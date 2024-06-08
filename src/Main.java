import java.util.Scanner;

public class Main {
    public static void tampilanMenu(){

        // DEKLARASI VARIABEL

        Scanner pilihMenu = new Scanner(System.in);
        int option;
        int[] quantity = new int[4];
        int total = 0;
        String more;
        int totalPembayaran;
        int diskon;
        int ppn;
        int biayaLayanan = 2000;
        String[] pilihan = new String[4];
        int[] cetakHarga = new int[4];
        int attempt = 0;
        boolean status = true;

        // DATA MENU MAKANANAN DALAM ARRAY

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


        // MUNCULKAN DAFTAR MENU

        System.out.println("--------- Wilujeng Sumping di Warung Mamank -----------");
        System.out.println();

        System.out.println("                *** Pilihan Menu ***");
        System.out.println();
        System.out.println(" --- Makanan --- ");
        System.out.println("Menu: " + menu[0].getNamaMenu() + "........... Rp" + menu[0].getHargaMenu());
        System.out.println("Menu: " + menu[1].getNamaMenu() + "........... Rp" + menu[1].getHargaMenu());
        System.out.println("Menu: " + menu[2].getNamaMenu() + "........ Rp" + menu[2].getHargaMenu());
        System.out.println("Menu: " + menu[3].getNamaMenu() + ".......... Rp" + menu[3].getHargaMenu());
        System.out.println("Menu: " + menu[4].getNamaMenu() + "................ Rp" + menu[4].getHargaMenu());
        System.out.println(" --- Minuman --- ");
        System.out.println("Menu: " + menu[5].getNamaMenu() + "........ Rp" + menu[5].getHargaMenu());
        System.out.println("Menu: " + menu[6].getNamaMenu() + "........ Rp" + menu[6].getHargaMenu());
        System.out.println("Menu: " + menu[7].getNamaMenu() + "......... Rp" + menu[7].getHargaMenu());
        System.out.println();

        // PROSES PEMESANAN BERULANG MAKS 4 KALI DENGAN STRUKTUR PERULANGAN WHILE

            while (status) {
                System.out.println("Silahkan pilih menu yang akan dipesan (max 4) dengan input angka:");

                option = pilihMenu.nextInt();

                // INPUT PILIHAN MENU DENGAN PENGKONDISIAN SWITCH CASE

                switch (option) {
                    case 1:
                        System.err.println("Kamu memilih Dada Ayam");
                        System.out.println();
                        System.out.println("Mau berapa banyak?");
                        option = pilihMenu.nextInt();
                        quantity[attempt] = option;
                        total = total + (quantity[attempt] * menu[0].getHargaMenu());
                        pilihan[attempt] = menu[0].getNamaMenu();
                        cetakHarga[attempt] = menu[0].getHargaMenu();
                        attempt += 1;
                        if(attempt == 4){
                            status = false;
                        }else {
                            System.out.println("Ada tambahan lain? (y/n) max 4 pesanan");
                            more = pilihMenu.next();
                            if(more.equals("y")){
                                continue;
                            }else {
                                status = false;
                            }
                        }


                        break;

                    case 2:
                        System.err.println("Kamu memilih Paha Ayam");
                        System.out.println();
                        System.out.println("Mau berapa banyak?");
                        option = pilihMenu.nextInt();
                        quantity[attempt] = option;
                        total = total + (quantity[attempt] * menu[1].getHargaMenu());
                        pilihan[attempt] = menu[1].getNamaMenu();
                        cetakHarga[attempt] = menu[1].getHargaMenu();
                        attempt += 1;
                        if(attempt == 4){
                            status = false;
                        }else {
                            System.out.println("Ada tambahan lain? (y/n) max 4 pesanan");
                            more = pilihMenu.next();
                            if(more.equals("y")){
                                continue;
                            }else {
                                status = false;
                            }
                        }
                        break;

                    case 3:
                        System.err.println("Kamu memilih Extra Sambal");
                        System.out.println();
                        System.out.println("Mau berapa banyak?");
                        option = pilihMenu.nextInt();
                        quantity[attempt] = option;
                        total = total + (quantity[attempt] * menu[2].getHargaMenu());
                        pilihan[attempt] = menu[2].getNamaMenu();
                        cetakHarga[attempt] = menu[2].getHargaMenu();
                        attempt += 1;
                        if(attempt == 4){
                            status = false;
                        }else {
                            System.out.println("Ada tambahan lain? (y/n) max 4 pesanan");
                            more = pilihMenu.next();
                            if(more.equals("y")){
                                continue;
                            }else {
                                status = false;
                            }
                        }
                        break;

                    case 4:
                        System.err.println("Kamu memilih Kol Goreng");
                        System.out.println();
                        System.out.println("Mau berapa banyak?");
                        option = pilihMenu.nextInt();
                        quantity[attempt] = option;
                        total = total + (quantity[attempt] * menu[3].getHargaMenu());
                        pilihan[attempt] = menu[3].getNamaMenu();
                        cetakHarga[attempt] = menu[3].getHargaMenu();
                        attempt += 1;
                        if(attempt == 4){
                            status = false;
                        }else {
                            System.out.println("Ada tambahan lain? (y/n) max 4 pesanan");
                            more = pilihMenu.next();
                            if(more.equals("y")){
                                continue;
                            }else {
                                status = false;
                            }
                        }
                        break;

                    case 5:
                        System.err.println("Kamu memilih Nasi");
                        System.out.println();
                        System.out.println("Mau berapa banyak?");
                        option = pilihMenu.nextInt();
                        quantity[attempt] = option;
                        total = total + (quantity[attempt] * menu[4].getHargaMenu());
                        pilihan[attempt] = menu[4].getNamaMenu();
                        cetakHarga[attempt] = menu[4].getHargaMenu();
                        attempt += 1;
                        if(attempt == 4){
                            status = false;
                        }else {
                            System.out.println("Ada tambahan lain? (y/n) max 4 pesanan");
                            more = pilihMenu.next();
                            if(more.equals("y")){
                                continue;
                            }else {
                                status = false;
                            }
                        }
                        break;

                    case 6:
                        System.err.println("Kamu memilih Es Teh Manis");
                        System.out.println();
                        System.out.println("Mau berapa banyak?");
                        option = pilihMenu.nextInt();
                        quantity[attempt] = option;
                        total = total + (quantity[attempt] * menu[5].getHargaMenu());
                        pilihan[attempt] = menu[5].getNamaMenu();
                        cetakHarga[attempt] = menu[5].getHargaMenu();
                        attempt += 1;
                        if(attempt == 4){
                            status = false;
                        }else {
                            System.out.println("Ada tambahan lain? (y/n) max 4 pesanan");
                            more = pilihMenu.next();
                            if(more.equals("y")){
                                continue;
                            }else {
                                status = false;
                            }
                        }
                        break;

                    case 7:
                        System.err.println("Kamu memilih Es Teh Tawar");
                        System.out.println();
                        System.out.println("Mau berapa banyak?");
                        option = pilihMenu.nextInt();
                        quantity[attempt] = option;
                        total = total + (quantity[attempt] * menu[6].getHargaMenu());
                        pilihan[attempt] = menu[6].getNamaMenu();
                        cetakHarga[attempt] = menu[6].getHargaMenu();
                        attempt += 1;
                        if(attempt == 4){
                            status = false;
                        }else {
                            System.out.println("Ada tambahan lain? (y/n) max 4 pesanan");
                            more = pilihMenu.next();
                            if(more.equals("y")){
                                continue;
                            }else {
                                status = false;
                            }
                        }
                        break;

                    case 8:
                        System.err.println("Kamu memilih Air Mineral");
                        System.out.println();
                        System.out.println("Mau berapa banyak?");
                        option = pilihMenu.nextInt();
                        quantity[attempt] = option;
                        total = total + (quantity[attempt] * menu[7].getHargaMenu());
                        pilihan[attempt] = menu[7].getNamaMenu();
                        cetakHarga[attempt] = menu[7].getHargaMenu();
                        attempt += 1;
                        if(attempt == 4){
                            status = false;
                        }else {
                            System.out.println("Ada tambahan lain? (y/n) max 4 pesanan");
                            more = pilihMenu.next();
                            if(more.equals("y")){
                                continue;
                            }else {
                                status = false;
                            }
                        }
                        break;
                }
            }

                    // PENGKONDISIAN UNTUK MEMBEDAKAN HARGA DISKON DAN HARGA NORMAL

                    if (total > 100000) {
                        diskon = (int) (total * 0.1);
                        ppn = (int) (total * 0.1);
                        System.out.println("----------- Rincian Pesanan ------------");
                        for (int i = 0; i < attempt; i++){
                            System.out.println(pilihan[i] + " Rp" + cetakHarga[i] + " x"+ quantity[i] + "........... Rp" + cetakHarga[i] * quantity[i]);
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
                        for (int i = 0; i < attempt; i++){
                            System.out.println(pilihan[i] + " Rp" + cetakHarga[i] + " x" + quantity[i] + "........... Rp" + cetakHarga[i] * quantity[i]);
                        }
                        totalPembayaran = total + ppn + biayaLayanan;
                        System.out.println("Ppn ...................... Rp" + ppn);
                        System.out.println("Biaya Lananan ............ Rp" + biayaLayanan);
                        System.out.println("------------------------------------");
                        System.out.println("Total pembayaran ......... Rp" + totalPembayaran);
                        if(totalPembayaran >= 50000){
                            System.out.println("Selamat anda mendapatkan free 1 minuman karena berbelanja di atas 50 ribu");
                        }
                        System.exit(0);
                    }
            }

    public static void main(String[] args) {
        tampilanMenu();
    }
}