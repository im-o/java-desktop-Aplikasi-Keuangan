import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.DateFormatter;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.util.Date;
import java.util.logging.Logger;
import java.util.logging.Level;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.table.DefaultTableCellRenderer;
//liborint
import java.awt.print.PrinterAbortException;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable.PrintMode;


/**
 *
 * @author Ramayanti
 */
public class jurnalPenjualan extends javax.swing.JInternalFrame {
//    String jenisAkun = "";
    String jenisDB ="tbl_jurnal_penjualan";
    String pilihMakanan ="";
    String jnsMakananClicked ="";
    String kopi1 = "kopi susu";
    //jurnalKhusus
    String pembayaranD,pembayaranK;
    int indexPembayaranD,indexPembayaranK;
    
//    String jenisMkn="";
    private DefaultTableModel tableModel;
    private Connection connection;
    private String iniGetTgl;
    
    public jurnalPenjualan() {
        initComponents();
        initTable();
        initDate();
        sumTable();
        loadData();
//        totalSeluruh();
//        setLocationRelativeTo(null);
        System.out.println("tanggal : "+iniGetTgl);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelForm = new javax.swing.JPanel();
        jPanelBtn = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextCari = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooserUrut1 = new com.toedter.calendar.JDateChooser();
        jDateChooserUrut2 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jButtonUrutkan = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSpinnerTotal = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTgl = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRef = new javax.swing.JTextField();
        jSpinnerHarga = new javax.swing.JSpinner();
        jSpinnerJml = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxJenis = new javax.swing.JComboBox<>();
        jComboBoxPilih = new javax.swing.JComboBox<>();
        jLabelRef = new javax.swing.JTextField();
        jComboBoxJPembayaran = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAkun = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSpinnerTotalSemua = new javax.swing.JSpinner();

        setClosable(true);
        setTitle("PENERIMAAN & PENJUALAN");
        setToolTipText("");

        jPanelForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanelBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_assignment_turned_in_black_18dp.png"))); // NOI18N
        btnSimpan.setText(" Save");
        btnSimpan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_system_update_alt_black_18dp.png"))); // NOI18N
        btnEdit.setText("Update");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_delete_forever_black_18dp.png"))); // NOI18N
        btnHapus.setText("Delete");
        btnHapus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_refresh_black_18dp.png"))); // NOI18N
        btnClear.setText("Refesh");
        btnClear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_print.png"))); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnLayout = new javax.swing.GroupLayout(jPanelBtn);
        jPanelBtn.setLayout(jPanelBtnLayout);
        jPanelBtnLayout.setHorizontalGroup(
            jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBtnLayout.setVerticalGroup(
            jPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBtnLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap())
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        jLabel10.setText("Cari berdasarkan keterangan kas :");

        jTextCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextCariKeyReleased(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic_search_black_18dp.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextCari, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Andalus", 0, 12)); // NOI18N
        jLabel11.setText("Urutkan berdasarkan tanggal dari :");

        jLabel12.setFont(new java.awt.Font("Aharoni", 0, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("-");

        jButtonUrutkan.setText("Urutkan");
        jButtonUrutkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUrutkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUrutkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jDateChooserUrut1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooserUrut2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jDateChooserUrut1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDateChooserUrut2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jButtonUrutkan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Andalus", 0, 28)); // NOI18N
        jLabel7.setText("Total Bayar");

        jLabel8.setText(" Rp.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("=");

        jSpinnerTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSpinnerTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinnerTotal.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinnerTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jSpinnerTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Tanggal :");

        txtTgl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTglPropertyChange(evt);
            }
        });

        jLabel3.setText("Keterangan :");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane3.setViewportView(txtKeterangan);

        jLabel4.setText("J.Pembayaran :");

        jLabel5.setText("Harga :");

        txtRef.setEditable(false);
        txtRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRefActionPerformed(evt);
            }
        });

        jSpinnerHarga.setToolTipText("");
        jSpinnerHarga.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerHargaStateChanged(evt);
            }
        });

        jSpinnerJml.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerJmlStateChanged(evt);
            }
        });

        jLabel6.setText("Jumlah :");

        jLabel15.setText("Jenis Makanan :");

        jComboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Jenis -" }));
        jComboBoxJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJenisActionPerformed(evt);
            }
        });

        jComboBoxPilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih -", "1. Kopi", "2. Jus", "3. Nasi", "4. Pisang Goreng", "5. Mie", "6. Lain-lain" }));
        jComboBoxPilih.setToolTipText("");
        jComboBoxPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPilihActionPerformed(evt);
            }
        });

        jLabelRef.setEditable(false);
        jLabelRef.setEnabled(false);

        jComboBoxJPembayaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih -", "Kas/Tunai" }));
        jComboBoxJPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJPembayaranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(txtTgl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerJml, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxPilih, 0, 119, Short.MAX_VALUE)
                                    .addComponent(jSpinnerHarga)
                                    .addComponent(jComboBoxJPembayaran, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBoxJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelRef)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxJPembayaran, jComboBoxPilih});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxJPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSpinnerHarga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinnerJml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxJPembayaran, jComboBoxPilih});

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblAkun.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblAkun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAkun.getTableHeader().setReorderingAllowed(false);
        tblAkun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAkunMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAkun);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Andalus", 0, 18)); // NOI18N
        jLabel9.setText("Total :");

        jSpinnerTotalSemua.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinnerTotalSemua.setEnabled(false);
        jSpinnerTotalSemua.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinnerTotalSemua, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerTotalSemua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSpinnerTotalSemua.getAccessibleContext().setAccessibleName("");
        jSpinnerTotalSemua.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
//        System.out.println("Jenis akun saat ini : "+jenisAkun);
        String tesTgl;
        //        String varDate =""+txtTgl.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        tesTgl = sdf.format(txtTgl.getDate());
        String varKet = txtKeterangan.getText();
        String varJns = pilihMakanan;
        System.out.println("combo : "+varJns);
        String varRef = txtRef.getText();
        String varHarga = jSpinnerHarga.getValue().toString();
        String varJml = jSpinnerJml.getValue().toString();
        String varTtl = jSpinnerTotal.getValue().toString();
        String varPembayaranD = jSpinnerTotal.getValue().toString();
        String varPembayaranK = jSpinnerTotal.getValue().toString();
        
        

        //jika ada data masih kosong
        if(varKet.equals("")||(varJns.equals("- Jenis -"))||(jComboBoxJPembayaran.getSelectedItem().equals("- Pilih -"))||(varJml.equals("0"))){
            JOptionPane.showMessageDialog(null, "Masih ada Form yang kosong, coba periksa");
            return;
        }

        //hubungkan ke database
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "INSERT INTO "+jenisDB+" (id_j, tanggal_j, ket_j, jenis_j, ref_j, harga_j, jumlah_j,"
                    + "total_harga_j,"+pembayaranD+","+pembayaranK+")VALUES (NULL,?,?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement preStatement = (PreparedStatement) connection.prepareStatement(sqlQuery);
                try {
                    preStatement.setDate(1, java.sql.Date.valueOf(tesTgl));
                    //                preStatement.setDate(1, java.sql.Date.valueOf("2018-09-04"));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "error di set DATE");
                }
                try {
                preStatement.setString(2, varKet);
                preStatement.setString(3, varJns);
                preStatement.setString(4, varRef);
                preStatement.setString(5, varHarga);
                preStatement.setString(6, varJml);
                preStatement.setString(7, varTtl);
                preStatement.setString(8, varPembayaranD);
                preStatement.setString(9, varPembayaranK);
                
                System.out.println("iniD : "+indexPembayaranD+pembayaranD);
                System.out.println("iniK : "+indexPembayaranK+pembayaranK);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "fixError");
                }
                
                preStatement.executeUpdate();
//                sumTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error di set preStatement save");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error pada saat simpan data");
        }finally{
            loadData();
        }

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int rowBaris = tblAkun.getSelectedRow();
        if(rowBaris == -1){
            JOptionPane.showMessageDialog(null, "Belum ada data terseleksi!");
            return;
        }
        try {
            String tesTgl;
            String varId = (String) tableModel.getValueAt(rowBaris, 0).toString();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            tesTgl = sdf.format(txtTgl.getDate());
            String varKet = txtKeterangan.getText();
            String varJns = pilihMakanan;
            String varRef = txtRef.getText();
            String varHarga = jSpinnerHarga.getValue().toString();
            String varJml = jSpinnerJml.getValue().toString();
            String varTtl = jSpinnerTotal.getValue().toString();
            if((varKet.equals(""))||(varJns.equals("- Jenis -"))||(jComboBoxJPembayaran.getSelectedItem().equals("- Pilih -"))||(varHarga.equals("0"))||(varJml.equals("0"))){
                JOptionPane.showMessageDialog(null, "Gagal Update, Ada Form masih kosong, coba periksa !!");
                return;
            }
            try {
                //hubungkan ke database
                connection = dbKonek.koneksiDB();
                String sqlQuery = "UPDATE "+jenisDB+" SET tanggal_j=?, ket_j=?, jenis_j=?, ref_j=?, harga_j=?, jumlah_j=?, total_harga_j=?"
                + "WHERE id_j=?";
                try {
                    PreparedStatement preStatement = (PreparedStatement) connection.prepareStatement(sqlQuery);
                    try {
                        preStatement.setDate(1, java.sql.Date.valueOf(tesTgl));
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "error di set DATE/tanggal");
                    }
                    preStatement.setString(2, varKet);
                    preStatement.setString(3, varJns);
                    preStatement.setString(4, varRef);
                    preStatement.setString(5, varHarga);
                    preStatement.setString(6, varJml);
                    preStatement.setString(7, varTtl);
                    preStatement.setString(8, varId);
                    preStatement.executeUpdate();
                    sumTable();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "error di set Data");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error pada saat EDIT/UPDATE data");
            }finally{
                loadData();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error ketika ambil data");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        btnHapus();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        resetForm();
        loadData();
    }//GEN-LAST:event_btnClearActionPerformed

    private void jTextCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCariKeyReleased
        cariData();
    }//GEN-LAST:event_jTextCariKeyReleased

    private void jButtonUrutkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUrutkanActionPerformed
        orderByDate();
    }//GEN-LAST:event_jButtonUrutkanActionPerformed

    private void txtTglPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTglPropertyChange
        if(txtTgl.getDate()!= null){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            iniGetTgl=format.format(txtTgl.getDate());
        }
    }//GEN-LAST:event_txtTglPropertyChange

    private void txtRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRefActionPerformed

    private void tblAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAkunMouseClicked
        tableClicked();
    }//GEN-LAST:event_tblAkunMouseClicked

    private void jSpinnerJmlStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerJmlStateChanged
        int totalHrg = (int)jSpinnerHarga.getValue()*(int)jSpinnerJml.getValue();
        jSpinnerTotal.setValue(totalHrg);
    }//GEN-LAST:event_jSpinnerJmlStateChanged

    private void jSpinnerHargaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerHargaStateChanged
        int totalHrg = (int)jSpinnerHarga.getValue()*(int)jSpinnerJml.getValue();
        jSpinnerTotal.setValue(totalHrg);
    }//GEN-LAST:event_jSpinnerHargaStateChanged

    private void jComboBoxPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPilihActionPerformed
        jComboBoxPilih();
    }//GEN-LAST:event_jComboBoxPilihActionPerformed

    private void jComboBoxJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJenisActionPerformed
        jComboBoxJenis();
    }//GEN-LAST:event_jComboBoxJenisActionPerformed

    private void jComboBoxJPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJPembayaranActionPerformed
        jenisPembayaran();
    }//GEN-LAST:event_jComboBoxJPembayaranActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Data yang dicetak akan sama dengan yang ditabel\n"
                + "silahkan difilter terlebih dahulu bila ingin\nTekan Yes untuk lanjut mencetak data . .");
        if(dialogResult == JOptionPane.YES_OPTION){
            try {
                tblAkun.print(PrintMode.FIT_WIDTH, new MessageFormat("Data Penjualan"+"                     Date print : "+iniGetTgl),null);
            } catch (PrinterException ex) {
                Logger.getLogger(jurnalPenjualan.class.getName()).log(Level.SEVERE,null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonUrutkan;
    private javax.swing.JComboBox<String> jComboBoxJPembayaran;
    private javax.swing.JComboBox<String> jComboBoxJenis;
    private javax.swing.JComboBox<String> jComboBoxPilih;
    private com.toedter.calendar.JDateChooser jDateChooserUrut1;
    private com.toedter.calendar.JDateChooser jDateChooserUrut2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLabelRef;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelBtn;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinnerHarga;
    private javax.swing.JSpinner jSpinnerJml;
    private javax.swing.JSpinner jSpinnerTotal;
    private javax.swing.JSpinner jSpinnerTotalSemua;
    private javax.swing.JTextField jTextCari;
    private javax.swing.JTable tblAkun;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextField txtRef;
    private com.toedter.calendar.JDateChooser txtTgl;
    // End of variables declaration//GEN-END:variables

/*
hi.
Attention.
Seluruh bagian ke bawa ini adalah fungsi/method yang nantinya akan dipanggil    
*/
    
    private void sumTable(){
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT SUM(total_harga_j) as sumTotal FROM "+jenisDB;
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            if(resultSet.next()){
                String sum = resultSet.getString("sumTotal");//sumTotal dipanggil dari db
                jSpinnerTotalSemua.setValue(Integer.valueOf(sum));//conver ke int
//                jTextFieldTotal.setText(sum);
            }
        } catch (Exception e) {
        }
    }
    private final void totalSeluruh(){
        int total =0;
        for (int i=0;i<tableModel.getRowCount();i++){
            int amount = Integer.parseInt((String)tableModel.getValueAt(i, 7));
            total += amount;
        }
        System.out.println("total :: "+total);
//        jSpinnerTotalSemua.setValue(total);
    }
    private void resetAutoIncrement(){
        String sqlQuery = "ALTER TABLE "+jenisDB+" AUTO_INCREMENT=1";
            try {
                PreparedStatement preStatement = (PreparedStatement) connection.prepareStatement(sqlQuery);
                preStatement.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error pada fungsi resetAutoIncrement");
        }
    }
    private void resetForm(){
        Date date = new Date();
        txtTgl.setDate(date);
        txtKeterangan.setText("");
        jComboBoxPilih.setSelectedItem("- Pilih -");
        jComboBoxJPembayaran.setSelectedItem("- Pilih -");
        txtRef.setText("");
        jLabelRef.setText("");
        jSpinnerHarga.setValue(0);
        jSpinnerJml.setValue(0);
        jTextCari.setText("");
        sumTable();
    }
    private void initDate(){
        Date date = new Date();
        jDateChooserUrut1.setDate(date);
        jDateChooserUrut2.setDate(date);
        txtTgl.setDate(date);
    }
    private void initTable(){
        tableModel = new DefaultTableModel();
        tblAkun.setModel(tableModel);
        tableModel.addColumn("ID");
        tableModel.addColumn("Tanggal");
        tableModel.addColumn("Keterangan");
        tableModel.addColumn("Jenis Makanan");
        tableModel.addColumn("Ref");
        tableModel.addColumn("Harga/Satuan");
        tableModel.addColumn("Jumlah");
        tableModel.addColumn("Total Bayar");
        //column
        TableColumn tColumn;
        tblAkun.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tColumn = tblAkun.getColumnModel().getColumn(0);
        tColumn.setPreferredWidth(35);//id
        tColumn = tblAkun.getColumnModel().getColumn(1);
        tColumn.setPreferredWidth(78);//tgl
        tColumn = tblAkun.getColumnModel().getColumn(2);
        tColumn.setPreferredWidth(235);//ket
        tColumn = tblAkun.getColumnModel().getColumn(3);
        tColumn.setPreferredWidth(230);//jns mkn
        tColumn = tblAkun.getColumnModel().getColumn(4);
        tColumn.setPreferredWidth(35);//ref
        tColumn = tblAkun.getColumnModel().getColumn(5);
        tColumn.setPreferredWidth(100);//hrg/stuan
        tColumn = tblAkun.getColumnModel().getColumn(6);
        tColumn.setPreferredWidth(60);//jumlah
        tColumn = tblAkun.getColumnModel().getColumn(7);
        tColumn.setPreferredWidth(100);//ttl
        
    }
    //method orderByDate
    private void orderByDate(){
        String varDate1;
        String varDate2;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        varDate1 = sdf.format(jDateChooserUrut1.getDate());
        varDate2 = sdf.format(jDateChooserUrut2.getDate());
//        System.out.println("var 1 : "+varDate1);
//        System.out.println("var 2 : "+varDate2);
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT * FROM "+jenisDB+" WHERE tanggal_j BETWEEN '"+varDate1+"' AND '"+varDate2+"'";
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            //mengisi table
            while(resultSet.next()){
                try{
                    Object[] dt_akun = new Object[8];
                    dt_akun[0] = resultSet.getInt("id_j");//id_j dipanggil dari db
                    dt_akun[1] = resultSet.getDate("tanggal_j");
                    dt_akun[2] = resultSet.getString("ket_j");
                    dt_akun[3] = resultSet.getString("jenis_j");
                    dt_akun[4] = resultSet.getString("ref_j");
                    dt_akun[5] = resultSet.getInt("harga_j");
                    dt_akun[6] = resultSet.getInt("jumlah_j");
                    dt_akun[7] = resultSet.getInt("total_harga_j");
                    tableModel.addRow(dt_akun);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "error di fungsi orderDate");
                }
//                resultSet.close();
//                statement.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error ! Coba periksa Jenis akun / Tanggal");
        }
    }
    
    //method cariData
    private void cariData(){
        String cari = jTextCari.getText();
        tableModel.getDataVector().removeAllElements(); //hapus data form
        tableModel.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "SELECT * FROM "+jenisDB+" WHERE ket_j LIKE '%"+cari+"%'";
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            //mengisi table
            while(resultSet.next()){
                try {
                    Object[] dt_akun = new Object[8];
                    dt_akun[0] = resultSet.getInt("id_j");
                    dt_akun[1] = resultSet.getDate("tanggal_j");
                    dt_akun[2] = resultSet.getString("ket_j");
                    dt_akun[3] = resultSet.getString("jenis_j");
                    dt_akun[4] = resultSet.getString("ref_j");
                    dt_akun[5] = resultSet.getInt("harga_j");
                    dt_akun[6] = resultSet.getInt("jumlah_j");
                    dt_akun[7] = resultSet.getInt("total_harga_j");
                    tableModel.addRow(dt_akun);
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "error ambil data ini");
                }
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error! Data tidak ditemukan Coba periksa Jenis akun dll.");
        }
    }
    
    //method loadData
    private void loadData(){
        tableModel.getDataVector().removeAllElements(); //hapus data form
        tableModel.fireTableDataChanged(); //memberitahu bahwa data kosong (berubah)
        try {
            connection = dbKonek.koneksiDB();
//            if(jenisAkun=="Kas"){
//                jenisDB="tbl_kas";
//            }
//            else if(jenisAkun=="Penjualan"){
//                jenisDB="tbl_buku_besar";
//            }
            String sqlQuery = "SELECT * FROM "+jenisDB;
            Statement statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            
            //mengisi table
            while(resultSet.next()){
                try {
                    Object[] dt_akun = new Object[8];
                    dt_akun[0] = resultSet.getInt("id_j");
                    dt_akun[1] = resultSet.getDate("tanggal_j");
                    dt_akun[2] = resultSet.getString("ket_j");
                    dt_akun[3] = resultSet.getString("jenis_j");
                    dt_akun[4] = resultSet.getString("ref_j");
                    dt_akun[5] = resultSet.getInt("harga_j");
                    dt_akun[6] = resultSet.getInt("jumlah_j");
                    dt_akun[7] = resultSet.getInt("total_harga_j");
                    tableModel.addRow(dt_akun);
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "error ambil data load");
                }
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error pada saat load data JP");
        }
    }
    
    //method btnHapus
    private void btnHapus(){
        int rowBaris = tblAkun.getSelectedRow();
        if(rowBaris==-1){
            JOptionPane.showMessageDialog(null, "Gagal hapus, coba periksa lagi!\n"
                + "Pilih salah satu data pada table \nyang ingin dihapus");
            return;
        }
        String varId = (String) tableModel.getValueAt(rowBaris, 0).toString();
        try {
            connection = dbKonek.koneksiDB();
            String sqlQuery = "DELETE FROM "+jenisDB+" WHERE id_j=?";
            try {
                PreparedStatement preStatement = (PreparedStatement) connection.prepareStatement(sqlQuery);
                preStatement.setString(1, varId);
                preStatement.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "menghapus error, cek btnhapus");
            }finally{
                resetAutoIncrement();
                resetForm();
                loadData();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "konek error, cek btnhapus");
        }
    }
    
    //method ketika table di klik maka akan mengirim data ke form2 yang ada
    private void tableClicked(){
        try {
            int row = tblAkun.getSelectedRow();
            //int column = tblAkun.getSelectedColumn();
            if (row == -1){
                return;
            }
            //mengambil data dari tabel
            String str_tgl = String.valueOf(tableModel.getValueAt(row, 1));
            Date tanggal = null;
            try {
                tanggal = new SimpleDateFormat("yyyy-MM-dd").parse(str_tgl);
                txtTgl.setDate(tanggal);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error");
            }
            String ktrAkun = (String) tableModel.getValueAt(row, 2);
            jnsMakananClicked = (String) tableModel.getValueAt(row, 3); //disimpan ke variable global
            String refAkun = (String) tableModel.getValueAt(row, 4);
            String hrgAkun = (String) tableModel.getValueAt(row, 5).toString();
            String jmlAkun = (String) tableModel.getValueAt(row, 6).toString();
            String ttlAkun = (String) tableModel.getValueAt(row, 7).toString();
            jenisMakanan();
            
            txtKeterangan.setText(ktrAkun);
            txtRef.setText(refAkun);
//            jComboBoxPilih.setSelectedItem((String) tableModel.getValueAt(row, 3).toString());
            jComboBoxJenis.setSelectedItem(jnsMakananClicked);
            jComboBoxJPembayaran.setSelectedItem("Kas/Tunai");
            jSpinnerHarga.setValue(Integer.valueOf(hrgAkun));
            jSpinnerJml.setValue(Integer.valueOf(jmlAkun));
//            jComboBoxPilih.setSelectedItem(jnsAkun);
//            jSpinnerTotal.setValue(Integer.valueOf(ttlAkun));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Ambil Data");
        }
    }
    
    private void attention(){
        JOptionPane.showMessageDialog(null, "HEI BRO");
    }
    
    private void jComboBoxPilih(){
        if (jComboBoxPilih.getSelectedItem().equals("1. Kopi")){
            String[] makanan = {"- Jenis -", "kopi susu", "kopi hitam", "kopi cappucino"};
            jComboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(makanan));
//            txtRef.setText("001");
//            jLabelRef.setText("Kas");
        }
        else if(jComboBoxPilih.getSelectedItem().equals("2. Jus")){
            jComboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"- Jenis -","jus jeruk", "jus alpukat", "jus melon"}));
//            txtRef.setText("002");
//            jLabelRef.setText("Penjualan");
        }
        else if(jComboBoxPilih.getSelectedItem().equals("3. Nasi")){
            jComboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Jenis -","nasi goreng biasa", "nasi goreng merah", "nasi goreng jakarta"}));
//            txtRef.setText("003");
//            jLabelRef.setText("Penjualan1");
        }
        else if(jComboBoxPilih.getSelectedItem().equals("4. Pisang Goreng")){
            jComboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Jenis -","pisang goreng biasa", "pisang goreng keju", "pisang goreng coklat"}));
//            txtRef.setText("004");
//            jLabelRef.setText("Penjualan2");
        }
        else if(jComboBoxPilih.getSelectedItem().equals("5. Mie")){
            jComboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Jenis -","mie soto", "mie sumur", "mie dan nasi"}));
//            txtRef.setText("005");
//            jLabelRef.setText("Penjualan3");
        }
        else if(jComboBoxPilih.getSelectedItem().equals("6. Lain-lain")){
            jComboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"lain-lain"}));
            pilihMakanan = "lain-lain";
//            txtRef.setText("006");
//            jLabelRef.setText("Penjualan4");
        }
        else{
            jComboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"- Jenis -"}));
            jComboBoxPilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"- Pilih -","1. Kopi","2. Jus","3. Nasi","4. Pisang Goreng","5. Mie","6. Lain-lain"}));
            pilihMakanan = null;
        }
    }
        
    private void jComboBoxJenis(){
        //kopi
        if(jComboBoxJenis.getSelectedItem().equals("kopi susu")){
            pilihMakanan = "kopi susu";
            jSpinnerHarga.setValue(6000); //harga
        }
        else if(jComboBoxJenis.getSelectedItem().equals("kopi hitam")){
            pilihMakanan = "kopi hitam";
            jSpinnerHarga.setValue(5000); //harga
        }
        else if(jComboBoxJenis.getSelectedItem().equals("kopi cappucino")){
            pilihMakanan = "kopi cappucino";
            jSpinnerHarga.setValue(7000); //harga
        }
        //jus
        else if(jComboBoxJenis.getSelectedItem().equals("jus jeruk")){
            pilihMakanan = "jus jeruk";
            jSpinnerHarga.setValue(8000);
        }
        else if(jComboBoxJenis.getSelectedItem().equals("jus alpukat")){
            pilihMakanan = "jus alpukat";
            jSpinnerHarga.setValue(8000);
        }
        else if(jComboBoxJenis.getSelectedItem().equals("jus melon")){
            pilihMakanan = "jus melon";
            jSpinnerHarga.setValue(8000);
        }
        //nasi
        else if(jComboBoxJenis.getSelectedItem().equals("nasi goreng biasa")){
            pilihMakanan = "nasi goreng biasa";
            jSpinnerHarga.setValue(10000);
        }
        else if(jComboBoxJenis.getSelectedItem().equals("nasi goreng merah")){
            pilihMakanan = "nasi goreng merah";
        }
        else if(jComboBoxJenis.getSelectedItem().equals("nasi goreng jakarta")){
            pilihMakanan = "nasi goreng jakarta";
            jSpinnerHarga.setValue(12000);
        }
        //pisang
        else if(jComboBoxJenis.getSelectedItem().equals("pisang goreng biasa")){
            pilihMakanan = "pisang goreng biasa";
            jSpinnerHarga.setValue(10000);
        }
        else if(jComboBoxJenis.getSelectedItem().equals("pisang goreng keju")){
            pilihMakanan = "pisang goreng keju";
            jSpinnerHarga.setValue(12000);
        }
        else if(jComboBoxJenis.getSelectedItem().equals("pisang goreng coklat")){
            pilihMakanan = "pisang goreng coklat";
            jSpinnerHarga.setValue(15000);
        }
        //mie
        else if(jComboBoxJenis.getSelectedItem().equals("mie soto")){
            pilihMakanan = "mie soto";
            jSpinnerHarga.setValue(10000);
        }
        else if(jComboBoxJenis.getSelectedItem().equals("mie sumur")){
            pilihMakanan = "mie sumur";
            jSpinnerHarga.setValue(10000);
        }
        else if(jComboBoxJenis.getSelectedItem().equals("mie dan nasi")){
            pilihMakanan = "mie dan nasi";
            jSpinnerHarga.setValue(15000);
        }
        else if(jComboBoxJenis.getSelectedItem().equals("lain-lain")){
            pilihMakanan = "lain-lain";
        }
        else{
            pilihMakanan = "- Jenis -";
        }
    }
    public void jenisMakanan(){
        if ((jnsMakananClicked.equals("kopi susu"))||(jnsMakananClicked.equals("kopi hitam"))||(jnsMakananClicked.equals("kopi cappucino"))){
            jComboBoxPilih.setSelectedItem("1. Kopi");
        }
        else if((jnsMakananClicked.equals("jus jeruk"))||(jnsMakananClicked.equals("jus alpukat"))||(jnsMakananClicked.equals("jus melon"))){
            jComboBoxPilih.setSelectedItem("2. Jus");
        }
        else if((jnsMakananClicked.equals("nasi goreng biasa"))||(jnsMakananClicked.equals("nasi goreng merah"))||(jnsMakananClicked.equals("nasi goreng jakarta"))){
            jComboBoxPilih.setSelectedItem("3. Nasi");
        }
        else if((jnsMakananClicked.equals("pisang goreng biasa"))||(jnsMakananClicked.equals("pisang goreng keju"))||(jnsMakananClicked.equals("pisang goreng coklat"))){
            jComboBoxPilih.setSelectedItem("4. Pisang Goreng");
        }
        else if((jnsMakananClicked.equals("mie soto"))||(jnsMakananClicked.equals("mie sumur"))||(jnsMakananClicked.equals("mie dan nasi"))){
            jComboBoxPilih.setSelectedItem("5. Mie");
        }
        else if(jnsMakananClicked.equals("lain-lain")){
            jComboBoxPilih.setSelectedItem("6. Lain-lain");
        }
        else{
            jComboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"- Jenis -"}));
            jComboBoxPilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"- Pilih -","1. Kopi","2. Jus","3. Nasi","4. Pisang Goreng","5. Mie","6. Lain-lain"}));
            pilihMakanan = "";
            JOptionPane.showMessageDialog(null, "data kosong");
        }
    }
    private void jenisPembayaran(){
        if(jComboBoxJPembayaran.getSelectedItem().equals("Kas/Tunai")){
            pembayaranD ="kas_j";
            indexPembayaranD=8;
            pembayaranK ="penjualan_j";
            indexPembayaranK=10;
            txtRef.setText("101");
            jLabelRef.setText("Kas");
        }
        else if(jComboBoxJPembayaran.getSelectedItem().equals("L.Piutang")){
            pembayaranD ="kas_j";
            pembayaranK ="bayar_piutang_j";
            txtRef.setText("001");
            jLabelRef.setText("Kas");
        }
        else if(jComboBoxJPembayaran.getSelectedItem().equals("Utang")){
            pembayaranD ="tPiutang_j";
            pembayaranK ="pejualan_j";
        }
    }
}