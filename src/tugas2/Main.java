package tugas2;

import java.util.Scanner;

public class Main implements Pesan, Admin{
    public static void main(String[] args) {
        Menu menu = new Menu();

        printTitle();
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        do {
            if (input.equals("1")){
                Pesan.main(menu);
            } else if (input.equals("2")) {
                System.out.println("Masukkan password: ");
                String password = s.nextLine();
                if (password.equals("12345678")){
                    Admin.main(menu);
                }else {
                    System.out.println("Password Salah!");
                }
            } else if (input.trim().equalsIgnoreCase("selesai")) {
                break;
            }
            printTitle();
            input = s.nextLine();
        }while(!input.trim().equalsIgnoreCase("selesai"));
        System.out.println("Terima kasih sudah berkunjung ke warung mamank");


    }

    public static void printTitle(){
        System.out.println("------------------- Warung Mamank -------------------");
        System.out.println("1. Pesan Menu");
        System.out.println("2. Login Admin (Khusus Admin)");
        System.out.println("ketik selesai untuk keluar aplikasi");
        System.out.println("------------------------------------------------------");
        System.out.print("input: ");
    }


}
