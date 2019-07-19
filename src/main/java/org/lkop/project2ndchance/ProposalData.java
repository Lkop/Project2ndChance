package org.lkop.project2ndchance;

public class ProposalData {
    
    private int id;
    private String name;
    private String lastname;
    private String email;
    
    public ProposalData(){

        this.name = null;
        this.lastname = null;
        this.email = null; 
    }
    
    public void setName(String name){
    
        this.name = name;
    }
    
    public String getName(){
    
        return this.name;
    }
    
    public void setLastname(String lastname){
    
        this.lastname = lastname;
    }
    
    public void setEmail(String email){
    
        this.email = email;
    }
}
