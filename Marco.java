import java.util.Scanner;
class Employee {
    int id;
    String name;
    int salary;

    public void printDetails() {      //This is a method.
        System.out.print("My Id is " + id);
        System.out.println(" and my name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}
class Rectangle{
        int length;
        int breadth;
        public int perimeterCalc(){
            return 2*(length+breadth);
        }
        public int areaCalc(){
            return length*breadth;
        }
    }
public class Marco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a custom class lmao.s");

        Employee Tanu = new Employee();
        Employee Kirti = new Employee();

        Tanu.id = 1274;
        Tanu.name = "Alwaystanushree";
        Tanu.salary = 30;

        Kirti.id = 1986;
        Kirti.name = "BeingKirtika";
        Kirti.salary = 40;

        //Printing the attributes/Properties.
        Tanu.printDetails();
        Kirti.printDetails();
        // System.out.println(Tanu.id);
        // System.out.println(Tanu.name);

        int sal = Kirti.getSalary();
        System.out.println(sal);

        Rectangle r1 = new Rectangle();
        System.out.print("Enter the length of the rectangle : ");
        r1.length = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle : ");
        r1.breadth = sc.nextInt();
        System.out.println("Its area is " + r1.areaCalc());
        System.out.println("Its perimeter is " + r1.perimeterCalc());
    }
}
