/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console;


import Model.Aplikasi;
import Model.Dokter;
import Model.Orang;
import Model.Pasien;
import Model.PasienInap;
import Model.Ruangan;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nabila Kusuma
 */

public class Console {
    private Aplikasi app;
    private Scanner IInt;
    private Scanner IStr;
    
    public Console(Aplikasi app){
        this.app = app;
        IInt = new Scanner (System.in);
        IStr = new Scanner (System.in);
    }
    
    public int inputPilihan(){
        try {
            return IInt.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Anda harus memasukkan karakter berupa Angka");
        } finally {
            IInt = new Scanner(System.in);
        }
    }
    
    public void dataPasien(){
        int pil1 = 0;
        do {
            try {
                System.out.println("");
                System.out.println("     MENU DATA PASIEN");
                System.out.println("  1. Daftar Pasien");
                //System.out.println("  2. Daftar Pasien Inap"); //Mendaftarkan Pasien menjadi Pasien Inap
                System.out.println("  2. Menghapus Pasien");
                System.out.println("  3. Menampilkan Data Pasien");
                //System.out.println("  5. Menampilkan Data Pasien Inap"); //Hanya Pasien yg diopname
                System.out.println("  4. Mencari Pasien berdasarkan Indeks"); // belom
                System.out.println("  5. Mencari Pasien berdasarkan Id Pasien");
                System.out.println("");
                System.out.print("Pilih Menu :");
                pil1 = inputPilihan();
                switch (pil1) {
                    case 1:
                        System.out.println("");
                        System.out.println("   INPUT PASIEN");
                        System.out.print("Nama         : ");
                        String Nama = IStr.nextLine();
                        System.out.print("Tanggal Lahir: ");
                        String tglLahir = IStr.nextLine();
                        System.out.print("Umur         : ");
                        int Umur = IInt.nextInt();
                        System.out.print("Id Pasien    : ");
                        String IdPasien = IStr.nextLine();
                        app.createPasien(Nama, Umur, tglLahir, IdPasien);
                        break;
                    //case 2:
                    //    System.out.println("");
                    //    System.out.println("");
                    //    System.out.println("   DAFTAR PASIEN INAP");
                    //    System.out.println("");
                    //    System.out.println("Nama :");
                    //    String Nama = IStr.nextLine();
                    //    System.out.println("Dokter : ");
                    //    String Nama = IStr.nextLine(); //bingung nama atributnya
                    //    int jmlDiagnosa=0;
                    //    String Diagnosa[jmlDiagnosa] = IStr.nextLine();
                    //    jmlDiagnosa++; //diagnosanya baru 1
                    case 2:
                        System.out.println("");
                        System.out.println("   MENGHAPUS PASIEN");
                        System.out.print("Id Pasien : ");
                        String IdP = IStr.nextLine();
                        app.removePasien(IdP);
                        break;
                        
                    case 3:
                        System.out.println("");
                        System.out.println("   MENAMPILKAN DATA PASIEN");
                        System.out.println("");
                        app.viewListConsole(app.getListPasien());
                        break;
                        
                    case 4:
                        System.out.println("");
                        System.out.println("    MENCARI PASIEN BERDASARKAN INDEKS");
                        System.out.print("Masukkan Indeks Pasien: ");
                        int indeks = IInt.nextInt();
                        app.getPasienIdx(indeks);
                        System.out.println("");
                        break;
                       
                    case 5:
                        System.out.println("");
                        System.out.println("    MENCARI PASIEN BERDASARKAN ID");
                        System.out.print("Masukkan Id Pasien: ");
                        String IdPas = IStr.nextLine();
                        app.getPasien(IdPas);
                        System.out.println("");
                        break;
                        
                    case 0:
                        break;
                } 
            } catch (Exception e) {
                System.out.println("Error : "+e.getMessage());
            } finally { 
                IInt = new Scanner (System.in);
                IStr = new Scanner (System.in);
            }   
        } while (pil1!=0);
    }
    
    public void dataDokter(){
        int pil1 = 0;
        do {
            try {
                System.out.println("");
                System.out.println("     MENU DATA DOKTER");
                System.out.println("  1. Input Dokter");
                System.out.println("  2. Menghapus Dokter");
                System.out.println("  3. Menampilkan Data Dokter");
                System.out.println("  4. Mencari Dokter berdasarkan Id");
                System.out.println("  5. Mencari Dokter berdasarkan Indeks");
                System.out.println("");
                System.out.print("Pilih Menu :");
                pil1 = inputPilihan();
                switch (pil1) {
                    case 1:
                        System.out.println("");
                        System.out.println("   DAFTAR DOKTER");
                        System.out.print("Nama Dokter  : ");
                        String Nama = IStr.nextLine();
                        System.out.print("Tanggal Lahir: ");
                        String tglLahir = IStr.nextLine();
                        System.out.print("Umur         : ");
                        int Umur = IInt.nextInt();
                        System.out.print("Id Dokter    : ");
                        String IdDokter = IStr.nextLine();
                        System.out.print("Spesialis    :");
                        String Spesialis = IStr.nextLine();
                        app.createDokter(Nama, Umur, tglLahir, IdDokter, Spesialis);
                        break;
                    
                    case 2:
                        System.out.println("");
                        System.out.println("   MENGHAPUS DOKTER");
                        System.out.print("Id Dokter : ");
                        String IdD = IStr.nextLine();
                        app.removeDokter(IdD);
                        break;
                        
                    case 3:
                        System.out.println("   MENAMPILKAN DATA DOKTER");
                        System.out.println("");
                        app.viewListConsole(app.getListDokter());
                        break;
                        
                    case 4:
                        System.out.println("");
                        System.out.println("    MENCARI DOKTER BERDASARKAN ID");
                        System.out.print("Masukkan Id Dokter: ");
                        String idDokter = IStr.nextLine();
                        app.getDokter(idDokter);
                        System.out.println("");
                        break;
                        
                    case 5:
                        System.out.println("");
                        System.out.println("    MENCARI DOKTER BERDASARKAN INDEKS");
                        System.out.print("Masukkan indeks Dokter: ");
                        int idx = IInt.nextInt();
                        app.getDokterIdx(idx);
                        System.out.println("");
                        break;
                        
                    case 0:
                        break;
                } 
            } catch (Exception e) {
                System.out.println("Error : "+e.getMessage());
            } finally { 
                IInt = new Scanner (System.in);
                IStr = new Scanner (System.in);
            }   
        } while (pil1!=0);
    }
    
    public void dataRuangan(){
        int pil1 = 0;
        do {
            try {
                System.out.println("");
                System.out.println("     MENU DATA RUANGAN");
                System.out.println("  1. Input Ruangan");
                System.out.println("  2. Menghapus Ruangan");
                System.out.println("  3. Menampilkan Data Ruangan");
                System.out.println("  4. Input Pasien Inap");
                System.out.println("  5. Lihat Ruangan berdasarkan Id"); //ada Pasien Inap
                System.out.println("");
                System.out.print("Pilih Menu :");
                pil1 = inputPilihan();
                switch (pil1) {
                    case 1:
                        System.out.println("");
                        System.out.println("   INPUT RUANGAN");
                        System.out.print("Nama Ruangan : ");
                        String Nama = IStr.nextLine();
                        System.out.print("Id Ruangan   : ");
                        String Id = IStr.nextLine();
                        app.createRuangan(Id, Nama);
                        break;
                    
                    case 2:
                        System.out.println("");
                        System.out.println("   MENGHAPUS RUANGAN");
                        System.out.print("Id Ruangan : ");
                        String IdR = IStr.nextLine();
                        app.removeRuangan(IdR);
                        break;
                        
                    case 3:
                        System.out.println("   MENAMPILKAN DATA RUANGAN");
                        System.out.println("");
                        app.viewListConsole(app.getListRuangan());
                        break;
                        
                    case 4:
                        System.out.println("");
                        System.out.println("    INPUT PASIEN INAP");
                        System.out.print("Masukkan Id Ruangan: ");
                        String idRuangan = IStr.nextLine();
                        System.out.print("Masukkan Id Pasien : ");
                        String idPasien = IStr.nextLine();
                        System.out.print("Masukkan Id Dokter :");
                        String idDktr = IStr.nextLine();
                        //app.addPasienInap(idRuangan, idPasien, iddktr);
                        System.out.println("");
                        break;
                        
                    case 5:
                        System.out.println("");
                        System.out.println("    LIHAT PASIEN");
                        System.out.print("Masukkan Id Ruangan: ");//ADA PASIEN INAPNYA
                        
                    case 0:
                        break;
                } 
            } catch (Exception e) {
                System.out.println("Error : "+e.getMessage());
            } finally { 
                IInt = new Scanner (System.in);
                IStr = new Scanner (System.in);
            }   
        } while (pil1!=0);
    }
    
    public void Menu(){
        int pil = 0;
        do {
            try {
                System.out.println("_________________________________________");    
                System.out.println("");
                System.out.println("   Sistem Informasi Data Pasien Inap");
                System.out.println("             di Rumah Sakit");
                System.out.println("_________________________________________");
                System.out.println("");
                System.out.println("");
                System.out.println("  Menu :");
                System.out.println("  1. Data Pasien");
                System.out.println("  2. Data Dokter");
                System.out.println("  3. Data Ruangan");
                System.out.println("");
                System.out.print("  Pilih Menu :");
                pil = inputPilihan();
                switch (pil){
                    case 1:
                        //app.loadPasien();
                        dataPasien();
                        //app.savePasien();
                        break;

                    case 2:
                        dataDokter();
                        break;

                    case 3:
                        dataRuangan();
                        break;
                    }
            } catch (Exception e){
                System.out.println("Error : "+e.getMessage());
            } finally {
                    IInt = new Scanner (System.in);
                    IStr = new Scanner (System.in);
            }
    } while (pil!=0);
}
}

