import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
class Expense {
    private LocalDate date;
    private double amount;
    private String description;

    public Expense(LocalDate date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public LocalDate getDate() { return date; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }

    public String toCSV() {
        return date + "," + amount + "," + description;
    }

    public static Expense fromCSV(String line) {
        String[] parts = line.split(",");
        LocalDate date = LocalDate.parse(parts[0]);
        double amount = Double.parseDouble(parts[1]);
        String desc = parts[2];
        return new Expense(date, amount, desc);
    }
}
class ExpenseManager {
    List<Expense> a = new ArrayList<>();
    final String FILE_PATH = "expense.csv";

    public ExpenseManager() {
        loadExpenses();
    }

    public void addExpense(Expense e) {
        a.add(e);
        saveExpenses();
    }

    public void viewExpenses() {
        if (a.isEmpty()) {
            System.out.println("No expenses found.");
            return;
        }
        for (int i = 0; i < a.size(); i++) {
            Expense e = a.get(i);
            System.out.printf("%d. %s Rs.%.2f %s%n", i + 1, e.getDate(), e.getAmount(), e.getDescription());
        }
    }

    public void deleteExpense(int index) {
        if (index < 0 || index >= a.size()) {
            System.out.println("Invalid Index Entry.");
            return;
        }
        a.remove(index);
        saveExpenses();
    }

    public void loadExpenses() {
        a.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                a.add(Expense.fromCSV(line));
            }
        } catch (IOException e) {
            // handle file not found or empty
        }
    }

    public void saveExpenses() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Expense e : a) {
                writer.write(e.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Failed to save expenses.");
        }
    }

    public double totalExpense() {
        double total = 0;
        for (Expense e : a) {
            total += e.getAmount();
        }
        return total;
    }
}
class Main {
    public static void main(String[] args) 
    {
        ExpenseManager manager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\n--- Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4. View Total Expense");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Date (yyyy-mm-dd): ");
                    LocalDate date = LocalDate.parse(scanner.nextLine());

                    System.out.print("Amount: ₹");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Description: ");
                    String desc = scanner.nextLine();

                    manager.addExpense(new Expense(date, amount, desc));
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    System.out.print("Enter index to delete: ");
                    int idx = scanner.nextInt();
                    manager.deleteExpense(idx - 1);
                    break;

                case 4
                    System.out.println("Total spent: ₹" + manager.totalExpense());
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
                scanner.close();
            }
        }
    }
}
