/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author LENOVO
 */
public class SegitigaSamaKaki extends BangunDatar implements Resizeable{
    public int alas, tinggi;

    @Override
    public void hitungLuas(){
        this.luas = 0.5 * alas * tinggi;
    }

    @Override
    public void hitungKeliling(){
        double simir =
                Math.sqrt(Math.pow(0.5*alas, 2)+
                Math.pow(tinggi, 2));
        this.keliling = (2*simir) + alas;
    }

    @Override
    public void perbesar() {
        this.alas = this.alas * 2;
        this.tinggi = this.tinggi * 2;
    }

    @Override
    public void perkecil() {
        this.alas = this.alas / 2;
        this.tinggi = this.tinggi / 2;
    }

}