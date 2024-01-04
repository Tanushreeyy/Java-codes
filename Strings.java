import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Type any string : ");
                String a = sc.next();

                int length = a.length();
        System.out.printf("The length of the string is %d \n",length);

        String upper = a.toUpperCase();
        System.out.printf("Given string in uppercase format is %s \n",upper);

        String lower = a.toLowerCase();
        System.out.printf("Given string in uppercase format is %s \n",lower);

        System.out.print("Enter the starting index : ");
        int start = sc.nextInt();
        String index1 = a.substring(start);
        System.out.printf("Your required string is %s \n",index1);

        System.out.print("Enter the starting index : ");     //character is included
        int st = sc.nextInt();
        System.out.print("Enter the ending index : ");       //character is excluded
        int ed = sc.nextInt();
        String index2 = a.substring(st,ed);
        System.out.printf("Your required string is %s \n",index2);

        String not_trimmed = "       Dhichkyaauunnnn        ";
        String trimmed = not_trimmed.trim();
        System.out.printf("The untrimmed one is %s \n",not_trimmed);
        System.out.printf("The trimmed one is %s \n",trimmed);

        String lmao = "Dhikchik";
        String lmao1 = lmao.replace('h','r');
        System.out.printf("String before replacing opertaion : %s \n",lmao);
        System.out.printf("String after replacing opertaion : %s \n",lmao1);

        String lmao2 = lmao.replace("h","tan");
        System.out.printf("String before replacing opertaion : %s \n",lmao);
        System.out.printf("String after replacing opertaion : %s \n",lmao2);

        System.out.println(lmao.startsWith("Dh"));
        System.out.println(lmao.startsWith("dh"));
        System.out.println(lmao.startsWith("lm"));
        System.out.println(lmao.endsWith("lm"));
        System.out.println(lmao.endsWith("ik"));
        System.out.println(lmao.endsWith("IK"));

        //We can use both characters and strings in the replace, startsWith and endsWith operation.

        System.out.println(lmao.charAt(3));

        //string/character but both enclosed in ""
        System.out.println(lmao.indexOf("ik"));
        System.out.println(lmao.indexOf("ik"));
        System.out.println(lmao.indexOf("ik",4));
        System.out.println(lmao.lastIndexOf("ik"));
        System.out.println(lmao.lastIndexOf("ik",5));

        System.out.println(lmao.equals("Tanu"));
        System.out.println(lmao.equalsIgnoreCase("dhIkCHik"));
        System.out.println(lmao.equalsIgnoreCase("djgRfjsjIHGG"));
    }
}
