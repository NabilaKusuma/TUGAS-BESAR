/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
 

/**
 *
 * @author Nabila Kusuma
 */
public class Aplikasi {
    private List<Dokter> daftarDokter;
    private List<Pasien> daftarPasien;
    private List<Ruangan> daftarRuangan;
    //private final String IdDokter;
    //private final String IdPasien;
    //private final String IdRuangan;
    private int jmlDokter;
    private int jmlPasien;
    
    public Aplikasi() {
        daftarDokter = new ArrayList();
        daftarPasien = new ArrayList();
        daftarRuangan = new ArrayList();
    }
    
    public void addDokter(String Nama, int Umur, String IdDokter, String Spesialis) {
        daftarDokter.add(new Dokter(Nama, Umur, IdDokter, Spesialis));
        jmlDokter++;
    }
    
    public void addPasien(String IdPasien, String Nama, int Umur) {
        daftarPasien.add(new Pasien(IdPasien, Nama, Umur));
        jmlPasien++;
    }
  
    public Pasien getPasien(String IdPasien){
        Pasien p = null;
        for (int i = 0 ; i<jmlPasien ; i++){
            if (daftarPasien.get(i).getIdPasien().equals(IdPasien)){
                p = daftarPasien.get(i);
                break;
            }
        }
        return p;
    }
    
    public void removePasien (String IdPasien){
        for (int i=0 ; i<jmlPasien ; i++){
            if (daftarPasien.get(i).getIdPasien().equals(IdPasien)){
                daftarPasien.remove(i);
                break;
            }
        }
    }
}
