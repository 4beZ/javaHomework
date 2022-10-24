public class Matrix {
    double[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8 ,9}};
    int cols = 3;
    int rows = 3;

    Matrix sum (Matrix matrix1) {
        Matrix matrix = new Matrix();
        matrix.goNull();
        if ((matrix1.rows == rows) && (matrix1.cols == cols)) {
            for (int i = 0; i < matrix1.rows; i++) {
                for (int j = 0; j < matrix1.cols; j++) {
                    matrix.numbers[i][j] = matrix1.numbers[i][j] + numbers[i][j];
                }
            }
        }
        return matrix;
    }

    void multiplyByNumber (int num) {
        Matrix matrix = new Matrix();
        matrix.goNull();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    numbers[i][j] = numbers[i][j] * num;
                }
            }
    }

    public void goNull () {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = 0;
            }
        }
    }

    public String toString () {
        String result = "";
        for (double[] d : numbers)
        {
            for (double num : d) {
                result += num + " ";
            }
            result += "\n";
        }
        return result;
    }
}
