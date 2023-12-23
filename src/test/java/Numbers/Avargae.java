package Numbers;

import java.util.Scanner;

public class Avargae {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num ");
        int a = sc.nextInt();
        System.out.println("Enter your second num ");
        int b = sc.nextInt();
        System.out.println("Enter your third num ");
        int c = sc.nextInt();
        System.out.println("Enter your fourth num ");
        int d = sc.nextInt();
        System.out.println("Enter your fifth num ");
        int e = sc.nextInt();

        System.out.println("Total sum is "+(a+b+c+d+e));
        System.out.println("Avg is "+((a+b+c+d+e))/5);


    }
}
