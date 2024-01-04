import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the number of initial odd natural numbers you want : ");
//        int n = sc.nextInt();
//        System.out.printf("The odd natural numbers upto %d are\n",n);
//        for (int i = 0; i < n; i++){
//                System.out.println(2*i+1);
//        }

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        System.out.print("Enter the total number of even numbers you want to add : ");
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            int a = 2 * i;
            sum = sum + a;
        }
        System.out.println("The sum of n number of even numbers is " + sum);

        System.out.print("Enter the number : ");
        int m = sc.nextInt();
        System.out.printf("The multiplication tablle of %d is", m);
        for (int i = 1; i <= 10; i++)
            System.out.printf("%d X %d = %d\n", m, i, m * i);

        System.out.print("Enter your number : ");
        int v = sc.nextInt();
        int fact = 1;
        for (int i = v; i > 0; i--) fact = fact * i;
        System.out.printf("The factorial of %d is %d", v, fact);
    }
}
