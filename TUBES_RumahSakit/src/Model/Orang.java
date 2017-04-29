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

import java.util.List;

public abstract class Orang {
    private String Nama;
    private int Umur;
    private String tglLahir;
    
    public Orang (String Nama, int Umur, String tglLahir) {
        this.Nama = Nama;
        this.Umur = Umur;
        this.tglLahir = tglLahir;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }
    
    
}
