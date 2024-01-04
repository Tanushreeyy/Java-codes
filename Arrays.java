public class Arrays {
    public static void main(String[] args) {

        // Initialing marks of 5 students using arrays
        int [] marks;
        marks = new int[5];
        marks[0] = 100;
        marks[1] = 20;
        marks[2] = 46;
        marks[3] = 79;
        marks[4] = 89;
        System.out.println(marks[3]);

        int [] mark = {32,45,67,78,89};  /* Declare + Initialize */
        float [] scott = {89.4f,56.0f,45.9f};
        String [] students = {"Tanu", "Gullu", "Rishu", "Ashu" };

        System.out.println(mark[3]);
        System.out.println(mark.length);
        System.out.println(students.length);

        // Naive method for displaying an array
        System.out.println(scott[0]);
        System.out.println(scott[1]);
        System.out.println(scott[2]);

        // Displaying using for loop
        System.out.println("Printing using for loop");
        for (String student : students) {
            System.out.println(student);
        }
//            Normal for loop
//        for ( int i=0 ; i<students.length ; i++){
//            System.out.println(students[i]);
//        }

            // MultiDimensional Arrays

        int [][]flats = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 200;
        flats[1][1] = 201;
        flats[1][2] = 202;

        // Printing 2D Array
        for (int m=0 ; m<flats.length ; m++) {
            for (int n = 0; n < flats[m].length; n++) {
                System.out.print(flats[m][n]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
