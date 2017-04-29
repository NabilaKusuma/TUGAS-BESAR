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
public class PasienInap {
    private Pasien pasien;
    private Dokter dokter;
    private String[] Diagnosa = new String[10];
    private int JumDiag;
    
    public PasienInap(Pasien pasien, Dokter dokter){
        this.pasien = pasien;
        this.dokter = dokter;
    }
    
    public String getDiagnosa(int a) {
        return Diagnosa[a];
    }        
            
    public void addDiagnosa(String Sakit) {
        if (JumDiag<10) {
            Diagnosa[JumDiag] = Sakit;
        }
        JumDiag++;
    }
    
    public void deleteDiagnosa(int index) {
        for (int i=index ; i<JumDiag ; i++) {
            Diagnosa[i] = Diagnosa[i+1];
        }
        JumDiag--;
    }
    
    public void setDokter (Dokter d) {
        this.dokter = d;
    }

    public Dokter getDokter() {
        return dokter;
    }
    
    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }
}
