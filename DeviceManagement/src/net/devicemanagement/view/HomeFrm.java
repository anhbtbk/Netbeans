/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package net.devicemanagement.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.devicemanagement.controller.DataController;
import net.devicemanagement.controller.DataControllerImp;
import net.devicemanagement.view.model.Phone;

/**
 *
 * @author Tuan Anh
 */
public class HomeFrm extends javax.swing.JFrame implements ActionListener {

    private List<Phone> phones; //tạo list các điện thoại
    private DefaultTableModel tableModelPhone;
    private DataController dataController;

    /**
     * Creates new form HomeFrm
     */
    public HomeFrm() {
        initComponents();
        setLocationRelativeTo(null);
        addButtonGroup(); //Phương thức chỉ chọn 1 radio button trong 1 nhóm
        addActionListener(); //Đăng kí sự kiện cho từng nút
        phones = new ArrayList<>();
        tableModelPhone = (DefaultTableModel) tblPhone.getModel();
        //khi ứng dụng được kích hoạt, dữ liệu tự load và hiển thị lên
        dataController = new DataControllerImp();
        LoadData();
        ShowData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSortPhone = new javax.swing.ButtonGroup();
        buttonGroupSearchPhone = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        rbSortPhoneNameASC = new javax.swing.JRadioButton();
        rbSortPhoneNameDESC = new javax.swing.JRadioButton();
        rbSortPhonePhaseASC = new javax.swing.JRadioButton();
        rbSortPhonePhaseDESC = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        rbSearchPhoneByImei = new javax.swing.JRadioButton();
        rbSearchPhoneByName = new javax.swing.JRadioButton();
        txtSearchPhoneByImei = new javax.swing.JTextField();
        txtSearchPhoneByName = new javax.swing.JTextField();
        rbSearchPhoneByPhase = new javax.swing.JRadioButton();
        comboSearchPhoneByPhase = new javax.swing.JComboBox<>();
        btnSearchPhone = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhone = new javax.swing.JTable();
        btnAddPhone = new javax.swing.JButton();
        btnEditPhone = new javax.swing.JButton();
        btnRemovePhone = new javax.swing.JButton();
        btnRefreshPhone = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ THIẾT BỊ");
        setResizable(false);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sắp xếp điện thoại", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        rbSortPhoneNameASC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSortPhoneNameASC.setText("Theo tên a-z");
        rbSortPhoneNameASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSortPhoneNameASCActionPerformed(evt);
            }
        });

        rbSortPhoneNameDESC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSortPhoneNameDESC.setText("Theo tên z-a");

        rbSortPhonePhaseASC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSortPhonePhaseASC.setText("Theo giai đoạn a-z");
        rbSortPhonePhaseASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSortPhonePhaseASCActionPerformed(evt);
            }
        });

        rbSortPhonePhaseDESC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSortPhonePhaseDESC.setText("Theo giai đoạn z-a");
        rbSortPhonePhaseDESC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSortPhonePhaseDESCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSortPhoneNameASC)
                    .addComponent(rbSortPhoneNameDESC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSortPhonePhaseASC)
                    .addComponent(rbSortPhonePhaseDESC))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSortPhoneNameASC)
                    .addComponent(rbSortPhonePhaseASC))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSortPhoneNameDESC)
                    .addComponent(rbSortPhonePhaseDESC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm điện thoại", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        rbSearchPhoneByImei.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSearchPhoneByImei.setText("Theo IMEI");

        rbSearchPhoneByName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSearchPhoneByName.setText("Theo tên");
        rbSearchPhoneByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSearchPhoneByNameActionPerformed(evt);
            }
        });

        txtSearchPhoneByImei.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchPhoneByImei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPhoneByImeiActionPerformed(evt);
            }
        });

        txtSearchPhoneByName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        rbSearchPhoneByPhase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbSearchPhoneByPhase.setText("Theo giai đoạn");
        rbSearchPhoneByPhase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSearchPhoneByPhaseActionPerformed(evt);
            }
        });

        comboSearchPhoneByPhase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboSearchPhoneByPhase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EVT", "DVT", "PVT" }));

        btnSearchPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearchPhone.setText("Tìm");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSearchPhoneByImei, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSearchPhoneByName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbSearchPhoneByPhase))
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchPhoneByImei)
                    .addComponent(txtSearchPhoneByName)
                    .addComponent(comboSearchPhoneByPhase, 0, 256, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnSearchPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSearchPhoneByImei)
                    .addComponent(txtSearchPhoneByImei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSearchPhoneByName)
                    .addComponent(txtSearchPhoneByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchPhone))
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSearchPhoneByPhase)
                    .addComponent(comboSearchPhoneByPhase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tblPhone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số IMEI", "Tên Model", "Giai đoạn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPhone);

        btnAddPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddPhone.setText("Thêm điện thoại");
        btnAddPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhoneActionPerformed(evt);
            }
        });

        btnEditPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditPhone.setText("Sửa điện thoại");

        btnRemovePhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRemovePhone.setText("Xóa điện thoại");

        btnRefreshPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRefreshPhone.setText("Làm mới");
        btnRefreshPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshPhoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnRefreshPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemovePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefreshPhone)
                    .addComponent(btnAddPhone)
                    .addComponent(btnEditPhone)
                    .addComponent(btnRemovePhone))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("QUẢN LÝ ĐIỆN THOẠI", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("QUẢN LÝ PC", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("QUẢN LÝ LAPTOP", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("QUẢN LÝ MÀN HÌNH", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("THÔNG TIN NHÂN VIÊN", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 955, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("QUẢN LÝ MƯỢN", jPanel6);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPhoneActionPerformed

    private void btnRefreshPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshPhoneActionPerformed

    private void rbSearchPhoneByPhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSearchPhoneByPhaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSearchPhoneByPhaseActionPerformed

    private void rbSortPhoneNameASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSortPhoneNameASCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSortPhoneNameASCActionPerformed

    private void rbSortPhonePhaseDESCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSortPhonePhaseDESCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSortPhonePhaseDESCActionPerformed

    private void rbSortPhonePhaseASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSortPhonePhaseASCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSortPhonePhaseASCActionPerformed

    private void rbSearchPhoneByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSearchPhoneByNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSearchPhoneByNameActionPerformed

    private void txtSearchPhoneByImeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPhoneByImeiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPhoneByImeiActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPhone;
    private javax.swing.JButton btnEditPhone;
    private javax.swing.JButton btnRefreshPhone;
    private javax.swing.JButton btnRemovePhone;
    private javax.swing.JButton btnSearchPhone;
    private javax.swing.ButtonGroup buttonGroupSearchPhone;
    private javax.swing.ButtonGroup buttonGroupSortPhone;
    private javax.swing.JComboBox<String> comboSearchPhoneByPhase;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbSearchPhoneByImei;
    private javax.swing.JRadioButton rbSearchPhoneByName;
    private javax.swing.JRadioButton rbSearchPhoneByPhase;
    private javax.swing.JRadioButton rbSortPhoneNameASC;
    private javax.swing.JRadioButton rbSortPhoneNameDESC;
    private javax.swing.JRadioButton rbSortPhonePhaseASC;
    private javax.swing.JRadioButton rbSortPhonePhaseDESC;
    private javax.swing.JTable tblPhone;
    private javax.swing.JTextField txtSearchPhoneByImei;
    private javax.swing.JTextField txtSearchPhoneByName;
    // End of variables declaration//GEN-END:variables

    private void addButtonGroup() {
        buttonGroupSearchPhone.add(rbSearchPhoneByImei);
        buttonGroupSearchPhone.add(rbSearchPhoneByName);
        buttonGroupSearchPhone.add(rbSearchPhoneByPhase);
        buttonGroupSortPhone.add(rbSortPhoneNameASC);
        buttonGroupSortPhone.add(rbSortPhoneNameDESC);
        buttonGroupSortPhone.add(rbSortPhonePhaseASC);
        buttonGroupSortPhone.add(rbSortPhonePhaseDESC);
    }

    private void addActionListener() {
        //đăng ký sự kiện cho từng nút
        btnAddPhone.addActionListener(this);
        btnEditPhone.addActionListener(this);
        btnRefreshPhone.addActionListener(this);
        btnRemovePhone.addActionListener(this);
        btnSearchPhone.addActionListener(this);

        rbSearchPhoneByImei.addActionListener(this);
        rbSearchPhoneByName.addActionListener(this);
        rbSearchPhoneByPhase.addActionListener(this);

        rbSortPhoneNameASC.addActionListener(this);
        rbSortPhoneNameDESC.addActionListener(this);
        rbSortPhonePhaseASC.addActionListener(this);
        rbSortPhonePhaseDESC.addActionListener(this);

    }

    public void addPhoneCallback(Phone phone) {  //ở cái table sẽ gọi đến phương 
        //thức vào và truyền đến list phone nhận dược
        phones.add(phone);
        showPhone(phone);
        saveData(DataController.PHONE);//đang muốn lưu cái gì
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //thực hiện các hành động
        var obj = e.getSource();
        if (obj.equals(btnAddPhone)) {
            AddPhoneDialog addPhoneDialog
                    = new AddPhoneDialog(this, rootPaneCheckingEnabled);
            addPhoneDialog.setVisible(true);
        } else if (obj.equals(btnRemovePhone)) {
            removePhone();
        } else if (obj.equals(btnEditPhone)) {
            editPhone();

    }

    //pt hiển thị thông tin ra bảng
    private void showPhone(Phone phone) {
        Object[] row = new Object[]{
            phone.getImei(), phone.getName(), phone.getPhase()
        };
        tableModelPhone.addRow(row); //thêm các thông số bên trên vào bảng
    }

    private void LoadData() {
        phones = dataController.<Phone>readDataFromFile(DataController.PHONE_FILE);
        
    }

    private void ShowData() {
        showPhones();
    }

    private void showPhones() {
        for (Phone phone : phones) {
            showPhone(phone);
        }
    }

    private void saveData(int choice) {
        switch(choice) {
            case DataController.PHONE:
                dataController.<Phone>writeToFile(phones, 
                        DataController.PHONE_FILE);
                break;
        }
    }

    private void removePhone() {
       int selectedIndex = tblPhone.getSelectedRow();//chọn dòng cần xóa
       //chỉ số dòng trong bảng chính là chỉ số dòng trong danh sách
       if(selectedIndex > -1) {         
           var msg = "Bạn có chắc chắn muốn xóa bản ghi này không?";
           int confirm = JOptionPane.showConfirmDialog(rootPane, msg);
           if(confirm == JOptionPane.OK_OPTION) {
               phones.remove(selectedIndex); //xóa khỏi danh sách
               tableModelPhone.removeRow(selectedIndex); //xóa khỏi bảng
               dataController.<Phone>writeToFile(phones, 
                       DataController.PHONE_FILE);
           }
       } else {
           var msg = "Vui lòng chọn 1 bản ghi để xóa!";
           showDialogMessage(msg);
       }
    }
    private void showDialogMessage(String msg) {
       JOptionPane.showMessageDialog(rootPane, msg);
    }
    
    private void editPhone() {
        
    }
}
