
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xKral_Tr
 */
public class AnaEkran2 extends javax.swing.JFrame {
    
    public int OldposX;
    public int OldposY;
    
    DefaultTableModel model;
    DefaultTableModel model2;
    DefaultTableModel model3;
    DefaultTableModel model4;
    VeriTabaniIslemleri.CalisanVeriTabaniIslemleri islemler = new VeriTabaniIslemleri(). new CalisanVeriTabaniIslemleri();
    VeriTabaniIslemleri.firmaVeriTabanıIslemleri islemler2 = new VeriTabaniIslemleri(). new firmaVeriTabanıIslemleri();
    VeriTabaniIslemleri.yikilcakEvVeriTabaniIslemleri islemler3 = new VeriTabaniIslemleri(). new yikilcakEvVeriTabaniIslemleri();
    VeriTabaniIslemleri.yeniEvVeriTabaniIslemleri islemler4 = new VeriTabaniIslemleri(). new yeniEvVeriTabaniIslemleri();
    
    
    /**
     * Creates new form AnaEkran2
     */
    public AnaEkran2() {
        initComponents();
         model = (DefaultTableModel) yikilcakEvTableAna.getModel();
         model2 = (DefaultTableModel) yapilcakEvTableAna.getModel();
         model3 = (DefaultTableModel) calisanTableAna.getModel();
         model4 = (DefaultTableModel) jTable1.getModel();
         
        calisanGoruntule();
        firmaGoruntule();
        yikilcakEvGoruntule();
        yapilcakEvGoruntule();
        jTabbedPane1.setBackground(Color.darkGray);
        
    }

    public void calisanGoruntule(){
        
        model3.setRowCount(0);
        
        ArrayList<Calisan> calisanlar = new ArrayList<Calisan>();
        
        calisanlar = islemler.calisanlariGetir();
        
        if(calisanlar != null){
            
            for(Calisan calisan : calisanlar){
                
                Object[] eklenecek = {calisan.getId(),calisan.getAd(),calisan.getSoyad(),calisan.getDepartman(),calisan.getEmail(),calisan.getTelNo(),calisan.getMaas()};
                model3.addRow(eklenecek);
                
            }
            
        }
        
    }
    public void yapilcakEvGoruntule(){
        
        model2.setRowCount(0);
        
        ArrayList<yeniEv> evler = new ArrayList<yeniEv>();
        
        evler = islemler4.yeniEvGetir();
        
        if(evler != null){
            
            for(yeniEv yEv : evler){
                
                Object[] eklenecek = {yEv.getId(),yEv.getIl(),yEv.getIlce(),yEv.getMahalle(),yEv.getCadde(),yEv.getAptAd(),yEv.getAptNo(),yEv.getArsaMKare(),yEv.getKatSayisi(),yEv.getYapiciFirma(),yEv.getYapilmaMaliyeti(),yEv.getYapilmaSuresi()};
                model2.addRow(eklenecek);
                
            }
            
        }
        
    }
    
    public void yikilcakEvGoruntule(){
        
        model.setRowCount(0);
        
        ArrayList<yikilcakEv> evler = new ArrayList<yikilcakEv>();
        
        evler = islemler3.yikilcakEvGetir();
        
        if(evler != null){
            
            for(yikilcakEv yEv : evler){
                
                Object[] eklenecek = {yEv.getId(),yEv.getIl(),yEv.getIlce(),yEv.getMahalle(),yEv.getCadde(),yEv.getAptAd(),yEv.getAptNo(),yEv.getArsaMKare(),yEv.getYikicakFirma(),yEv.getYikmaMaliyeti(),yEv.getYikmaSuresi()};
                model.addRow(eklenecek);
                
            }
            
        }
        
    }
    
    public void firmaGoruntule(){
        
        model4.setRowCount(0);
        
        ArrayList<Firma> fr = new ArrayList<Firma>();
        
        fr = islemler2.firmaGetir();
        
        if(fr != null){
            
            for(Firma firma : fr){
                
                Object[] eklenecek = {firma.getId(),firma.getFirmaAdi(),firma.getFirmaSahipAdi(),firma.getFirmaAlani()};
                model4.addRow(eklenecek);
                
            }
            
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        yikilcakEvTableAna = new javax.swing.JTable();
        yikilcakEvIslemB = new keeptoo.KButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        yapilcakEvTableAna = new javax.swing.JTable();
        yapilcakEvIslemB = new keeptoo.KButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        calisanTableAna = new javax.swing.JTable();
        calisanIslemB = new keeptoo.KButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        firmaIslemB = new keeptoo.KButton();
        anaCikisB = new keeptoo.KButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setUndecorated(true);

        jPanel5.setBackground(java.awt.Color.darkGray);

        jTabbedPane1.setBackground(java.awt.Color.darkGray);
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(java.awt.Color.darkGray);

        yikilcakEvTableAna.setBackground(new java.awt.Color(153, 153, 153));
        yikilcakEvTableAna.setForeground(new java.awt.Color(255, 255, 255));
        yikilcakEvTableAna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İl", "İlçe", "Mahalle", "Cadde/Sokak", "Apartman Adı", "Apartman No", "Metrekare", "Yıkma Firma", "Yıkma Maliyeti", "Yıkma Süresi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        yikilcakEvTableAna.setGridColor(new java.awt.Color(255, 255, 255));
        yikilcakEvTableAna.setSelectionBackground(java.awt.Color.darkGray);
        jScrollPane1.setViewportView(yikilcakEvTableAna);

        yikilcakEvIslemB.setText("Yıkılcak Ev İşlemleri");
        yikilcakEvIslemB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        yikilcakEvIslemB.setkBackGroundColor(new java.awt.Color(255, 102, 0));
        yikilcakEvIslemB.setkBorderRadius(40);
        yikilcakEvIslemB.setkEndColor(new java.awt.Color(0, 204, 255));
        yikilcakEvIslemB.setkFillButton(false);
        yikilcakEvIslemB.setkHoverEndColor(new java.awt.Color(0, 255, 255));
        yikilcakEvIslemB.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        yikilcakEvIslemB.setkHoverStartColor(new java.awt.Color(255, 153, 0));
        yikilcakEvIslemB.setkSelectedColor(new java.awt.Color(255, 153, 0));
        yikilcakEvIslemB.setkStartColor(new java.awt.Color(255, 255, 255));
        yikilcakEvIslemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yikilcakEvIslemBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(yikilcakEvIslemB, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yikilcakEvIslemB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Yıkılcak Ev", jPanel1);

        jPanel2.setBackground(java.awt.Color.darkGray);

        yapilcakEvTableAna.setBackground(new java.awt.Color(153, 153, 153));
        yapilcakEvTableAna.setForeground(new java.awt.Color(255, 255, 255));
        yapilcakEvTableAna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İl", "İlçe", "Mahalle", "Cadde/Sokak", "Yeni Apartman Adı", "Apartman No", "Metrekare", "Kat Sayısı", "Yapıcı Firma", "Yapılma Maliyeti", "Bitiş Günü"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        yapilcakEvTableAna.setSelectionBackground(java.awt.Color.darkGray);
        jScrollPane2.setViewportView(yapilcakEvTableAna);

        yapilcakEvIslemB.setText("Yapılcak Ev İşlemleri");
        yapilcakEvIslemB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        yapilcakEvIslemB.setkBackGroundColor(new java.awt.Color(255, 102, 0));
        yapilcakEvIslemB.setkBorderRadius(40);
        yapilcakEvIslemB.setkEndColor(new java.awt.Color(0, 204, 255));
        yapilcakEvIslemB.setkFillButton(false);
        yapilcakEvIslemB.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        yapilcakEvIslemB.setkHoverForeGround(new java.awt.Color(255, 153, 153));
        yapilcakEvIslemB.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        yapilcakEvIslemB.setkSelectedColor(new java.awt.Color(0, 204, 204));
        yapilcakEvIslemB.setkStartColor(new java.awt.Color(255, 255, 255));
        yapilcakEvIslemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yapilcakEvIslemBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(yapilcakEvIslemB, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(yapilcakEvIslemB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Yapılcak Ev", jPanel2);

        jPanel3.setBackground(java.awt.Color.darkGray);

        calisanTableAna.setBackground(new java.awt.Color(153, 153, 153));
        calisanTableAna.setForeground(new java.awt.Color(255, 255, 255));
        calisanTableAna.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Ad", "Soyad", "Çalıştığı Firma", "E-mail", "Telefon Numarası", "Maaş"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calisanTableAna.setSelectionBackground(java.awt.Color.darkGray);
        jScrollPane3.setViewportView(calisanTableAna);

        calisanIslemB.setText("Çalışan İşlemleri");
        calisanIslemB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        calisanIslemB.setkBackGroundColor(new java.awt.Color(255, 102, 0));
        calisanIslemB.setkBorderRadius(40);
        calisanIslemB.setkEndColor(new java.awt.Color(0, 204, 255));
        calisanIslemB.setkFillButton(false);
        calisanIslemB.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        calisanIslemB.setkHoverForeGround(new java.awt.Color(255, 153, 153));
        calisanIslemB.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        calisanIslemB.setkSelectedColor(new java.awt.Color(0, 204, 204));
        calisanIslemB.setkStartColor(new java.awt.Color(255, 255, 255));
        calisanIslemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calisanIslemBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(calisanIslemB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(calisanIslemB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Çalışanlar", jPanel3);

        jPanel4.setBackground(java.awt.Color.darkGray);

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Firma Adı", "Firma Sahibi", "Firma Alanı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(java.awt.Color.darkGray);
        jScrollPane4.setViewportView(jTable1);

        firmaIslemB.setText("Firma İşlemleri");
        firmaIslemB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        firmaIslemB.setkBackGroundColor(new java.awt.Color(255, 102, 0));
        firmaIslemB.setkBorderRadius(40);
        firmaIslemB.setkEndColor(new java.awt.Color(0, 204, 255));
        firmaIslemB.setkFillButton(false);
        firmaIslemB.setkHoverEndColor(new java.awt.Color(204, 204, 0));
        firmaIslemB.setkHoverForeGround(new java.awt.Color(255, 153, 153));
        firmaIslemB.setkHoverStartColor(new java.awt.Color(0, 204, 255));
        firmaIslemB.setkSelectedColor(new java.awt.Color(0, 204, 204));
        firmaIslemB.setkStartColor(new java.awt.Color(255, 255, 255));
        firmaIslemB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmaIslemBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(firmaIslemB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(firmaIslemB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Firma", jPanel4);

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

        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(anaCikisB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(anaCikisB, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anaCikisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaCikisBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_anaCikisBActionPerformed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - OldposX, posY - OldposY);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        OldposX = evt.getX();
        OldposY = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void calisanIslemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calisanIslemBActionPerformed
        CalisanEkleEkrani calis = new CalisanEkleEkrani(this, true);
        calis.setVisible(true);
        
    }//GEN-LAST:event_calisanIslemBActionPerformed

    private void firmaIslemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmaIslemBActionPerformed
        FirmaEkrani fr = new FirmaEkrani(this, true);
        fr.setVisible(true);
    }//GEN-LAST:event_firmaIslemBActionPerformed

    private void yapilcakEvIslemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yapilcakEvIslemBActionPerformed
        yapilcakEvEkrani yEv = new yapilcakEvEkrani(this, true);
        yEv.setVisible(true);
    }//GEN-LAST:event_yapilcakEvIslemBActionPerformed

    private void yikilcakEvIslemBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yikilcakEvIslemBActionPerformed
        yikilcakEvEkrani deneme = new yikilcakEvEkrani(this,true);
            deneme.setVisible(true);
    }//GEN-LAST:event_yikilcakEvIslemBActionPerformed

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
            java.util.logging.Logger.getLogger(AnaEkran2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton anaCikisB;
    private keeptoo.KButton calisanIslemB;
    private javax.swing.JTable calisanTableAna;
    private keeptoo.KButton firmaIslemB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KButton yapilcakEvIslemB;
    private javax.swing.JTable yapilcakEvTableAna;
    private keeptoo.KButton yikilcakEvIslemB;
    private javax.swing.JTable yikilcakEvTableAna;
    // End of variables declaration//GEN-END:variables
}
