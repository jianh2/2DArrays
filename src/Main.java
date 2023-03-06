import java.util.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        String[][] seatingChart = new String[3][4];
        seatingChart[0][0] = "Abby";
        seatingChart[0][1] = "Don";
        seatingChart[0][2] = "George";
        seatingChart[0][3] = "Kim";
        seatingChart[1][0] = "Brian";
        seatingChart[1][1] = "Eleanor";
        seatingChart[1][2] = "Harry";
        seatingChart[1][3] = "Lenny";
        seatingChart[2][0] = "Cathy";
        seatingChart[2][1] = "Fred";
        seatingChart[2][2] = "Jill";
        seatingChart[2][3] = "Matt";

        seatingChart[1][2] = "Paul";
        String temp = seatingChart[2][3];
        seatingChart[2][3] = seatingChart[0][0];
        seatingChart[0][0] = temp;
        for (String[] innerArr : seatingChart) {
            System.out.println(Arrays.toString(innerArr));
        }
        System.out.println(seatingChart[0][2] + seatingChart[2][0]);
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][0] = 6;
    }
//The code will print GeorgeCathy

    //The code will print out 6
}
