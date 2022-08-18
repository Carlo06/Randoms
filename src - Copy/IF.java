import java.util.Scanner;

public class IF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("tin")) {
             System.out.println("You typed tin");

        }
        else if (s.equals("hello")){
            System.out.println("hi");
        }
    
        else {
            System.out.println("Print");
        }
        
    }      

    
}
