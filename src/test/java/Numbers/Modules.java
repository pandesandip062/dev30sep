package Numbers;

import java.util.Scanner;

public class Modules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your first number -->");
        int a = sc.nextInt();
        System.out.println(" Enter your second number -->");
        int b= sc.nextInt();

        System.out.println("Modules of two numbers--> "+(a%b));
    }
}
