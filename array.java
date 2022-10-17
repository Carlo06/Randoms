import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        // TODO Auto-generated method stub
       //SYTNAX WHAT EVER WHAT YOU WANT TO TYPE
    
        char[] names = {'C', 'A', 'R', 'L', 'O'};
        
    

        for (int i = 0; i < names.length; i++){
            
            if (!(names[i] == 'A' || names[i] == 'E' || names[i] == 'I'|| names[i] == 'O' || names[i] == 'U')){
            
                System.out.println(names[i]);
            }
        }
        
      ///  for (int i = names.length - 1; i >= 0; i--){
        //    System.out.println(names[i]);
       // }
     //   System.out.println( (names[4]));
    //     System.out.println( (names[3]));
     //     System.out.println( (names[2]));
     //     System.out.println( (names[1]));
      //    System.out.println( (names[0]));       
    }
}
