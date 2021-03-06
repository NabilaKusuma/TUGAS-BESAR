/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import Model.Pasien;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author Nabila Kusuma
 */
public class Ruangan {
    private String IdRuangan;
    private String namaRuangan;
    //private List<PasienInap> daftarPasienInap = new ArrayList();
    private PasienInap[] daftarPasienInap = new PasienInap[1];
    private int jmlPasien;

    //__________________________________RUANGAN_________________________________
    public Ruangan(String IdRuangan, String namaRuangan) {
        this.IdRuangan = IdRuangan;
        this.namaRuangan = namaRuangan;
    }
    
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
    
    //______________________________PASIEN INAP_________________________________
    public void createPasienInap(Pasien pasien, Dokter dokter) {
        PasienInap pi = new PasienInap(pasien,dokter);
    }
    
    public PasienInap getPasienInap (String id) {
        for (int i = 0; i <= daftarPasienInap.length; i++) {
            if (daftarPasienInap[i].getPasien().getIdPasien().equals(id)){
                return daftarPasienInap[i];
            } else {
                System.out.println("Pasien tidak terdaftar sebagai pasien inap");
            }
        }
        return null;
    }
   
    public PasienInap getPasienInapIdx(int index){ //get by index
        return daftarPasienInap[index];
    }
   
    public void removePasienInap(String idPasien){ 
        for (int i=0 ; i<=daftarPasienInap.length ; i++){
            if (daftarPasienInap[i].getPasien().equals(idPasien)){
                daftarPasienInap[i] = null;
                break;
            }
        }
    }
    
    @Override
    public String toString(){
        String r = "Id Ruangan  : " + getIdRuangan() + "\n" +
                   "Nama Uangan : " + getNamaRuangan() + "\n";  
        return r;
    }
    
    public String viewAll(){
        String r = "Id Ruangan  : " + getIdRuangan() + "\n" +
                   "Nama Uangan : " + getNamaRuangan() + "\n";
        for (int i = 0; i <=daftarPasienInap.length; i++) {
            String a = daftarPasienInap[i].toString()+ "\n" ;
        }
        return r;
    }
    
    public PasienInap[] getDaftarPasienInap() {
        return daftarPasienInap;
    }
    
    public String toStringAll() {
            //return IdRuangan + " , " + namaRuangan + " , " + daftarPasienInap[i];
            String r = "Id Ruangan  : " + getIdRuangan() + "\n" +
                       "Nama Ruangan : " + getNamaRuangan() + "\n" +
                       "Nama Pasien : " + getDaftarPasienInap();
        return r;
    }
    
    public String getListRuanganLengkap() {
        String s = "";
        for (int i = 0; i <=daftarPasienInap.length; i++) {
            s += daftarPasienInap[i].getPasien()+ "\n";
        }
        return s;
    }

    
    
}
