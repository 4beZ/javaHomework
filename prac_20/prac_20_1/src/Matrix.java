public class Matrix {
    public static <T extends Number, V extends Number> double[][] sum(T[][] a, V[][] b) {
        if (a.length != b.length || a[0].length != b[0].length)
            return null;

        double[][] res = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[i][j] = a[i][j].doubleValue() + b[i][j].doubleValue();
            }
        }
        return res;
    }

    public static <T extends Number, V extends Number> double[][] subtract(T[][] a, V[][] b) {
        if (a.length != b.length || a[0].length != b[0].length)
            return null;

        double[][] res = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                res[i][j] = a[i][j].doubleValue() - b[i][j].doubleValue();
            }
        }
        return res;
    }

    public static <T extends Number, V extends Number> double[][] mult(T[][] a, V[][] b) {
        if (a[0].length != b.length)
            return null;

        double[][] res = new double[a.length][b[0].length];

        for (int i = 0; i < b[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                double num = 0;
                for (int k = 0; k < a[0].length; k++) {
                    System.out.println(i + " " + j + " " + k);
                    num += a[i][k].doubleValue() * b[k][j].doubleValue();
                }
                res[i][j] = num;
            }
        }
        return res;
    }
}
