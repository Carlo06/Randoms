public class Ma3 {
    public static void main(String args[]) {
        boolean Holiday = true;
        boolean suspended = false;
    
     
     if (suspended){
         System.out.println("Ask my parents to drive me to NU");

         

     }
     else if (Holiday){
        System.out.println("Spend time with Family");
    }
   
    
    else {
     
         // Step 1
         walk();
         
         rideJeep();
         
         rideTricycle();
     
      
    }
    
    
    
    }
    
    static void walk(){
        System.out.println("walk Through the terminal ");
    }
    
    static void rideJeep(){
        System.out.println("Ride jeep along frisco Qc");
        System.out.println("Exit jeep at Ust Gate 2");
    }
    static void rideTricycle(){
        System.out.println("Walk from UST to NU");
    }
    
}