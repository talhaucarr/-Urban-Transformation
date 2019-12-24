
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
public class FirmaEkrani extends javax.swing.JDialog {
    public int OldposX;
    public int OldposY;
    
    DefaultTableModel model;
    VeriTabaniIslemleri.firmaVeriTabanıIslemleri islemler = new VeriTabaniIslemleri(). new firmaVeriTabanıIslemleri();
    /**
     * Creates new form FirmaEkrani
     */
    public FirmaEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) firmaTablo.getModel();
        firmaGoruntule();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        firmaTablo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dinamikArama3 = new javax.swing.JTextField();
        firmaAdı_alani = new javax.swing.JTextField();
        firmaSahibi_alani = new javax.swing.JTextField();
        firmaAlani = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        yikmaYedekB = new keeptoo.KButton();
        yikmaEkleB = new keeptoo.KButton();
        yikmaSilB = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setUndecorated(true);

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));

        jPanel1.setBackground(java.awt.Color.darkGray);

        firmaTablo.setBackground(new java.awt.Color(153, 153, 153));
        firmaTablo.setModel(new javax.swing.table.DefaultTableModel(
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
        firmaTablo.setSelectionBackground(java.awt.Color.darkGray);
        firmaTablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firmaTabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(firmaTablo);
        if (firmaTablo.getColumnModel().getColumnCount() > 0) {
            firmaTablo.getColumnModel().getColumn(0).setResizable(false);
            firmaTablo.getColumnModel().getColumn(1).setResizable(false);
            firmaTablo.getColumnModel().getColumn(2).setResizable(false);
            firmaTablo.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Firma Adı");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Firma Sahibi");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Arama");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Firma Alanı");

        dinamikArama3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dinamikArama3KeyReleased(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel6MouseDragged(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        kButton1.setForeground(new java.awt.Color(0, 255, 153));
        kButton1.setText("X");
        kButton1.setkBackGroundColor(java.awt.Color.darkGray);
        kButton1.setkEndColor(java.awt.Color.darkGray);
        kButton1.setkForeGround(new java.awt.Color(0, 153, 153));
        kButton1.setkHoverEndColor(java.awt.Color.darkGray);
        kButton1.setkHoverForeGround(new java.awt.Color(255, 0, 51));
        kButton1.setkHoverStartColor(new java.awt.Color(153, 153, 153));
        kButton1.setkPressedColor(new java.awt.Color(153, 153, 153));
        kButton1.setkSelectedColor(new java.awt.Color(153, 153, 153));
        kButton1.setkStartColor(java.awt.Color.darkGray);
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

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

        kButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-update-25.png"))); // NOI18N
        kButton2.setkEndColor(new java.awt.Color(0, 255, 255));
        kButton2.setkFillButton(false);
        kButton2.setkHoverEndColor(new java.awt.Color(51, 255, 0));
        kButton2.setkHoverForeGround(new java.awt.Color(0, 255, 51));
        kButton2.setkHoverStartColor(new java.awt.Color(51, 255, 255));
        kButton2.setkStartColor(java.awt.Color.darkGray);
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firmaSahibi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firmaAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(yikmaSilB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(yikmaEkleB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(yikmaYedekB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firmaAdı_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(37, 37, 37)
                        .addComponent(dinamikArama3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firmaAdı_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dinamikArama3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(firmaSahibi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(firmaAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(yikmaEkleB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yikmaYedekB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yikmaSilB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void dinamikAra(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        firmaTablo.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
        
    }
    
    private void dinamikArama3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dinamikArama3KeyReleased
        String ara = dinamikArama3.getText();
        
        dinamikAra(ara);
    }//GEN-LAST:event_dinamikArama3KeyReleased

    private void firmaTabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firmaTabloMouseClicked
        int selectedrow = firmaTablo.getSelectedRow();
        
        firmaAdı_alani.setText(model.getValueAt(selectedrow, 1).toString());
        firmaSahibi_alani.setText(model.getValueAt(selectedrow, 2).toString());
        firmaAlani.setText(model.getValueAt(selectedrow, 3).toString());
    }//GEN-LAST:event_firmaTabloMouseClicked

    private void jLabel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseDragged
        int posX = evt.getXOnScreen();
        int posY = evt.getYOnScreen();
        this.setLocation(posX - OldposX, posY - OldposY);
    }//GEN-LAST:event_jLabel6MouseDragged

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        OldposX = evt.getX();
        OldposY = evt.getY();
    }//GEN-LAST:event_jLabel6MousePressed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        setVisible(false); //you can't see me!
        dispose(); //Destroy the JFrame object
    }//GEN-LAST:event_kButton1ActionPerformed

    private void yikmaYedekBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yikmaYedekBActionPerformed
        File file = new File("CalisanlarYedek.txt");//proje içinde text.txt adında bir txt oluşturun.
        
        ArrayList<Firma> firma = new ArrayList<Firma>();
        
        firma = islemler.firmaGetir();
        
        if(firma != null){
                        
             try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
                            for(Firma fr : firma){
                            br.write(fr.getFirmaAdi() + " " + fr.getFirmaSahipAdi() + " " + fr.getFirmaAlani());
                            br.newLine();
                            }
                        }

                        catch (IOException e) {
                            System.out.println("Unable to read file " +file.toString());
                    }                          
        }
    }//GEN-LAST:event_yikmaYedekBActionPerformed

    private void yikmaEkleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yikmaEkleBActionPerformed

        jLabel4.setText("");
        
        String ad = firmaAdı_alani.getText();
        String firmaSahip = firmaSahibi_alani.getText();
        String alan = firmaAlani.getText();

        
        islemler.firmaEkle(ad, firmaSahip, alan);
        
        firmaGoruntule();
        
        jLabel4.setText("Yeni Firma Başarıyla Eklendi...");

        //uyariYapilcak.setText("Yeni Çalışan Başarıyla Eklendi...");
    }//GEN-LAST:event_yikmaEkleBActionPerformed

    private void yikmaSilBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yikmaSilBActionPerformed

        jLabel4.setText("");
        
        int selectedrow = firmaTablo.getSelectedRow();
        
        if(selectedrow == -1){
            
            if(model.getRowCount() ==0)
            {
                
                jLabel4.setText("Calisanlar Tablosu Boş!");
                
            }
            else{
                
                jLabel4.setText("Lütfen Güncellenecek Bir Çalışan Seçiniz!");
                
            }
            
        }
        else{
            
            int id = (int)model.getValueAt(selectedrow, 0);
            islemler.firmaSil(id);
            firmaGoruntule();
            
            jLabel4.setText("Çalışan Başarıyla Silindi!");
            
        }
    }//GEN-LAST:event_yikmaSilBActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed

        String ad = firmaAdı_alani.getText();
        String firmaSahip = firmaSahibi_alani.getText();
        String alan = firmaAlani.getText();
        
        int selectedrow = firmaTablo.getSelectedRow();
        
        if(selectedrow == -1){
            
            if(model.getRowCount() == 0){
                
                jLabel4.setText("Calisanlar Tablosu Boş!");
                
            }
            else{
                
                jLabel4.setText("Lütfen Güncellenecek Bir Çalışan Seçiniz!");
                
            }
            
        }
        else{
            
            int id = (int)model.getValueAt(selectedrow, 0);
            islemler.firmaGuncelle(id,ad,firmaSahip,alan);
            firmaGoruntule();
            
            jLabel4.setText("Çalışan Başarıyla Güncellendi!");
            
        }
    }//GEN-LAST:event_kButton2ActionPerformed
    
    public void firmaGoruntule(){
        
        model.setRowCount(0);
        
        ArrayList<Firma> calisanlar = new ArrayList<Firma>();
        
        calisanlar = islemler.firmaGetir();
        
        if(calisanlar != null){
            
            for(Firma firma : calisanlar){
                
                Object[] eklenecek = {firma.getId(),firma.getFirmaAdi(),firma.getFirmaSahipAdi(),firma.getFirmaAlani()};
                model.addRow(eklenecek);
                
            }
            
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(FirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FirmaEkrani dialog = new FirmaEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField dinamikArama3;
    private javax.swing.JTextField firmaAdı_alani;
    private javax.swing.JTextField firmaAlani;
    private javax.swing.JTextField firmaSahibi_alani;
    private javax.swing.JTable firmaTablo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton yikmaEkleB;
    private keeptoo.KButton yikmaSilB;
    private keeptoo.KButton yikmaYedekB;
    // End of variables declaration//GEN-END:variables
}
