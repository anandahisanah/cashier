import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int nomor_menu, jumlah_pesanan, diskon, subtotal, total, pembayaran, kembalian;

        Scanner input = new Scanner(System.in);

        // Menampilkan Menu Makanan
        System.out.println("");
        System.out.println("|_______________________________________________|");
        System.out.println("|                       MENU                    |");
        System.out.println("|                   DINAN'S CAFE                |");
        System.out.println("|_______________________________________________|");
        System.out.println("|       Nama Menu Minuman     |     Harga       |");
        System.out.println("|_____________________________|_________________|");
        System.out.println("| 1. Milk Vannila Float       |   Rp.25.000     |");
        System.out.println("| 2. Taro Float               |   Rp.25.000     |");
        System.out.println("| 3. Red velvet Float         |   Rp.25.000     |");
        System.out.println("| 4. Chocolate Float          |   Rp.25.000     |");
        System.out.println("| 5. Mocha Latte Art          |   Rp.25.000     |");
        System.out.println("| 6. Cappucino Latte Art      |   Rp.25.000     |");
        System.out.println("| 7. Ice Lychee Tea           |   Rp.15.000     |");
        System.out.println("| 8. Ice Lemon Tea            |   Rp.15.000     |");
        System.out.println("| 9. Air Putih                |   Rp.5.000      |");
        System.out.println("| 10. Kentang Goreng          |   Rp.15.000     |");
        System.out.println("| 11. Nugget                  |   Rp.15.000     |");
        System.out.println("| 12. Sosis                   |   Rp.15.000     |");
        System.out.println("| 13. Singkong Balado         |   Rp.15.000     |");
        System.out.println("| 14. Mix Jajanan Paket murah |   Rp.55.000     |");
        System.out.println("|_______________________________________________|");
        System.out.println("");

        // Memilih Menu
        System.out.print("Masukkan Nomor Menu yang Dipesan : ");
        nomor_menu = input.nextInt();
        System.out.println("_______________________________________________");
        
        // Memasukkan Jumlah Menu
        System.out.print("Masukkan Jumlah Pesanan : ");
        jumlah_pesanan = input.nextInt();
        System.out.println("_______________________________________________");

        // Menampilkan Detail Pesanan
        System.out.println("Detail Pesanan : ");

        switch (nomor_menu) {
            case 1:
                subtotal = 25000 * jumlah_pesanan;
                System.out.println("1. Milk Vannila Float - Rp.25.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            case 2:
                subtotal = 25000 * jumlah_pesanan;
                System.out.println("2. Taro Float - Rp.25.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            default:
                subtotal = 0;
                break;
        }
        System.out.println("_______________________________________________");

        // Memasukkan Diskon
        System.out.print("Masukkan Diskon (dalam %) : ");
        diskon = input.nextInt();
        System.out.println("_______________________________________________");

        // Menampilkan Total Pembayaran
        total = subtotal - (subtotal * diskon / 100);
        System.out.println("Subtotal : Rp. " + subtotal);
        System.out.println("Total Diskon : " + diskon + " %");
        System.out.println("Total Pembayaran : Rp. " + total);
        System.out.println("_______________________________________________");

        // Memasukkan Pembayaran
        System.out.print("Masukkan Pembayaran : ");
        pembayaran = input.nextInt();
        System.out.println("_______________________________________________");

        // Menampilkan Kembalian
        kembalian = pembayaran - total;
        System.out.println("Kembalian : " + kembalian);
        System.out.println("_______________________________________________");
    }
}
