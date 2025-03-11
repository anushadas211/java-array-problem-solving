package myjava.search.elementin2darray;
import java.util.Scanner;
public class SearchElementin2darray {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("Number " + target + " found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
  if (!found) {
            System.out.println("Number " + target + " not found in the array.");
        }

        scanner.close();
    }
}