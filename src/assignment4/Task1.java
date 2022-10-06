package assignment4;

//655778 Tanvir Ahmed

public class Task1 {
    public static int productDiagonals(int[][] array, int size) {
        if(size==0)
            return 0;

        int leftDiogonalProduct = 1;
        int rightDiogonalProduct = 1;
        int middle = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    leftDiogonalProduct *= array[i][j];
                }
                if (i + j == size - 1) {
                    rightDiogonalProduct *= array[i][j];
                }
            }
        }
        if (size % 2 != 0) {
            middle = array[size / 2][size  / 2];
        }

        return rightDiogonalProduct * leftDiogonalProduct / middle;

    }
}
