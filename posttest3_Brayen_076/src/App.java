import java.util.ArrayList;
import seni.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    // Penerapan Acces Modifier (private)
    static ArrayList<lukisan> lksn = new ArrayList<>();
    static ArrayList<patung> ptg = new ArrayList<>();
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    // Penerapan Acces Modifier (Default)
    static void lihatL() {
        System.out.println("===================================");
        System.out.println("|           List karya          |");
        System.out.println("===================================");
        for (int i = 0; i < lksn.size(); i++) {
            lukisan lukis = lksn.get(i);
            String idLukisan = lukis.getIdLukisan();
            String JudulKarya = lukis.getJudulKarya();
            String pencipta = lukis.getPencipta();
            int TahunBuat = lukis.getTahunBuat();
            int HargaKarya = lukis.getHargaKarya();
            String teknik = lukis.getTeknikLukisan();
            String aliran = lukis.getAliran();

            System.out.println("Id             : " + idLukisan);
            System.out.println("Judul Karya    : " + JudulKarya);
            System.out.println("Pencipta Karya : " + pencipta);
            System.out.println("Tahun Buat     : " + TahunBuat);
            System.out.println("Harga          : Rp." + HargaKarya);
            System.out.println("Teknik Lukisan : " + teknik);
            System.out.println("Aliran Lukisan : " + aliran);
            System.out.println("===================================");
        }
    }

    static void lihatP() {
        System.out.println("===================================");
        System.out.println("|           List karya          |");
        System.out.println("===================================");
        for (int i = 0; i < ptg.size(); i++) {
            patung Patung = ptg.get(i);
            String IdKarya = Patung.getIdPatung();
            String JudulKarya = Patung.getJudulKarya();
            String Pencipta = Patung.getPencipta();
            int TahunBuat = Patung.getTahunBuat();
            int HargaKarya = Patung.getHargaKarya();
            String Bahan = Patung.getBahan();
            Double Tinggi = Patung.getTinggiPatung();

            System.out.println("Id            : " + IdKarya);
            System.out.println("Judul Karya   : " + JudulKarya);
            System.out.println("Judul Karya   : " + Pencipta);
            System.out.println("Tahun Buat    : " + TahunBuat);
            System.out.println("Harga         : Rp." + HargaKarya);
            System.out.println("Bahan Patung  : " + Bahan);
            System.out.println("Tinggi Patung : " + Tinggi);
            System.out.println("===================================");
        }
    }

    // Penerapan Acces Modifier (protected)
    protected static void menu() {
        System.out.println("=========================");
        System.out.println("|          Menu         |");
        System.out.println("=========================");
        System.out.println("| 1. Lihat List Karya   |");
        System.out.println("| 2. Daftar Karya       |");
        System.out.println("| 3. Ubah Karya         |");
        System.out.println("| 4. Hapus Karya        |");
        System.out.println("| 5. Exit               |");
        System.out.println("=========================");
    }

    protected static void menu2() {
        System.out.println("=========================");
        System.out.println("|          Menu         |");
        System.out.println("=========================");
        System.out.println("| 1. Lukisan            |");
        System.out.println("| 2. Patung             |");
        System.out.println("| 3. Exit               |");
        System.out.println("=========================");
    }

    private static void tambahL() throws Exception {
        System.out.println("===================================");
        System.out.println("|          Daftar Lukisan         |");
        System.out.println("===================================");
        String Id = String.format("0" + (lksn.size() + 1));
        System.out.print("Masukkan Judul Karya : ");
        String Judul = br.readLine();
        System.out.print("Masukkan Pencipta Karya : ");
        String Pencipta = br.readLine();
        int Tahun;
        while (true) {
            try {
                System.out.print("Masukkan Tahun Pembuatan : ");
                Tahun = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Inputan Tahun Pembuatan Harus Berupa Integer!");
            }
        }
        int Harga;
        while (true) {
            try {
                System.out.print("Harga : ");
                Harga = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Inputan Harga Harus Berupa Integer!");
            }
        }
        System.out.print("Masukkan Teknik Lukisan : ");
        String Teknik = br.readLine();
        System.out.print("Masukkan Aliran Lukisan : ");
        String Aliran = br.readLine();
        lukisan lukis = new lukisan(Id, Judul, Pencipta, Tahun, Harga, Teknik, Aliran);
        lksn.add(lukis);
    }

    public static void tambahP() throws IOException {
        System.out.println("===================================");
        System.out.println("|          Daftar Patung          |");
        System.out.println("===================================");
        String Id = String.format("0" + (ptg.size() + 1));
        System.out.print("Masukkan Judul Karya : ");
        String Judul = br.readLine();
        System.out.print("Masukkan Pencipta Karya : ");
        String Pencipta = br.readLine();
        int Tahun;
        while (true) {
            try {
                System.out.print("Masukkan Tahun Pembuatan : ");
                Tahun = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Inputan Tahun Pembuatan Harus Berupa Integer!");
            }
        }
        int Harga;
        while (true) {
            try {
                System.out.print("Harga : ");
                Harga = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Inputan Harga Harus Berupa Integer!");
            }
        }
        System.out.print("Masukkan Bahan Patung : ");
        String Bahan = br.readLine();
        double Tinggi;
        while (true) {
            try {
                System.out.print("Tinggi Patung : ");
                Tinggi = Double.parseDouble(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Inputan Harga Harus Berupa Integer!");
            }
        }
        patung ptng = new patung(Id, Judul, Pencipta, Tahun, Harga, Bahan, Tinggi);
        ptg.add(ptng);
    }

    public static void ubahL() throws Exception {
        System.out.println("===================================");
        System.out.println("|         Ubah Data Lukisan       |");
        System.out.println("===================================");
        System.out.print("Masukkan Nomor Lukisan: ");
        int cari = Integer.parseInt(br.readLine());
        for (int i = 0; i < lksn.size(); i++) {
            if (cari - 1 == i) {
                lukisan newlksn = lksn.get(i);
                System.out.print("Masukkan Judul Lukisan : ");
                String newjudul = br.readLine();
                newlksn.setJudulKarya(newjudul);
                System.out.print("Masukkan Pencipta Lukisan : ");
                String Pencipta = br.readLine();
                newlksn.setPencipta(Pencipta);
                int newtahun;
                while (true) {
                    try {
                        System.out.print("Masukkan Tahun Pembuatan : ");
                        newtahun = Integer.parseInt(br.readLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Inputan Tahun Pembuatan Harus Berupa Integer!");
                    }
                }
                newlksn.setTahunBuat(newtahun);
                int newharga;
                while (true) {
                    try {
                        System.out.print("Harga : ");
                        newharga = Integer.parseInt(br.readLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Inputan Harga Harus Berupa Integer!");
                    }
                }
                newlksn.setHargaKarya(newharga);
                System.out.print("Masukkan Teknik Lukisan : ");
                String newTeknik = br.readLine();
                newlksn.setTeknikLukisan(newTeknik);
                System.out.print("Masukkan Aliran Lukisan : ");
                String newAliran = br.readLine();
                newlksn.setAliran(newAliran);
            }
        }
    }

    public static void ubahP() throws Exception {
        System.out.println("===================================");
        System.out.println("|        Ubah Data Patung         |");
        System.out.println("===================================");
        System.out.print("Masukkan Nomor Lukisan: ");
        int cari = Integer.parseInt(br.readLine());
        for (int i = 0; i < ptg.size(); i++) {
            if (cari - 1 == i) {
                patung newptg = ptg.get(i);
                System.out.print("Masukkan Judul Lukisan : ");
                String newjudul = br.readLine();
                newptg.setJudulKarya(newjudul);
                System.out.print("Masukkan Pencipta Lukisan : ");
                String Pencipta = br.readLine();
                newptg.setPencipta(Pencipta);
                int newtahun;
                while (true) {
                    try {
                        System.out.print("Masukkan Tahun Pembuatan : ");
                        newtahun = Integer.parseInt(br.readLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Inputan Tahun Pembuatan Harus Berupa Integer!");
                    }
                }
                newptg.setTahunBuat(newtahun);
                int newharga;
                while (true) {
                    try {
                        System.out.print("Harga : ");
                        newharga = Integer.parseInt(br.readLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Inputan Harga Harus Berupa Integer!");
                    }
                }
                newptg.setHargaKarya(newharga);
                System.out.print("Masukkan Bahan Patung : ");
                String newBahan = br.readLine();
                newptg.setBahan(newBahan);
                double newTinggi;
                while (true) {
                    try {
                        System.out.print("Tinggi Patung : ");
                        newTinggi = Double.parseDouble(br.readLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Inputan Harga Harus Berupa Integer!");
                    }
                }
                newptg.setTinggiPatung(newTinggi);
            }
        }
    }

    public static void hapusL() throws IOException {
        System.out.println("===================================");
        System.out.println("|          Hapus Lukisan          |");
        System.out.println("===================================");
        System.out.print("Masukkan Nomor Lukisan: ");
        int Cari = Integer.parseInt(br.readLine());
        lksn.remove(Cari - 1);
    }
    public static void hapusP() throws IOException {
        System.out.println("===================================");
        System.out.println("|          Hapus Patung           |");
        System.out.println("===================================");
        System.out.print("Masukkan Nomor Lukisan: ");
        int Cari = Integer.parseInt(br.readLine());
        ptg.remove(Cari - 1);
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            menu();
            int menu;
            while (true) {
                try {
                    System.out.print("Menu : ");
                    menu = Integer.parseInt(br.readLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Inputan Tahun Pembuatan Harus Berupa Integer!");
                }
            }
            switch (menu) {
                case 1:
                    menu2();
                    int pilih1;
                    while (true) {
                        try {
                            System.out.print("Masukkan Pilihan : ");
                            pilih1 = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan Tahun Pembuatan Harus Berupa Integer!");
                        }
                    }
                    if (pilih1 == 1) {
                        if (lksn.size() == 0) {
                            System.out.println("=============================================");
                            System.out.println("Data Lukisan Kosong Mohon Isi Terlebih Dahulu");
                            System.out.println("=============================================");
                            break;
                        }
                        lihatL();
                    } else if (pilih1 == 2) {
                        if (ptg.size() == 0) {
                            System.out.println("================================================");
                            System.out.println("| Data Patung Kosong Mohon Isi Terlebih Dahulu |");
                            System.out.println("================================================");
                            break;
                        }
                        lihatP();
                    }
                    break;
                case 2:
                    menu2();
                    int pilih2;
                    while (true) {
                        try {
                            System.out.print("Masukkan Pilihan : ");
                            pilih2 = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan Tahun Pembuatan Harus Berupa Integer!");
                        }
                    }
                    if (pilih2 == 1) {
                        tambahL();
                    } else if (pilih2 == 2) {
                        tambahP();
                    }
                    break;
                case 3:
                    menu2();
                    int pilih3;
                    while (true) {
                        try {
                            System.out.print("Masukkan Pilihan : ");
                            pilih3 = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan Tahun Pembuatan Harus Berupa Integer!");
                        }
                    }
                    if (pilih3 == 1) {
                        if (lksn.size() == 0) {
                            System.out.println("=============================================");
                            System.out.println("Data Lukisan Kosong Mohon Isi Terlebih Dahulu");
                            System.out.println("=============================================");
                            break;
                        }
                        lihatL();
                        ubahL();
                    } else if (pilih3 == 2) {
                        if (ptg.size() == 0) {
                            System.out.println("=============================================");
                            System.out.println("Data Patung Kosong Mohon Isi Terlebih Dahulu");
                            System.out.println("=============================================");
                            break;
                        }
                        lihatP();
                        ubahP();
                    }
                    break;
                case 4:
                    menu2();
                    int pilih4;
                    while (true) {
                        try {
                            System.out.print("Masukkan Pilihan : ");
                            pilih4 = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan Tahun Pembuatan Harus Berupa Integer!");
                        }
                    }
                    if (pilih4 == 1) {
                        if (lksn.size() == 0) {
                            System.out.println("=============================================");
                            System.out.println("Data Lukisan Kosong Mohon Isi Terlebih Dahulu");
                            System.out.println("=============================================");
                            break;
                        }
                        lihatL();
                        hapusL();
                    } else if (pilih4 == 2) {
                        if (ptg.size() == 0) {
                            System.out.println("=============================================");
                            System.out.println("Data Patung Kosong Mohon Isi Terlebih Dahulu");
                            System.out.println("=============================================");
                            break;
                        }
                        lihatP();
                        hapusP();
                    }
                    break;
                case 5:
                    System.out.println("=============================================");
                    System.out.println("|      Thankyou for your participation      |");
                    System.out.println("=============================================");
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
