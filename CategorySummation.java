import java.util.HashMap;
import java.util.Map;

public class CategorySummation {
    private ExpenseEntry expenseEntry;

    public CategorySummation(ExpenseEntry expenseEntry) {
        this.expenseEntry = expenseEntry;
    }

    public void displayCategorySummation() {
        Map<String, Double> categorySummation = new HashMap<>();
        for (Expense expense : expenseEntry.getExpenses()) {
            if (categorySummation.containsKey(expense.getCategory())) {
                categorySummation.put(expense.getCategory(),
                        categorySummation.get(expense.getCategory()) + expense.getAmount());
            } else {
                categorySummation.put(expense.getCategory(), expense.getAmount());
            }
        }
        for (Map.Entry<String, Double> entry : categorySummation.entrySet()) {
            System.out.println("Category: " + entry.getKey() + ", Total: " + entry.getValue());
        }
    }
}