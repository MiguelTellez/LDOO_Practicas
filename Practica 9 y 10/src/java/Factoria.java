

public class Factoria {

//private static Factoria singleton;
  
    //public  static Factoria getFactoriaUsuario(){
    //if (singleton==null) {
       // singleton=new Factoria();
    //}
    //return singleton;
 //}
    
private Factoria(){
   int opcion = 3;
   Admin administrador = new Admin();
   Normal normal = new Normal();
   LoginInvitado invitado = new LoginInvitado();
    
    switch(opcion){
    case 1:
        System.out.println(administrador);
        break;
    case 2:
        System.out.println(normal);
        break;
    case 3:
        System.out.println(invitado);
        break;
        
    default:
    }
    
        
} ;
   
    
    
}
