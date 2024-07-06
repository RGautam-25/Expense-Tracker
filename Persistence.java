import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Persistence {
    public void saveExpensesToFile(ExpenseEntry expenseEntry, String filename) {
        try (FileWriter writer = new FileWriter(new File(filename))) {
            for (Expense expense : expenseEntry.getExpenses()) {
                writer.write(expense.getDate() + "," + expense.getCategory() + "," + expense.getAmount() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ExpenseEntry loadExpensesFromFile(String filename) {
        ExpenseEntry expenseEntry = new ExpenseEntry();
        try {
            File file = new File(filename);
            if (file.exists()) {
                String[] lines = java.nio.file.Files.readAllLines(file.toPath()).toArray(new String[0]);
                for (String line : lines) {
                    String[] parts = line.split(",");
                    Expense expense = new Expense(parts[0], parts[1], Double.parseDouble(parts[2]));
                    expenseEntry.addExpense(expense);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return expenseEntry;
    }
}