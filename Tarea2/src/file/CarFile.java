package file;

import domain.Car;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class CarFile {

    public RandomAccessFile randomAccessFile;
    private int regsQuantity;//cantidad de registros que tiene mi archivo
    private int regsSize;// tamaño en bytes de mi registro
    private String myFilePath;//camino del archivo

    public CarFile(File file) throws IOException {

        this.myFilePath = file.getPath();

        this.regsSize = 150;

        //una validacion basica de file
        if (file.exists() && !file.isFile()) {

            throw new IOException(file.getName() + "is an invalid file");

        } else {

            //crear una instancia de RAF
            randomAccessFile = new RandomAccessFile(file, "rw");

            //necesitamos indicar cuantos registros tiene el archivo
            this.regsQuantity = (int) Math.ceil((double) randomAccessFile.length() / (double) this.regsSize);

        }

    }// method

    //metodo para insertar a un estudiante una pocision especifica
    public boolean putValue(int position, Car carToInsert) throws IOException {

        //vamos a hacer una pequeña validacon de position
        if (position >= 0 && position <= this.regsQuantity) {

            //verificar que el tamaño sea el adecuado
            if (carToInsert.sizeInBytes() > this.regsSize) {

                System.out.println("1002- record size is too large");
                return false;

            } else {

                //escribir en el archivo
                randomAccessFile.seek(position * this.regsSize);
                randomAccessFile.writeUTF(carToInsert.getName());
                randomAccessFile.writeInt(carToInsert.getYear());
                randomAccessFile.writeFloat(carToInsert.getMileage());
                randomAccessFile.writeBoolean(carToInsert.isAmerican());
                randomAccessFile.writeInt(carToInsert.getSerial());

                return true;
            }

        } else {

            System.out.println("1001-position is out of bounds");
            return false;
        }

    }//end method

    public boolean addEndRecord(Car car) throws IOException {

        boolean success = putValue(this.regsQuantity, car);

        if (success) {

            ++this.regsQuantity;

        }
        return success;

    }//end method

    //obtener un estudiante de una pocision especifica
    public Car getCar(int position) throws IOException {

        if (position >= 0 && position <= this.regsQuantity) {

            //leer
            randomAccessFile.seek(position * this.regsSize);
            Car carToFind = new Car();

            carToFind.setName(randomAccessFile.readUTF());
            carToFind.setYear(randomAccessFile.readInt());
            carToFind.setMileage(randomAccessFile.readFloat());
            carToFind.setAmerican(randomAccessFile.readBoolean());
            carToFind.setSerial(randomAccessFile.readInt());

            if (carToFind.getName().equals("deleted")) {
                return null;

            } else {
                return carToFind;
            }

        } else {

            System.out.println(" 1003- position is out bounds");
            return null;
        }

    }

    public String readOneCar(int position) throws IOException {

        Car carTemp = this.getCar(position);

        if (carTemp == null) {
            return "El vehiculo no existe";
        }
        return this.getCar(position).getName() + this.getCar(position).getMileage() + this.getCar(position).getSerial()
                + this.getCar(position).getYear() + this.getCar(position).isAmerican();

    }

    public int serial() throws IOException {
        int generateSerial = 0;

        for (int i = 0; i < this.regsQuantity; i++) {
            Car carTemp = this.getCar(i);
            if (carTemp != null) {
                int serialT = carTemp.getSerial();
                int serialG = generateSerial;

                if (carTemp.getSerial() == generateSerial) {
                    generateSerial++;
                }
            }
        }

        return generateSerial;
    }

    public ArrayList<Car> getCarList() throws IOException {
        //crear una instancia  de un array list
        ArrayList<Car> arrayListOfCar = new ArrayList<>();

        //recorrer el arreglo para insertar en la lista
        for (int i = 0; i < regsQuantity; i++) {

            Car carTemp = getCar(i);

            //insertar ese estudiante en la lista a menos de que este null
            if (carTemp != null) {
                arrayListOfCar.add(carTemp);
            }
        }

        return arrayListOfCar;
    }

    public boolean deleteRecord(int serial) throws IOException {
        Car carTemp;

        for (int i = 0; i < this.regsQuantity; i++) {
            carTemp = this.getCar(i);

            if (carTemp != null) {
                
            
                if (carTemp.getSerial() == serial) {
                    carTemp.setName("deleted");
                    return this.putValue(i, carTemp);
                }
            }

        }
        return false;
    }

    public boolean updateCar(int serial, String newAtribute, String newReg) throws IOException {
        boolean success = false;

        for (int i = 0; i < this.regsQuantity; i++) {

            Car carTemporal = this.getCar(i);

            if (carTemporal != null) {
               
            

                if (serial == carTemporal.getSerial()) {

                    if (newAtribute.equalsIgnoreCase("nombre")) {
                        carTemporal.setName(newReg);
                    }

                    if (newAtribute.equalsIgnoreCase("americano")) {
                        if (carTemporal.isAmerican() == true) {
                            carTemporal.setAmerican(false);
                        } else {
                            carTemporal.setAmerican(true);
                        }

                    }

                    if (newAtribute.equalsIgnoreCase("año")) {
                        carTemporal.setYear(Integer.parseInt(newReg));
                    }

                    this.putValue(i, carTemporal);
                    success = true;
                }
            }
        }
        return success;
    }

}
