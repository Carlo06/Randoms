import java.util.Scanner;

import javax.sound.sampled.Line;

public class Conditions {
    public static void main(String[] args){
      int x = 32;
      int y = 6;
      int z = 10;
      // > < = >= <= !=;

      boolean compare = !( y > z && z < y) ||( y == z || x < z); 

      System.out.println(compare);
      
      
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
    

      s.equals("hello");
  
 
 
    }
}
