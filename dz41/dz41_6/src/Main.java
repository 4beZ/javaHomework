public class Main {
    public static void main(String[] args) {
        Employer manager = new Manager(150.5, 20);
        Employer employer = new Employer(200);
        Employer[] employers = {manager, employer};

        for (Employer e : employers) {
            System.out.println(e.getIncome());
        }
    }
}