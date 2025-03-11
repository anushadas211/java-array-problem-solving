package myjava.mini.maxi2darray;
public class MiniMaxi2Darray {

    public static void main(String[] args) {
        int[][] myArray = {
            {25, 12, 3},
            {9, 22, 19},
            {7, 18, 2}
        };
        if (myArray.length == 0 || myArray[0].length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int largest = myArray[0][0];
        int smallest = myArray[0][0];

       for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] > largest) {
                    largest = myArray[i][j];
                }
                if (myArray[i][j] < smallest) {
                    smallest = myArray[i][j];
                }
            }
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
