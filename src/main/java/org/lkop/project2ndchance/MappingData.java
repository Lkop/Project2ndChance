package org.lkop.project2ndchance;

public class MappingData {
    
    private AwardData aw_dev_data;
    private AwardData aw_men_data;
    private ProposalData pr_data;
    
    public MappingData(AwardData aw_dev_data, AwardData aw_men_data, ProposalData pr_data){
    
        this.aw_dev_data = aw_dev_data;
        this.aw_men_data = aw_men_data;
        this.pr_data = pr_data;
    }
    
    public AwardData getDevAward(){
    
        return this.aw_dev_data;
    }
    
    public AwardData getMenAward(){
    
        return this.aw_men_data;
    }
    
    public ProposalData getProposal(){
    
        return this.pr_data;
    }
}
