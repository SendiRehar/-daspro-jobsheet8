import java.util.Scanner;
class Triangle21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Baris: ");
        int baris = sc.nextInt(); 
        System.out.print("Masukkan Nilai n =  ");
        int n = sc.nextInt();

        int i = 0;
        while (i < baris) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        sc.close();
    }
}