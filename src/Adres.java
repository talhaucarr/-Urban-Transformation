/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xKral_Tr
 */
public class Adres {
    
    private int id;
    private String il;
    private String ilce;
    private String mahalle;
    private String cadde;
    private String aptAd;
    private int aptNo;
    private int arsaMKare;

    public Adres(int id, String il, String ilce, String mahalle, String cadde, String aptAd, int aptNo, int arsaMKare) {
        this.id = id;
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.cadde = cadde;
        this.aptAd = aptAd;
        this.aptNo = aptNo;
        this.arsaMKare = arsaMKare;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public String getAptAd() {
        return aptAd;
    }

    public void setAptAd(String aptAd) {
        this.aptAd = aptAd;
    }

    public int getAptNo() {
        return aptNo;
    }

    public void setAptNo(int aptNo) {
        this.aptNo = aptNo;
    }

    public int getArsaMKare() {
        return arsaMKare;
    }

    public void setArsaMKare(int arsaMKare) {
        this.arsaMKare = arsaMKare;
    }
    
    
    
}
