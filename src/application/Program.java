package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char resp = sc.next().charAt(0);
            if (resp == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Annual income: ");
                double annualIncome = sc.nextDouble();

                System.out.print("Health expenditures: ");
                double healthSpending = sc.nextDouble();

                TaxPayer taxPayer = new Individual(name, annualIncome, healthSpending);
                taxPayers.add(taxPayer);
            }
            else if (resp == 'c') {
                System.out.print("Company name: ");
                String name = sc.nextLine();

                System.out.print("Annual income: ");
                double annualIncome = sc.nextDouble();

                System.out.print("Number of employees: ");
                int employeesNumber = sc.nextInt();

                TaxPayer taxPayer = new Company(name, annualIncome, employeesNumber);
                taxPayers.add(taxPayer);
            }
        }

        System.out.println("TAXES PAID");
        double sum = 0.0;
        for (TaxPayer taxpaid : taxPayers) {
            System.out.printf("%s: $ %.2f%n", taxpaid.getName(), taxpaid.taxCalc());
            sum += taxpaid.taxCalc();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);

        sc.close();
    }

}
