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
        System.out.println("________________________________________________");
        System.out.print ("Masukkan Nomor Menu yang Dipesan : ");
        nomor_menu = input.nextInt();
        
        // Memasukkan Jumlah Menu
        System.out.print("Masukkan Jumlah Pesanan : ");
        jumlah_pesanan = input.nextInt();
        System.out.println("_______________________________________________");

        // Menampilkan Detail Pesanan
        System.out.println("Detail Pesanan : ");

        switch (nomor_menu) {
            case 1:
                subtotal = 25000 * jumlah_pesanan;
                System.out.println("Milk Vannila Float : Rp.25.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 2:
                subtotal = 25000 * jumlah_pesanan;
                System.out.println("Taro Float : Rp.25.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 3:
                subtotal = 25000 * jumlah_pesanan;
                System.out.println("Red velvet Float : Rp.25.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 4:
                subtotal = 25000 * jumlah_pesanan;
                System.out.println("Chocolate Float : Rp.25.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 5:
                subtotal = 25000 * jumlah_pesanan;
                System.out.println("Mocha Latte Art : Rp.25.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 6:
                subtotal = 25000 * jumlah_pesanan;
                System.out.println("Cappucino Latte Art : Rp.25.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 7:
                subtotal = 15000 * jumlah_pesanan;
                System.out.println("Ice Lychee Tea : Rp.15.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 8:
                subtotal = 15000 * jumlah_pesanan;
                System.out.println("Ice Lemon Tea : Rp.15.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 9:
                subtotal = 5000 * jumlah_pesanan;
                System.out.println("Air Putih : Rp.5.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 10:
                subtotal = 15000 * jumlah_pesanan;
                System.out.println("Kentang Goreng : Rp.15.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 11:
                subtotal = 15000 * jumlah_pesanan;
                System.out.println("Nugget : Rp.15.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 12:
                subtotal = 15000 * jumlah_pesanan;
                System.out.println("Sosis : Rp.15.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 13:
                subtotal = 15000 * jumlah_pesanan;
                System.out.println("Singkong Balado : Rp.15.000");
                System.out.println("Total : Rp." + subtotal);
                break;
            
            case 14:
                subtotal = 55000 * jumlah_pesanan;
                System.out.println("Mix Jajanan Paket murah : Rp55.000");
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
        System.out.print("Masukkan Pembayaran : Rp.");
        pembayaran = input.nextInt();
        System.out.println("_______________________________________________");

        // Menampilkan Kembalian
        kembalian = pembayaran - total;
        System.out.println("Kembalian : Rp." + kembalian);
        System.out.println("_______________________________________________");
    }
}
