public class Main {
    public static void seasonLover (Seasons season) {
        switch (season) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }

    public static void main(String[] args) {
        Seasons summer = Seasons.SUMMER;

        System.out.println(summer);
        seasonLover(summer);

        for (Seasons s : Seasons.values()) {
            System.out.println(s);
        }
    }
}