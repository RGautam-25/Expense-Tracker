import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExpenseListing {
    private ExpenseEntry expenseEntry;

    public ExpenseListing(ExpenseEntry expenseEntry) {
        this.expenseEntry = expenseEntry;
    }

    public void displayExpenses() {
        for (Expense expense : expenseEntry.getExpenses()) {
            System.out.println("Date: " + expense.getDate() + ", Category: " + expense.getCategory() + ", Amount: "
                    + expense.getAmount());
        }
    }

    public void sortExpensesByDate() {
        Collections.sort(expenseEntry.getExpenses(), new Comparator<Expense>() {
            @Override
            public int compare(Expense e1, Expense e2) {
                return e1.getDate().compareTo(e2.getDate());
            }
        });
    }

    public void filterExpensesByCategory(String category) {
        for (Expense expense : expenseEntry.getExpenses()) {
            if (expense.getCategory().equals(category)) {
                System.out.println("Date: " + expense.getDate() + ", Category: " + expense.getCategory() + ", Amount: "
                        + expense.getAmount());
            }
        }
    }
}