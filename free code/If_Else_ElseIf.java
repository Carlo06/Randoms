import java.util.Scanner;

public class If_Else_ElseIf {
    public static void main(String[] args){
        System.out.print("HElloCarlo");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("tin")) {
             System.out.println("You typed tin");
             String age = sc.nextLine();

             if (age.equals(17)){
                System.out.println( "edi nays");

             } 
            

        }
        else if (s.equals("hello")){
            System.out.println("hi");
        }
    
        else {
            System.out.println("Print");
        }
        
    }      

    
}
