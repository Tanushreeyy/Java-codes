import java.util.Scanner;
public class Methods {

    static void foo() {
        System.out.println("leaving like a father");
    }

    static void foo(int m) {
        System.out.println("I meow you " + m);
    }

    //    static int mySum( int x , int y) {
    int mySum(int x, int y) {       //Parameters
        int z = x > y ? (x + 5) * y : x * (y + 5);
        return z;
//        return x > y ? (x + 5) * y : x * (y + 5);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        Methods obj = new Methods();   //Scanner sc = new Scanner();
        int c = obj.mySum(a,b);        //int a = sc.nextInt();
//        int c = mySum(a,b);
        System.out.println(c);

//        Methods Overloading
        foo();
        int m;
        foo(m = 3000);    //Arguments are actual
    }
}
