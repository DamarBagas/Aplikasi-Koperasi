import java.util.Scanner;

public class simpan extends Koperasi{
public int jumlahsimpan;
public int jumlahambil;
public String tglsimpan;
public String tglambil;
    Scanner input = new Scanner(System.in);
public void nyimpan(){
    System.out.println("-----SIMPAN----");
    System.out.println("Masukkan Tanggal : ");
    tglsimpan= input.nextLine();
    System.out.println("Masukkan Jumlah Simpanan : ");
    jumlahsimpan= input.nextInt();
    System.out.println("Berhasil Menyimpan");

}
public void ngambil(){
    System.out.println("-----AMBIL------");
    System.out.println("Masukkan Tanggal : ");
    tglambil= input.nextLine();
    System.out.println("Masukkan Jumlah Pengambilan : ");
    jumlahambil= input.nextInt();
}

}
