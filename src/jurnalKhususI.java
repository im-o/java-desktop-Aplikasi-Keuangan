import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.Connection;
public class jurnalKhususI extends javax.swing.JInternalFrame {
    DefaultTableModel tableModel;
    String tblJnsJurnal;
    String jnsJurnal;
    String jenisTabel ="tbl_jurnal_penjualan";
    private Connection connection;
    
    public jurnalKhususI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAkun = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxJnsAkun = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jSpinnerKredit = new javax.swing.JSpinner();
        jSpinnerDebet = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonRefresh = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblAkun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PILIH JENIS JURNAL TERLEBIH DAHULU"
            }
        ));
        tblAkun.setEnabled(false);
        jScrollPane1.setViewportView(tblAkun);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jComboBoxJnsAkun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Jenis Jurnal Khusus -", "1. Jurnal Penerimaan Kas", "2. Jurnal Pengeluaran Kas", "3. Jurnal Pembelian", "4. x" }));
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
                .addComponent(jComboBoxJnsAkun, 0, 274, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxJnsAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("DEBET(D)");

        jLabel3.setText("KREDIT(K)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSpinnerDebet, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinnerKredit, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jSpinnerDebet, jSpinnerKredit});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerKredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerDebet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Andalus", 0, 24)); // NOI18N
        jLabel2.setText("Informasi Saldo >>>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_update_black_18dp.png"))); // NOI18N
        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRefresh)
                .addGap(61, 61, 61))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRefresh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxJnsAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJnsAkunActionPerformed
        jenisJurnal();
    }//GEN-LAST:event_jComboBoxJnsAkunActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        jenisJurnal();
    }//GEN-LAST:event_jButtonRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JComboBox<String> jComboBoxJnsAkun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerDebet;
    private javax.swing.JSpinner jSpinnerKredit;
    private javax.swing.JTable tblAkun;
    // End of variables declaration//GEN-END:variables
    private void initTablePenerimaan(){
        tableModel = new DefaultTableModel();
        tblAkun.setModel(tableModel);
        tableModel.addColumn("Tanggal");
        tableModel.addColumn("Keterangan");
//        tableModel.addColumn("Ref");
        tableModel.addColumn("Kas(D)");
        tableModel.addColumn("Potongan(D)");
        tableModel.addColumn("Penjualan(K)");
        tableModel.addColumn("Piutang(K)");
    }
    private void initTablePenjualan(){
        tableModel = new DefaultTableModel();
        tblAkun.setModel(tableModel);
        tableModel.addColumn("Tanggal");
        tableModel.addColumn("Keterangan");
//        tableModel.addColumn("Ref");
        tableModel.addColumn("Piutang(D)");
        tableModel.addColumn("Lain-lain(D)");
        tableModel.addColumn("Penjualan(K)");
    }
    private void initTablePengeluaran(){
        tableModel = new DefaultTableModel();
        tblAkun.setModel(tableModel);
        tableModel.addColumn("Tanggal");
        tableModel.addColumn("Keterangan");
//        tableModel.addColumn("Ref");
        tableModel.addColumn("Utang(D)");
        tableModel.addColumn("Pembelian(D)");
        tableModel.addColumn("Peralatan(D)");
        tableModel.addColumn("Perlengkapan(D)");
        tableModel.addColumn("Beban(D)");
        tableModel.addColumn("Dividen(D)");
        tableModel.addColumn("Potongan(K)");
        tableModel.addColumn("Kas(K)");
    }
    private void initTablePembelian(){
        tableModel = new DefaultTableModel();
        tblAkun.setModel(tableModel);
        tableModel.addColumn("Tanggal");
        tableModel.addColumn("Keterangan");
//        tableModel.addColumn("Ref");
        tableModel.addColumn("Pembelian(D)");
        tableModel.addColumn("Peralatan(D)");
        tableModel.addColumn("Utang(K)");
//        tableModel.addColumn("Lain-lain(K)");
    }
    private void jenisJurnal(){
        if(jComboBoxJnsAkun.getSelectedItem().equals("1. Jurnal Penerimaan Kas")){
            tblJnsJurnal = "tbl_jurnal_penjualan";
            initTablePenerimaan();
            sumTableD();
            sumTableK();
            loadDataPenerimaan();
        }
        else if(jComboBoxJnsAkun.getSelectedItem().equals("4. Jurnal Penjualan")){
            tblJnsJurnal = "tbl_jurnal_penjualan";
            initTablePenjualan();
        }
        else if(jComboBoxJnsAkun.getSelectedItem().equals("2. Jurnal Pengeluaran Kas")){
            tblJnsJurnal = "tbl_jurnal_pembelian";
            initTablePengeluaran();
            loadDataPengeluaran();
        }
        else if(jComboBoxJnsAkun.getSelectedItem().equals("3. Jurnal Pembelian")){
            tblJnsJurnal = "tbl_jurnal_pembelian";
            initTablePembelian();
            pembelianK();
        }
    }
    //penerimaan
    private void loadDataPenerimaan(){
        tableModel.getDataVector().removeAllElements(); //hapus data form
        tableModel.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT tanggal_j,ket_j,kas_j,potongan_j,penjualan_j,bayar_piutang_j FROM "+tblJnsJurnal+";";
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            //mengisi table
            while(resultSet.next()){
                try {
                    Object[] dt_akun = new Object[6];
                    dt_akun[0] = resultSet.getDate("tanggal_j");
                    dt_akun[1] = resultSet.getString("ket_j");
//                    dt_akun[1] = resultSet.getString("ref_j");
                    dt_akun[2] = resultSet.getInt("kas_j");
                    dt_akun[3] = resultSet.getInt("potongan_j");
                    dt_akun[4] = resultSet.getInt("penjualan_j");
                    dt_akun[5] = resultSet.getInt("bayar_piutang_j");
                    tableModel.addRow(dt_akun);
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "error ambil data");
                }
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error pada saat load data()");
        }
    }
    //pengeluaran kas
    private void loadDataPengeluaran(){
        tableModel.getDataVector().removeAllElements(); //hapus data form
        tableModel.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT tanggal_j,ket_j,utang_pb,pembelian_pb,peralatan_pb,perlengkapan_pb,beban_pb,"
                    + "dividen_pb,potongan_pb,kas_pb FROM "+tblJnsJurnal+" WHERE kas_pb > 0;";
            System.out.println("jenis tbl : "+tblJnsJurnal);
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            //mengisi table
            while(resultSet.next()){
                try {
                    Object[] dt_akun = new Object[10];
                    dt_akun[0] = resultSet.getDate("tanggal_j");
                    dt_akun[1] = resultSet.getString("ket_j");
//                    dt_akun[2] = resultSet.getString("ref_j");
                    dt_akun[2] = resultSet.getInt("utang_pb");
                    dt_akun[3] = resultSet.getInt("pembelian_pb");
                    dt_akun[4] = resultSet.getInt("peralatan_pb");
                    dt_akun[5] = resultSet.getInt("perlengkapan_pb");
                    dt_akun[6] = resultSet.getString("beban_pb");
                    dt_akun[7] = resultSet.getString("dividen_pb");
                    dt_akun[8] = resultSet.getString("potongan_pb");
                    dt_akun[9] = resultSet.getString("kas_pb");
                    tableModel.addRow(dt_akun);
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "error ambil data pengeluaran kas");
                }
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error pada saat load datapengeluarankas()");
        }
    }    
    //pembelian kredit
    private void pembelianK(){
        tableModel.getDataVector().removeAllElements(); //hapus data form
        tableModel.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT tanggal_j,ket_j,pembelian_k,peralatan_k,utang_k  FROM "+tblJnsJurnal+" WHERE utang_k > 0;";
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            //mengisi table
            while(resultSet.next()){
                try {
                    Object[] dt_akun = new Object[6];
                    dt_akun[0] = resultSet.getDate("tanggal_j");
                    dt_akun[1] = resultSet.getString("ket_j");
//                    dt_akun[1] = resultSet.getString("ref_j");
                    dt_akun[2] = resultSet.getInt("pembelian_k");
                    dt_akun[3] = resultSet.getInt("peralatan_k");
                    dt_akun[4] = resultSet.getInt("utang_k");
//                    dt_akun[5] = resultSet.getInt("lain_k");
                    tableModel.addRow(dt_akun);
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "error ambil data");
                }
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error pada saat load data()");
        }
    }
    
    private void sumTableD(){
//        tableModel.getDataVector().removeAllElements();
//        tableModel.fireTableDataChanged();
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT SUM(kas_j) as sumTotalKas FROM "+jenisTabel;
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while(resultSet.next()){
                String sum = resultSet.getString("sumTotalKas");//sumTotal dipanggil dari db
                jSpinnerDebet.setValue(Integer.valueOf(sum));//conver ke int
                System.out.println("sumTabel : "+Integer.valueOf(sum));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "e");
        }
    }
    private void sumTableK(){
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT SUM(penjualan_j) as sumTotalK FROM "+jenisTabel;
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            if(resultSet.next()){
                String sum = resultSet.getString("sumTotalK");//sumTotal dipanggil dari db
                jSpinnerKredit.setValue(Integer.valueOf(sum));//conver ke int
            }
        } catch (Exception e) {
        }
    }
}
