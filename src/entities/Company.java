package entities;

public class Company extends TaxPayer {

    private Integer employeesNumber;

    public Company() {
    }

    public Company(String name, Double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double taxCalc() {
        double taxPaid = 0.0;
        if (employeesNumber > 10) {
            taxPaid = 14 * annualIncome / 100;
        }
        else {
            taxPaid = 16 * annualIncome / 100;
        }
        return taxPaid;
    }

}
