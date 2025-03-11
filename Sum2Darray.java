package myjava.sum2darray;
public class Sum2Darray {

    public static void main(String[] args) {
        int[][] myArray = {
            {10, 20, 30},
            {45, 55, 65},
            {17, 18, 19}
                          };
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
        for (int j = 0; j < myArray[i].length; j++) {
         sum += myArray[i][j];
         }
        }
        System.out.println("Sum of all elements: " + sum);
   }
}

