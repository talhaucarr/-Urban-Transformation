
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VeriTabaniIslemleri {
    
    private Connection con = null;
    
    private Statement statement = null;
    
    private PreparedStatement preparedStatement = null;
    
    
    
    class CalisanVeriTabaniIslemleri{
        
        public int bayrak ;
        
        
            public void calisanSil(int id){
        
        String sorgu = "DELETE from calisanlar where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void calisanGuncelle(int id,String ad,String soyad,String dept,String email,int telno,int maas){
        
        String sorgu = "Update calisanlar set ad = ? , soyad = ? , calistigiBolum = ? ,email = ?,telNo = ?, maas = ? where id = ?";
                
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, dept);
            preparedStatement.setString(4, dept);
            preparedStatement.setInt(5, telno);
            preparedStatement.setInt(6, maas);
            
            preparedStatement.setInt(7, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void calisanEkle(String ad,String soyad,String dept,String email,int telno,int maas){
        
        String sorgu = "Insert into calisanlar(ad,soyad,calistigiBolum,email,telNo,maas) VALUES(?,?,?,?,?,?)";
        bayrak = 1;
        
        try {
            statement = con.createStatement();
            
            String sorgu2 = "Select * from firma";
            
            ResultSet rs = statement.executeQuery(sorgu2);
            
            
            while(rs.next()){
                
                
                String adi = rs.getString("firmaAdi");
                System.out.println(adi);
                if (adi.equals(dept)){
                    
                    bayrak = 1;
                    break;
                }
                else{
                    
                     bayrak =0;
                    
                }
                
                
                
            }
            
            if(bayrak ==1){
                try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, dept);
            preparedStatement.setString(4, email);
            preparedStatement.setInt(5, telno);
            preparedStatement.setInt(6, maas);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
        } 
        
        
        
        
    }
    
       public ArrayList<Calisan> calisanlariGetir(){
        
           
           
        ArrayList<Calisan> cikti = new ArrayList<Calisan>();
        
        try {
            statement = con.createStatement();
            
            String sorgu = "Select * from calisanlar";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while(rs.next()){
                
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String dept = rs.getString("calistigiBolum");
                String email = rs.getString("email");
                int telNo = rs.getInt("telNo");
                int maas = rs.getInt("maas");
                
                cikti.add(new Calisan(id, ad, soyad, dept,email,telNo,maas));
                
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }         
        
    }
        
    }
    
    class firmaVeriTabanıIslemleri{
        
        public void firmaSil(int id){
        
        String sorgu = "DELETE from firma where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
        public void firmaGuncelle(int id,String Firmaad,String FirmaSahip,String firmaAlan){
        
        String sorgu = "Update firma set firmaAdi = ? , firmaSahibi = ? , firmaAlani = ? where id = ?";
                
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, Firmaad);
            preparedStatement.setString(2, FirmaSahip);
            preparedStatement.setString(3, firmaAlan);

            
            preparedStatement.setInt(4, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
        public void firmaEkle(String Firmaad,String FirmaSahip,String firmaAlan){
        
        String sorgu = "Insert into firma(firmaAdi,firmaSahibi,firmaAlani) VALUES(?,?,?)";
        
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, Firmaad);
            preparedStatement.setString(2, FirmaSahip);
            preparedStatement.setString(3, firmaAlan);

            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
        public ArrayList<Firma> firmaGetir(){
        
        ArrayList<Firma> cikti = new ArrayList<Firma>();
        
        try {
            statement = con.createStatement();
            
            String sorgu = "Select * from firma";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                int id = rs.getInt("id");
                String firmaAdi = rs.getString("firmaAdi");
                String firmaSahip = rs.getString("firmaSahibi");
                String firmaAlani = rs.getString("firmaAlani");

                
                cikti.add(new Firma(id, firmaAdi, firmaSahip, firmaAlani));
                
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }      
       
    }
        
        }
    
    class yikilcakEvVeriTabaniIslemleri{
        
        public int bayrak2;
        
        public void yikilcakEvEkle(String il,String ilçe,String mahalle,String cadde,String binaAdi,int binaNo,int mKare,String firmaAdi,int yikmaMaliyeti,String yikmaSuresi ){
            
            String sorgu = "Insert into yikilcakev(il,ilce,mahalle,cadde,binaAdi,binaNo,binaArsaMKare,yikicakFirma,yikmaMaliyet,yikmaSuresi) VALUES(?,?,?,?,?,?,?,?,?,?)";
            
            bayrak2 = 1;
        
            try{
            statement = con.createStatement();
            
            String sorgu2 = "Select * from firma";
            
            ResultSet rs = statement.executeQuery(sorgu2);
            
            
            while(rs.next()){
                
                
                String adi = rs.getString("firmaAdi");
                System.out.println(adi);
                if (adi.equals(firmaAdi)){
                    
                    bayrak2 = 1;
                    break;
                }
                else{
                    
                     bayrak2 =0;
                    
                }
                
                try {
                preparedStatement = con.prepareStatement(sorgu);
                
                preparedStatement.setString(1, il);
                preparedStatement.setString(2, ilçe);
                preparedStatement.setString(3, mahalle);
                preparedStatement.setString(4, cadde);
                preparedStatement.setString(5, binaAdi);
                preparedStatement.setInt(6, binaNo);
                preparedStatement.setInt(7, mKare);;
                preparedStatement.setString(8, firmaAdi);
                preparedStatement.setInt(9, yikmaMaliyeti);
                preparedStatement.setString(10, yikmaSuresi);

                preparedStatement.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
        }
            catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
        } 
            
            
            
        }
        
        public void yikilcakEvSil(int id){
            
            
            String sorgu = "DELETE from yikilcakev where id = ?";
        
            try {
                preparedStatement = con.prepareStatement(sorgu);
            
                preparedStatement.setInt(1, id);
            
                preparedStatement.executeUpdate();
            
            } catch (SQLException ex) {
                Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        public void yikilcakEvGuncelle(int id,String il,String ilçe,String mahalle,String cadde,String binaAdi,int binaNo,int mKare,String firmaAdi,int yikmaMaliyeti,String yikmaSuresi){
            
            String sorgu = "Update yikilcakev set il = ? , ilce = ? , mahalle = ? , cadde = ? , binaAdi = ? , binaNo = ? , binaArsaMKare = ?, yikicakFirma = ?, yikmaMaliyet = ? , yikmaSuresi = ? where id = ?";
        
        try {
            
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, il);
            preparedStatement.setString(2, ilçe);
            preparedStatement.setString(3, mahalle);
            preparedStatement.setString(4, cadde);
            preparedStatement.setString(5, binaAdi);
            preparedStatement.setInt(6, binaNo);
            preparedStatement.setInt(7, mKare);
            preparedStatement.setString(8, firmaAdi);
            preparedStatement.setInt(9, yikmaMaliyeti);
            preparedStatement.setString(10, yikmaSuresi);
            
            preparedStatement.setInt(11, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        public ArrayList<yikilcakEv> yikilcakEvGetir(){
            
            ArrayList<yikilcakEv> getir = new ArrayList<yikilcakEv>();
        
            try {
                statement = con.createStatement();
            
                String sorgu = "Select * from yikilcakev";
            
                ResultSet rs = statement.executeQuery(sorgu);
            
                while(rs.next()){
                
                    int id = rs.getInt("id");
                    String il = rs.getString("il");
                    String ilçe = rs.getString("ilce");
                    String mahalle = rs.getString("mahalle");
                    String cadde = rs.getString("cadde");
                    String binaAdi = rs.getString("binaAdi");
                    int binaNo = rs.getInt("binaNo");
                    int arsaMKare = rs.getInt("binaArsaMKare");
                    String yikicakFirma = rs.getString("yikicakFirma");
                    int yikmaMaliyeti = rs.getInt("yikmaMaliyet");
                    String yikmaSuresi = rs.getString("yikmaSuresi");
                
                    getir.add(new yikilcakEv(yikicakFirma, yikmaMaliyeti, yikmaSuresi,id, il, ilçe, mahalle, cadde, binaAdi, binaNo, arsaMKare));
                
                }
                return getir;
            
            } catch (SQLException ex) {
                Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            
        }
        
    }
    
    class yeniEvVeriTabaniIslemleri{
        
        public int bayrak3;
        
        public void yeniEvEkle(String il,String ilçe,String mahalle,String cadde,String binaAdi,int binaNo,int mKare,int katSayisi,String firmaAdi,int yapilmaMaliyeti,String yikmaSuresi ){
            
            String sorgu = "Insert into yeniev(il,ilce,mahalle,cadde,yeniAptAd,aptNo,arsaMKare,katSayisi,YapiciFirma,yapilmaMaliyet,yapilmaSuresi) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            
            try {
            statement = con.createStatement();
            
            String sorgu2 = "Select * from firma";
            
            ResultSet rs = statement.executeQuery(sorgu2);
            
            
            while(rs.next()){
                
                
                String adi = rs.getString("firmaAdi");
                System.out.println(adi);
                if (adi.equals(firmaAdi)){
                    
                    bayrak3 = 1;
                    break;
                }
                else{
                    
                     bayrak3 =0;
                    
                }
                
                
                
            }
            try {
                preparedStatement = con.prepareStatement(sorgu);
                
                preparedStatement.setString(1, il);
                preparedStatement.setString(2, ilçe);
                preparedStatement.setString(3, mahalle);
                preparedStatement.setString(4, cadde);
                preparedStatement.setString(5, binaAdi);
                preparedStatement.setInt(6, binaNo);
                preparedStatement.setInt(7, mKare);
                preparedStatement.setInt(8, katSayisi);
                preparedStatement.setString(9, firmaAdi);
                preparedStatement.setInt(10, yapilmaMaliyeti);
                preparedStatement.setString(11, yikmaSuresi);

                preparedStatement.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
        } 
            
            
            
            
            
        }
        
        public void yeniEvSil(int id){
            
            String sorgu = "DELETE from yeniev where id = ?";
        
            try {
                preparedStatement = con.prepareStatement(sorgu);
            
                preparedStatement.setInt(1, id);
            
                preparedStatement.executeUpdate();
            
            } catch (SQLException ex) {
                Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        public void yeniEvGuncelle(String il,String ilçe,String mahalle,String cadde,String binaAdi,int binaNo,int mKare,int katSayisi,String firmaAdi,int yapilmaMaliyeti,String yikmaSuresi,int id){
            
            String sorgu = "Update yeniev set il = ? , ilce = ? , mahalle = ? , cadde = ? , yeniAptAd = ? , aptNo = ? , arsaMKare = ? , katSayisi = ?, YapiciFirma = ?, yapilmaMaliyet = ? , yapilmaSuresi = ? where id = ?";
        
        try {
            
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, il);
            preparedStatement.setString(2, ilçe);
            preparedStatement.setString(3, mahalle);
            preparedStatement.setString(4, cadde);
            preparedStatement.setString(5, binaAdi);
            preparedStatement.setInt(6, binaNo);
            preparedStatement.setInt(7, mKare);
            preparedStatement.setInt(8, katSayisi);
            preparedStatement.setString(9, firmaAdi);
            preparedStatement.setInt(10, yapilmaMaliyeti);
            preparedStatement.setString(11, yikmaSuresi);
            
            preparedStatement.setInt(12, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
        public ArrayList<yeniEv> yeniEvGetir(){
            
            ArrayList<yeniEv> getir = new ArrayList<yeniEv>();
        
            try {
                statement = con.createStatement();
            
                String sorgu = "Select * from yeniev";
            
                ResultSet rs = statement.executeQuery(sorgu);
            
                while(rs.next()){
                
                    int id = rs.getInt("id");
                    String il = rs.getString("il");
                    String ilçe = rs.getString("ilce");
                    String mahalle = rs.getString("mahalle");
                    String cadde = rs.getString("cadde");
                    String binaAdi = rs.getString("yeniAptAd");
                    int binaNo = rs.getInt("aptNo");
                    int arsaMKare = rs.getInt("arsaMKare");
                    int katSayisi = rs.getInt("katSayisi");
                    String yikicakFirma = rs.getString("YapiciFirma");
                    int yikmaMaliyeti = rs.getInt("yapilmaMaliyet");
                    String yikmaSuresi = rs.getString("yapilmaSuresi");
                
                    getir.add(new yeniEv(katSayisi, yikicakFirma, yikmaMaliyeti, yikmaSuresi, id, il, ilçe, mahalle, cadde, binaAdi, binaNo, arsaMKare));
                
                }
                return getir;
            
            } catch (SQLException ex) {
                Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            
        }
            
    }
         
    public boolean girisYap(String kullanici_adi,String parola){
        
        String sorgu = "SELECT * from kullanici where kullaniciAdı = ? and sifre = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    public void KayitOl(String kAdi, String parola, String email){
        
        String sorgu = "Insert into kullanici(kullaniciAdı,sifre,email) VALUES(?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kAdi);
            preparedStatement.setString(2, parola);
            preparedStatement.setString(3, email);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VeriTabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public VeriTabaniIslemleri(){
        //BAĞLANMA İŞLEMLERİ
        
         String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        System.out.println(url);
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        
        //VeriTabaniIslemleri islemler = new VeriTabaniIslemleri();
        VeriTabaniIslemleri.CalisanVeriTabaniIslemleri islemler = new VeriTabaniIslemleri(). new CalisanVeriTabaniIslemleri();
        
        
    }   
}
