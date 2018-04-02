package domain;

//nombre (20 caracteres), año (entero), kilometraje
//(flotante), americano (booleano) y serie (entero)
public class Car {
    
    private String name;
    private int year;
    private float mileage;
    private boolean american;
    private int serial;

    public Car() {
    }

    public Car(String name, int year, float mileage, boolean american, int serial) {
        this.name = name;
        this.year = year;
        this.mileage = mileage;
        this.american = american;
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMileage() {
        return mileage;
    }

    public void setMileage(float mileage) {
        this.mileage = mileage;
    }

    public boolean isAmerican() {
        return american;
    }

    public void setAmerican(boolean american) {
        this.american = american;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "name=" + name + ", year=" + year + ", mileage=" + mileage + ", american=" + american + ", serial=" + serial + '}';
    }
 
    
    
    public int sizeInBytes (){
    
    return 4+4+4+1+ 2*this.name.length();
        
    }
    
}
