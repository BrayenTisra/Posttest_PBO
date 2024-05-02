package seni;

public class patung extends karya{
    private String idPatung, bahan;
    private double tinggiPatung;
    public final String jenisP = "Patung";

    public patung(String idPatung, String JudulKarya, String Pencipta, int TahunBuat, int HargaKarya, String bahan,
            double tinggiPatung) {
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

    @Override
    public void lihat() {
        System.out.println("|              " + jenisP + "             |");
        System.out.println("===================================");
        System.out.println("Id            : " + this.idPatung);
        System.out.println("Judul Karya    : " + this.JudulKarya);
        System.out.println("Pencipta Karya : " + this.Pencipta);
        System.out.println("Tahun Buat     : " + this.TahunBuat);
        System.out.println("Harga Karya    : " + this.HargaKarya);
        System.out.println("Bahan Patung  : " + this.bahan);
        System.out.println("Tinggi Patung : " + this.tinggiPatung);
        System.out.println("===================================");
    }

}
