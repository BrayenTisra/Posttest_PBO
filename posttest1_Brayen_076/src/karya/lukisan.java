package karya;

public class lukisan {
    String IdLukisan;
    String JudulLukisan;
    int TahunBuat;
    int HargaLukisan;

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
        IdLukisan = idLukisan;
    }
    public void setJudulLukisan(String judulLukisan) {
        JudulLukisan = judulLukisan;
    }
    public void setTahunBuat(int tahunBuat) {
        TahunBuat = tahunBuat;
    }
    public void setHargaLukisan(int hargaLukisan) {
        HargaLukisan = hargaLukisan;
    }
}
