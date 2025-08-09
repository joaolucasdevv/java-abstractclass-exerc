package entities;

public class Company extends TaxPayer {

    private Integer employeesNumber;

    public Company() {
    }

    public Company(String name, Double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

}
