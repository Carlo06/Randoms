import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        
       // Celcius();

       // Farenheight();

      //  SecondsToMinutes();

      //  HoursToMinutes();

       // MegaBytesToGigaBytes();

       // myNumber();
        
       // Uppercase();
      
      // CapitalOfPhilippines();
      
      //fiveHumanSense();
        Love();
        
      

    }
    
    static void Celcius(){

        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Temperature in Celcius: ");
        double C = scan.nextDouble();
        System.out.println("Your Temperature in celcius will be converted in farenheight ");

        double f = ( C * (9.0/5.0) + 32 );
        System.out.println("your Converted Farenheight will be " + "= " + f );
        
        
    
    }

    static void Farenheight(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Temperature in Farenheight: ");
        double F = scan.nextDouble();
        System.out.println("Your Temperature in Farenheight will be converted in celcius ");

        double c = ((F-32 ) * 5/9  ) ;
        System.out.println("your Converted celcius will be " + "= " + c );

    
    }

    static void SecondsToMinutes(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Seconds: ");
        double Seconds = scan.nextDouble();
        System.out.println("Your Seconds will be convereted to Minutes ");

        double Minutes = Seconds / 60;
        System.out.println("your Converted Minutes " + "= " + Minutes  );

    }

    static void HoursToMinutes(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Hours: ");
        double Hour = scan.nextDouble();
        System.out.println("Your Hours will be convereted to Minutes ");

        double Minutes = Hour * 60;
        System.out.println("your Converted Minutes " + "= " + Minutes  );

    }
    
    static void MegaBytesToGigaBytes(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Megabytes: ");
        double Megabytes = scan.nextDouble();
        System.out.println("Your Megabytes will be converted to Gigabytes ");

        double Gigabytes= Megabytes / 1000;
        System.out.println("your Converted Megabytes " + "= " + Gigabytes  );

        scan.close();
    }

    //PART 2

    static void myNumber(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your 11 digit Phone Number: ");
        String MobileNumber = scan.nextLine();

        if ( MobileNumber.length() == 11){
          
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }

    static void Uppercase(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String bestfriend = scan.nextLine();

        if (bestfriend == bestfriend.toUpperCase()){
          
            System.out.println("Valid");    
        } else {
            System.out.println("Invalid");
        }

    }
   
    static void CapitalOfPhilippines(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the Philippines: ");
        String Capital = scan.nextLine();

        if ( Capital.toLowerCase().equals("manila" ) || Capital.toUpperCase().equals("MANILA")){
          
            System.out.println("Valid");    
        } else {
            System.out.println("Invalid");
        }

    }

    static void fiveHumanSense(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input one of the five human sense: ");
        String humanSense  = scan.nextLine();

        if (humanSense.equals("Sight") ){  
            System.out.println("Valid");    
        } 
        
        else if (humanSense.equals("Touch") ){
            System.out.println("Valid");
        }

        else if (humanSense.equals("Hearing") ){
            System.out.println("Valid");
        }
        else if (humanSense.equals("Smell") ){
            System.out.println("Valid");
        }
        else if (humanSense.equals("Taste") ){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

        System.out.print("Enter one of the five human senses: ");
        
    

      //  switch (sense) {
         //   case "sight":
         //       System.out.print("Valid ");
         //       break;
        //    case "smell":
        //        System.out.print("Valid ");
       //         break;
      //      case "hearing":
      //          System.out.print("Valid ");
        //        break;
       //     case "touch":
       //         System.out.print("Valid ");
        //        break;
        //    case "taste":
       //         System.out.print("Valid ");
       //         break;
       //     default:
      //          System.out.print("invalid ");
       //         break;
    }

    static void Love(){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Input any sentence: ");
        String love = scan.nextLine();

        if (love.contains(love) ){    
            System.out.println("Valid");    
        } else {
            System.out.println("Invalid");
        }

        scan.close();

    }



}
