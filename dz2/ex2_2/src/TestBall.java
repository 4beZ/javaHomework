public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(2, 3);
        System.out.println("x = " + ball.getX());
        ball.setX(4);
        System.out.println("x = " + ball.getX());
        System.out.println("y = " + ball.getY());
        ball.setY(5);
        System.out.println("y = " + ball.getY());
        ball.setXY(1, 1);
        System.out.println("x = " + ball.getX() + " y = " + ball.getY());
        ball.move(5, -4);
        System.out.println(ball);
    }
}