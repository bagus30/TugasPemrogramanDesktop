import java.util.*;


public class Main2 {
    public static void tampilanMenu() {

        // DEKLARASI VARIABEL

        Scanner pilihMenu = new Scanner(System.in);
        String option;
        String menuUtama;
        int[] quantity = new int[20];
        int total = 0;
        String more;
        int totalPembayaran;
        int diskon;
        int ppn;
        int biayaLayanan = 2000;
        String[] pilihan = new String[20];
        int[] cetakHarga = new int[20];
        int attempt = 0;
        boolean status = true;
        int jumlahMenu;

        String password;

        // DATA MENU MAKANANAN DALAM ARRAY

        DaftarMenu daftar = new DaftarMenu();

        menuMakanan[] menu = {
                new menuMakanan("Dada Ayam", 15000, "Makanan"),
                new menuMakanan("Paha Ayam", 13000, "Makanan"),
                new menuMakanan("Extra Sambal", 3000, "Makanan"),
                new menuMakanan("Kol Goreng", 7000, "Makanan"),
                new menuMakanan("Nasi", 5000, "Makanan"),
                new menuMakanan("Es Teh Manis", 4000, "Minuman"),
                new menuMakanan("Es Teh Tawar", 2000, "Minuman"),
                new menuMakanan("Air Mineral", 5000, "Minuman")
        };


        daftar.tambahMenu(new menuMakanan("Dada Ayam", 15000, "Makanan"));
        daftar.tambahMenu(new menuMakanan("Paha Ayam", 13000, "Makanan"));
        daftar.tambahMenu(new menuMakanan("Extra Sambal", 3000, "Makanan"));
        daftar.tambahMenu(new menuMakanan("Kol Goreng", 7000, "Makanan"));
        daftar.tambahMenu(new menuMakanan("Nasi", 5000, "Makanan"));
        daftar.tambahMenu(new menuMakanan("Es Teh Manis", 4000, "Minuman"));
        daftar.tambahMenu(new menuMakanan("Es Teh Tawar", 2000, "Minuman"));
        daftar.tambahMenu(new menuMakanan("Air Mineral", 5000, "Minuman"));


        System.out.println("Ketik pesan untuk memesan makanan, ketik admin untuk masuk ke menu admin");
        menuUtama = pilihMenu.next();

        if (menuUtama.equals("pesan")) {

            // MUNCULKAN DAFTAR MENU


            System.out.println("--------- Wilujeng Sumping di Warung Mamank -----------");
            System.out.println();

            System.out.println("                *** Pilihan Menu ***");
            System.out.println();
            System.out.println(" --- Makanan --- ");

            System.out.println("1. " + menu[0].getNamaMenu() + "........... Rp" + menu[0].getHargaMenu());
            System.out.println("2. " + menu[1].getNamaMenu() + "........... Rp" + menu[1].getHargaMenu());
            System.out.println("3. " + menu[2].getNamaMenu() + "........ Rp" + menu[2].getHargaMenu());
            System.out.println("4. " + menu[3].getNamaMenu() + ".......... Rp" + menu[3].getHargaMenu());
            System.out.println("5. " + menu[4].getNamaMenu() + "................ Rp" + menu[4].getHargaMenu());
            System.out.println(" --- Minuman --- ");
            System.out.println("6. " + menu[5].getNamaMenu() + "........ Rp" + menu[5].getHargaMenu());
            System.out.println("7. " + menu[6].getNamaMenu() + "........ Rp" + menu[6].getHargaMenu());
            System.out.println("8. " + menu[7].getNamaMenu() + "......... Rp" + menu[7].getHargaMenu());
            System.out.println();

            // PROSES PEMESANAN BERULANG MAKS 4 KALI DENGAN STRUKTUR PERULANGAN WHILE

            while (status) {
                System.out.println("Silahkan pilih menu yang akan dipesan dengan input angka: (tulis 'selesai' apabila ingin cetak struk)");

                option = pilihMenu.next();

                // INPUT PILIHAN MENU DENGAN PENGKONDISIAN SWITCH CASE

                switch (option) {
                    case "1":
                        System.err.println("Kamu memilih " + menu[0].getNamaMenu());
                        System.out.println();
                        System.out.println("Mau berapa banyak?");

                        quantity[attempt] = pilihMenu.nextInt();
                        total = total + (quantity[attempt] * menu[0].getHargaMenu());
                        pilihan[attempt] = menu[0].getNamaMenu();
                        cetakHarga[attempt] = menu[0].getHargaMenu();
                        attempt += 1;
                        System.out.println(attempt);
                        break;

                    case "2":
                        System.err.println("Kamu memilih " + menu[1].getNamaMenu());
                        System.out.println();
                        System.out.println("Mau berapa banyak?");

                        quantity[attempt] = pilihMenu.nextInt();
                        total = total + (quantity[attempt] * menu[1].getHargaMenu());
                        pilihan[attempt] = menu[1].getNamaMenu();
                        cetakHarga[attempt] = menu[1].getHargaMenu();
                        attempt += 1;
                        break;

                    case "3":
                        System.err.println("Kamu memilih " + menu[2].getNamaMenu());
                        System.out.println();
                        System.out.println("Mau berapa banyak?");

                        quantity[attempt] = pilihMenu.nextInt();
                        total = total + (quantity[attempt] * menu[2].getHargaMenu());
                        pilihan[attempt] = menu[2].getNamaMenu();
                        cetakHarga[attempt] = menu[2].getHargaMenu();
                        attempt += 1;
                        break;

                    case "4":
                        System.err.println("Kamu memilih " + menu[3].getNamaMenu());
                        System.out.println();
                        System.out.println("Mau berapa banyak?");

                        quantity[attempt] = pilihMenu.nextInt();
                        total = total + (quantity[attempt] * menu[3].getHargaMenu());
                        pilihan[attempt] = menu[3].getNamaMenu();
                        cetakHarga[attempt] = menu[3].getHargaMenu();
                        attempt += 1;
                        break;

                    case "5":
                        System.err.println("Kamu memilih " + menu[4].getNamaMenu());
                        System.out.println();
                        System.out.println("Mau berapa banyak?");

                        quantity[attempt] = pilihMenu.nextInt();
                        total = total + (quantity[attempt] * menu[4].getHargaMenu());
                        pilihan[attempt] = menu[4].getNamaMenu();
                        cetakHarga[attempt] = menu[4].getHargaMenu();
                        attempt += 1;
                        break;

                    case "6":
                        System.err.println("Kamu memilih " + menu[5].getNamaMenu());
                        System.out.println();
                        System.out.println("Mau berapa banyak?");

                        quantity[attempt] = pilihMenu.nextInt();
                        total = total + (quantity[attempt] * menu[5].getHargaMenu());
                        pilihan[attempt] = menu[5].getNamaMenu();
                        cetakHarga[attempt] = menu[5].getHargaMenu();
                        attempt += 1;
                        break;

                    case "7":
                        System.err.println("Kamu memilih " + menu[6].getNamaMenu());
                        System.out.println();
                        System.out.println("Mau berapa banyak?");

                        quantity[attempt] = pilihMenu.nextInt();
                        total = total + (quantity[attempt] * menu[6].getHargaMenu());
                        pilihan[attempt] = menu[6].getNamaMenu();
                        cetakHarga[attempt] = menu[6].getHargaMenu();
                        attempt += 1;
                        break;

                    case "8":
                        System.err.println("Kamu memilih " + menu[7].getNamaMenu());
                        System.out.println();
                        System.out.println("Mau berapa banyak?");

                        quantity[attempt] = pilihMenu.nextInt();
                        total = total + (quantity[attempt] * menu[7].getHargaMenu());
                        pilihan[attempt] = menu[7].getNamaMenu();
                        cetakHarga[attempt] = menu[7].getHargaMenu();
                        attempt += 1;
                        break;
                    case "selesai":
                        status = false;
                        break;
                }
            }

            // PENGKONDISIAN UNTUK MEMBEDAKAN HARGA DISKON DAN HARGA NORMAL

            if (total > 100000) {
                diskon = (int) (total * 0.1);
                ppn = (int) (total * 0.1);
                System.out.println("----------- Rincian Pesanan ------------");
                for (int i = 0; i < attempt; i++) {
                    System.out.println(pilihan[i] + " Rp" + cetakHarga[i] + " x" + quantity[i] + "........... Rp" + cetakHarga[i] * quantity[i]);
                }
                totalPembayaran = total + ppn + biayaLayanan - diskon;
                System.out.println("Diskon ................... Rp" + diskon);
                System.out.println("Ppn ...................... Rp" + ppn);
                System.out.println("Biaya Lananan ............ Rp" + biayaLayanan);
                System.out.println("------------------------------------");
                System.out.println("Total pembayaran ......... Rp" + totalPembayaran);
                System.out.println("Selamat anda mendapatkan free 1 minuman karena berbelanja di atas 50 ribu");
                System.exit(0);
            } else {
                ppn = (int) (total * 0.1);
                System.out.println("----------- Rincian Pesanan ------------");
                for (int i = 0; i < attempt; i++) {
                    System.out.println(pilihan[i] + " Rp" + cetakHarga[i] + " x" + quantity[i] + "........... Rp" + cetakHarga[i] * quantity[i]);
                }
                totalPembayaran = total + ppn + biayaLayanan;
                System.out.println("Ppn ...................... Rp" + ppn);
                System.out.println("Biaya Lananan ............ Rp" + biayaLayanan);
                System.out.println("------------------------------------");
                System.out.println("Total pembayaran ......... Rp" + totalPembayaran);
                if (totalPembayaran >= 50000) {
                    System.out.println("Selamat anda mendapatkan free 1 minuman karena berbelanja di atas 50 ribu");
                }
                System.exit(0);
            }
        } else {
            System.out.println("ini adalah menu admin");
            System.out.print("password:");
            password = pilihMenu.next();

            if(password.equals("12345678")) {

                System.out.println(" --- Makanan --- ");

                System.out.println("1. " + menu[0].getNamaMenu() + "........... Rp" + menu[0].getHargaMenu());
                System.out.println("2. " + menu[1].getNamaMenu() + "........... Rp" + menu[1].getHargaMenu());
                System.out.println("3. " + menu[2].getNamaMenu() + "........ Rp" + menu[2].getHargaMenu());
                System.out.println("4. " + menu[3].getNamaMenu() + ".......... Rp" + menu[3].getHargaMenu());
                System.out.println("5. " + menu[4].getNamaMenu() + "................ Rp" + menu[4].getHargaMenu());
                System.out.println(" --- Minuman --- ");
                System.out.println("6. " + menu[5].getNamaMenu() + "........ Rp" + menu[5].getHargaMenu());
                System.out.println("7. " + menu[6].getNamaMenu() + "........ Rp" + menu[6].getHargaMenu());
                System.out.println("8. " + menu[7].getNamaMenu() + "......... Rp" + menu[7].getHargaMenu());
                System.out.println();

                System.out.println("Anda berhasil masuk sebagai admin");
                System.out.println("Silahkan pilih menu mana yang akan dihapus");
                String hapus;

                hapus = pilihMenu.next();

                switch (hapus){
                    case "1" :
                        System.out.println("Yakin ingin menghapus? Ya/Tidak");
                        password = pilihMenu.next();
                        if (password.equals("Ya")){
                            daftar.hapusMenu("Dada Ayam");
                            daftar.tampilkanMenu();
                        }else {

                        }

                        break;

                    case "2" :
                        System.out.println("Yakin ingin menghapus? Ya/Tidak");
                        password = pilihMenu.next();
                        if (password.equals("Ya")) {
                            daftar.hapusMenu("Paha Ayam");
                            daftar.tampilkanMenu();
                        }else {

                        }
                        break;

                    case "3" :
                        System.out.println("Yakin ingin menghapus? Ya/Tidak");
                        password = pilihMenu.next();
                        if (password.equals("Ya")) {
                            daftar.hapusMenu("Extra Sambal");
                            daftar.tampilkanMenu();
                        }else {

                        }
                        break;

                    case "4" :
                        System.out.println("Yakin ingin menghapus? Ya/Tidak");
                        password = pilihMenu.next();
                        if (password.equals("Ya")) {
                            daftar.hapusMenu("Kol Goreng");
                            daftar.tampilkanMenu();
                        }else {

                        }
                        break;

                    case "5" :
                        System.out.println("Yakin ingin menghapus? Ya/Tidak");
                        password = pilihMenu.next();
                        if (password.equals("Ya")) {
                            daftar.hapusMenu("Nasi");
                            daftar.tampilkanMenu();
                        }else {

                        }
                        break;

                    case "6" :
                        System.out.println("Yakin ingin menghapus? Ya/Tidak");
                        password = pilihMenu.next();
                        if (password.equals("Ya")) {
                            daftar.hapusMenu("Es Teh Manis");
                            daftar.tampilkanMenu();
                        }else {

                        }
                        break;

                    case "7" :
                        System.out.println("Yakin ingin menghapus? Ya/Tidak");
                        password = pilihMenu.next();
                        if (password.equals("Ya")) {
                            daftar.hapusMenu("Es Teh Tawar");
                            daftar.tampilkanMenu();
                        }else {

                        }
                        break;

                    case "8" :
                        System.out.println("Yakin ingin menghapus? Ya/Tidak");
                        password = pilihMenu.next();
                        if (password.equals("Ya")) {
                            daftar.hapusMenu("Air Mineral");
                            daftar.tampilkanMenu();
                        }else {

                        }
                        break;
                }

            }else{
                System.out.println("Password salah");
            }
        }
    }
    public static void main(String[] args) {
        tampilanMenu();
    }
}