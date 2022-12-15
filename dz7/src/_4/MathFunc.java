package _4;

public class MathFunc implements MathCalculable{
    @Override
    public double power(double num, int power) {
        double res = 1;
        for (int i = 0; i < power; i++) {
            res *= num;
        }
        return res;
    }

    @Override
    public double complexModule(Complex num) {
        return Math.sqrt(Math.pow(num.img, 2) + Math.pow(num.real, 2));
    }

    public double circleLength (double radius) {
        return 2 * PI * radius;
    }
}
