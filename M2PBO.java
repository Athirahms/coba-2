package modul2;
import java.util.Scanner;

class KLingkaran{
    int r;
    double kelLingkaran;
    double phi = 3.14;
    
    public void KLingkaran(){
        System.out.println("masukkan nilai jari-jari : ");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        kelLingkaran = 2*phi*r;
        System.out.println("Keliling lingkaran bernilai : "+kelLingkaran);
    }
}

class LLingkaran{
    int r;
    double lsLingkaran;
    double phi = 3.14;
    
    public void LLingkaran(){
        System.out.println("masukkan nilai jari-jari : ");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        lsLingkaran = phi*(r*r);
        System.out.println("Luas Lingkaran bernilai : "+lsLingkaran);
    }
}

public class M2PBO {
    public static void main (String[] args){
        KLingkaran kl = new KLingkaran();
        LLingkaran ll = new LLingkaran();
        Scanner input = new Scanner(System.in);
        int inputMenu;
        
        System.out.println("\t\t==MENU==\n1. Keliling lingkaran\n2. Luas lingkaran\nsilahkan pilih menu : ");
        inputMenu = input.nextInt();
        switch (inputMenu) {
            case 1:
                kl.KLingkaran();
                break;
            case 2:
                ll.LLingkaran();
                break;
            default:
                System.out.println("Maaf menu pilihan anda tidak tersedia");
                break;
        }
    }
}
