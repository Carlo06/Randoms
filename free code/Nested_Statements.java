import java.util.Scanner;

public class Nested_Statements {
    public static void main(String[] args){
        System.out.print("input your age");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18){
            System.out.print("input your fav food");
            String food = sc.nextLine();

            if (food.equals("pizza")){
                System.out.println("mine too");
            }
            else if (food.equals("burger")){
                System.out.println("I might Consider it");
            }
            
            else{
                System.out.println("I Dont like it");
            }
        }
        else if (age >=13){
            System.out.println("You are Teenager");


        }

        else {
            System.out.println("you are not a teen ager or an adult");

        }



        

       

        

        

    

 
        
     
 
          
 
 
 
 
     }
 }
    

