import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Enter your name : ");
        String nam = sc.next();

        System.out.printf("Hello %s !!\nI am Sylvie. Let's play Rock Paper Scissor!!", nam);
        System.out.println("Choices are as shown below : ");
        System.out.println("1. Rock \n2. Paper \n3. Scissor\n");
        System.out.print("I have opted my choice, enter yours : ");
        int ch = sc.nextInt();
        int com = ran.nextInt(1, 4);

        System.out.printf("Your Choice : %d \nMy Choice : %d\n", ch, com);

        if (ch == 1 && com == 2)
            System.out.printf("Sylvie won! %s lose.", nam);
        else if (ch == 2 && com == 3)
            System.out.printf("Sylvie won! %s lose.", nam);
        else if (ch == 3 && com == 1)
            System.out.printf("Sylvie won! %s lose.", nam);
        else if (ch == com)
            System.out.println("Match Draw");
        else
            System.out.printf("%s won! Sylvie lose.", nam);
    }
}