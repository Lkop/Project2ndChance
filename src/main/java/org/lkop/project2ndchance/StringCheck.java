package org.lkop.project2ndchance;

import java.io.IOException;

public class StringCheck extends FileCheck {
    
    public StringCheck(String my_file){
    
        super(my_file);
    }

    /*
    public void read(){
        try {
            String st;
            while ((st = getBR().readLine()) != null){
                
                
                System.out.println(st); 
            }
        }catch(IOException e){
            
        }
    }
    */
    
    public String getName(){
        
        try {
            String str = getBR().readLine();
            
            while (str != null){
                
                String[] str_split = str.split(" ");
                
                System.out.println("strsplit0= " + str_split[0] + " strsplit1= " + str_split[1]);
                
                if(str_split[0].equalsIgnoreCase("name:")){
                    return str_split[1];
                }
                
                str = getBR().readLine();
            }
        }catch(IOException e){
           
        }
        return null;
    }
    
    public String getLastName(){
    
        //to be completed
        return null;
    }
    
    public String getEmail(){
    
        //to be completed
        return null;
    }
    

    
}