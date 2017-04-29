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
public class Dokter extends Orang{
    private String Id;
    private String Spesialis;
    
    public Dokter (String Nama, int Umur, String Id, String Spesialis) {
        super(Nama,Umur);
        this.Id = Id;
        this.Spesialis = Spesialis;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getSpesialis() {
        return Spesialis;
    }

    public void setSpesialis(String Spesialis) {
        this.Spesialis = Spesialis;
    }
}
