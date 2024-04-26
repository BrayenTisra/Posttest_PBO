package seni;

public class lukisan extends karya {
    private String idLukisan, teknikLukisan, aliran;
    public final String jenisL = "Lukisan";

    public lukisan(String idLukisan, String JudulKarya, String pencipta, int TahunBuat, int HargaKarya,String teknikLukisan, String aliran) {
        super(JudulKarya, pencipta, TahunBuat, HargaKarya);
        this.idLukisan = idLukisan;
        this.teknikLukisan = teknikLukisan;
        this.aliran = aliran;
    }

    public void setIdLukisan(String idLukisan) {
        this.idLukisan = idLukisan;
    }

    public void setTeknikLukisan(String teknikLukisan) {
        this.teknikLukisan = teknikLukisan;
    }

    public void setAliran(String aliran) {
        this.aliran = aliran;
    }

    public String getIdLukisan() {
        return idLukisan;
    }

    public String getTeknikLukisan() {
        return teknikLukisan;
    }

    public String getAliran() {
        return aliran;
    }

    @Override
    public void lihat() {
        System.out.println("|             " + jenisL + "             |");
        System.out.println("===================================");
        System.out.println("Id             : " + this.idLukisan);
        System.out.println("Judul Karya    : " + this.JudulKarya );
        System.out.println("Pencipta Karya : " + this.Pencipta);
        System.out.println("Tahun Buat     : " + this.TahunBuat);
        System.out.println("Harga Karya    : " + this.HargaKarya);
        System.out.println("Teknik Lukisan : " + this.teknikLukisan);
        System.out.println("Aliran Lukisan : " + this.aliran);
        System.out.println("===================================");
    }

}
