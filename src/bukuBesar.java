import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.Connection;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
public class bukuBesar extends javax.swing.JInternalFrame {
    DefaultTableModel tableModel;
    DefaultTableModel tableModel1;
    String tblJnsJurnalD;
    String tblJnsJurnalK;
    String jnsAkunD;
    String jnsAkunK;
    private Connection connection;
    String saldoAwal;
    String saldoD;
    String saldoK;
    int totalSaldo;
    
    int kasLB,pembelianLB,potPembelianLB,penjualanLB,potonganPenjualanLB,perlengkapanLB,bebanLB;
    int test = 1000000;
    
    int varKasB;
    int varPerlengkapanB;
    
    int sumKasD,sumKasK,totalSumKas;
    int sumPerlengkapanD,totalSumPerlengkapan;
    
    /**
     * Creates new form jurnalKhususI
     */
    public bukuBesar() {
        initComponents();
        initTableD();
        initTableK();
//        loadDataKas();
//        loadData();
        getAllS();
        
        sumKas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAkun = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAkun1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jSpinnerSaldoKredit = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinnerSaldoDebet = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerTotalSaldo = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jSpinnerDebetSaldoAwal = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxJnsAkun = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("BUKU BESAR");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblAkun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PILIH JENIS BUKU BESAR TERLEBIH DAHULU"
            }
        ));
        jScrollPane1.setViewportView(tblAkun);

        tblAkun1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PILIH JENIS BUKU BESAR TERLEBIH DAHULU"
            }
        ));
        jScrollPane2.setViewportView(tblAkun1);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinnerSaldoKredit.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        jLabel3.setText("* Saldo Kredit");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSpinnerSaldoKredit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerSaldoKredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        jLabel1.setText("* Saldo Debet");

        jSpinnerSaldoDebet.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSpinnerSaldoDebet, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinnerSaldoDebet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel2.setText("Total Saldo *");

        jSpinnerTotalSaldo.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSpinnerTotalSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerTotalSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator1.setForeground(new java.awt.Color(255, 51, 102));

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSpinnerDebetSaldoAwal.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel4.setText("Saldo Awal *");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jSpinnerDebetSaldoAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerDebetSaldoAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxJnsAkun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Jenis Buku Besar -", "1. Kas", "2. Pembelian", "3. Potongan Pembelian", "4. Penjualan", "5. Potongan Penjualan", "6. Perlengkapan", "7. Beban", "8. Utang Usaha" }));
        jComboBoxJnsAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJnsAkunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxJnsAkun, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxJnsAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel5, jPanel6});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxJnsAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJnsAkunActionPerformed
        jenisJurnal();        
    }//GEN-LAST:event_jComboBoxJnsAkunActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jenisJurnal(); 
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxJnsAkun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerDebetSaldoAwal;
    private javax.swing.JSpinner jSpinnerSaldoDebet;
    private javax.swing.JSpinner jSpinnerSaldoKredit;
    private javax.swing.JSpinner jSpinnerTotalSaldo;
    private javax.swing.JTable tblAkun;
    private javax.swing.JTable tblAkun1;
    // End of variables declaration//GEN-END:variables
    TableColumn tColumn;
    private void initTableD(){
        tableModel = new DefaultTableModel();
        tblAkun.setModel(tableModel);
        tableModel.addColumn("Tanggal");
        tableModel.addColumn("Keterangan");
//        tableModel.addColumn("Ref");
        tableModel.addColumn("Debet(D)");
        
//        tblAkun.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        tColumn = tblAkun.getColumnModel().getColumn(0);
//        tColumn.setPreferredWidth(90);//tanggal
//        tColumn = tblAkun.getColumnModel().getColumn(1);
//        tColumn.setPreferredWidth(250);//ket
//        tColumn = tblAkun.getColumnModel().getColumn(2);
//        tColumn.setPreferredWidth(131);//debet
    }
    private void initTableK(){
        tableModel1 = new DefaultTableModel();
        tblAkun1.setModel(tableModel);
        tableModel1.addColumn("Tanggal");
        tableModel1.addColumn("Keterangan");
//        tableModel.addColumn("Ref");
        tableModel1.addColumn("Kredit(K)");
        
//        tblAkun1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        tColumn = tblAkun1.getColumnModel().getColumn(0);
//        tColumn.setPreferredWidth(90);//tanggal
//        tColumn = tblAkun1.getColumnModel().getColumn(1);
//        tColumn.setPreferredWidth(250);//ket
//        tColumn = tblAkun1.getColumnModel().getColumn(2);
//        tColumn.setPreferredWidth(131);//kredit
    }
    private void jenisJurnal(){
        try {
            jSpinnerDebetSaldoAwal.setValue(0);
            if(jComboBoxJnsAkun.getSelectedItem().equals("1. Kas")){
                tblJnsJurnalD = "tbl_jurnal_penjualan";
                jnsAkunD = "kas_j";
                tblJnsJurnalK = "tbl_jurnal_pembelian";
                jnsAkunK = "kas_pb";
                loadDataPenerimaan();
                loadDataPenerimaanK();
                totalSaldo();
                kasLB = totalSaldo;
                System.out.println("jnsAKunn : "+kasLB);
                jSpinnerDebetSaldoAwal.setValue(varKasB);
                System.out.println("jnsAKunnKASSS : "+varKasB);
                jSpinnerTotalSaldo.setValue(totalSumKas);
            }
            else if(jComboBoxJnsAkun.getSelectedItem().equals("2. Pembelian")){
                tblJnsJurnalD = "tbl_jurnal_pembelian";
                jnsAkunD = "pembelian_pb";
//                tblJnsJurnalK = "tbl_jurnal_pembelian";
//                jnsAkunK = "kas_pb";
                loadDataPenerimaan();
//                loadDataPenerimaanK();
                tableModel1.getDataVector().removeAllElements(); //hapus data form
                tableModel1.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
                jSpinnerSaldoKredit.setValue(0);
                totalSaldo();
                pembelianLB=totalSaldo;
            }
            else if(jComboBoxJnsAkun.getSelectedItem().equals("3. Potongan Pembelian")){
//                tblJnsJurnalD = "tbl_jurnal_penjualan";
//                jnsAkunD = "kas_j";
                tblJnsJurnalK = "tbl_jurnal_pembelian";
                jnsAkunK = "potongan_pb";
//                loadDataPenerimaan();
                loadDataPenerimaanK();
                tableModel.getDataVector().removeAllElements(); //hapus data form
                tableModel.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
                jSpinnerSaldoDebet.setValue(0);
                totalSaldoK();
                potPembelianLB=totalSaldo;
            }
            else if(jComboBoxJnsAkun.getSelectedItem().equals("4. Penjualan")){
                tblJnsJurnalK = "tbl_jurnal_penjualan";
                jnsAkunK = "penjualan_j";
//                loadDataPenerimaan();
                loadDataPenerimaanK();
                tableModel.getDataVector().removeAllElements(); //hapus data form
                tableModel.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
                jSpinnerSaldoDebet.setValue(0);
                totalSaldoK();
                penjualanLB=totalSaldo;
            }
            else if(jComboBoxJnsAkun.getSelectedItem().equals("5. Potongan Penjualan")){
//                jnsAkunD = "kas_j";
//                jnsAkunK = "kas_pb";
//                loadDataPenerimaan();
//                loadDataPenerimaanK();
                
                tableModel.getDataVector().removeAllElements(); //hapus data form
                tableModel.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
                tableModel1.getDataVector().removeAllElements(); //hapus data form
                tableModel1.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
                jSpinnerSaldoDebet.setValue(0);
                jSpinnerSaldoKredit.setValue(0);
                totalSaldo();
                potonganPenjualanLB=totalSaldo;
            }
            else if(jComboBoxJnsAkun.getSelectedItem().equals("6. Perlengkapan")){
                tblJnsJurnalD = "tbl_jurnal_pembelian";
                jnsAkunD = "perlengkapan_pb";
//                tblJnsJurnalK = "tbl_jurnal_pembelian";
//                jnsAkunK = "kas_pb";
                loadDataPenerimaan();
//                loadDataPenerimaanK();
                tableModel1.getDataVector().removeAllElements(); //hapus data form
                tableModel1.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
                jSpinnerSaldoKredit.setValue(0);
                jSpinnerDebetSaldoAwal.setValue(varPerlengkapanB);
                totalSaldo();
                perlengkapanLB=totalSaldo;
            }
            else if(jComboBoxJnsAkun.getSelectedItem().equals("7. Beban")){
                tblJnsJurnalD = "tbl_jurnal_pembelian";
                jnsAkunD = "beban_pb";
//                tblJnsJurnalK = "tbl_jurnal_pembelian";
//                jnsAkunK = "kas_pb";
                loadDataPenerimaan();
//                loadDataPenerimaanK();
                tableModel1.getDataVector().removeAllElements(); //hapus data form
                tableModel1.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
                jSpinnerSaldoKredit.setValue(0);
                totalSaldo();
                bebanLB = totalSaldo;
                System.out.println("jnsAKunn : "+bebanLB);
            }
            else if(jComboBoxJnsAkun.getSelectedItem().equals("8. Utang Usaha")){
                tblJnsJurnalD = "tbl_jurnal_pembelian";
                jnsAkunD = "utang_pb";
                tblJnsJurnalK = "tbl_jurnal_pembelian";
                jnsAkunK = "utang_k";
                loadDataPenerimaan();
                loadDataPenerimaanK();
                totalSaldoK();
                bebanLB = totalSaldo;
                System.out.println("jnsAKunn : "+bebanLB);
            }
            else{
                tableModel.getDataVector().removeAllElements(); //hapus data form
                tableModel.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
                tableModel1.getDataVector().removeAllElements(); //hapus data form
                tableModel1.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
                jSpinnerSaldoDebet.setValue(0);
                jSpinnerSaldoKredit.setValue(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "errorrrrrrr");
        }
    }
    private void loadDataPenerimaan(){
        tableModel.getDataVector().removeAllElements(); //hapus data tabel 
        tableModel.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
        tblAkun.setModel(tableModel);
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT tanggal_j,ket_j,"+jnsAkunD+" FROM "+tblJnsJurnalD+" WHERE "+jnsAkunD+" > 0;";
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            //mengisi table
            while(resultSet.next()){
                try {
                    Object[] dt_akun = new Object[3];
                    dt_akun[0] = resultSet.getDate("tanggal_j");
                    dt_akun[1] = resultSet.getString("ket_j");
                    dt_akun[2] = resultSet.getInt(jnsAkunD);
                    tableModel.addRow(dt_akun);
                    sumD();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "error ambil data");
                }
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error pada saat load data()");
            
            System.out.println("iniiiiiiiii : "+jnsAkunD + jnsAkunK + tblJnsJurnalD + tblJnsJurnalK);
        }
    }
    private void loadDataPenerimaanK(){
        tableModel1.getDataVector().removeAllElements(); //hapus data form
        tableModel1.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
        tblAkun1.setModel(tableModel1);
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT tanggal_j,ket_j,"+jnsAkunK+" FROM "+tblJnsJurnalK+" WHERE "+jnsAkunK+" > 0;";
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            //mengisi table
            while(resultSet.next()){
                try {
                    Object[] dt_akun = new Object[3];
                    dt_akun[0] = resultSet.getDate("tanggal_j");
                    dt_akun[1] = resultSet.getString("ket_j");
                    dt_akun[2] = resultSet.getInt(jnsAkunK);
                    tableModel1.addRow(dt_akun);
                    sumK();
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "error ambil data");
                }
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error pada saat load data()");
            System.out.println("iniiiiiiiii : "+jnsAkunD + jnsAkunK + tblJnsJurnalD + tblJnsJurnalK);
        }
    }
    private void sumD(){
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT SUM("+jnsAkunD+") as totalD FROM "+tblJnsJurnalD+";";
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            if(resultSet.next()) {
                saldoD = resultSet.getString("totalD");
                jSpinnerSaldoDebet.setValue(Integer.valueOf(saldoD));
            }
            else{
                jSpinnerSaldoDebet.setValue(0);
            }
        } catch (Exception e) {
        }
    }
    private void sumK(){
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT SUM("+jnsAkunK+") as totalK FROM "+tblJnsJurnalK+";";
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            if(resultSet.next()) {
                saldoK = resultSet.getString("totalK");
                jSpinnerSaldoKredit.setValue(Integer.valueOf(saldoK));
            }
            else{
                jSpinnerSaldoKredit.setValue(0);
            }
        } catch (Exception e) {
        }
    }
    private void totalSaldo(){
        totalSaldo = (int)jSpinnerSaldoDebet.getValue()+(int)jSpinnerDebetSaldoAwal.getValue()-(int)jSpinnerSaldoKredit.getValue();
        jSpinnerTotalSaldo.setValue(totalSaldo);
    }
    private void totalSaldoK(){
        totalSaldo = (int)jSpinnerSaldoKredit.getValue()+(int)jSpinnerDebetSaldoAwal.getValue()-(int)jSpinnerSaldoDebet.getValue();
        jSpinnerTotalSaldo.setValue(totalSaldo);
    }    
    private void getAllS(){
        saldoAwal sAwal = new saldoAwal();
        varKasB = sAwal.kasKeBBesar;
        varPerlengkapanB = sAwal.perlengakapanBB;
    }

    private void sumKas(){
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT SUM(kas_j) as totalD FROM tbl_jurnal_penjualan;";
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while(resultSet.next()) {
                String strKasD = resultSet.getString("totalD");
                sumKasD = Integer.valueOf(strKasD);
                System.out.println("sumKasD "+ sumKasD);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "sumKasD");
        }
        try {
            connection = dbKonek.koneksiDB();
            Statement statement1 = (Statement) connection.createStatement();
            String sqlQuery1 = "SELECT SUM(kas_pb) as totalK FROM tbl_jurnal_pembelian;";
            ResultSet resultSet1 = statement1.executeQuery(sqlQuery1);
            while(resultSet1.next()){
                String strKasK = resultSet1.getString("totalK");
                sumKasK = Integer.valueOf(strKasK);
                System.out.println("sumKasK "+ sumKasK);
            }
        } catch (Exception e) {
        }finally{
            totalSumKas = varKasB+sumKasD-sumKasK;
            System.out.println("totalSumKas :" +totalSumKas);
        }
        //perlengkapan
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT SUM(perlengkapan_pb) as totalD FROM tbl_jurnal_pembelian;";
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while(resultSet.next()) {
                String strKasD = resultSet.getString("totalD");
                sumPerlengkapanD = Integer.valueOf(strKasD);
                totalSumPerlengkapan = sumPerlengkapanD+varPerlengkapanB;
                System.out.println("totalSumPerlengkapan "+ totalSumPerlengkapan);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "sumKasD");
        }
    }
}
