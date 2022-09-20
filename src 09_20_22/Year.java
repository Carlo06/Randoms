import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int y;
        int a;
        int b;
        int c;
        int d;
        int e;
        int g;
        int h;
        int j;
        int k;
        int m;
        int r;
        int n;
        int p;

        System.out.print("Current year: ");
         y = scan.nextInt();
        scan.close();
        // quotient (/)
        // remainder (%)
        a = y % 19;
        b = y / 100;
        c = y % 100;
        d = b / 4;
        e = b % 4;
        g = (8 * b + 13) / 25;
        h = ( 19 * a + b - d - g + 15) % 30;
        j = c / 4;
        k = c % 4;
        m = (a + 11 * h) / 319;
        r = (2 * e + 2 * j - k - h + m + 32) % 7;
        n = (h - m + r + 90) / 25;
        p = (h - m + r + n + 19) % 32;

        System.out.println("Easter falls on " + "(Sunday) " +   n + "/" + p + "/" + y);

    }


}
