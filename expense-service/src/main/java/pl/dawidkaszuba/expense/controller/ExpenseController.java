package pl.dawidkaszuba.expense.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.dawidkaszuba.expense.entity.Expense;
import pl.dawidkaszuba.expense.responseTemplate.ResponseTemplateUserWithExpenses;
import pl.dawidkaszuba.expense.service.ExpenseService;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/")
    public Expense saveExpense(@RequestBody Expense expense) {
        return expenseService.saveExpense(expense);
    }

    @GetMapping("/{id}")
    public Expense getExpense(@PathVariable("id")  Long id) {
        return expenseService.findExpenseById(id);
    }
    @GetMapping("/user/{id}")
    public ResponseTemplateUserWithExpenses getUserExpenses(@PathVariable("id") Long id) {
        return expenseService.findExpensesByUserId(id);
    }
}
