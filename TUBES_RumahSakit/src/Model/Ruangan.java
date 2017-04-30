/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import Model.Pasien;

/**
 *
 * @author Nabila Kusuma
 */
public class Ruangan {
    private String IdRuangan;
    private String namaRuangan;
    private List<PasienInap> daftarPasien;
    private int jmlPasien;

    public Ruangan(String IdRuangan, String namaRuangan) {
        this.IdRuangan = IdRuangan;
        this.namaRuangan = namaRuangan;
        //this.jmlPasien = jmlPasien;
    }
    
    public void addPasienInap(Pasien pasien, Dokter dokter) {
        daftarPasien.add(new PasienInap(pasien, dokter));
    }
    
    
    public PasienInap getPasienInapIdx(int index){ //get by index
        return daftarPasien.get(index);
    }
    
    //public PasienInap getPasienInapId(String Id){ //get by index
    //    return daftarPasien.get(Id);
    //}
    
    //public PasienInap getPasienInapId(String Id){
    //    Pasien p = null;
    //    for (int i = 0 ; i<=jmlPasien ; i++){
    //        if (daftarPasien.get(i).getIdPasien().equals(Id)){
    //            p = daftarPasien.get(i);
    //            break;
    //        }
    //    }
    //    return p;
    //}

    public String getIdRuangan() {
        return IdRuangan;
    }

    public void setIdRuangan(String IdRuangan) {
        this.IdRuangan = IdRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }

    public void removePasienInap(String idPasien){ 
        for (int i=0 ; i<jmlPasien ; i++){
            if (daftarPasien.get(i).getPasien().equals(idPasien)){
                daftarPasien.remove(i);
                break;
            }
        }
    }
    
    @Override
    public String toString(){
        String r = "Id Ruangan      : " + getIdRuangan() + "\n" +
                "Nama           : " + getNamaRuangan() + "\n"; //nama pasien inap belom 
        return r;
    }
}
