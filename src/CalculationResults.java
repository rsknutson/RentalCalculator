import javax.swing.*;
import java.awt.*;

public class CalculationResults extends JFrame{
    
    public CalculationResults(String title, String address, double purchasePrice,
            double afterRepairValue, double closingCosts, double repairCosts, double percentDownPayment, double loanIR,
            int yearsAmortized, double grossMonthlyRent, double electricityExpense, double waterExpense, double garbageExpense,
            double hOA, double monthlyInsurance, double propertyTaxes, double vacancyRate, double repairsRate, double capEx,
            double propertyManagementRate)
    {
        
        setSize(1000,1000);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Results");
        Box resultsBox = Box.createVerticalBox();
        
        
        
        //Calculating Principle and Interest
        double pI;
        
        double r = loanIR/100/12; //monthly interest rate
        double n = yearsAmortized * 12; //number of payments
        double p = purchasePrice - (purchasePrice * (percentDownPayment / 100)); //amount borrowed or loan principle
        
        if (r == 0)
            pI = p/n;
        else
            pI = (r*p)/(1 - Math.pow((1+r), -n));
        
        
        //Calculating Monthly Expenses
        double monthlyExpenses = electricityExpense + waterExpense + garbageExpense + hOA + monthlyInsurance + propertyTaxes + (grossMonthlyRent*vacancyRate/100) + (grossMonthlyRent*repairsRate/100) + (grossMonthlyRent*capEx/100) + (grossMonthlyRent*propertyManagementRate/100);
        double totalMonthlyExpenses = monthlyExpenses + pI;
        
        
        //Calculating Cash Flow
        double cashFlow = grossMonthlyRent - totalMonthlyExpenses;
        
        
        //Calculating Total Cash Needed
        double totalCashNeeded = (closingCosts + repairCosts + (percentDownPayment * purchasePrice /100));
        
        
        //Calculating Cash on Cash Return
        double cashOnCashReturn = (cashFlow / totalCashNeeded * 100 * 12);
        
        
        //Calculating 50% Rule
        double fiftyPercentRule = (grossMonthlyRent * .5) - (pI);
    
        
        //Displaying Principle and Interest Calculations
        JPanel pIPanel = new JPanel();
        
        JLabel pILabel1 = new JLabel("Principle and Interest: ");
        pILabel1.setFont(new Font("Arial", Font.PLAIN, 40));
        pIPanel.add(pILabel1);
        
        JLabel pILabel2 = new JLabel("$" + Double.toString(pI));
        pILabel2.setFont(new Font("Arial", Font.BOLD, 40));
        pIPanel.add(pILabel2);
        
        resultsBox.add(pIPanel);
        
        
        //Displaying Monthly Expenses
        JPanel totalMonthlyExpensesPanel = new JPanel();
        
        JLabel totalMonthlyExpensesLabel1 = new JLabel("Monthly Expenses: ");
        totalMonthlyExpensesLabel1.setFont(new Font("Arial", Font.PLAIN, 40));
        totalMonthlyExpensesPanel.add(totalMonthlyExpensesLabel1);
        
        JLabel totalMonthlyExpensesLabel2 = new JLabel("$" + Double.toString(totalMonthlyExpenses));
        totalMonthlyExpensesLabel2.setFont(new Font("Arial", Font.BOLD, 40));
        totalMonthlyExpensesPanel.add(totalMonthlyExpensesLabel2);
        
        resultsBox.add(totalMonthlyExpensesPanel);
        
        
        //Displaying Cash on Cash Return
        JPanel cashOnCashReturnPanel = new JPanel();
        
        JLabel cashOnCashReturnLabel1 = new JLabel("Cash on Cash Return: ");
        cashOnCashReturnLabel1.setFont(new Font("Arial", Font.PLAIN, 40));
        cashOnCashReturnPanel.add(cashOnCashReturnLabel1);
        
        JLabel cashOnCashReturnLabel2 = new JLabel(Double.toString(cashOnCashReturn) + "%");
        cashOnCashReturnLabel2.setFont(new Font("Arial", Font.BOLD, 40));
        cashOnCashReturnPanel.add(cashOnCashReturnLabel2);
        
        resultsBox.add(cashOnCashReturnPanel);
        
        
        //Displaying Fifty percent Rule
        JPanel fiftyPercentRulePanel = new JPanel();
        
        JLabel fiftyPercentRuleLabel1 = new JLabel("Fifty Percent Rule: ");
        fiftyPercentRuleLabel1.setFont(new Font("Arial", Font.PLAIN, 40));
        fiftyPercentRulePanel.add(fiftyPercentRuleLabel1);
        
        JLabel fiftyPercentRuleLabel2 = new JLabel("$" + Double.toString(fiftyPercentRule));
        fiftyPercentRuleLabel2.setFont(new Font("Arial", Font.BOLD, 40));
        fiftyPercentRulePanel.add(fiftyPercentRuleLabel2);
        
        resultsBox.add(fiftyPercentRulePanel);
        
        
        //Displaying Monthly Cash Flow
        JPanel cashFlowPanel = new JPanel();
        
        JLabel cashFlowLabel1 = new JLabel("Monthly Cash Flow ");
        cashFlowLabel1.setFont(new Font("Arial", Font.PLAIN, 40));
        cashFlowPanel.add(cashFlowLabel1);
        
        JLabel cashFlowLabel2 = new JLabel("$" + Double.toString(cashFlow));
        cashFlowLabel2.setFont(new Font("Arial", Font.BOLD, 40));
        cashFlowPanel.add(cashFlowLabel2);
        
        resultsBox.add(cashFlowPanel);
        
        
        //Displaying Total Cash Needed
        JPanel totalCashNeededPanel = new JPanel();
        
        JLabel totalCashNeededLabel1 = new JLabel("Total Cash Needed: ");
        totalCashNeededLabel1.setFont(new Font("Arial", Font.PLAIN, 40));
        totalCashNeededPanel.add(totalCashNeededLabel1);
        
        JLabel totalCashNeededLabel2 = new JLabel("$" + Double.toString(totalCashNeeded));
        totalCashNeededLabel2.setFont(new Font("Arial", Font.BOLD, 40));
        totalCashNeededPanel.add(totalCashNeededLabel2);
        
        resultsBox.add(totalCashNeededPanel);
        
        
        this.add(resultsBox);
        setVisible(true);
    }
}

