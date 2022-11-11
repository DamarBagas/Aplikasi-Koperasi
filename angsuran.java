import java.util.Scanner;

public class angsuran {
    public String tglangsur;
    public int angsurke;
    public int jumangsur;
    public int totalangsur;

    Scanner input = new Scanner(System.in);
    public void ngansur(){
        System.out.println("-----ANGSURAN-----");
        System.out.println("Masukkan tanggal : ");
        tglangsur = input.nextLine();
        System.out.println("Angsuran ke-");
        angsurke=input.nextInt();
        System.out.println("Masukkan Jumlah Angsuran : ");
        jumangsur = input.nextInt();
        System.out.println("Total Angsuran : "+totalangsur);

    }
}

