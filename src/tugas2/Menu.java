package tugas2;

import java.util.*;

public class Menu {
    Kategori kategori;
    String nama;
    Double harga;
    private Map<Integer, Menu> daftarMenu = new TreeMap<>();

    public Menu(){

    }

    public Menu(Kategori kategori, String nama, Double harga){
        this.kategori = kategori;
        this.nama = nama;
        this.harga = harga;
    }

    public Map<Integer, Menu> getDaftarMenu(){
        daftarMenu.put(1, new Menu(Kategori.Makanan, "Dada Ayam", new Double(15000)));
        daftarMenu.put(2, new Menu(Kategori.Makanan, "Paha Ayam", new Double(13000)));
        daftarMenu.put(3, new Menu(Kategori.Makanan, "Nasi", new Double(5000)));
        daftarMenu.put(4, new Menu(Kategori.Makanan, "Kol Goreng", new Double(6000)));
        daftarMenu.put(5, new Menu(Kategori.Makanan, "Extra Sambal", new Double(3000)));
        daftarMenu.put(6, new Menu(Kategori.Minuman, "Es Teh", new Double(3000)));
        daftarMenu.put(7, new Menu(Kategori.Minuman, "Air Mineral", new Double(5000)));
        return daftarMenu;
    }

    public void printDaftarMenu(){
        System.out.println("------------ Selamat Datang di Warung Mamank ------------");
        System.out.println("| Pilihan | Kategori\t| Nama\t\t\t\t|\t\tHarga\t|");
        System.out.println("---------------------------------------------------------");
        for (Map.Entry<Integer, Menu> entry : getDaftarMenu().entrySet()){
            Integer key = entry.getKey();
            Menu menu = entry.getValue();
            System.out.printf("|%8d | %-8s\t| %-14s\t| %10.2f\t|\n", key, menu.getKategori(), menu.getNama(), menu.getHarga());
        }
        System.out.println("---------------------------------------------------------");
    }

    public void printDaftarMenuAdmin(){
        System.out.println("------------ Daftar Menu ------------");
        System.out.println("| Nomor   | Kategori\t| Nama\t\t\t\t|\t\tHarga\t|");
        System.out.println("---------------------------------------------------------");
        for (Map.Entry<Integer, Menu> entry : getDaftarMenu().entrySet()){
            Integer key = entry.getKey();
            Menu menu = entry.getValue();
            System.out.printf("|%8d | %-8s\t| %-14s\t| %10.2f\t|\n", key, menu.getKategori(), menu.getNama(), menu.getHarga());
        }
        System.out.println("---------------------------------------------------------");
    }

    public Kategori getKategori(){
        return kategori;
    }

    public void setKategori(Kategori kategori){
        this.kategori = kategori;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public Double getHarga(){
        return harga;
    }

    public void setHarga(Double harga){
        this.harga = harga;
    }
}
