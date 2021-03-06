/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import file.CarFile;
import domain.Car;
import file.CarFile;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melissa Ramírez R
 */
public class InterfaceRegister extends javax.swing.JInternalFrame {

    Car car = new Car();
    File file = new File("./carFinal.dat");

    /**
     * Creates new form InterfaceRegister
     */
    public InterfaceRegister() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_name = new javax.swing.JLabel();
        lbl_year = new javax.swing.JLabel();
        lbl_km = new javax.swing.JLabel();
        tfd_name = new javax.swing.JTextField();
        tfd_year = new javax.swing.JTextField();
        tfd_km = new javax.swing.JTextField();
        lbl_american = new javax.swing.JLabel();
        chb_americano = new javax.swing.JCheckBox();
        btn_ingresarVehiculo = new javax.swing.JButton();
        lbl_actualizaSerie = new javax.swing.JLabel();
        tfd_serial = new javax.swing.JTextField();
        lb_updateatribute = new javax.swing.JLabel();
        tfd_actualizaSerie = new javax.swing.JTextField();
        lbl_newReg = new javax.swing.JLabel();
        tfd_newReg = new javax.swing.JTextField();
        btn_actualizaSerie = new javax.swing.JButton();
        lbl_deleteV = new javax.swing.JLabel();
        tfd_deleteV = new javax.swing.JTextField();
        btn_deleteV = new javax.swing.JButton();

        setTitle("Registro de Vehículos ");

        lbl_name.setText("Marca");

        lbl_year.setText("Año");

        lbl_km.setText("Kilometraje");

        tfd_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_yearActionPerformed(evt);
            }
        });

        lbl_american.setText("Americano");

        chb_americano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_americanoActionPerformed(evt);
            }
        });

        btn_ingresarVehiculo.setText("Ingresar");
        btn_ingresarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarVehiculoActionPerformed(evt);
            }
        });

        lbl_actualizaSerie.setText("Serie del vehículo que desea modificar");

        lb_updateatribute.setText("Atributo que desea modificar");

        tfd_actualizaSerie.setToolTipText("Actualizar");
        tfd_actualizaSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_actualizaSerieActionPerformed(evt);
            }
        });

        lbl_newReg.setText("Ingrese el nuevo dato");

        btn_actualizaSerie.setText("Actualizar");
        btn_actualizaSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizaSerieActionPerformed(evt);
            }
        });

        lbl_deleteV.setText("Serie del vehículo que desea borrar");

        tfd_deleteV.setToolTipText("Borrar");
        tfd_deleteV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfd_deleteVActionPerformed(evt);
            }
        });

        btn_deleteV.setText("Borrar");
        btn_deleteV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_year)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_km)
                            .addComponent(lbl_american))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chb_americano)
                            .addComponent(tfd_km, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btn_ingresarVehiculo)
                        .addGap(250, 250, 250)
                        .addComponent(btn_actualizaSerie)
                        .addGap(228, 228, 228)
                        .addComponent(btn_deleteV)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfd_year, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(tfd_name))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_actualizaSerie)
                    .addComponent(lb_updateatribute)
                    .addComponent(lbl_newReg))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfd_newReg, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfd_actualizaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfd_serial, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(lbl_deleteV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfd_deleteV, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_name)
                            .addComponent(tfd_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_actualizaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfd_serial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_deleteV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfd_deleteV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_year)
                            .addComponent(tfd_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_km)
                            .addComponent(tfd_km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_newReg)
                            .addComponent(tfd_newReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_updateatribute)
                            .addComponent(tfd_actualizaSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chb_americano)
                    .addComponent(lbl_american))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresarVehiculo)
                    .addComponent(btn_actualizaSerie)
                    .addComponent(btn_deleteV))
                .addContainerGap(262, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfd_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_yearActionPerformed

    }//GEN-LAST:event_tfd_yearActionPerformed

    private void chb_americanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_americanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_americanoActionPerformed

    private void btn_ingresarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarVehiculoActionPerformed
        boolean american = false;
        try {

            CarFile carFile = new CarFile(file);
            if (chb_americano.isSelected()) {
                american = true;
            } else {
                american = false;
            }
            int serial = carFile.serial();
            Car addNewCar = new Car(tfd_name.getText(), Integer.parseInt(tfd_year.getText()), Float.parseFloat(tfd_km.getText()),
                    american, serial);
            carFile.addEndRecord(addNewCar);
            JOptionPane.showMessageDialog(null, "EL vehiculo con la serie " + serial + " fue ingresado con éxito");

        } catch (IOException ex) {
            System.out.println("Problemas con el archivo btn ingresar");
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "No ingrese letras en los campos de año y kilometraje");
        }

    }//GEN-LAST:event_btn_ingresarVehiculoActionPerformed

    private void tfd_actualizaSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_actualizaSerieActionPerformed
 
    }//GEN-LAST:event_tfd_actualizaSerieActionPerformed

    private void btn_actualizaSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizaSerieActionPerformed

        try {
            CarFile carFile = new CarFile(file);
            carFile.updateCar(Integer.parseInt(tfd_serial.getText()), tfd_actualizaSerie.getText(), tfd_newReg.getText());
            JOptionPane.showMessageDialog(null, "El vehiculo con la serie " + tfd_serial.getText() + " fue actualizado con exito");
        
        } catch (IOException ex) {
            System.out.println("Problemas con el archivo btn ingresar");
        }
    }//GEN-LAST:event_btn_actualizaSerieActionPerformed

    private void tfd_deleteVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfd_deleteVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfd_deleteVActionPerformed

    private void btn_deleteVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteVActionPerformed
        try {
            CarFile carFile = new CarFile(file);
            carFile.deleteRecord(Integer.parseInt(tfd_deleteV.getText()));
            JOptionPane.showMessageDialog(null, "El vehiculo con la serie " + tfd_deleteV.getText() + " fue borrado con exito");

        } catch (IOException ioe) {

            System.out.println("Problemas con el archivo, boton borrar");
        }
    }//GEN-LAST:event_btn_deleteVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizaSerie;
    private javax.swing.JButton btn_deleteV;
    private javax.swing.JButton btn_ingresarVehiculo;
    private javax.swing.JCheckBox chb_americano;
    private javax.swing.JLabel lb_updateatribute;
    private javax.swing.JLabel lbl_actualizaSerie;
    private javax.swing.JLabel lbl_american;
    private javax.swing.JLabel lbl_deleteV;
    private javax.swing.JLabel lbl_km;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_newReg;
    private javax.swing.JLabel lbl_year;
    private javax.swing.JTextField tfd_actualizaSerie;
    private javax.swing.JTextField tfd_deleteV;
    private javax.swing.JTextField tfd_km;
    private javax.swing.JTextField tfd_name;
    private javax.swing.JTextField tfd_newReg;
    private javax.swing.JTextField tfd_serial;
    private javax.swing.JTextField tfd_year;
    // End of variables declaration//GEN-END:variables
}
