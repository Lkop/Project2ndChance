package org.lkop.project2ndchance;

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
}