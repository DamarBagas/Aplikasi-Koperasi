import java.util.Scanner;

public class pinjam {
    Scanner input = new Scanner(System.in);
    public String tglpinjam;
    public int jumlahpinjam;
    public String tgltempo;
    public int bunga;

    public void minjam(){
        System.out.println("-----PINJAM-------");
        System.out.println("Masukkan Tanggal  :");
        tglpinjam=input.nextLine();
        System.out.println("Masukkan Jumlah Pinjam : ");
        jumlahpinjam = input.nextInt();
        System.out.println("Masukkan Bunga : ");
        bunga=input.nextInt();

    }
}
