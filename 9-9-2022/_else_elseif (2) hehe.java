import java.util.Scanner;

public class _else_elseif {
    public static void main(String[] args){
        System.out.println("Enter any key to start ");
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       
        String name;
        System.out.println("What is your name? ");
        name = scan.nextLine();
         System.out.println("my name is " + name);
        
         int age;
         double weight;
         
          System.out.println("What is your age? ");
          age = scan.nextInt();
         
          if (age >18){
             System.out.println( "you are " + age + " then you are not a minor! ");
             
             System.out.println("Enter your weight? ");
 
             weight = scan.nextDouble();
             
             if (weight > 90.0){
                System.out.println("You are Obease");
             }
             else if (weight <=85.0){
                System.out.print("YOU NEED TO DIET! ");
             }
                
 
 
 
          }
 
          else if (age ==18){
             System.out.println("I might consider it");
 
          }
          else{
             System.out.println("you are a minor");
          }

        
        



         
        
      
    }      

}