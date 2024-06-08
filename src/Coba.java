import java.util.Scanner;
import java.util.*;

public class Coba {

    public static void main(String[] args){
        int pilihMenu;
        Scanner pilih = new Scanner(System.in);
        String[] daftarMenu = new String[4];
        daftarMenu[1] = "Dada Ayam";
        daftarMenu[2] = "Paha Ayam";
        daftarMenu[3] = "Sambal";

        int attempt = 0;

        boolean status = true;

        String[] tampung = new String[3];

        System.out.println("Daftar menu");
        for (int i = 1; i < 4; i++ ){
            System.out.println(i + ". " + daftarMenu[i]);
        }

        while (status){
            System.out.println("Silahkan pilih menu yang ingin dipilih (input angka)");
            pilihMenu = pilih.nextInt();
        switch (pilihMenu){
            case 1:
                tampung[attempt] = Arrays.toString(new String[]{daftarMenu[1]});
                attempt += 1;
                if(attempt == 3){
                    status = false;
                }
                break;
            case 2:
                tampung[attempt] = Arrays.toString(new String[]{daftarMenu[2]});
                attempt += 1;
                if(attempt == 3){
                    status = false;
                }
                break;
            case 3:
                tampung[attempt] = Arrays.toString(new String[]{daftarMenu[3]});
                attempt += 1;
                if(attempt == 3){
                    status = false;
                }
                break;
            }
        }
//        for (int i = 0; i < 3; i++ ){
//            System.out.println(i + ". " + tampung[i].toString());
//        }
        System.out.println("Pilihan anda");
        System.out.println("1. " + tampung[0].toString());
        System.out.println("2. " + tampung[1].toString());
        System.out.println("3. " + tampung[2].toString());
    }
}
