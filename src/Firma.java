/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xKral_Tr
 */
public class Firma {
    
    private int id ;
    private String firmaAdi;
    private String firmaSahipAdi;
    private String firmaAlani;

    public Firma(int id, String firmaAdi, String firmaSahipAdi, String firmaAlani) {
        this.id = id;
        this.firmaAdi = firmaAdi;
        this.firmaSahipAdi = firmaSahipAdi;
        this.firmaAlani = firmaAlani;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getFirmaSahipAdi() {
        return firmaSahipAdi;
    }

    public void setFirmaSahipAdi(String firmaSahipAdi) {
        this.firmaSahipAdi = firmaSahipAdi;
    }

    public String getFirmaAlani() {
        return firmaAlani;
    }

    public void setFirmaAlani(String firmaAlani) {
        this.firmaAlani = firmaAlani;
    }
    
    
    
}
