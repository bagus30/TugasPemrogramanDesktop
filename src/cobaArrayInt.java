import java.util.Scanner;

public class cobaArrayInt {
    public static void main(String[] args) {
        int[] quantity = new int[3];

        Scanner coba = new Scanner(System.in);

        int attempt = 0;

        boolean status = true;

        String more;

        while(status){
            int tambah = coba.nextInt();
            quantity [attempt] = tambah;
            attempt += 1;
            if (attempt == 3){
                status = false;
            }else{
                System.out.println("Continue? (y/n)");
                more = coba.next();
                if(more.equals("y")){

                }else {
                    status = false;
                }
            }
        }
        for (int i = 0; i < attempt; i++){
            System.out.println(quantity[i]);
        }
    }
}
