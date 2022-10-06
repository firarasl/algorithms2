package assignment4;

//655778 Tanvir Ahmed

public class Task2 {
    public static int[] search(int[][] array, int size, int search) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] == search) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[0];
    }
}
