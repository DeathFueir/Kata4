/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

/**
 *
 * @author death
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 
public class MailListReader {
     
    public static ArrayList<String> read (String fileName) throws FileNotFoundException, IOException{
        ArrayList<String> mailList = new ArrayList<>();
         
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
         
        String mail;
        while((mail = reader.readLine()) != null){
            mailList.add(mail);
        }
         
        reader.close();
         
        return mailList;
    }
     
}
