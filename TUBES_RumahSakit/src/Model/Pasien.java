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
public class Pasien extends Orang{
    private String Id;
    
    
    public Pasien (String Id, String Nama, int Umur) {
        super(Nama, Umur);
        this.Id = Id;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
}