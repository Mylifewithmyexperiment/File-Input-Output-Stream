/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import java.io.*;

/**
 *
 * @author SHASHI
 */
public class BufferOutputStreamrExample {
//    public static void main(String[] args) throws FileNotFoundException, IOException {
//        FileOutputStream  file = new FileOutputStream("F:\\check.txt");
////       
////        ByteArrayOutputStream bout1 = new ByteArrayOutputStream();
////        bout1.write(65); // byte gives the ascii code so 65==A
////        bout1.writeTo(file);
//
//    // whereas in byte array output stream we can write it to different file 
//    // like  bout.writeTo(file1);
//        
//        BufferedOutputStream bout = new BufferedOutputStream(file); //collection of data //here it is now connected to fileoutputStream
//        String s = "shashi is not dead";
//        byte b[] = s.getBytes();
//        bout.write(b);
//        bout.flush();//it is used for flushing the buffer output stream data . 
//        bout.close();
//        file.close();
//        
//    }
    
    
    
    
     public static void main(String[] args) throws FileNotFoundException, IOException {
       // FileInputStream  file = new FileInputStream("F:\\check.txt");
     //   BufferedInputStream bin = new BufferedInputStream(file); //collection of data //here it is now connected to fileoutputStream
       byte []g = {35,37,38}; 
      ByteArrayInputStream bin = new ByteArrayInputStream(g);// it will only read the byte data 
     int i=0 ;
         while((i=bin.read())!=-1)
         {
             char ch =(char)i;
             System.out.println(ch);
              
         }
        
        bin.close();
        //file.close();
        
          
}
}

