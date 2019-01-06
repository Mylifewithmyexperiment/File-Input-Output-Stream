/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;
import java.io.*;
/**
 *
 * @author SHASHI
 */

// the purpose this api is to combine content of two input stream file  together
public class SequenceInputStreamEx    {
    public static void main(String[] args) throws Exception {
        
//        FileOutputStream file1 = new FileOutputStream("F:\\file1.txt");
//        
//        FileOutputStream file2 = new FileOutputStream("F:\\file2.txt");
//        String s1 = "He is awaken";
//        byte b[]= s1.getBytes();
//        file1.write(b);
//        String s2 = "He will conquer all";
//        byte c[]=s2.getBytes();
//        file2.write(c);
//        file1.close();
//         file2.close();
//         
         
        FileInputStream  file1 = new FileInputStream("F:\\file1.txt");
        FileInputStream  file2 = new FileInputStream("F:\\file2.txt");
        
        FileOutputStream fout = new FileOutputStream("F:\\SeqFile.txt");
        
        SequenceInputStream seqFile = new SequenceInputStream(file1, file2); // the two file data are combined together 
        
        int i;
        
        while((i=seqFile.read())!=-1)
        {
            fout.write(i);          //writting the combined data in differnt file 
            
            System.out.print((char)i);
        }
        

        
    }
}
