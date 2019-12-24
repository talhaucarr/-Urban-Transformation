/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xKral_Tr
 */
public class yeniEv extends Adres{
    
    private int katSayisi;
    private String yapiciFirma;
    private int yapilmaMaliyeti;
    private String yapilmaSuresi;

    public yeniEv(int katSayisi, String yapiciFirma, int yapilmaMaliyeti, String yapilmaSuresi, int id, String il, String ilce, String mahalle, String cadde, String aptAd, int aptNo, int arsaMKare) {
        super(id, il, ilce, mahalle, cadde, aptAd, aptNo, arsaMKare);
        this.katSayisi = katSayisi;
        this.yapiciFirma = yapiciFirma;
        this.yapilmaMaliyeti = yapilmaMaliyeti;
        this.yapilmaSuresi = yapilmaSuresi;
    }

    
    
    public int getKatSayisi() {
        return katSayisi;
    }

    public void setKatSayisi(int katSayisi) {
        this.katSayisi = katSayisi;
    }

    public String getYapiciFirma() {
        return yapiciFirma;
    }

    public void setYapiciFirma(String yapiciFirma) {
        this.yapiciFirma = yapiciFirma;
    }

    public int getYapilmaMaliyeti() {
        return yapilmaMaliyeti;
    }

    public void setYapilmaMaliyeti(int yapilmaMaliyeti) {
        this.yapilmaMaliyeti = yapilmaMaliyeti;
    }

    public String getYapilmaSuresi() {
        return yapilmaSuresi;
    }

    public void setYapilmaSuresi(String yapilmaSuresi) {
        this.yapilmaSuresi = yapilmaSuresi;
    } 
    
}
