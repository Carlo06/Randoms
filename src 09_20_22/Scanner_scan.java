import java.util.Scanner;

public class Scanner_scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name;
        System.out.println("Enter your Name: ");
        name = scan.nextLine();

        System.out.println("Hello I am " + name);

        String food;
        System.out.println("enter your favorite food ");
        food = scan.nextLine();

        System.out.println("My favorite food is " + food);


        int age;
        System.out.println("Enter your age ");
        age = scan.nextInt();

        System.out.println("my age is " + age);

        double weight;
        System.out.println("Ente your Weight");
        weight = scan.nextFloat();
        
        System.out.println("My weight is " + weight + "kg");


        String animal;
        System.out.println("Enter tour favorite Animal ");
        animal = scan.nextLine();

        System.out.println("My Favorite Animal is " + animal);


        

    
    
    
    }
    

}

    
