/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views;

import TablasMedidas.*;

/**
 *
 * @author Jesus
 */
public class MedidaView extends javax.swing.JPanel {

    static TablaTemperatura milimetro;
    static TablaTemperatura centimetro;
    static TablaTemperatura decimetro;
    static TablaTemperatura metro;
    static TablaTemperatura decametro;
    static TablaTemperatura hectometro;
    static TablaTemperatura kilometro;

    /**
     * Creates new form DivisasView
     */
    public MedidaView() {
        initComponents();
        InitTables();
    }

    public static void InitTables() {
        milimetro = new TablaMilimetro();
        centimetro = new TablaCentimetro();
        decimetro = new TablaDecimetro();
        metro = new TablaMetro();
        decametro = new TablaDecametro();
        hectometro = new TablaHectometro();
        kilometro = new TablaKilometro();
    }

    public static double getValorMedida(TablaTemperatura tabla, String moneda) {
        return tabla.GetValue(moneda);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMontoMedida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboOrigenMedida = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnConvertirMedida = new javax.swing.JLabel();
        txtResultadoMedida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboDestinoMedida = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(35, 34, 34));
        jPanel1.setPreferredSize(new java.awt.Dimension(614, 397));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa la medida que desea convertir:");

        txtMontoMedida.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtMontoMedida.setForeground(new java.awt.Color(153, 153, 153));
        txtMontoMedida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMontoMedida.setText("0.00");
        txtMontoMedida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMontoMedidaMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Medida de destino");

        comboOrigenMedida.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        comboOrigenMedida.setForeground(new java.awt.Color(102, 102, 102));
        comboOrigenMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mm", "cm", "dm", "m", "Dam", "Hm", "Km", " " }));

        jPanel2.setBackground(new java.awt.Color(0, 99, 82));

        btnConvertirMedida.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        btnConvertirMedida.setForeground(new java.awt.Color(255, 255, 255));
        btnConvertirMedida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConvertirMedida.setText("CONVERTIR");
        btnConvertirMedida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConvertirMedidaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConvertirMedidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConvertirMedidaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConvertirMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConvertirMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        txtResultadoMedida.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtResultadoMedida.setForeground(new java.awt.Color(153, 153, 153));
        txtResultadoMedida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultadoMedida.setText("Resultado...");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Medida de origen ");

        comboDestinoMedida.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        comboDestinoMedida.setForeground(new java.awt.Color(102, 102, 102));
        comboDestinoMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mm", "cm", "dm", "m", "Dam", "Hm", "Km" }));
        comboDestinoMedida.setSelectedIndex(3);
        comboDestinoMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDestinoMedidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(txtMontoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboOrigenMedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResultadoMedida)
                            .addComponent(comboDestinoMedida, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtMontoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboOrigenMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboDestinoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txtResultadoMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboDestinoMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDestinoMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDestinoMedidaActionPerformed

    private void btnConvertirMedidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertirMedidaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConvertirMedidaMouseEntered

    private void btnConvertirMedidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertirMedidaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConvertirMedidaMouseExited

    private void btnConvertirMedidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertirMedidaMouseClicked
        // TODO add your handling code here:
        double monto = Double.parseDouble(txtMontoMedida.getText());
        String medidaOrigen = (String) comboOrigenMedida.getSelectedItem();
        String medidaDestino = (String) comboDestinoMedida.getSelectedItem();
        double valorMedida = 0.0;
        switch (medidaOrigen) {
            case "mm":
                valorMedida = getValorMedida(milimetro, medidaDestino);
                txtResultadoMedida.setText(String.format("%.2f", (monto * valorMedida)));
                break;
            case "cm":
                valorMedida = getValorMedida(centimetro, medidaDestino);
                txtResultadoMedida.setText(String.format("%.2f", (monto * valorMedida)));
                break;
            case "dm":
                valorMedida = getValorMedida(decimetro, medidaDestino);
                txtResultadoMedida.setText(String.format("%.2f", (monto * valorMedida)));
                break;
            case "m":
                valorMedida = getValorMedida(metro, medidaDestino);
                txtResultadoMedida.setText(String.format("%.2f", (monto * valorMedida)));
                break;
            case "Dam":
                valorMedida = getValorMedida(decametro, medidaDestino);
                txtResultadoMedida.setText(String.format("%.2f", (monto * valorMedida)));
                break;
            case "Hm":
                valorMedida = getValorMedida(hectometro, medidaDestino);
                txtResultadoMedida.setText(String.format("%.2f", (monto * valorMedida)));
                break;
            case "Km":
                valorMedida = getValorMedida(kilometro, medidaDestino);
                txtResultadoMedida.setText(String.format("%.2f", (monto * valorMedida)));
                break;

            default:
                System.out.println("No se pudo completar");
        }
    }//GEN-LAST:event_btnConvertirMedidaMouseClicked

    private void txtMontoMedidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMontoMedidaMouseClicked
        // TODO add your handling code here:
        txtMontoMedida.setText("");
    }//GEN-LAST:event_txtMontoMedidaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnConvertirMedida;
    private javax.swing.JComboBox<String> comboDestinoMedida;
    private javax.swing.JComboBox<String> comboOrigenMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtMontoMedida;
    private javax.swing.JTextField txtResultadoMedida;
    // End of variables declaration//GEN-END:variables
}
