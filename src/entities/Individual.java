package entities;

public class Individual extends TaxPayer {

    private Double healthSpending;

    public Individual() {
    }

    public Individual(String name, Double annualIncome, Double healthSpending) {
        super(name, annualIncome);
        this.healthSpending = healthSpending;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    @Override
    public Double taxCalc() {
        double taxPaid = 0.0;
        if (annualIncome < 20000.00) {
            taxPaid = 15 * annualIncome / 100;
            if (healthSpending != 0.0) {
                double healthDiscount = 50 * healthSpending / 100;
                taxPaid -= healthDiscount;
            }
        }
        else {
            taxPaid = 25 * annualIncome / 100;
            if (healthSpending != 0.0) {
                double healthDiscount = 50 * healthSpending / 100;
                taxPaid -= healthDiscount;
            }
        }
        return taxPaid;
    }

}
