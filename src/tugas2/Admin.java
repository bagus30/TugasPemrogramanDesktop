package tugas2;

import java.util.Scanner;
import java.util.TreeMap;


public interface Admin {

    static void main(Menu superMenu){
        System.out.println();
        printHeader(superMenu);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int lastKey = ((TreeMap<Integer, Menu>) superMenu.getDaftarMenu()).lastKey();

        int lastID = lastKey + 1;

        do{
            if (input.equals("1")){
                Menu newData = new Menu();

                System.out.println("Admin - Mode Tambah Data - Kategori (1: Makanan, 2: Minuman): ");
                input = scanner.nextLine();
                newData.setKategori(input.equals("1")?Kategori.Makanan : Kategori.Minuman);

                System.out.println("Admin - Mode Tambah Data - Nama Menu: ");
                input = scanner.nextLine();
                newData.setNama(input);

                System.out.println("Admin - Mode Tambah Data - Harga: ");
                input = scanner.nextLine();
                newData.setHarga(new Double(input));

                superMenu.getDaftarMenu().put(lastID++, newData);
                System.out.println("Data berhasil ditambahkan");
            }

            else if(input.equals("2")){
                System.out.print("Admin - Mode Edit Data - ID Key: ");
                Integer key = Integer.parseInt(scanner.nextLine());
                Menu data = superMenu.getDaftarMenu().get(key);

                if(data == null){
                    System.out.println("ID Key tidak ditemukan");
                }else {
                    System.out.println("Admin - Mode Edit Data - Ganti Harga " + data.getNama() + ": ");
                    input = scanner.nextLine();
                    data.setHarga(new Double(input));

                    System.out.print("Admin - Mode Edit Data - Konfirmasi - Anda yakin akan melakukan perubahan harga? (ya/tidak): ");
                    String konfirmasi = scanner.nextLine();
                    if(konfirmasi.equalsIgnoreCase("ya")){
                        superMenu.getDaftarMenu().put(key, data);
                    }else {
                        System.out.println("Gagal!");
                    }
                }
            }

            else if (input.equals("3")){
                System.out.print("Admin - Mode Hapus Data - ID Key: ");
                Integer key = Integer.parseInt(scanner.nextLine());

                System.out.print("Admin - Mode Hapus Data - Konfirmasi - Anda yakin hapus menu ini? (ya/tidak): ");
                String konfirmasi = scanner.nextLine();

                if(konfirmasi.equalsIgnoreCase("ya")){
                    superMenu.getDaftarMenu().remove(key);
                }else {
                    System.out.println("Gagal!");
                }
            }

            printHeader(superMenu);
            input = scanner.nextLine();

        }while (!input.trim().equalsIgnoreCase("selesai"));


    }

    static void printHeader(Menu menu){
        menu.printDaftarMenuAdmin();
        System.out.println("Admin - (1: Tambah menu, 2: Ubah menu, 3: Hapus menu, selesai: Kembali");
        System.out.print("Admin - Pilihan saya: ");
    }

}
