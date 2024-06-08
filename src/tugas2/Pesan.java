package tugas2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public interface Pesan {

    static void main(Menu menu){
        System.out.println();
        menu.printDaftarMenu();

        ArrayList<Menu> pesananSaya = new ArrayList<>();

        int jumlahPesanan = 1;
        System.out.println("Pesanan ke-1: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        do{
            for (Map.Entry<Integer, Menu> entry : menu.getDaftarMenu().entrySet()){
                Integer key = entry.getKey();
                Menu newPesanan = entry.getValue();

                if(String.valueOf(key).equals(input.trim())){
                    pesananSaya.add(newPesanan);
                    jumlahPesanan++;
                }

                else if(input.trim().equalsIgnoreCase("selesai")){
                    break;
                }
            }
            System.out.print("Pesanan ke-" + jumlahPesanan + ": ");
            input = scanner.nextLine();
        }while(!input.trim().equalsIgnoreCase("selesai"));
        hitungPesanan(pesananSaya);
        System.out.println("Mohon ditunggu untuk pesanannya ya!");
        System.out.println();
        System.out.println("Apakah kamu ingin memesan lagi? (ya/tidak)");
        input = scanner.nextLine();
        if (input.trim().equalsIgnoreCase("ya")){
            Pesan.main(menu);
        }else if (input.trim().equalsIgnoreCase("tidak")){

        }
    }

    static void hitungPesanan(ArrayList<Menu> pesananSaya){
        Map<String, Integer> jumlahItem = new HashMap<>();
        Map<String, Double> totalHarga = new HashMap<>();

        for(Menu pesanan : pesananSaya){
            String nama = pesanan.getNama();
            Double harga = pesanan.getHarga();

            jumlahItem.put(nama, jumlahItem.getOrDefault(nama, 0)+1);
            totalHarga.put(nama, totalHarga.getOrDefault(nama, 0.0) + harga);
        }

        System.out.println("-------------------- Pembayaran --------------------");
        System.out.println("| Nama           | Jumlah Item |      Harga |Total Harga |");

        Double totalBayar = new Double(0);
        for (String nama : jumlahItem.keySet()){
            Double hargaItem = totalHarga.get(nama) / jumlahItem.get(nama);
            System.out.printf("| %-14s | %11d | %10.1f | %10.1f |\n", nama, jumlahItem.get(nama), hargaItem, totalHarga.get(nama));
            totalBayar = totalBayar + totalHarga.get(nama);
        }

        boolean isPromo = false;
        boolean isDiskon = false;
        Double totalDiskon = new Double(0);
        if(totalBayar > new Double(50000)){
            isPromo = true;
        }

        if(totalBayar > new Double(100000)){
            isDiskon = true;
            totalDiskon = totalBayar * 10 / 100;
            totalBayar = totalBayar - totalDiskon;
        }

        Double biayaPelayanan = new Double(2000);
        Double finalBayar = totalBayar + biayaPelayanan + (totalBayar * 10 / 100);
        System.out.println("------------------------------------------");
        System.out.println("Total bayar ............................... Rp" + (totalBayar + totalDiskon));
        if (isDiskon) System.out.println("- Diskon .................................. Rp" + totalDiskon);
        if (isDiskon) System.out.println("Total bayar setelah diskon ................ Rp" + totalBayar);
        System.out.println("+ pajak 10% ............................... Rp" + (totalBayar * 10 / 100));
        System.out.println("+ Biaya pelayanan ......................... Rp" + biayaPelayanan);
        System.out.println("Total ..................................... Rp" + finalBayar);
        if (isPromo) System.out.println("Selamat anda mendapatkan gratis 1 minuman");

    }

}
