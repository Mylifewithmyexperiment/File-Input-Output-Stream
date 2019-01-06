/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

import java.io.IOException;

/**
 *
 * @author SHASHI
 */
public class FileSystem {
    
    private static FileSystem f;//object with return type of class name 
    String s = " I am in default constructor of singleton class";
     
    private FileSystem()
    {
        System.out.println(" in private fileSystem : - " +s);
    }
    
    public static FileSystem classNameMethodAsGetINSTANCE(){  //method with return thype of class
        
     // unlike constructor we use getInstace method for instantiation of object    
        if(f==null)
        {
            f= new FileSystem();
            
        }
        
        return f;
    }
    
    
    void SingletonCheck()
    {
        System.out.println(" i am called by class object ");
    }
    
    public static void main(String[] args) throws IOException {
        
        FileSystem obj = FileSystem.classNameMethodAsGetINSTANCE();
        obj.SingletonCheck();
        
        
        System.out.println("shashi jais");
       // System.err.println("  ");
     
       // int i = System.in.read();
      //  System.out.println((char)i);
        
      
    
    }
         
    
}
