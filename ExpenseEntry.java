import java.util.ArrayList;
import java.util.List;

public class ExpenseEntry {
    private List<Expense> expenses;

    public ExpenseEntry() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}