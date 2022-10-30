public class Employer {
    String firstName, lastName;
    double income = 0;

    Employer (double income) {
        this.income = income;
    }

    Employer () {

    }

    double getIncome () {
        return income;
    }
}
