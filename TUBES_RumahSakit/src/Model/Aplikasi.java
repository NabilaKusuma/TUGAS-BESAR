/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 

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
    
    public void addDokter(String Nama, int Umur, String tglLahir, String IdDokter, String Spesialis) {
        daftarDokter.add(new Dokter(Nama, Umur, tglLahir, IdDokter, Spesialis));
        jmlDokter++;
    }
    
    public void addPasien(String Nama, int Umur, String tglLahir, String IdPasien) {
        daftarPasien.add(new Pasien(Nama, Umur, tglLahir, IdPasien));
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
    
    public String[] getListPasien(){
        List idPasien = daftarPasien.stream().map(p -> p.toString()).collect(Collectors.toList());
        return (String[]) idPasien.stream().toArray(size -> new String[size]);
    }
    
    public String[] getListDokter(){
        List idDokter = daftarDokter.stream().map(d -> d.toString()).collect(Collectors.toList());
        return (String[]) idDokter.stream().toArray(size -> new String[size]);
    }
    
    public String[] getListRuangan(){
        List idRuangan = daftarRuangan.stream().map(r -> r.toString()).collect(Collectors.toList());
        return (String[]) idRuangan.stream().toArray(size -> new String[size]);
    }
}
