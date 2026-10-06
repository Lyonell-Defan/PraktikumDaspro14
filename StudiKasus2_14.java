import java.util.Scanner;

public class StudiKasus2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nama;
        String jenisKegiatan;
        int jumDokumen;
        int peringkatJuara;
        int statusPendanaan;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ")
        jenisKegiatan = sc.nextLine();
        System.out.println("Jumlah dokumen : ");
        jumDokumen = sc.nextInt();
        System.out.print("Peringkat juara : ");
        peringkatJuara = sc.nextInt();

        
    }
}