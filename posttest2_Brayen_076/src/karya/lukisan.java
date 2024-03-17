package karya;

public class lukisan {
    private String IdLukisan, JudulLukisan;
    private int TahunBuat, HargaLukisan;

    public lukisan(String IdLukisan, String JudulLukisan, int TahunBuat, int HargaLukisan) {
        this.IdLukisan = IdLukisan;
        this.JudulLukisan = JudulLukisan;
        this.TahunBuat = TahunBuat;
        this.HargaLukisan = HargaLukisan;
    }

    public String getIdLukisan() {
        return IdLukisan;
    }
    public String getJudulLukisan() {
        return JudulLukisan;
    }
    public int getTahunBuat() {
        return TahunBuat;
    }
    public int getHargaLukisan() {
        return HargaLukisan;
    }

    public void setIdLukisan(String idLukisan) {
        this.IdLukisan = idLukisan;
    }
    public void setJudulLukisan(String judulLukisan) {
        this.JudulLukisan = judulLukisan;
    }
    public void setTahunBuat(int tahunBuat) {
        this.TahunBuat = tahunBuat;
    }
    public void setHargaLukisan(int hargaLukisan) {
        this.HargaLukisan = hargaLukisan;
    }
}
