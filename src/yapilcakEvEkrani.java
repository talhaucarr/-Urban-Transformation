
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xKral_Tr
 */
public class yapilcakEvEkrani extends javax.swing.JDialog {
    public int OldposX;
    public int OldposY;
    DefaultTableModel model;
    VeriTabaniIslemleri.yeniEvVeriTabaniIslemleri islemler = new VeriTabaniIslemleri(). new yeniEvVeriTabaniIslemleri();
    
    /**
     * Creates new form asdas
     */
    public yapilcakEvEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocation(50,50);
        model = (DefaultTableModel) collapseHouse_table2.getModel();
        yikilcakEvGoruntule();
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
        y_mah_alani = new javax.swing.JTextField();
        y_cadde_alani = new javax.swing.JTextField();
        y_bAdi_alani = new javax.swing.JTextField();
        y_bNo_alani = new javax.swing.JTextField();
        y_m2_alani = new javax.swing.JTextField();
        y_katSayi_alani = new javax.swing.JTextField();
        y_firma_alani = new javax.swing.JTextField();
        y_maliyet_alani = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        y_bitisGun_alani = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        collapseHouse_table2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        y_il_alani = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        y_ilce_alani = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        yikmaYedekB = new keeptoo.KButton();
        yikmaEkleB = new keeptoo.KButton();
        yikmaSilB = new keeptoo.KButton();
        kButton1 = new keeptoo.KButton();
        jLabel13 = new javax.swing.JLabel();
        anaCikisB = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.darkGray);

        y_mah_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y_mah_alaniActionPerformed(evt);
            }
        });

        y_cadde_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y_cadde_alaniActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("İl");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("İlçe");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mahalle");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cadde/Sokak");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bitiş Günü");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Yeni Apartman Adı");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bina No");

        collapseHouse_table2.setBackground(new java.awt.Color(153, 153, 153));
        collapseHouse_table2.setForeground(new java.awt.Color(255, 255, 255));
        collapseHouse_table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "İl", "İlçe", "Mahalle", "Cadde/Sokak", "Apartman Adı", "Apartman No", "Metrekare", "Kat Sayısı", "Yapıcı Firma", "Yapılma Maliyeti", "Bitiş Günü"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        collapseHouse_table2.setSelectionBackground(java.awt.Color.darkGray);
        collapseHouse_table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collapseHouse_table2MouseClicked(evt);
            }
        });
        collapseHouse_table2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                collapseHouse_table2KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(collapseHouse_table2);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Metrekare");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kat Sayısı");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Yapıcı Firma");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Yapılma Maliyeti");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Arama");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));

        yikmaYedekB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-25.png"))); // NOI18N
        yikmaYedekB.setkEndColor(new java.awt.Color(0, 255, 255));
        yikmaYedekB.setkFillButton(false);
        yikmaYedekB.setkHoverEndColor(new java.awt.Color(51, 255, 51));
        yikmaYedekB.setkHoverStartColor(new java.awt.Color(51, 255, 255));
        yikmaYedekB.setkPressedColor(java.awt.Color.darkGray);
        yikmaYedekB.setkStartColor(java.awt.Color.darkGray);
        yikmaYedekB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yikmaYedekBActionPerformed(evt);
            }
        });

        yikmaEkleB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-plus-25.png"))); // NOI18N
        yikmaEkleB.setkEndColor(new java.awt.Color(0, 255, 255));
        yikmaEkleB.setkFillButton(false);
        yikmaEkleB.setkHoverEndColor(new java.awt.Color(51, 255, 51));
        yikmaEkleB.setkHoverStartColor(new java.awt.Color(51, 255, 255));
        yikmaEkleB.setkStartColor(java.awt.Color.darkGray);
        yikmaEkleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yikmaEkleBActionPerformed(evt);
            }
        });

        yikmaSilB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-delete-25.png"))); // NOI18N
        yikmaSilB.setkEndColor(new java.awt.Color(0, 255, 255));
        yikmaSilB.setkFillButton(false);
        yikmaSilB.setkHoverEndColor(new java.awt.Color(51, 255, 51));
        yikmaSilB.setkHoverStartColor(new java.awt.Color(51, 255, 255));
        yikmaSilB.setkSelectedColor(new java.awt.Color(0, 204, 204));
        yikmaSilB.setkStartColor(java.awt.Color.darkGray);
        yikmaSilB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yikmaSilBActionPerformed(evt);
            }
        });

        kButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-update-25.png"))); // NOI18N
        kButton1.setkEndColor(new java.awt.Color(0, 255, 255));
        kButton1.setkFillButton(false);
        kButton1.setkHoverEndColor(new java.awt.Color(51, 255, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 255, 51));
        kButton1.setkHoverStartColor(new java.awt.Color(51, 255, 255));
        kButton1.setkStartColor(java.awt.Color.darkGray);
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        jLabel13.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel13MouseDragged(evt);
            }
        });
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });

        anaCikisB.setForeground(new java.awt.Color(0, 255, 153));
        anaCikisB.setText("X");
        anaCikisB.setkBackGroundColor(java.awt.Color.darkGray);
        anaCikisB.setkEndColor(java.awt.Color.darkGray);
        anaCikisB.setkForeGround(new java.awt.Color(0, 153, 153));
        anaCikisB.setkHoverEndColor(java.awt.Color.darkGray);
        anaCikisB.setkHoverForeGround(new java.awt.Color(255, 0, 51));
        anaCikisB.setkHoverStartColor(new java.awt.Color(153, 153, 153));
        anaCikisB.setkPressedColor(new java.awt.Color(153, 153, 153));
        anaCikisB.setkSelectedColor(new java.awt.Color(153, 153, 153));
        anaCikisB.setkStartColor(java.awt.Color.darkGray);
        anaCikisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaCikisBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel10)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel11))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(y_ilce_alani)
                                            .addComponent(y_il_alani)
                                            .addComponent(y_mah_alani)
                                            .addComponent(y_cadde_alani)
                                            .addComponent(y_bAdi_alani)
                                            .addComponent(y_katSayi_alani)
                                            .addComponent(y_firma_alani)
                                            .addComponent(y_maliyet_alani)
                                            .addComponent(y_m2_alani)
                                            .addComponent(y_bNo_alani)
                                            .addComponent(y_bitisGun_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jSeparator4)
                                    .addComponent(jSeparator5)
                                    .addComponent(jSeparator6)
                                    .addComponent(jSeparator7)
                                    .addComponent(jSeparator9)
                                    .addComponent(jSeparator10)))
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1)
                                .addComponent(jSeparator11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(yikmaSilB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(yikmaEkleB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(yikmaYedekB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(anaCikisB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anaCikisB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(y_il_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator11))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(y_ilce_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(y_mah_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(y_cadde_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(y_bAdi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(y_bNo_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(y_m2_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(y_katSayi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(y_firma_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(y_maliyet_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(kButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(y_bitisGun_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(yikmaSilB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yikmaEkleB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(yikmaYedekB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void y_mah_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y_mah_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y_mah_alaniActionPerformed
    
    public void yikilcakEvGoruntule(){
        
        model.setRowCount(0);
        
        ArrayList<yeniEv> evler = new ArrayList<yeniEv>();
        
        evler = islemler.yeniEvGetir();
        
        if(evler != null){
            
            for(yeniEv yEv : evler){
                
                Object[] eklenecek = {yEv.getId(),yEv.getIl(),yEv.getIlce(),yEv.getMahalle(),yEv.getCadde(),yEv.getAptAd(),yEv.getAptNo(),yEv.getArsaMKare(),yEv.getKatSayisi(),yEv.getYapiciFirma(),yEv.getYapilmaMaliyeti(),yEv.getYapilmaSuresi()};
                model.addRow(eklenecek);
                
            }
            
        }
        
    }
        
    public void dinamikAra(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        collapseHouse_table2.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
    }
    
    private void y_cadde_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y_cadde_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_y_cadde_alaniActionPerformed

    private void collapseHouse_table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collapseHouse_table2MouseClicked
        int selectedrow = collapseHouse_table2.getSelectedRow();

        y_il_alani.setText(model.getValueAt(selectedrow, 1).toString());
        y_ilce_alani.setText(model.getValueAt(selectedrow, 2).toString());
        y_mah_alani.setText(model.getValueAt(selectedrow, 3).toString());
        y_cadde_alani.setText(model.getValueAt(selectedrow, 4).toString());
        y_bAdi_alani.setText(model.getValueAt(selectedrow, 5).toString());
        y_bNo_alani.setText(model.getValueAt(selectedrow, 6).toString());
        y_m2_alani.setText(model.getValueAt(selectedrow, 7).toString());
        y_katSayi_alani.setText(model.getValueAt(selectedrow, 8).toString());
        y_firma_alani.setText(model.getValueAt(selectedrow, 9).toString());
        y_maliyet_alani.setText(model.getValueAt(selectedrow, 10).toString());
        y_bitisGun_alani.setText(model.getValueAt(selectedrow, 11).toString());
    }//GEN-LAST:event_collapseHouse_table2MouseClicked

    private void collapseHouse_table2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_collapseHouse_table2KeyReleased

    }//GEN-LAST:event_collapseHouse_table2KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        String ara = jTextField2.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_jTextField2KeyReleased

    private void yikmaYedekBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yikmaYedekBActionPerformed
        File file = new File("YeniEvYedek.txt");//proje içinde text.txt adında bir txt oluşturun.

        ArrayList<yeniEv> evler = new ArrayList<yeniEv>();

        evler = islemler.yeniEvGetir();

        if(evler != null){

            try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
                for(yeniEv yEv : evler){
                    br.write(yEv.getIl() + " " + yEv.getIlce() + " " + yEv.getMahalle() + " " + yEv.getCadde() + " " + yEv.getAptAd() + " " + yEv.getAptNo() + " " + yEv.getArsaMKare() + " " + yEv.getKatSayisi() + " " + yEv.getYapiciFirma() + " " + yEv.getYapilmaMaliyeti() + " " +  yEv.getYapilmaSuresi() );
                    br.newLine();
                }
            }

            catch (IOException e) {
                System.out.println("Unable to read file " +file.toString());
            }
        }
    }//GEN-LAST:event_yikmaYedekBActionPerformed

    private void yikmaEkleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yikmaEkleBActionPerformed

        String il = y_il_alani.getText();
        String ilce = y_ilce_alani.getText();
        String mahalle = y_mah_alani.getText();
        String cadde = y_cadde_alani.getText();
        String aptAd = y_bAdi_alani.getText();
        int aptNo = Integer.valueOf(y_bNo_alani.getText());
        int mKare = Integer.valueOf(y_m2_alani.getText());
        int katSayi = Integer.valueOf(y_katSayi_alani.getText());
        String yikicakFirma = y_firma_alani.getText();
        int yikmaMaliyet = Integer.valueOf(y_maliyet_alani.getText());
        String tarih = y_bitisGun_alani.getText();

        islemler.yeniEvEkle(il, ilce, mahalle, cadde, aptAd, aptNo, mKare,katSayi, yikicakFirma, yikmaMaliyet, tarih );

        yikilcakEvGoruntule();

        //uyariYapilcak.setText("Yeni Çalışan Başarıyla Eklendi...");

    }//GEN-LAST:event_yikmaEkleBActionPerformed

    private void yikmaSilBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yikmaSilBActionPerformed

        int selectedrow = collapseHouse_table2.getSelectedRow();

        if(selectedrow == -1){

            if(model.getRowCount() ==0)
            {

                //uyariYapilcak.setText("Yeni Ev Tablosu Boş!");

            }
            else{

                //uyariYapilcak.setText("Lütfen Güncellenecek Bir Yeni Ev Seçiniz!");

            }

        }
        else{

            int id = (int)model.getValueAt(selectedrow, 0);
            islemler.yeniEvSil(id);
            yikilcakEvGoruntule();

            //uyariYapilcak.setText("Yeni Ev Başarıyla Silindi!");

        }
    }//GEN-LAST:event_yikmaSilBActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed

        String il = y_il_alani.getText();
        String ilce = y_ilce_alani.getText();
        String mahalle = y_mah_alani.getText();
        String cadde = y_cadde_alani.getText();
        String aptAd = y_bAdi_alani.getText();
        int aptNo = Integer.valueOf(y_bNo_alani.getText());
        int mKare = Integer.valueOf(y_m2_alani.getText());
        int katSayi = Integer.valueOf(y_katSayi_alani.getText());
        String yikicakFirma = y_firma_alani.getText();
        int yikmaMaliyet = Integer.valueOf(y_maliyet_alani.getText());
        String tarih = y_bitisGun_alani.getText();

        int selectedrow = collapseHouse_table2.getSelectedRow();

        if(selectedrow == -1){

            if(model.getRowCount() == 0){

                //uyariYapilcak.setText("Yıkılcak Ev Tablosu Boş!");

            }
            else{

                //uyariYapilcak.setText("Lütfen Güncellenecek Bir Ev Seçiniz!");

            }

        }
        else{

            int id = (int)model.getValueAt(selectedrow, 0);
            islemler.yeniEvGuncelle( il, ilce, mahalle, cadde, aptAd, aptNo, mKare,katSayi, yikicakFirma, yikmaMaliyet, tarih,id);
            yikilcakEvGoruntule();

            //uyariYapilcak.setText("Yapılcak Ev Başarıyla Güncellendi!");

        }

    }//GEN-LAST:event_kButton1ActionPerformed

    private void anaCikisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaCikisBActionPerformed
        setVisible(false); //you can't see me!
        dispose(); //Destroy the JFrame object
    }//GEN-LAST:event_anaCikisBActionPerformed

    private void jLabel13MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - OldposX, posY - OldposY);
    }//GEN-LAST:event_jLabel13MouseDragged

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        OldposX = evt.getX();
        OldposY = evt.getY();
    }//GEN-LAST:event_jLabel13MousePressed

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
            java.util.logging.Logger.getLogger(yapilcakEvEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yapilcakEvEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yapilcakEvEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yapilcakEvEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                yapilcakEvEkrani dialog = new yapilcakEvEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton anaCikisB;
    private javax.swing.JTable collapseHouse_table2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField2;
    private keeptoo.KButton kButton1;
    private javax.swing.JTextField y_bAdi_alani;
    private javax.swing.JTextField y_bNo_alani;
    private javax.swing.JTextField y_bitisGun_alani;
    private javax.swing.JTextField y_cadde_alani;
    private javax.swing.JTextField y_firma_alani;
    private javax.swing.JTextField y_il_alani;
    private javax.swing.JTextField y_ilce_alani;
    private javax.swing.JTextField y_katSayi_alani;
    private javax.swing.JTextField y_m2_alani;
    private javax.swing.JTextField y_mah_alani;
    private javax.swing.JTextField y_maliyet_alani;
    private keeptoo.KButton yikmaEkleB;
    private keeptoo.KButton yikmaSilB;
    private keeptoo.KButton yikmaYedekB;
    // End of variables declaration//GEN-END:variables
}
