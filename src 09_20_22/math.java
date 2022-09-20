public class math {
    public static void main(String[] args) {
        
        
        showWeight(88.0);

        math myApp = new math();
            
        myApp.showLocation("National University");
        
        int product = myApp.multiply(5, 5);
        System.out.println("the answer is " + product);
        
        int quotient = divide(5, 2);
        System.out.println("the answer is " + quotient);
    }

    
   
    
    static void showWeight (double weight){
        System.out.println("My weight is " + weight + "kg" );
    }
    
    void showLocation (String Location){
        System.out.println("My Location is at " + Location);
    }
    //Non Static method
     int multiply(int x, int y){
        int z = x * y;
        return z;
     }
    
     //Static method
    static int divide (int x, int y ){
     int z = x / y;
     return z;
     } 
     


   static boolean isEqual (int x, int y ){
    boolean z = x == y;
    return z;

    // return x == y;

   }  
     


     
    

}
