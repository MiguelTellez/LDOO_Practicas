
public class Singleclase {
    
Factoria Fac;

   
    private static Singleclase Fabr;
    
  
    private Singleclase (){
        
    }
        public static Singleclase getInstance(){
            if(Fabr == null){
                Fabr = new Singleclase();
            }
            return Fabr;
        }
   public Factoria fabr (){
       Fabr.getInstance();
       System.out.println(Fac);
     
       
       
      return Fac; 
   } ;
}