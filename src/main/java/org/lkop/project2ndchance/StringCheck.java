package org.lkop.project2ndchance;

import java.io.IOException;

public class StringCheck extends FileCheck {
    
    public StringCheck(String my_file){
    
        super(my_file);
    }
    
    public String getName(){
        
        try {
            String str = getBR().readLine();
            
            while (str != null){
                
                String[] str_split = str.split(" ");
                
                if(str_split[0].equalsIgnoreCase("name:")){
                    return str_split[1];
                }
                
                str = getBR().readLine();
            }
        }catch(IOException e){
           
        }
        return null;
    }
    
    public String getLastname(){

        try {
            String str = getBR().readLine();
            
            while (str != null){
               
                String[] str_split = str.split(" ");

                if(str_split[0].equalsIgnoreCase("lastname:")){
                    return str_split[1];
                }
                
                str = getBR().readLine();
            }
        }catch(IOException e){
           
        }
        return null;
    }
    
    public String getEmail(){
    
        try {
            String str = getBR().readLine();
            
            while (str != null){
 
                String[] str_split = str.split(" ");

                if(str_split[0].equalsIgnoreCase("email:")){
                    return str_split[1];
                }
                
                str = getBR().readLine();
            }
        }catch(IOException e){
           
        }
        return null;
    }
    
    public int getSemester(){
    
        try {
            String str = getBR().readLine();
            
            while (str != null){
 
                String[] str_split = str.split(" ");

                if(str_split[0].equalsIgnoreCase("semester:")){
                    return Integer.parseInt(str_split[1]);
                }
                
                str = getBR().readLine();
            }
        }catch(IOException e){
           
        }
        return 0;
    } 
}