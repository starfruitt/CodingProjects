import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting for employee's name
        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();

        // Prompting for hours worked in a week
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = scanner.nextDouble();

        // Prompting for hourly pay rate
        System.out.print("Enter hourly pay rate: ");
        double payRate = scanner.nextDouble();

        // Prompting for federal tax withholding rate
        System.out.print("Enter federal tax withholding rate (e.g., 0.20): ");
        double federalTaxRate = scanner.nextDouble();

        // Prompting for state tax withholding rate
        System.out.print("Enter state tax withholding rate (e.g., 0.09): ");
        double stateTaxRate = scanner.nextDouble();

        // Calculating gross pay
        double grossPay = hoursWorked * payRate;

        // Calculating deductions
        double federalWithholding = grossPay * federalTaxRate;
        double stateWithholding = grossPay * stateTaxRate;
        double totalDeductions = federalWithholding + stateWithholding;

        // Calculating net pay
        double netPay = grossPay - totalDeductions;

        // Displaying payroll statement
        System.out.println("\nEmployee Name: " + name);
        System.out.printf("Hours Worked: %.2f%n", hoursWorked);
        System.out.printf("Pay Rate: $%.2f%n", payRate);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.2f%%): $%.2f%n", federalTaxRate * 100, federalWithholding);
        System.out.printf("  State Withholding (%.2f%%): $%.2f%n", stateTaxRate * 100, stateWithholding);
        System.out.printf("  Total Deduction: $%.2f%n", totalDeductions);
        System.out.printf("Net Pay: $%.2f%n", netPay);

        // Close the scanner
        scanner.close();
    }
}