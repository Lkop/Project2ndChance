package org.lkop.project2ndchance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileCheck {
   
    private BufferedReader br = null;
    private boolean is_ok = false;
  
    public FileCheck(String filename){
    
        try {
            
            File p_file = new File(filename);
            
            System.out.println("Is file readable? " + p_file.canRead());
            
            if(p_file.canRead() == true){
                
                //read file stream
                br = new BufferedReader(new FileReader(p_file));
                is_ok = true;
            }
            
        }catch (FileNotFoundException e) {
            
        }
    }
    
    public BufferedReader getBR(){
    
        return this.br;
    }
    
    public boolean isOk(){
    
        return this.is_ok;
    }
}
