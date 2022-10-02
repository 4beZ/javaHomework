public class Main {
    public static void main(String[] args) {
        String[] mas = {"Hello", "world", "I", "am", "Alex", "student"};
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < Math.round(mas.length/2); i++) {
            String buff = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = buff;
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}