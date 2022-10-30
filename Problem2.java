package assignment;

public class Problem2 {

    public static void main(String[] args) {
        
       long currentpopulation = 167288486;
       
       long oneyear = 365;
       
       long totdays = 365*5;
       
       long tothour = totdays*24;
       
       long totmin = tothour*60;
       
       long per = totmin/5;
       
       int year = 0;
        
       for(long i = 1; i<= totmin; i++){
       
       // for 1 birth per minute
       
       currentpopulation++;
       
       // for 1 death 2 minutes
       
       if(i%2==0){
       
       currentpopulation--;
           
       }
       
       // for 1 migrant in 8 minutes
       
       if(i%8==0){
       
       currentpopulation--;
           
       }
       
       if(i%per==0){
           year++;
           System.out.println("After "+year+" year population will be "+currentpopulation);
       }
       
       
       }
        
    }
    
}
