package seni;

public abstract class karya implements karyaSeni{
    protected String JudulKarya, Pencipta;
    protected int TahunBuat, HargaKarya;

    public karya(String JudulKarya, String pencipta, int TahunBuat, int HargaKarya) {
        this.JudulKarya = JudulKarya;
        this.Pencipta = pencipta;
        this.TahunBuat = TahunBuat;
        this.HargaKarya = HargaKarya;
    }

    public String getJudulKarya() {
        return JudulKarya;
    }
    public String getPencipta() {
        return Pencipta;
    }
    public int getTahunBuat() {
        return TahunBuat;
    }
    public int getHargaKarya() {
        return HargaKarya;
    }

    public void setJudulKarya(String judulKarya) {
        this.JudulKarya = judulKarya;
    }
    public void setPencipta(String Pencipta) {
        this.Pencipta = Pencipta;
    }
    public void setTahunBuat(int tahunBuat) {
        this.TahunBuat = tahunBuat;
    }
    public void setHargaKarya(int hargaKarya) {
        this.HargaKarya = hargaKarya;
    }
    
    public abstract void lihat();
}
