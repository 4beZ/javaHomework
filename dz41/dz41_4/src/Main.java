public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix matrix = new Matrix();
        matrix.goNull();
        matrix = matrix1.sum(matrix2);
        System.out.println(matrix);
        matrix.multiplyByNumber(6);
        System.out.println(matrix);
    }
}