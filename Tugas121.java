import java.util.Scanner;

public class Tugas121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Nilai n harus minimal 1.");
        } else {
            int total = 0; 

            for (int baris = 1; baris <= n; baris++) {
                for (int angka = 1; angka <= baris; angka++) {
                    System.out.print(angka);
                    if (angka < baris) {
                        System.out.print(" ");
                    }
                    total++;
                }
                System.out.println();
            }

            System.out.println("Total angka tercetak: " + total);
        }

        sc.close();
    }
}