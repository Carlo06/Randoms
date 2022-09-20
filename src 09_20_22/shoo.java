
    public class shoo {
        public static void main(String[] args) throws Exception {
    
    
    
           shoo myApp = new shoo();
    
    
    
           // Non-static method call
            myApp.showHelloJava();
    
    
    
           // Static method call
            showHelloWorld();
    
    
    
           // Non-static method call with parameter
            myApp.showName("Elizer");
    
    
    
           // Static method call with parameter
            showAge(20);
    
    
    
           // Static method call with two parameters
            showNameAndAge("Elizer", 20);
    
    
    
           // Non-static method call with two parameters that returns an int
            int sum = myApp.add(1, 1);
            System.out.println(sum);
    
    
    
           // Static method call with two parameters that returns an int
            int difference = subtract(1, 1);
            System.out.println(difference);
            
            showWeight(88.0);
            
            myApp.showLocation("National University");
            
            int product = myApp.multiply(5, 5);
            System.out.println(product);
            
            int quotient = divide(5, 2);
            System.out.println(quotient);
            
    
    
    
       }
    
    
    
       // Non-static method
        void showHelloJava() {
            System.out.println("Hello Java! This is a non-static method.");
        }
    
    
    
       // Static method
        static void showHelloWorld() {
            System.out.println("Hello World! This is a static method.");
        }
    
    
    
       // Non-static method with a parameter
        void showName(String name) {
            System.out.println("My name is " + name);
        }
    
    
    
       // Static method with a parameter
        static void showAge(int age) {
            System.out.println("My age is " + age);
        }
    
    
    
       // Static method with two parameters
        static void showNameAndAge(String name, int age) {
            System.out.println("Hello: " + name);
            System.out.println("You are : " + age + " years old!");
        }
    
    
    
       // Non-static method with two parameters with a return type
        int add(int x, int y) {
            int z = x + y;
            return z;
        }
    
    
    
       // Static method with two parameters with a return type
        static int subtract(int x, int y) {
            int z = x - y;
            return z;
        }
        static void showWeight (double weight){
            System.out.println("My weight is " + weight );
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
    }

