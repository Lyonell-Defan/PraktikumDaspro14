import java.util.Scanner;

public class StudiKasus1_14 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        }
        System.out.println("Total harga: Rp " +totalHarga);
        System.out.println("Diskon yang didapat: " + diskon);
        System.out.println("Total yang harus dibayar: Rp" + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian anda: Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang anda tidak cukup, kurang Rp " + kurang);
        }

    }
}