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
public class Pasien extends Orang{
    private String IdPasien;
    
    
    public Pasien (String Nama, int Umur, String tglLahir, String IdPasien) {
        super(Nama, Umur, tglLahir);
        this.IdPasien = IdPasien;
    }

    public String getIdPasien() {
        return IdPasien;
    }

    public void setIdPasien(String IdPasien) {
        this.IdPasien = IdPasien;
    }
    
    @Override
    public String toString(){
        return "Id Pasien      : " + getIdPasien() + "\n" +
                "Nama          : " + getNama() + "\n" +
                "Tanggal Lahir : " + getTglLahir() + "\n" +
                "Umur          : " + getUmur() + "\n";    
    }
}