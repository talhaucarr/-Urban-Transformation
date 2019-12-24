/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xKral_Tr
 */
public class yikilcakEv extends Adres{
    
    
    private String yikicakFirma;
    private int yikmaMaliyeti;
    private String yikmaSuresi;

    public yikilcakEv(String yikicakFirma, int yikmaMaliyeti, String yikmaSuresi, int id, String il, String ilce, String mahalle, String cadde, String aptAd, int aptNo, int arsaMKare) {
        super(id, il, ilce, mahalle, cadde, aptAd, aptNo, arsaMKare);
        this.yikicakFirma = yikicakFirma;
        this.yikmaMaliyeti = yikmaMaliyeti;
        this.yikmaSuresi = yikmaSuresi;
    }







    public String getYikicakFirma() {
        return yikicakFirma;
    }



    public void setYikicakFirma(String yikicakFirma) {
        this.yikicakFirma = yikicakFirma;
    }

    public int getYikmaMaliyeti() {
        return yikmaMaliyeti;
    }

    public void setYikmaMaliyeti(int yikmaMaliyeti) {
        this.yikmaMaliyeti = yikmaMaliyeti;
    }

    public String getYikmaSuresi() {
        return yikmaSuresi;
    }

    public void setYikmaSuresi(String yikmaSuresi) {
        this.yikmaSuresi = yikmaSuresi;
    }
    
    
}
