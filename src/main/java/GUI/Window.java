/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Views.*;

import java.awt.BorderLayout;
import java.awt.Color;

import java.time.LocalDate;
import javax.swing.JPanel;





/**
 *
 * @author Jesus
 */
public class Window extends javax.swing.JFrame {
    //====================================== PRUEBAAAA========================
    
    //==============================================================
    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        InitContent();
        setDate();
        

    }

    private void setDate(){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int day = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        txtDate.setText("Hoy es "+day+" de "+mes[month-1]+" de "+year);
        
        
    }
    
    
    private void InitContent(){
        ShowJPanel(new PageTest());
        
    }
    
    
    
    private void ShowJPanel(JPanel panel){
        
        panel.setSize(614,397);
        panel.setLocation(0, 0);
        
        contenedor.removeAll();
        contenedor.add(panel,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuOptions = new javax.swing.JPanel();
        btnDivisa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnTemperatura = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnMedidas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnPeso = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBackground(new java.awt.Color(35, 34, 34));
        background.setForeground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 69, 57));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONVERSOR");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        menuOptions.setBackground(new java.awt.Color(0, 99, 82));

        btnDivisa.setBackground(new java.awt.Color(0, 99, 82));
        btnDivisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDivisaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDivisaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDivisaMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DIVISAS");

        javax.swing.GroupLayout btnDivisaLayout = new javax.swing.GroupLayout(btnDivisa);
        btnDivisa.setLayout(btnDivisaLayout);
        btnDivisaLayout.setHorizontalGroup(
            btnDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDivisaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDivisaLayout.setVerticalGroup(
            btnDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDivisaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTemperatura.setBackground(new java.awt.Color(0, 99, 82));
        btnTemperatura.setPreferredSize(new java.awt.Dimension(100, 69));
        btnTemperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTemperaturaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTemperaturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTemperaturaMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TEMPERATURA");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnTemperaturaLayout = new javax.swing.GroupLayout(btnTemperatura);
        btnTemperatura.setLayout(btnTemperaturaLayout);
        btnTemperaturaLayout.setHorizontalGroup(
            btnTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTemperaturaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnTemperaturaLayout.setVerticalGroup(
            btnTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTemperaturaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnMedidas.setBackground(new java.awt.Color(0, 99, 82));
        btnMedidas.setPreferredSize(new java.awt.Dimension(100, 69));
        btnMedidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMedidasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMedidasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMedidasMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MEDIDAS");

        javax.swing.GroupLayout btnMedidasLayout = new javax.swing.GroupLayout(btnMedidas);
        btnMedidas.setLayout(btnMedidasLayout);
        btnMedidasLayout.setHorizontalGroup(
            btnMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMedidasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnMedidasLayout.setVerticalGroup(
            btnMedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMedidasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnPeso.setBackground(new java.awt.Color(0, 99, 82));
        btnPeso.setPreferredSize(new java.awt.Dimension(100, 69));
        btnPeso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesoMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PESO");

        javax.swing.GroupLayout btnPesoLayout = new javax.swing.GroupLayout(btnPeso);
        btnPeso.setLayout(btnPesoLayout);
        btnPesoLayout.setHorizontalGroup(
            btnPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPesoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnPesoLayout.setVerticalGroup(
            btnPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPesoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuOptionsLayout = new javax.swing.GroupLayout(menuOptions);
        menuOptions.setLayout(menuOptionsLayout);
        menuOptionsLayout.setHorizontalGroup(
            menuOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDivisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(btnMedidas, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(btnPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        menuOptionsLayout.setVerticalGroup(
            menuOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMedidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Desarrollado por:");

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Jesus Maquera");

        jLabel12.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("V 1.0");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(menuOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        header.setBackground(new java.awt.Color(0, 99, 82));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BIENVENIDO AL CONVERSOR! :D");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel9)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel9)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 42, -1, 90));

        txtDate.setFont(new java.awt.Font("Roboto Black", 1, 15)); // NOI18N
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        txtDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtDate.setText(".");
        background.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 6, 620, 20));

        contenedor.setPreferredSize(new java.awt.Dimension(614, 397));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        background.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 144, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDivisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivisaMouseClicked
        // TODO add your handling code here:
        ShowJPanel(new DivisasView());
    }//GEN-LAST:event_btnDivisaMouseClicked

    private void btnTemperaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemperaturaMouseClicked
        // TODO add your handling code here:
        ShowJPanel(new TemperaturaView());
    }//GEN-LAST:event_btnTemperaturaMouseClicked

    private void btnMedidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedidasMouseClicked
        // TODO add your handling code here:
        ShowJPanel(new MedidasView());
    }//GEN-LAST:event_btnMedidasMouseClicked

    private void btnPesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesoMouseClicked
        // TODO add your handling code here:
        ShowJPanel(new PesoView());
    }//GEN-LAST:event_btnPesoMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        ShowJPanel(new PageTest());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnDivisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivisaMouseEntered

        // TODO add your handling code here:
        btnDivisa.setBackground(new java.awt.Color(0, 153, 146));
       
    }//GEN-LAST:event_btnDivisaMouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        btnTemperatura.setBackground(new java.awt.Color(0, 153, 146));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void btnTemperaturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemperaturaMouseEntered
        // TODO add your handling code here:
        btnTemperatura.setBackground(new java.awt.Color(0, 153, 146));
    }//GEN-LAST:event_btnTemperaturaMouseEntered

    private void btnMedidasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedidasMouseEntered
        // TODO add your handling code here:
        btnMedidas.setBackground(new java.awt.Color(0, 153, 146));
    }//GEN-LAST:event_btnMedidasMouseEntered

    private void btnPesoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesoMouseEntered
        // TODO add your handling code here:
        btnPeso.setBackground(new java.awt.Color(0, 153, 146));
    }//GEN-LAST:event_btnPesoMouseEntered

    private void btnDivisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivisaMouseExited
        // TODO add your handling code here:
        
        btnDivisa.setBackground(new java.awt.Color(0,99,82));
    }//GEN-LAST:event_btnDivisaMouseExited

    private void btnTemperaturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemperaturaMouseExited
        // TODO add your handling code here:
        btnTemperatura.setBackground(new java.awt.Color(0,99,82));
    }//GEN-LAST:event_btnTemperaturaMouseExited

    private void btnMedidasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMedidasMouseExited
        // TODO add your handling code here:
        btnMedidas.setBackground(new java.awt.Color(0,99,82));
    }//GEN-LAST:event_btnMedidasMouseExited

    private void btnPesoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesoMouseExited
        // TODO add your handling code here:
        btnPeso.setBackground(new java.awt.Color(0,99,82));
    }//GEN-LAST:event_btnPesoMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnDivisa;
    private javax.swing.JPanel btnMedidas;
    private javax.swing.JPanel btnPeso;
    private javax.swing.JPanel btnTemperatura;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuOptions;
    private javax.swing.JLabel txtDate;
    // End of variables declaration//GEN-END:variables



}
