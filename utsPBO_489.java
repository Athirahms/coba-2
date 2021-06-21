package uts;
import java.util.Scanner;

interface kategoriHarga{
    public void mahal();
    public void murah();
    public void standarHarga();
}

class buku {
    String [] jenisB = {"Insiklopedia","Novel","Majalah","Komik","Agama"};
    String judulB;
    int batasUmur;
    int harga;

    public buku(String judulB, int batasUmur, int harga) {
        this.judulB = judulB;
        this.batasUmur = batasUmur;
        this.harga = harga;
    }

    public buku(int harga) {
        this.harga = harga;
    }
    
    public buku(){
    
    }

    public String[] getJenisB() {
        return jenisB;
    }

    public void setJenisB(String[] jenisB) {
        this.jenisB = jenisB;
    }

    public String getJudulB() {
        return judulB;
    }

    public void setJudulB(String judulB) {
        this.judulB = judulB;
    }

    public int getBatasUmur() {
        return batasUmur;
    }

    public void setBatasUmur(int batasUmur) {
        this.batasUmur = batasUmur;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void tampilJenis(){
        System.out.println("\n==DAFTAR JENIS BUKU==\n");
        for(int i = 0; i < 5 ; i++){
            System.out.println(+i+" Buku "+jenisB[i]);
        }
    }
    
    public void kategoriUsia(){
        System.out.println("\n==BATAS UMUR==\n");
        for(int i = 0; i < 5 ; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan umur : ");
            batasUmur = input.nextInt();
            if(batasUmur <= 15){
                System.out.println("Buku yang umum diakses adalah : " +jenisB[1]);
            }else if(batasUmur > 15){
                System.out.println("Buku yang umum diakses adalah : "+jenisB[4]);
            }
            break;
        }
    }
}

class costumer extends buku implements kategoriHarga{
    int hargaStandar = 10000;
    @Override
    public void mahal(){
        System.out.println("Buku ini masuk ke dalam kategori mahal");
    }
    @Override
    public void murah(){
        System.out.println("Buku ini masuk ke dalam ketegori murah");
    }
    @Override
    public void standarHarga(){
        System.out.println("Standar harga buku adalah Rp"+hargaStandar);
    }
    public void costumerService(){
        costumer c = new costumer();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan juduk buku yang ingin anda beli : ");
        judulB = input.nextLine();
        System.out.println("Masukkan harga : ");
        harga = input.nextInt();
        c.standarHarga();
        if (harga <= 10000){
            c.murah();
        }else if(harga > 10000){
            c.mahal();
        }
    }
}
public class utsPBO_489{

    public static void main(String[] args) {
        buku b = new buku();
        b.tampilJenis();
        b.kategoriUsia();
        
        costumer c = new costumer();
        c.costumerService();
    }
    
}
