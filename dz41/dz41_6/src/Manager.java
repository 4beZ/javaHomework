public class Manager extends Employer{
    double averageSum;

    Manager (double income, double averageSum) {
        this.income = income;
        this.averageSum = averageSum;
    }

    double getIncome () {
        return this.income + averageSum;
    }
}
