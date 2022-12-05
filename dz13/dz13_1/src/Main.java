public class Main {
    public static void main(String[] args) {
        goOut("Hello");
        String str = "Bye";
        System.out.println(str.charAt(str.length() - 1));
        str = "Ends!!!";
        System.out.println(str.endsWith("!!!"));
        str = "I like cookies";
        System.out.println(str.startsWith("I like"));
        str = "Hello Java user";
        System.out.println(str.contains("Java"));
        str = "I like Java!!!";
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replaceAll("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(2, 11));
    }

    public static void goOut (String str) {
        System.out.println(str);
    }
}