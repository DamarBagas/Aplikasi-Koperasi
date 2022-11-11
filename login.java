import java.util.Scanner;
public class login extends Koperasi{

    Koperasi ad = new Koperasi();
    Scanner input = new Scanner(System.in);
    public void admin(){

        ad.setUser("damar");
        ad.setPass(123);

        System.out.println("====================================");
        System.out.println("||     Welcome To Koperasi v1.0   ||");
        System.out.println("====================================");
        System.out.println("Silahkan Login Terlebih Dahulu");
        System.out.println("Masukkan Username : ");
        String us= input.nextLine();
        System.out.println("Masukkan Password : ");
        int ps = input.nextInt();
            if (us.equals(ad.getUser()) && ps==ad.getPass()) {
                    System.out.println("Anda Berhasil Login");

            }
        else{
            System.out.println("Anda Salah dalam Memasukkan User dan pass");
            System.out.println("Silahkkan Login Ulang");
        }
    }

}
