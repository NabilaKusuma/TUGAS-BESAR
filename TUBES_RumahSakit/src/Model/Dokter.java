/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nabila Kusuma
 */
public class Dokter extends Orang{
    private String IdDokter;
    private String Spesialis;
    
    public Dokter (String Nama, int Umur, String tglLahir, String IdDokter, String Spesialis) {
        super(Nama, Umur, tglLahir);
        this.IdDokter = IdDokter;
        this.Spesialis = Spesialis;
    }

    public String getIdDokter() {
        return IdDokter;
    }

    public void setIdDokter(String IdDokter) {
        this.IdDokter = IdDokter;
    }

    public String getSpesialis() {
        return Spesialis;
    }

    public void setSpesialis(String Spesialis) {
        this.Spesialis = Spesialis;
    }
    
    public String toString(){
        return "Id Dokter      : " + getIdDokter() + "\n" +
                "Nama          : " + getNama() + "\n" +
                "Tanggal Lahir : " + getTglLahir() + "\n" +
                "Umur          : " + getUmur() + "\n";    
    }
}
