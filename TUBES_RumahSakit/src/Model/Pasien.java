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
    
    
    public Pasien (String IdPasien, String Nama, int Umur) {
        super(Nama, Umur);
        this.IdPasien = IdPasien;
    }

    public String getIdPasien() {
        return IdPasien;
    }

    public void setIdPasien(String IdPasien) {
        this.IdPasien = IdPasien;
    }
}