package org.lkop.project2ndchance;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class ProposalData {
    
    private static final AtomicInteger count = new AtomicInteger(0); 
    private int id;
    private String name;
    private String lastname;
    private String email;
    private int semester;
    private String pr_title;
    private String pr_url;

    
    //mentor's data
    private String mname;
    private String mlastname;
    private String memail;
    
    //information data
    private boolean phase_pass;
    private boolean final_pass;
    private LocalDate start_date;
    private LocalDate end_date;
    
    public ProposalData(){

        this.id = count.incrementAndGet();
        this.phase_pass = false;
        this.final_pass = false;
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
    
    public void setPrTitle(String pr_title){
    
        this.pr_title = pr_title;
    }
    
    public String getPrTitle(){
    
        return this.pr_title;
    }
    
    public void setPrUrl(String pr_url){
    
        this.pr_url = pr_url;
    }
    
    public String getPrUrl(){
    
        return this.pr_url;
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
    
    //information methods
    public void setPhasePass(boolean phase_pass){
    
        this.phase_pass = phase_pass;
    }
    
    public boolean getPhasePass(){
    
        return this.phase_pass;
    }
    
    public void setFinalPass(boolean final_pass){
    
        this.final_pass = final_pass;
    }
    
    public boolean getFinalPass(){
    
        return this.final_pass;
    }
    
    public void setStartDate(LocalDate start_date){
    
        this.start_date = start_date;
    }
    
    public LocalDate getStartDate(){
    
        return this.start_date;
    }
    
    public void setEndDate(LocalDate end_date){
    
        this.end_date = end_date;
    }
    
    public LocalDate getEndDate(){
    
        return this.end_date;
    }
   
}
