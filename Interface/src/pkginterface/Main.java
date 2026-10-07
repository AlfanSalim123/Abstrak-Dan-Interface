/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] argv){
        SegiEmpat se = new SegiEmpat();
        se.lebar = 10;
        se.panjang = 10;
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas sebelum diperbesar = "+se.luas);
        System.out.println("Keliling sebelum diperbesar = "+se.keliling);
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas setelah diperbesar = "+se.luas);
        System.out.println("Keliling setelah diperbesar = "+se.keliling);
    
    Lingkaran l = new Lingkaran();
l.jariJari = 10;
l.hitungLuas();
l.hitungKeliling();

System.out.println("Luas Lingkaran sebelum diperkecil = " + l.luas);
System.out.println("Keliling Lingkaran sebelum diperkecil = " + l.keliling);

l.perkecil();
l.hitungLuas();
l.hitungKeliling();

System.out.println("Luas Lingkaran setelah diperkecil = " + l.luas);
System.out.println("Keliling Lingkaran setelah diperkecil = " + l.keliling);


SegitigaSamaKaki stsk = new SegitigaSamaKaki();
stsk.alas = 10;
stsk.tinggi = 10;
stsk.hitungLuas();
stsk.hitungKeliling();

System.out.println("Luas STSK sebelum diperkecil = " + stsk.luas);
System.out.println("Keliling STSK sebelum diperkecil = " + stsk.keliling);

stsk.perkecil();
stsk.hitungLuas();
stsk.hitungKeliling();

System.out.println("Luas STSK setelah diperkecil = " + stsk.luas);
System.out.println("Keliling STSK setelah diperkecil = " + stsk.keliling);
    }
}