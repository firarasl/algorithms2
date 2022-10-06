import java.util.Arrays;

public class Assignment4 {

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
            middle = array[size / 2][size / 2];
        }

        return rightDiogonalProduct * leftDiogonalProduct / middle;

    }

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

    public static void main(String[] args) {
        int[][] task1first= {{1,2,3}, {5,4,7}, {3,7,2}};
        System.out.println(productDiagonals(task1first, 3));
        int[][] test= {{}};
        System.out.println(productDiagonals(test, 0));
        int[][] task1second= {{1,2,3,4}, {5,6,7,8}, {9,7,4,2}, {2,2,2,1}};
        System.out.println(productDiagonals(task1second, 4));
        int[][] task1third= {{1,2,3,4,5}, {5,6,7,8,6}, {9,7,4,2,7}, {2,2,2,1,8}, {2,4,2,1,1}};

        System.out.println(productDiagonals(task1third, 5));


        System.out.println("-----------------------------");

        int[][] task2first= {{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
        System.out.println(Arrays.toString(search(task2first, 4,29)));
        int[][] task2second= {{10,20,30,40,50}, {15,25,35,45,52}, {27,29,37,48,55}, {32,33,39,50,56}, {32,33,39,50,60}};

        System.out.println(Arrays.toString(search(task2second,5,50)));
    }
}
