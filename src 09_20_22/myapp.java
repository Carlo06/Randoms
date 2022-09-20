import java.util.Scanner;
public class myapp
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f1;
        int f14;
        int f2;
        int f3;
        int f4;
        int f5;
        int f6;
        int f7;
        int f8;
        int f9;
        int f10;
        int f11;
        int f12;
        int f13;
        
        System.out.print("Current year: ");
        f14 = input.nextInt();
        input.close();
        f1 = f14 % 19;
        f2 = f14 / 100; 
        f3 = f14 % 100;
        f4 = f2 / 4;
        f5 = f2 % 4;
        f6 = (8 * f2 + 13) / 25;
        f7 = (19 * f1 + f2 - f4 - f6 + 15) % 30;
        f8 = f3 / 4;
        f9 = f3 % 4;
        f10 = (f1 + 11 * f7) / 319;
        f11 = (2 * f5 + 2 * f8 - f9 - f7 + f10 + 32) % 7;
        f12 = (f7 - f10 + f11 + 90) / 25;
        f13 = (f7 - f10 + f11 + f12 + 19) % 32;
        System.out.println("Easter falls on " + f13 + "/" + f12 + "/" + f14);
    }
}