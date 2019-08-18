package org.lkop.project2ndchance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringCheck {
    
    //proposal methods
    public String getName(String string){
        
        String[] str_split = string.split(" ");
        
        if(str_split[0].equalsIgnoreCase("name:")){
            return str_split[1];
        } 
        return null;
    }
    
    public String getLastname(String string){

        String[] str_split = string.split(" ");
        
        if(str_split[0].equalsIgnoreCase("lastname:")){
            return str_split[1];
        } 
        return null;
    }
    
    public String getEmail(String string){
    
        String[] str_split = string.split(" ");
        
        if(str_split[0].equalsIgnoreCase("email:")){
            return str_split[1];
        } 
        return null;
    }
    
    public int getSemester(String string){
        
        String[] str_split = string.split(" ");
        
        if(str_split[0].equalsIgnoreCase("semester:")){
            return Integer.parseInt(str_split[1]);
        }
        return 0;
    }

    public String getPrTitle(String string){
    
        String[] str_split = string.split(": ");
        
        if(str_split[0].equalsIgnoreCase("proposal title")){
            return str_split[1];
        } 
        return null;
    }
    
    public String getPrUrl(String string){
    
        String[] str_split = string.split(": ");
        
        if(str_split[0].equalsIgnoreCase("proposal url")){
            return str_split[1];
        } 
        return null;
    }
        
    //awards methods
    public int getId(String string){
    
        String[] str_split = string.split(" ");
        
        if(str_split[0].equalsIgnoreCase("award")){
            return Integer.parseInt(str_split[1]);
        }
        return 0;
    }
    
    public int getPrize(String string){
        
        String[] str_split = string.split(" ");
        
        if(str_split[0].equalsIgnoreCase("prize:")){
            return Integer.parseInt(str_split[1]);
        }
        return 0;
    }
    
    //information methods
    public boolean getPhasePass(String string){
        
        String[] str_split = string.split(": ");
        
        if(str_split[0].equalsIgnoreCase("phase pass")){

            if(str_split[1].equalsIgnoreCase("yes")){        
                return true;
            }
        }
        return false;
    }
    
    public boolean getFinalPass(String string){
        
        String[] str_split = string.split(": ");
        
        if(str_split[0].equalsIgnoreCase("project done")){
            
            if(str_split[1].equalsIgnoreCase("yes")){
                return true;
            }
        }
        return false;
    }
    
    public LocalDate getStartDate(String string){
        
        String[] str_split = string.split(": ");
        
        if(str_split[0].equalsIgnoreCase("start date")){
            
            if(!str_split[1].isEmpty()){
                return LocalDate.parse(str_split[1], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            }
        }
        return null;
    }
    
    public LocalDate getEndDate(String string){
        
        String[] str_split = string.split(": ");
        
        if(str_split[0].equalsIgnoreCase("end date")){

            if(!str_split[1].isEmpty()){
                return LocalDate.parse(str_split[1], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            }
        }
        return null;
    }
    
}