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
public class PasienInap {
    private Pasien pasien;
    private Dokter dokter;
    private String[] diagnosa = new String[10];
    private int JumDiag=0;
    
    public PasienInap(Pasien pasien, Dokter dokter){
          this.pasien = pasien;
          this.dokter = dokter;
    }

    public String getDiagnosa(int a) {
        return diagnosa[a];
    }        
            
    public void addDiagnosa(String Sakit) {
        if (JumDiag<10) {
            diagnosa[JumDiag] = Sakit;
        }
        JumDiag++;
    }
    
    public void deleteDiagnosa(int index) {
        for (int i=index ; i<JumDiag ; i++) {
            diagnosa[i] = diagnosa[i+1];
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
    
    public String toString() {
        String Pasien   = "Pasien      = " + pasien;
        String Dokter   = "Dokter      = " + dokter;
        String Diagnosa = "Diagnosa    = " + diagnosa;
        
        return Pasien + '\n' + Dokter + '\n' + Diagnosa;
    }
    
}
