import jdk.nashorn.internal.ir.ContinueNode;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        login l = new login();
        Koperasi k = new Koperasi();
        simpan s = new simpan();
        pinjam p = new pinjam();
        angsuran a = new angsuran();
        l.admin();

        System.out.println("==================================");
        System.out.println("||             MENU             ||");
        System.out.println("==================================");
        System.out.println("   1. Input Data  ");
        System.out.println("   2. Lihat Data ");
        System.out.println("----------------------------------");
        System.out.println("Masukkan pilihan : ");
        k.menu = input.nextInt();
        switch(k.menu){
            case 1:
                System.out.println("Masukkan Nama : ");
                k.nama = input.nextLine();
                System.out.println("Masukkan No.Telpon : ");
                k.telpon = input.nextInt();
                System.out.println("Masukkan Alamat : ");
                k.alamat = input.nextLine();
             break;
            case 2:
                System.out.println("Hasil Data");
            break;
            default:
                System.out.println("Pilihan anda tidak tersedia");
                System.out.println("Kembali ke menu");
        }


        System.out.println("======================================");
        System.out.println("|              KOPERASI              |");
        System.out.println("======================================");
        System.out.println("  1. Simpanan ");
        System.out.println("  2. Pinjaman ");
        System.out.println("  3. Angsuran ");
        System.out.println("silahkan memilih : ");
        int pil = input.nextInt();
        switch(pil){
            case 1:
                System.out.println("----SIMPANAN----");
                System.out.println(" 1.Menyimpan");
                System.out.println(" 2.Mengambil");
                System.out.println("Masukkan Pilihan : ");
                k.simp = input.nextInt();
                switch(k.simp){
                    case 1:
                        s.nyimpan();
                        break;
                    case 2:
                        s.ngambil();
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                        System.out.println("Kembali ke menu Koperasi");
                }
            break;
            case 2:
                p.minjam();
            break;
            case 3:
                a.ngansur();

            break;
            default:
                System.out.println("Pilihan tidak tersedia");
                System.out.println("Kembali ke menu Koperasi");
            break;
        }
    }
}