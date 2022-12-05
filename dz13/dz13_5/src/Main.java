public class Main {
    public static void main(String[] args) {
        String number = "+104289652211";
        String number2 = "84289652211";
        divideNumber(number2);
        divideNumber(number);
    }

    public static void divideNumber (String number) {
        String end = number.substring(number.length() - 10);
        if (number.startsWith("8")) {
            String code = "+7";
            System.out.println(code + " " + end.substring(0, 3) +
                    " " + end.substring(3, 6) + " " + end.substring(6, 10));
        }
        else {
            String code = number.substring(0, number.length() - 10);
            System.out.println(code + " " + end.substring(0, 3) +
                    " " + end.substring(3, 6) + " " + end.substring(6, 10));
        }
    }
}