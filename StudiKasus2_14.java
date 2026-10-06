import java.util.Scanner;

public class StudiKasus2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nama;
        String jenisKegiatan;
        int jumDokumen;
        int peringkatJuara;
        int statusPendanaan;
        int kurang;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Jumlah dokumen : ");
        jumDokumen = sc.nextInt();
        System.out.print("Peringkat juara : ");
        peringkatJuara = sc.nextInt();

        System.out.print("Status : ");

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            if (peringkatJuara >=1 && peringkatJuara <=3) {
                if (jumDokumen == 4) {
                    System.out.println("Dokumen dan juara memenuhi syarat. Dana penghargaan diberikan");
                } else {
                    kurang = 4 - jumDokumen;
                    System.out.println("Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Anda tidak juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan (1 = lolos, 0 = tidak lolos) :");
            statusPendanaan = sc.nextInt();
            
            if (statusPendanaan == 1) {
                if (jumDokumen == 4) {
                    System.out.println("Dokumen dan status pendanaan memenuhi syarat. Dana penghargaan diberikan.");
                } else {
                    kurang = 4 - jumDokumen;
                    System.out.println("Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
                
            } else {
                System.out.println("Anda tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("jenis kegiatan di luar (Lainnya). Dana penghargaan tidak diberikan");
        }
    }
}