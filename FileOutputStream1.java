/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHASHI
 */
public class FileOutputStream1 {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream file = new FileOutputStream("F:\\check.txt");
            
            
            file.write(17);
            file.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOutputStream1.class.getName()).log(Level.SEVERE, null, ex);
        }

FileInputStream f = new FileInputStream("F:check.txt");
 int i =f.read();  // for reading u have to specify the content. 
        System.out.println(" the content is " +i);
      
    }
    
    
}
