/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package TugasAkhir;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alifb
 */
public class RentKost extends javax.swing.JInternalFrame {

    /**
     * Creates new form RentKost
     */
    public RentKost() {
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

        radioButton = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderNameTxt = new javax.swing.JTextField();
        durasiSewaTxt = new javax.swing.JTextField();
        tipeKamarCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RadioButton1 = new javax.swing.JRadioButton();
        RadioButton2 = new javax.swing.JRadioButton();
        RadioButton3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        dpButton = new javax.swing.JTextField();
        agreementCbx = new javax.swing.JCheckBox();
        processButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        kostPriceTxt = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        setTitle("SEWA KOST");

        jLabel1.setText("Nama Penyewa");

        jLabel2.setText("Durasi Sewa");

        jLabel3.setText("Jumlah Penyewa");

        tipeKamarCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Sendiri", "2 Orang" }));
        tipeKamarCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipeKamarComboActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TugasAkhir/Images/rumah.jpg"))); // NOI18N

        jLabel5.setText("PILIH FASILITAS");

        radioButton.add(RadioButton1);
        RadioButton1.setText("Ac + Kamar Mandi Dalam");
        RadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton1ActionPerformed(evt);
            }
        });

        radioButton.add(RadioButton2);
        RadioButton2.setText("Kipas Angin + Kamar Mandi Dalam ");
        RadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton2ActionPerformed(evt);
            }
        });

        radioButton.add(RadioButton3);
        RadioButton3.setText("Kipas Angin + Kamar Mandi Luar");
        RadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("DP");

        agreementCbx.setText("Saya menyetujui untuk mematuhi seluruh peraturan");
        agreementCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreementCbxActionPerformed(evt);
            }
        });

        processButton.setText("Proses");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Hapus");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Harga");

        saveButton.setText("Simpan");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tipeKamarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orderNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(durasiSewaTxt)))
                            .addComponent(RadioButton3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(RadioButton1)
                                        .addComponent(RadioButton2))
                                    .addGap(108, 108, 108)))
                            .addComponent(agreementCbx))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(kostPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(orderNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(durasiSewaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tipeKamarCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kostPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(agreementCbx)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(processButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton1ActionPerformed

        if(tipeKamarCombo.getSelectedItem().equals("Sendiri")){
            kostPriceTxt.setText("2.400.000");
        }
        else if(tipeKamarCombo.getSelectedItem().equals("2 Orang")){
            kostPriceTxt.setText("2.500.000");
        }
    }//GEN-LAST:event_RadioButton1ActionPerformed

    private void agreementCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreementCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agreementCbxActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        if(orderNameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nama belum diisi");
        } else if(durasiSewaTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Isi durasi sewa dahulu");
        } else if(tipeKamarCombo.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(null, "Pilih Jumlah penyewa dulu");          
        }else if(kostPriceTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Pilihan belum lengkap");
        }else if(agreementCbx.isSelected()==false){
            JOptionPane.showMessageDialog(null, "Silakan centang setuju terlebih dahulu");
            
        }else if(dpButton.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Isikan DP terlebih dahulu");
        }else{
            JOptionPane.showMessageDialog(null, "Pesanan Berhasil");
        }
    }//GEN-LAST:event_processButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        orderNameTxt.setText("");
        durasiSewaTxt.setText("");
        tipeKamarCombo.setSelectedIndex(0);
        radioButton.clearSelection();
        kostPriceTxt.setText("");
        dpButton.setText("");
        agreementCbx.setSelected(false);
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void tipeKamarComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipeKamarComboActionPerformed
        
    }//GEN-LAST:event_tipeKamarComboActionPerformed

    private void RadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton2ActionPerformed
        if(tipeKamarCombo.getSelectedItem().equals("Sendiri")){
            kostPriceTxt.setText("1.700.000");
        }
        else if(tipeKamarCombo.getSelectedItem().equals("2 Orang")){
            kostPriceTxt.setText("1.800.000");
        }
    }//GEN-LAST:event_RadioButton2ActionPerformed

    private void RadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton3ActionPerformed
        if(tipeKamarCombo.getSelectedItem().equals("Sendiri")){
            kostPriceTxt.setText("1.300.000");
        }
        else if(tipeKamarCombo.getSelectedItem().equals("2 Orang")){
            kostPriceTxt.setText("1.400.000");
        }
    }//GEN-LAST:event_RadioButton3ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try{
            String sql = "INSERT INTO kost(name,duration,jumlah_penyewa,tipe,harga,dp) VALUES ('"
                    + orderNameTxt.getText() + "'.'"
                    + durasiSewaTxt.getText() + "'.'"
                    + tipeKamarCombo.getSelectedItem() + "'.'"
                    + radioButton + "'.'"
                    + kostPriceTxt.getText()+ "'.'"
                    + dpButton.getText() + "'.'";
            Connection conn = (Connection)ConnectorDb.connectDatabase();
            PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(RentKost.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.setVisible(true);
        this.getDesktopPane().add(optionMenu);
        this.dispose();
        
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButton1;
    private javax.swing.JRadioButton RadioButton2;
    private javax.swing.JRadioButton RadioButton3;
    private javax.swing.JCheckBox agreementCbx;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField dpButton;
    private javax.swing.JTextField durasiSewaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField kostPriceTxt;
    private javax.swing.JTextField orderNameTxt;
    private javax.swing.JButton processButton;
    private javax.swing.ButtonGroup radioButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> tipeKamarCombo;
    // End of variables declaration//GEN-END:variables
}
