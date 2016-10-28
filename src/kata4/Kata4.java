/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.io.File;

/**
 *
 * @author death
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\death\\Desktop");
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
