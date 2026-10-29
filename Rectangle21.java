import java.util.Scanner;
/**
 * Rectangle21
 */
public class Rectangle21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah Kolom:");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++){
             for(int j = 1; j <= kolom; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
      
    }
}