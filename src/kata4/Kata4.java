/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.io.File;
import java.nio.file.Files;

/**
 *
 * @author death
 */
 public class Kata4 {
  
      public static void main(String[] args) {
         
         File file = new File("C:\\Users\\death\\Desktop");
         print(file.listFiles(), "");
     }
     
     public static void print(File[] files, String indent){
         if(files == null){
             return;
         }
         for (File file : files) {
             System.out.println(indent + (file.isDirectory() ? "+" : "-") 
                     + file.getName());
             if(!file.isDirectory() || file.isHidden()){
                 continue;
             }
             print(file.listFiles(), "   ");
          }
      }
  }

