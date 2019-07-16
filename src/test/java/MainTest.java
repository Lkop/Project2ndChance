import com.lkop.project2ndchance.*;
import org.junit.Test;


public class MainTest {
    
    @Test
    public void run(){

        StringCheck sc = new StringCheck("4.txt");
       
        System.out.println(sc.getName());
                
        
        ProposalData p_data = new ProposalData();
        
        p_data.setName(sc.getName());
        
        System.out.println("p_data= " + p_data.getName());
    }
}
