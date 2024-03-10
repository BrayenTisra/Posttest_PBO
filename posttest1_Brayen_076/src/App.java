import java.util.ArrayList;
import karya.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<lukisan> lksn = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (true) {
            System.out.println("=========================");
            System.out.println("|          Menu         |");
            System.out.println("=========================");
            System.out.println("| 1. Lihat List Lukisan |");
            System.out.println("| 2. Daftar Lukisan     |");
            System.out.println("| 3. Ubah Lukisan       |");
            System.out.println("| 4. Hapus Lukisan      |");
            System.out.println("| 5. Exit               |");
            System.out.println("=========================");
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
                    System.out.println("===================================");
                    System.out.println("|           List Lukisan          |");
                    System.out.println("===================================");
                    for (int i = 0; i < lksn.size(); i++) {
                        lukisan lukis = lksn.get(i);
                        String IdLukisan = lukis.getIdLukisan();
                        String JudulLukisan = lukis.getJudulLukisan();
                        int TahunBuat = lukis.getTahunBuat();
                        int HargaLukisan = lukis.getHargaLukisan();

                        System.out.println("Id : " + IdLukisan);
                        System.out.println("Judul Lukisan : " + JudulLukisan);
                        System.out.println("Tahun Buat : " + TahunBuat);
                        System.out.println("Harga : Rp." + HargaLukisan);
                        System.out.println("===================================");
                    }
                    break;
                case 2:
                    System.out.println("===================================");
                    System.out.println("|          Daftar Lukisan         |");
                    System.out.println("===================================");
                    String id = String.format("0" + (lksn.size() + 1));
                    System.out.print("Masukkan Judul Lukisan : ");
                    String judul = br.readLine();
                    int tahun;
                    while (true) {
                        try {
                            System.out.print("Masukkan Tahun Pembuatan : ");
                            tahun = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan Tahun Pembuatan Harus Berupa Integer!");
                        }
                    }
                    int harga;
                    while (true) {
                        try {
                            System.out.print("Harga : ");
                            harga = Integer.parseInt(br.readLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Inputan Harga Harus Berupa Integer!");
                        }
                    }
                    lukisan lukis = new lukisan(id, judul, tahun, harga);
                    lksn.add(lukis);
                    break;
                case 3:
                    System.out.println("===================================");
                    System.out.println("|           Ubah Lukisan          |");
                    System.out.println("===================================");
                    System.out.print("Cari Index Lukisan: ");
                    int cari = Integer.parseInt(br.readLine());
                    for (int i = 0; i < lksn.size(); i++) {
                        if (cari-1 == i) {
                            lukisan newlksn = lksn.get(i);
                            System.out.print("Masukkan Judul Lukisan : ");
                            String newjudul = br.readLine();
                            newlksn.setJudulLukisan(newjudul);
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
                            newlksn.setHargaLukisan(newharga);
                        }
                    }
                    break;
                case 4:
                    System.out.println("===================================");
                    System.out.println("|           Hapus Lukisan         |");
                    System.out.println("===================================");
                    System.out.print("Cari Index Lukisan: ");
                    int Cari = Integer.parseInt(br.readLine());
                    lksn.remove(Cari-1);
                    break;
                case 5:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
