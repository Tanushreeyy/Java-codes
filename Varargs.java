import java.util.Scanner;
public class Varargs {

//    static int sum(int a,int b){
//        return a+b;}
//    static int sum(int a,int b,int c){
//        return a+b+c;}
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;}

    // with varargs
    static int sum(int ...arr){
//        Available as int [] arr
        int s = 0;
        for (int a : arr) {
            s += a;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is " + sum(4,5));
        System.out.println("The sum of 4,7 and 5 is " + sum(4,7,5));
        System.out.println("The sum of 3,9,8 and 5 is " + sum(3,9,8,5));
        System.out.println("The sum of nothing is " + sum());
    }
}
