/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Model.Aplikasi;
import Console.Console;

/**
 *1
 * @author Nabila Kusuma
 */
public class Driver {
    public static void main(String[] args) {
        Aplikasi app = new Aplikasi();
        
        Console view = new Console(app);
        view.Menu();
    }
}
