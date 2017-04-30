/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import Database.FileIO;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Nabila Kusuma
 */
public class Aplikasi {

    private List<Dokter> daftarDokter;
    private List<Pasien> daftarPasien;
    private List<Ruangan> daftarRuangan;
    private FileIO save;
    private int jmlDokter;
    private int jmlPasien;
    private int jmlRuangan;

    public Aplikasi() {
        save = new FileIO();
        daftarDokter = new ArrayList();
        daftarPasien = new ArrayList();
        daftarRuangan = new ArrayList();
    }

    //________________________________DOKTER____________________________________
    
    //public void addDokter(String Nama, int Umur, String tglLahir, String IdDokter, String Spesialis) {
    //    daftarDokter.add(new Dokter(Nama, Umur, tglLahir, IdDokter, Spesialis));
    //    jmlDokter++;
    //}
    
    
    //public Dokter getDokter(String IdDokter) { //menggunakan id
    //    return daftarDokter.stream()
    //            .filter(e -> e.getIdDokter().equals(IdDokter))
    //            .findFirst().orElse(null);
    //}

    public String[] getListDokter() {
        List idDokter = daftarDokter.stream().map(d -> d.toString()).collect(Collectors.toList());
        return (String[]) idDokter.stream().toArray(size -> new String[size]);
    }
    
    public void createDokter (String Nama, int Umur, String tglLahir, String IdDokter, String Spesialis){
        daftarDokter.add(new Dokter(Nama, Umur, tglLahir, IdDokter, Spesialis));
        jmlDokter++;
    }
    
    //public Dokter getDokter (String id){
    //    return daftarDokter.stream()
    //            .filter(d -> d.getIdDokter().equals(id))
    //            .findFirst().orElse(null);
    //  }
 
    public Dokter getDokterIdx (int index){
        Dokter d = daftarDokter.get(index);
        return d;
    }
    
    public Dokter getDokter (String id){
        return daftarDokter.stream()
                .filter(d -> d.getIdDokter().equals(id))
                .findFirst().orElse(null);
    }
    
    //public Dokter getDokterIdx (int index){
    //    Dokter d = daftarDokter.get(index);
    //    return d;
    //}
    
    public void removeDokter(String id){
        for (Dokter d : daftarDokter){
            if (d.getIdDokter().equals(id)){
                daftarDokter.remove(d);
            }
        }
    }
    
    public void loadDokter() throws FileNotFoundException, IOException {
        try {
            daftarDokter = (ArrayList<Dokter>) save.getObject("FileDOkter.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FileDokter.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarPasien = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void saveDokter() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarPasien, "FileDokter.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
        } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }
    
    

    //________________________________PASIEN____________________________________
    
    //public void addPasien(String Nama, int Umur, String tglLahir, String IdPasien) {
    //    daftarPasien.add(new Pasien(Nama, Umur, tglLahir, IdPasien));
    //    jmlPasien++;
    //}
    
    public void createPasien (String Nama, int Umur, String tglLahir, String IdPasien){
        daftarPasien.add(new Pasien(Nama, Umur, tglLahir, IdPasien));
        jmlPasien++;
    }
    
    public Pasien getPasien (String id){
        return daftarPasien.stream()
                .filter(p -> p.getIdPasien().equals(id))
                .findFirst().orElse(null);
    }
 
    public Pasien getPasienIdx (int index){
        Pasien p = daftarPasien.get(index);
        return p;
    }
    
    public void removePasien(String id){
        for (Pasien p : daftarPasien){
            if (p.getIdPasien().equals(id)){
                daftarPasien.remove(p);
            }
        }
    }
    
    //public Pasien getPasien(String IdPasien) { //menggunakan id
    //    return daftarPasien.stream()
    //            .filter(e -> e.getIdPasien().equals(IdPasien))
    //            .findFirst().orElse(null);
    //}
    
    //public Pasien getPasienIdx(int index){
    //    Pasien p = daftarPasien.get(index);
    //    return p;
    //}

    //public void removePasien(String IdPasien) {
    //    for (int i = 0; i < jmlPasien; i++) {
    //        if (daftarPasien.get(i).getIdPasien().equals(IdPasien)) {
    //            daftarPasien.remove(i);
    //            break;
    //        }
    //    }
    //}

    public String[] getListPasien() {
        List idPasien = daftarPasien.stream().map(p -> p.toString()).collect(Collectors.toList());
        return (String[]) idPasien.stream().toArray(size -> new String[size]);
    }

    public void loadPasien() throws FileNotFoundException, IOException {
        try {
            daftarPasien = (ArrayList<Pasien>) save.getObject("FilePasien.dat");
        } catch (FileNotFoundException ex) {
            File f = new File("FilePasien.dat");
            f.createNewFile();
        } catch (EOFException ex) {
            daftarPasien = new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    public void savePasien() throws FileNotFoundException, IOException {
        try {
            save.saveObject(daftarPasien, "FilePasien.dat");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("file not found");
        } catch (IOException ex) {
            throw new IOException("error " + ex.getMessage());
        }
    }

    //_________________________________RUANGAN__________________________________
    public void createRuangan(String IdRuangan, String namaRuangan) {
        daftarRuangan.add(new Ruangan(IdRuangan, namaRuangan));
        jmlRuangan++;
    }
    
    
    public Ruangan getRuangan(String IdRuangan) { //menggunakan id
        return daftarRuangan.stream()
                .filter(e -> e.getIdRuangan().equals(IdRuangan))
                .findFirst().orElse(null);
    }
    
   
    
    //public boolean createPasienInap(String idPasien, String idDokter) {    
    //    for (Ruangan r : daftarRuangan){
    //        if(r.getIdRuangan().equals(IdLog)) {
    //            r..createPesanan(lokasiAwal, destinasi);
    //            System.out.println(IdLog);
    //            return true;
    //        }
    //    }
    //    return false;
    //}
    
    // belum
    //public void createPasienInap (Pasien pasien, Dokter dokter){
    //    daftarPasien.add(new Pasien(pasien, dokter));
    //    jmlPasien++;
    //}
    
    //public Pasien getPasienInap (String id){
    //    return daftarPasien.stream()
    //            .filter(p -> p.getIdPasien().equals(id))
    //            .findFirst().orElse(null);
    //}
 
    //public Pasien getPasienInapIdx (int index){
    //    Pasien p = daftarPasien.get(index);
    //    return p;
    //}
    
    //public void removePasienInap(String id){
    //    for (Pasien p : daftarPasien){
    //        if (p.getIdPasien().equals(id)){
    //            daftarPasien.remove(p);
    //        }
    //    }
    //}
    
    public void addPasienInap(String IdRuangan, String IdPasien, String IdDokter) {
        Ruangan ruangan, ruanganCek;
        ruanganCek = getRuangan(IdRuangan);
        if ((ruanganCek!=null) && (ruanganCek instanceof Ruangan)){
            ruangan = ruanganCek;
        } else {
            throw new IllegalStateException("Ruangan tidak ada");
        }
        
        Pasien p = getPasien(IdPasien);
        Dokter d = getDokter(IdDokter);
        
        //if ((p!=null) && (d!=null) && (p instanceof Pasien)){
        //    if (ruangan.getPasienInapIdx(IdPasien) == null){
        //        ruangan.addPasienInap(p, dokter);
        //    } else {
        //        throw new IllegalStateException("Ruangan sudah terpakai");
        //    } else {
        //            throw new IllegalStateException("Ruangan tidak ada");
        //            }
        //}
    }
    
    public void removeRuangan(String IdRuangan) {
        for (int i = 0; i < jmlRuangan; i++) {
            if (daftarRuangan.get(i).getIdRuangan().equals(IdRuangan)) {
                daftarRuangan.remove(i);
                break;
            }
        }
    }
    
    public String[] getListRuangan() {
        List idRuangan = daftarRuangan.stream().map(r -> r.toString()).collect(Collectors.toList());
        return (String[]) idRuangan.stream().toArray(size -> new String[size]);
    }
    
    public void viewListConsole(String[] list) {
        Arrays.stream(list).forEach(System.out::println);
    }
}


    