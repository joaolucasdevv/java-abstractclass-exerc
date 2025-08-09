package application;

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
        }



        sc.close();
    }

}
