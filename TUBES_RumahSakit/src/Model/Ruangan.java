/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author Nabila Kusuma
 */
public class Ruangan {
    private String IdRuangan;
    private List<PasienInap> daftarPasien;
    private int jmlPasien;
    
    public void tambahPasienInap (Pasien p, Dokter d) {
        PasienInap newPasien = new PasienInap(p,d);
        daftarPasien.add(newPasien);
        jmlPasien++;
    }
    
    public PasienInap getPasienInap(int index){ //get by index
        return daftarPasien.get(jmlPasien);
        
    }
    
    //public PasienInap getPasienInap(String Id){ //get by Id Pasien di consule
        //return null;
        
    //}

    public String getIdRuangan() {
        return IdRuangan;
    }

    public void setIdRuangan(String IdRuangan) {
        this.IdRuangan = IdRuangan;
    }

    public void removePasienInap(int index){ 
        for (int i=0 ; i<jmlPasien ; i++){
            if (daftarPasien.get(i).getPasien().equals(IdRuangan)){
                daftarPasien.remove(i);
                break;
            }
        }
    }
}
