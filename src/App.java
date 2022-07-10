import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int nomor_menu, jumlah_pesanan, diskon, subtotal, total;

        Scanner input = new Scanner(System.in);

        // Menampilkan Detail Pesanan
        System.out.println("Detail Pesanan : ");

        switch (nomor_menu) {
            case 1:
                subtotal = 10000 * jumlah_pesanan;
                System.out.println("1. aaa - Rp.10000");
                System.out.println("Total : Rp." + subtotal);
                break;
            case 2:
                subtotal = 10000 * jumlah_pesanan;
                System.out.println("2. aaa - Rp.10000");
                System.out.println("Total : Rp." + subtotal);
                break;
            default:
                subtotal = 0;
                break;
        }

        // Memasukkan Diskon
        System.out.print("Masukkan Diskon (dalam %) : ");
        diskon = input.nextInt();

        // Menampilkan Total Pembayaran
        total = subtotal - ();
        System.out.println("Subtotal : Rp. " + subtotal);
        System.out.println("Total Diskon : " + diskon + " %");
        System.out.println("Total Pembayaran : Rp. " + total);

    }
}
