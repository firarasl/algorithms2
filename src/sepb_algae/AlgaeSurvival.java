package sepb_algae;

public class AlgaeSurvival {
    static int[][] array;
    static int rows, cols;

    public AlgaeSurvival(int n, int m) {
        this.rows = n;
        this.cols=m;
        array= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j]=0;
            }
        }
    }

    public static void setLivingCell(int row, int column){
        array[row][column] = 1;
    }

    public static int countLivingNeighbours(int row, int col) {
        int aliveNeighbours = 0;
        //if location doesnt exist
        if (row >= rows || col >= cols || row < 0 || col < 0) {
            return 0;
        }

        for (int startRow = row == 0 ? 0 : row - 1; startRow < row + 2 && startRow < rows; startRow++) {
            for (int startCol = col == 0 ? 0 : col - 1; startCol < col + 2 && startCol < cols; startCol++) {
                if (array[startRow][startCol] == 1) {
                    aliveNeighbours++;
                }

            }
        }            return aliveNeighbours;

    }

public static int[][] computeNextGeneration(){

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
             if(countLivingNeighbours(i,j) <2){
                 // if alive neighbours less than 2 then kill the cell
                 array[i][j]=0;
             }
             else if(countLivingNeighbours(i,j) > 3){
                 // if alive neighbours more than 3 then kill the cell
                 array[i][j]=0;
             }
             else if(countLivingNeighbours(i,j) == 3){
                 // if alive neighbours exactly 3 living neighbours then it should live
                 array[i][j]=1;
             }
            }

        } return array;


    }

    }
