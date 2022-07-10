import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int nomor_menu, jumlah_pesanan;
        Scanner input = new Scanner(System.in);

        for (String a = "Y"; a.equals("Y") || a.equals("y"); ) {
            // Menampilkan Menu Makanan
            System.out.println("");
            System.out.println("|_______________________________________________|");
            System.out.println("|                       MENU                    |");
            System.out.println("|                   DINAN'S CAFE                |");
            System.out.println("|_______________________________________________|");
            System.out.println("|       Nama Menu Minuman     |     Harga       |");
            System.out.println("|_____________________________|_________________|");
            System.out.println("| 1. Milk Vannila Float       |   Rp 25.000     |");
            System.out.println("| 2. Taro Float               |   Rp 25.000     |");
            System.out.println("| 3. Red velvet Float         |   Rp 25.000     |");
            System.out.println("| 4. Chocolate Float          |   Rp 25.000     |");
            System.out.println("| 5. Mocha Latte Art          |   Rp 25.000     |");
            System.out.println("| 6. Cappucino Latte Art      |   Rp 25.000     |");
            System.out.println("| 7. Ice Lychee Tea           |   Rp 15.000     |");
            System.out.println("| 8. Ice Lemon Tea            |   Rp 15.000     |");
            System.out.println("| 9. Air Putih                |   Rp 5.000      |");
            System.out.println("| 10. Kentang Goreng          |   Rp 15.000     |");
            System.out.println("| 11. Nugget                  |   Rp 15.000     |");
            System.out.println("| 12. Sosis                   |   Rp 15.000     |");
            System.out.println("| 13. Singkong Balado         |   Rp 15.000     |");
            System.out.println("| 14. Mix Jajanan Paket murah |   Rp 55.000     |");
            System.out.println("|_______________________________________________|");
            System.out.println("");

            // Memilih Menu
            System.out.println("________________");
            System.out.print ("Masukkan Nomor Menu yang Dipesan : ");
            nomor_menu = input.nextInt();
            
            // Memasukkan Jumlah Menu
            System.out.print("Masukkan Jumlah Pesanan : ");
            jumlah_pesanan = input.nextInt();
            System.out.println("________________");
        }
    }
}
