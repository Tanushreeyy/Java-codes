import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        System.out.print("Enter your age : ");
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      if(age>18){
          System.out.println("You can drive!");
      }
      else {
          System.out.println("Sorry, You cannot drive now.");
      }
//      else is optional in if else conditional programming.

        System.out.print("Enter your favourite Marvel Character : ");
        String name = sc.next();
        boolean dang = name.equalsIgnoreCase("Thor");

        if(dang){
            System.out.println("Maar hatodeyy, \nBehen ke Pakodey");
        }
        else {
            System.out.println("Jaana Bhagodey");
        }

        //Usage of else-if statements
        System.out.print("Enter age : ");
        int umar = sc.nextInt();
        if (umar>60){
            System.out.println("Buddhe tu ghar jaa");
        } else if (umar>40) {
            System.out.println("Tu bhi buddhe me hi aata hai saale");
        } else if (umar>20) {
            System.out.println("Yahi time hai, jeele bete");
        }
        else {
            System.out.println("Isko andar aane kon diya bey?");
        }

        //Switch Case Statements

        System.out.print("Enter member's name to know his tagline : ");
        String pp = sc.next();

        switch (pp) {
            case "mouli" -> {
                System.out.println("Chalo niklo niklo");
                System.out.println("Yaha aapka koi kaam ni hai");
            }
            case "pucchi" -> {
                System.out.println("Hey gaizzzz!!");
                System.out.println("Welcome to our youtube channel!!");
            }
            case "dakesh" -> System.out.println("Bhai mai kya kia?");
            case "bhagat" -> System.out.println("Teri aisi ki taisi");
            case "kirti" -> System.out.println("Tohhh??");
            case "tanu" -> System.out.println("Mai aisi kyu hoon yaarrrr");
            default -> System.out.println("Iss naam se yaha koi nahi hai");
        }
        System.out.println("Bhupendra Jogi");

        //normal syntax
        /*switch(pp){

            case "mouli":
                System.out.println("Chalo niklo niklo");
                System.out.println("Yaha aapka koi kaam ni hai");
                break;

            case "pucchi":
                System.out.println("Hey gaizzzz!!");
                System.out.println("Welcome to our youtube channel!!");
                break;

            case "dakesh":
                System.out.println("Bhai mai kya kia?");
                break;

            case "bhagat":
                System.out.println("Teri aisi ki taisi");
                break;

            case "kirti":
                System.out.println("Tohhh??");
                break;

            case "tanu":
                System.out.println("Mai aisi kyu hoon yaarrrr");
                break;

            default:
                System.out.println("Iss naam se yaha koi nahi hai");
        }
        System.out.println("Bhupendra Jogi");*/
    }
}
