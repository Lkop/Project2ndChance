package org.lkop.project2ndchance;

public class ProposalData {
    
    private int id=0;
    private String name;
    private String lastname;
    private String email;
    private int semester;
    
    //mentor's data
    private String mname;
    private String mlastname;
    private String memail;
    
    
    public ProposalData(){

        this.id++;
    }
    
    public int getId(){
    
        return this.id;
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
    
    public String getLastname(){
    
        return this.lastname;
    }
        
    public void setEmail(String email){
    
        this.email = email;
    }
    
    public String getEmail(){
    
        return this.email;
    }
    
    public void setSemester(int semester){
    
        this.semester = semester;
    }
    
    public int getSemester(){
    
        return this.semester;
    }
    
    //mentor's methods
    public void setMName(String name){
    
        this.mname = name;
    }
    
    public String getMName(){
    
        return this.mname;
    }
    
    public void setMLastname(String lastname){
    
        this.mlastname = lastname;
    }
    
    public String getMLastname(){
    
        return this.mlastname;
    }
    
    public void setMEmail(String email){
    
        this.memail = email;
    }
    
    public String getMEmail(){
    
        return this.memail;
    }
}
