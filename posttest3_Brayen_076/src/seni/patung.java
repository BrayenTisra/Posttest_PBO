package seni;

import java.io.IOException;

public class patung extends karya{
    private String idPatung, bahan;
    private double tinggiPatung;
    public patung(String idPatung, String JudulKarya, String Pencipta, int TahunBuat, int HargaKarya, String bahan, double tinggiPatung){
        super(JudulKarya, Pencipta, TahunBuat, HargaKarya);
        this.idPatung = idPatung;
        this.bahan = bahan;
        this.tinggiPatung = tinggiPatung;   
    }
    
    public String getIdPatung() {
        return idPatung;
    }
    public String getBahan() {
        return bahan;
    }
    public double getTinggiPatung() {
        return tinggiPatung;
    }

    public void setIdPatung(String idPatung) {
        this.idPatung = idPatung;
    }
    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
    public void setTinggiPatung(double tinggiPatung) {
        this.tinggiPatung = tinggiPatung;
    }
}
