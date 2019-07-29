package org.lkop.project2ndchance;

import java.io.File;

public class FileCheck {
  
    public FileCheck(String filename) throws SomethingWrong{
    
        File file = new File(filename);
        
        if(file.exists() != true){
        
            throw new SomethingWrong("File cannot be found.");
        }
        
        if(file.canRead() != true){
        
            throw new SomethingWrong("File cannot be read.");
        }
        
        if(file.length() == 0){
        
            throw new SomethingWrong("File is empty.");
        }
    }
}
