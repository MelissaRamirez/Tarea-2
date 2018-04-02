package Interface;

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

public class PrincipalWindow extends javax.swing.JFrame {

    Car car = new Car();
    File file = new File("./carFinal.dat");

    public PrincipalWindow() {
        initComponents();
        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        tbv_tableActualizaSerie = new javax.swing.JScrollPane();
        tbv_showR = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuItem2 = new javax.swing.JMenuItem();
        jdp_principalDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mni_insertCar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mni_tableCar = new javax.swing.JMenuItem();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        tbv_showR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Kilometraje", "Serie", "Año", "Americano"
            }
        ));
        tbv_tableActualizaSerie.setViewportView(tbv_showR);

        jCheckBox1.setText("jCheckBox1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdp_principalDesktopLayout = new javax.swing.GroupLayout(jdp_principalDesktop);
        jdp_principalDesktop.setLayout(jdp_principalDesktopLayout);
        jdp_principalDesktopLayout.setHorizontalGroup(
            jdp_principalDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jdp_principalDesktopLayout.setVerticalGroup(
            jdp_principalDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jMenu1.setText("Registro ");

        mni_insertCar.setText("Vehiculos");
        mni_insertCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_insertCarActionPerformed(evt);
            }
        });
        jMenu1.add(mni_insertCar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tabla");

        mni_tableCar.setText("Vehiculos");
        mni_tableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_tableCarActionPerformed(evt);
            }
        });
        jMenu2.add(mni_tableCar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdp_principalDesktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdp_principalDesktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mni_insertCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_insertCarActionPerformed
        
        InterfaceRegister interfaceReg = new InterfaceRegister();
        this.jdp_principalDesktop.removeAll();
        this.jdp_principalDesktop.repaint();
        this.jdp_principalDesktop.add(interfaceReg);
        interfaceReg.show();
    }//GEN-LAST:event_mni_insertCarActionPerformed

    private void mni_tableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_tableCarActionPerformed
        // TODO add your handling code here:
        
        InterfaceTable interfaceTable = new InterfaceTable();
        this.jdp_principalDesktop.removeAll();
        this.jdp_principalDesktop.repaint();
        this.jdp_principalDesktop.add(interfaceTable);
        interfaceTable.show();
    }//GEN-LAST:event_mni_tableCarActionPerformed

    
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JDesktopPane jdp_principalDesktop;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JMenuItem mni_insertCar;
    private javax.swing.JMenuItem mni_tableCar;
    private javax.swing.JTable tbv_showR;
    private javax.swing.JScrollPane tbv_tableActualizaSerie;
    // End of variables declaration//GEN-END:variables

}
