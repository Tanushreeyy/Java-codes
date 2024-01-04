import java.sql.SQLOutput;
import java.util.Scanner;
public class Practice_Array{
    public static void main(String[] args) {

        // Sum of all the elements of an array
//        float [] scott = {23.78f, 88.45f, 45.00f, 92.36f, 13.22f};
//        float sum = 0f;
//        for ( int i=0 ; i<scott.length ; i++){
//            sum = sum + scott[i];
//        }
//        System.out.print("The sum of all the elements in the array is ");
//        System.out.println(sum);

        // To search an element in the array
//        int [] Lame = {10, 20, 30, 40, 50, 60};
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number you want to search in the array : ");
//        int find = sc.nextInt();
//        boolean tanu = false;
//        for (int i : Lame) {
//            if (find == i) tanu = true;
//            break;
//        }
//            if (tanu) {
//                System.out.println("Your entered element is present in the array");
//            }
//            else
//                System.out.println("Your entered element is not in the list");

//        int [][] mat1 = new int [2][3];
//        int [][] mat2 = new int [2][3];
//        System.out.println("Enter elements of the first Matrix, 2rows and 3columns");
//        for (int i=0 ; i<mat1.length ; i++){
//            for (int j=0 ; j<mat1[i].length ; j++){
//                System.out.printf("Enter element mat1[%d][%d] : ",i,j);
//                mat1[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter elements of the second Matrix, 2rows and 3columns");
//        for (int a=0 ; a<mat2.length ; a++){
//            for (int b=0 ; b<mat2[a].length ; b++){
//                System.out.printf("Enter element mat1[%d][%d] : ",a,b);
//                mat2[a][b] = sc.nextInt();
//            }
//        }
//        int [][] result = new int [2][3];
//        System.out.println("Sum of the two matrices will be : ");
//        for (int x=0 ; x<mat1.length ; x++){
//            for (int y=0 ; y<mat1[x].length ; y++){
//                result[x][y] = mat1[x][y] + mat2[x][y];
//                System.out.print(result[x][y] + "  ");
//            }
//            System.out.print("\n");
//        }

        // To reverse all the elements in an array
//         int [] arr = new int [5];
//         int len = arr.length;
//        System.out.println("Enter the elements of the array :");
//         for (int i=0 ; i<len ; i++){
//             System.out.printf("Element a[%d] : ",i);
//             arr[i] = sc.nextInt();
//         }
//         int temp;
//         int a1 = Math.floorDiv(len, 2);
//         for (int j=0 ; j<a1 ; j++){
//             //Swapping logic
//             temp = arr[j];
//             arr[j] = arr[len-1-j];
//             arr[len-1-j] = temp;
//         }
//        System.out.print("The reversed array will be ");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

        // To print the maximum/minimum element of an array
//        int [] arr = new int [5];
//         int len = arr.length;
//        System.out.println("Enter the elements of the array :");
//         for (int i=0 ; i<len ; i++){
//             System.out.printf("Element a[%d] : ",i);
//             arr[i] = sc.nextInt();
//         }
//         int max = 0;
//         for (int j=0 ; j<arr.length ; j++){
//             if (arr[j]>max)
//                 max = arr[j];
//         }
//        System.out.print("The maximum element in the array is ");
//        System.out.println(max);

        boolean isSorted = true;
        int [] gar = {12 , 32 , 48 , 89, 23};
        for (int i = 0; i< gar.length-1; i++){
            if (gar[i] > gar[i+1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted)
            System.out.println("Given array is sorted");
        else
            System.out.println("Given array is not Sorted");
    }
}
