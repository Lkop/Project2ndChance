package org.lkop.project2ndchance;

import java.util.concurrent.atomic.AtomicInteger;

public class ProposalData {
    
    private static final AtomicInteger count = new AtomicInteger(0); 
    private int id;
    private String name;
    private String lastname;
    private String email;
    private int semester;
    private boolean phase_pass;
    
    //mentor's data
    private String mname;
    private String mlastname;
    private String memail;
    
    
    public ProposalData(){

        this.id = count.incrementAndGet();
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
    
    public void setPhasePass(boolean phase_pass){
    
        this.phase_pass = phase_pass;
    }
    
    public boolean getPhasePass(){
    
        return this.phase_pass;
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
