import java.util.*;
import java.util.Iterator;

public class menuMakanan {
   private String namaMenu;
   private int hargaMenu;
   private String kategoriMenu;

   public menuMakanan(String namaMenu, int hargaMenu, String kategoriMenu){
      this.namaMenu = namaMenu;
      this.hargaMenu = hargaMenu;
      this.kategoriMenu = kategoriMenu;
   }

   public String getNamaMenu(){
      return namaMenu;
   }

   public int getHargaMenu(){
      return hargaMenu;
   }

   public String getKategoriMenu(){
      return kategoriMenu;
   }

   public String toString(){
      return "Menu: " + namaMenu + "................ Rp" + hargaMenu;
   }

}

class DaftarMenu{
   private ArrayList<menuMakanan> daftarMenu;
   public DaftarMenu(){
      daftarMenu = new ArrayList<>();
   }

   public void tambahMenu(menuMakanan menu){
      daftarMenu.add(menu);
   }

   public void hapusMenu(String namaMenu) {
      Iterator<menuMakanan> iterator = daftarMenu.iterator();
      while (iterator.hasNext()) {
         menuMakanan menu = iterator.next();
         if (menu.getNamaMenu().equals(namaMenu)) {
            iterator.remove();
            System.out.println("Menu " + namaMenu + " telah dihapus.");
            return;
         }
      }
      System.out.println("Menu " + namaMenu + " tidak ditemukan.");
   }

   public void tampilkanMenu(){
      for (menuMakanan menu : daftarMenu){
         System.out.println(menu);
      }
   }
}
