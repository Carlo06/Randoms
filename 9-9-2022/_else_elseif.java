import java.util.Scanner;

public class hoy {
    public static void main(String[] args){
        System.out.println("What is your name? ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String name;
        int age;

      

        if (s.equals("tin")) {
            System.out.println("You typed tin");

             System.out.println("What is your age? ");
             age = scan.nextInt();

            

            

            
             if (age >18){
                System.out.println( "you are not a minor");

             }
               

       
             else if (age ==18){
                System.out.println("I might consider it");

             }
             else{
                System.out.println("you are a minor");
             }



        }
            
            
               

             
               


             
        
    }      

    
}