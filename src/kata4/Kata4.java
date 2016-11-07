/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author death
 */
 public class Kata4 {
  
    public static void main(String[] args) throws FileNotFoundException, IOException {
         
        String path = "‪C:\\Users\\death\\Desktop\\emailsfilev1.txt";
        
        ArrayList<String> mailList = MailListReader.read(path);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();        
    }        
  }

