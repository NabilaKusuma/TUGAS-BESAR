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
                System.out.println("     MENU DATA PASIEN");
                System.out.println("  1. Daftar Pasien");
                //System.out.println("  2. Daftar Pasien Inap"); //Mendaftarkan Pasien menjadi Pasien Inap
                System.out.println("  2. Menghapus Pasien");
                System.out.println("  3. Menampilkan Data Pasien");
                //System.out.println("  5. Menampilkan Data Pasien Inap"); //Hanya Pasien yg diopname
                System.out.println("  4. Mencari Pasien berdasarkan Indeks");
                System.out.println("  5. Mencari Pasien berdasarkan Id Pasien");
                System.out.println("");
                System.out.println("Pilih Menu :");
                pil1 = inputPilihan();
                switch (pil1) {
                    case 1:
                        System.out.println("");
                        System.out.println("   DAFTAR PASIEN");
                        System.out.println("");
                        System.out.println("Nama          : ");
                        String Nama = IStr.nextLine();
                        System.out.println("Tanggal Lahir : ");
                        String tglLahir = IStr.nextLine();
                        System.out.println("Umur          : ");
                        int Umur = IInt.nextInt();
                        System.out.println("Id Pasien : ");
                        String IdPasien = IStr.nextLine();
                        app.addPasien(Nama, Umur, tglLahir, IdPasien);
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
                        System.out.println("");
                        System.out.println("Id Pasien : ");
                        String IdPasien = new IStr.nextLine();
                        app.removePasien(IdPasien);
                        break;
                        
                    case 3:
                        System.out.println("   MENAMPILKAN DATA PASIEN");
                        System.out.println("");
                        app.viewListConsole(app.get)
                }
            }
            
        }
        
    }
    
    public void Menu(){
        
        int pil = 0;
        System.out.println("_________________________________________");
        System.out.println("");
        System.out.println("   Sistem Informasi Data Pasien Inap");
        System.out.println("             di Rumah Sakit");
        System.out.println("_________________________________________");
        System.out.println("");
        System.out.println("");
        System.out.println("Menu :");
        System.out.println("1. Data Pasien");
        System.out.println("2. Data Dokter");
        System.out.println("3. Data Ruangan");
        System.out.println("");
        System.out.println("Pilih Menu :");
        pil = inputPilihan();
        switch (pil){
            case 1;
                
            case 2;
            
            case 3;
        }
    }
}
