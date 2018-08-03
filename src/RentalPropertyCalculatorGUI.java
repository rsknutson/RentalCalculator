import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RentalPropertyCalculatorGUI extends JFrame{

    public static void main(String[] args) {
        
        new RentalPropertyCalculatorGUI();

    }
    
    JButton calculateResults;
    
    JTextField titleTextField; 
    JTextField addressTextField;
    JTextField purchasePriceTextField;
    JTextField afterRepairValueTextField;
    JTextField closingCostsTextField;
    JTextField repairCostsTextField;
    JTextField percentDownPaymentTextField;
    JTextField loanIRTextField;
    JTextField yearsAmortizedTextField;
    JTextField electricityExpenseTextField;
    JTextField grossMonthlyRentTextField;
    JTextField waterExpenseTextField;
    JTextField garbageExpenseTextField;
    JTextField hOATextField;
    JTextField monthlyInsuranceTextField;
    JTextField propertyTaxesTextField;
    JTextField vacancyRateTextField;
    JTextField repairsRateTextField;
    JTextField capExTextField;
    JTextField propertyManagementRateTextField;
    
    JLabel titleLabel;
    JLabel addressLabel;
    JLabel purchasePriceLabel;
    JLabel afterRepairValueLabel;
    JLabel closingCostsLabel;
    JLabel repairCostsLabel;
    JLabel percentDownPaymentLabel;
    JLabel loanIRLabel;
    JLabel yearsAmortizedLabel;
    JLabel grossMonthlyRentLabel;
    JLabel electricityExpenseLabel;
    JLabel waterExpenseLabel;
    JLabel garbageExpenseLabel;
    JLabel hOALabel;
    JLabel monthlyInsuranceLabel;
    JLabel propertyTaxesLabel;
    JLabel vacancyRateLabel;
    JLabel repairsRateLabel;
    JLabel capExLabel;
    JLabel propertyManagementRateLabel;
    
    private String title;
    private String address;
    private double purchasePrice;
    private double afterRepairValue;
    private double closingCosts;
    private double repairCosts;
    private double    percentDownPayment;
    private double loanIR;
    private int yearsAmortized;
    private double grossMonthlyRent;
    private double electricityExpense;
    private double waterExpense;
    private double garbageExpense;
    private double hOA;
    private double monthlyInsurance;
    private double propertyTaxes;
    private double vacancyRate;
    private double repairsRate;
    private double capEx;
    private double propertyManagementRate;
    
    public RentalPropertyCalculatorGUI(){
        
        this.setSize(1000,1000);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        Dimension dim = tk.getScreenSize();
        
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        
        this.setLocation(xPos, yPos);
        
        this.setResizable(true);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setTitle("Rental Property Calculator");
        
        Box mainBox = Box.createVerticalBox();
        
        //Title
        JPanel titlePanel = new JPanel(); 
        
        titleLabel = new JLabel("Property Title: ");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        titlePanel.add(titleLabel);
        
        titleTextField = new JTextField("", 25);
        titleTextField.setPreferredSize(new Dimension(100,50));
        titleTextField.setFont(new Font("Arial", Font.PLAIN, 25));
        titlePanel.add(titleTextField);
        
        mainBox.add(titlePanel);
        
        //Address
        JPanel addressPanel = new JPanel();
        
        addressLabel = new JLabel("Property Address: ");        
        addressLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        addressPanel.add(addressLabel);
        
        addressTextField = new JTextField("", 20);    
        addressTextField.setPreferredSize(new Dimension(100,50));        
        addressTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        addressPanel.add(addressTextField);
        
        mainBox.add(addressPanel);
        
        //Purchase Price
        JPanel purchasePricePanel = new JPanel();
        
        purchasePriceLabel = new JLabel("Purchase Price: ");        
        purchasePriceLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        purchasePricePanel.add(purchasePriceLabel);
        
        purchasePriceTextField = new JTextField("", 20);    
        purchasePriceTextField.setPreferredSize(new Dimension(100,50));        
        purchasePriceTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        purchasePricePanel.add(purchasePriceTextField);
        
        mainBox.add(purchasePricePanel);
        
        //afterRepairValue
        JPanel afterRepairValuePanel = new JPanel();
        
        afterRepairValueLabel = new JLabel("After Repair Value: ");        
        afterRepairValueLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        afterRepairValuePanel.add(afterRepairValueLabel);
        
        afterRepairValueTextField = new JTextField("", 20);    
        afterRepairValueTextField.setPreferredSize(new Dimension(100,50));        
        afterRepairValueTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        afterRepairValuePanel.add(afterRepairValueTextField);
        
        mainBox.add(afterRepairValuePanel);
        
        //Closing Costs
        JPanel closingCostsPanel = new JPanel();
        
        closingCostsLabel = new JLabel("Closing Costs: ");        
        closingCostsLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        closingCostsPanel.add(closingCostsLabel);
        
        closingCostsTextField = new JTextField("", 20);    
        closingCostsTextField.setPreferredSize(new Dimension(100,50));        
        closingCostsTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        closingCostsPanel.add(closingCostsTextField);
        
        mainBox.add(closingCostsPanel);
        
        //Repair Costs
        JPanel repairCostsPanel = new JPanel();
        
        repairCostsLabel = new JLabel("Repair Costs: ");        
        repairCostsLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        repairCostsPanel.add(repairCostsLabel);
        
        repairCostsTextField = new JTextField("", 20);    
        repairCostsTextField.setPreferredSize(new Dimension(100,50));        
        repairCostsTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        repairCostsPanel.add(repairCostsTextField);
        
        mainBox.add(repairCostsPanel);
        
        //percentDownPayment
        JPanel percentDownPaymentPanel = new JPanel();
        
        percentDownPaymentLabel = new JLabel("Down Payment(%): ");        
        percentDownPaymentLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        percentDownPaymentPanel.add(percentDownPaymentLabel);
        
        percentDownPaymentTextField = new JTextField("", 20);    
        percentDownPaymentTextField.setPreferredSize(new Dimension(100,50));        
        percentDownPaymentTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        percentDownPaymentPanel.add(percentDownPaymentTextField);
        
        mainBox.add(percentDownPaymentPanel);
        
        //loanIR
        JPanel loanIRPanel = new JPanel();
        
        loanIRLabel = new JLabel("Loan IR(%): ");        
        loanIRLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        loanIRPanel.add(loanIRLabel);
        
        loanIRTextField = new JTextField("", 20);    
        loanIRTextField.setPreferredSize(new Dimension(100,50));        
        loanIRTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        loanIRPanel.add(loanIRTextField);
        
        mainBox.add(loanIRPanel);
        
        //yearsAmortized
        JPanel yearsAmortizedPanel = new JPanel();
        
        yearsAmortizedLabel = new JLabel("Loan Years Amortized: ");        
        yearsAmortizedLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        yearsAmortizedPanel.add(yearsAmortizedLabel);
        
        yearsAmortizedTextField = new JTextField("", 20);    
        yearsAmortizedTextField.setPreferredSize(new Dimension(100,50));        
        yearsAmortizedTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        yearsAmortizedPanel.add(yearsAmortizedTextField);
        
        mainBox.add(yearsAmortizedPanel);
        
        //grossMonthlyRent
        JPanel grossMonthlyRentPanel = new JPanel();
        
        grossMonthlyRentLabel = new JLabel("Gross Monthly Rent: ");        
        grossMonthlyRentLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        grossMonthlyRentPanel.add(grossMonthlyRentLabel);
        
        grossMonthlyRentTextField = new JTextField("", 20);    
        grossMonthlyRentTextField.setPreferredSize(new Dimension(100,50));        
        grossMonthlyRentTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        grossMonthlyRentPanel.add(grossMonthlyRentTextField);
        
        mainBox.add(grossMonthlyRentPanel);
        
        //electricityExpense
        JPanel electricityExpensePanel = new JPanel();
        
        electricityExpenseLabel = new JLabel("Electricity Expense: ");        
        electricityExpenseLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        electricityExpensePanel.add(electricityExpenseLabel);
        
        electricityExpenseTextField = new JTextField("", 20);    
        electricityExpenseTextField.setPreferredSize(new Dimension(100,50));        
        electricityExpenseTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        electricityExpensePanel.add(electricityExpenseTextField);
        
        mainBox.add(electricityExpensePanel);
        
        //waterExpense
        JPanel waterExpensePanel = new JPanel();
        
        waterExpenseLabel = new JLabel("Water Expense: ");        
        waterExpenseLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        waterExpensePanel.add(waterExpenseLabel);
        
        waterExpenseTextField = new JTextField("", 20);    
        waterExpenseTextField.setPreferredSize(new Dimension(100,50));        
        waterExpenseTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        waterExpensePanel.add(waterExpenseTextField);
        
        mainBox.add(waterExpensePanel);
        
        //garbageExpense
        JPanel garbageExpensePanel = new JPanel();
        
        garbageExpenseLabel = new JLabel("Garbage Expense: ");        
        garbageExpenseLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        garbageExpensePanel.add(garbageExpenseLabel);
        
        garbageExpenseTextField = new JTextField("", 20);    
        garbageExpenseTextField.setPreferredSize(new Dimension(100,50));        
        garbageExpenseTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        garbageExpensePanel.add(garbageExpenseTextField);
        
        mainBox.add(garbageExpensePanel);
        
        //hOA
        JPanel hOAPanel = new JPanel();
        
        hOALabel = new JLabel("HOA Expense: ");        
        hOALabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        hOAPanel.add(hOALabel);
        
        hOATextField = new JTextField("", 20);    
        hOATextField.setPreferredSize(new Dimension(100,50));        
        hOATextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        hOAPanel.add(hOATextField);
        
        mainBox.add(hOAPanel);
        
        //monthlyInsurance
        JPanel monthlyInsurancePanel = new JPanel();
        
        monthlyInsuranceLabel = new JLabel("Monthly Insurance: ");        
        monthlyInsuranceLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        monthlyInsurancePanel.add(monthlyInsuranceLabel);
        
        monthlyInsuranceTextField = new JTextField("", 20);    
        monthlyInsuranceTextField.setPreferredSize(new Dimension(100,50));        
        monthlyInsuranceTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        monthlyInsurancePanel.add(monthlyInsuranceTextField);
        
        mainBox.add(monthlyInsurancePanel);
        
        //propertyTaxes
        JPanel propertyTaxesPanel = new JPanel();
        
        propertyTaxesLabel = new JLabel("Monthly Property Taxes: ");        
        propertyTaxesLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        propertyTaxesPanel.add(propertyTaxesLabel);
        
        propertyTaxesTextField = new JTextField("", 20);    
        propertyTaxesTextField.setPreferredSize(new Dimension(100,50));        
        propertyTaxesTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        propertyTaxesPanel.add(propertyTaxesTextField);
        
        mainBox.add(propertyTaxesPanel);
        
        //vacancyRate
        JPanel vacancyRatePanel = new JPanel();
        
        vacancyRateLabel = new JLabel("Vacancy Rate(%): ");        
        vacancyRateLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        vacancyRatePanel.add(vacancyRateLabel);
        
        vacancyRateTextField = new JTextField("", 20);    
        vacancyRateTextField.setPreferredSize(new Dimension(100,50));        
        vacancyRateTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        vacancyRatePanel.add(vacancyRateTextField);
        
        mainBox.add(vacancyRatePanel);
        
        //repairsRate
        JPanel repairsRatePanel = new JPanel();
        
        repairsRateLabel = new JLabel("Repairs Rate(%): ");        
        repairsRateLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        repairsRatePanel.add(repairsRateLabel);
        
        repairsRateTextField = new JTextField("", 20);    
        repairsRateTextField.setPreferredSize(new Dimension(100,50));        
        repairsRateTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        repairsRatePanel.add(repairsRateTextField);
        
        mainBox.add(repairsRatePanel);
        
        //capEx
        JPanel capExPanel = new JPanel();
        
        capExLabel = new JLabel("Capital Expenditures(%): ");        
        capExLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        capExPanel.add(capExLabel);
        
        capExTextField = new JTextField("", 20);    
        capExTextField.setPreferredSize(new Dimension(100,50));        
        capExTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        capExPanel.add(capExTextField);
        
        mainBox.add(capExPanel);
        
        //propertyManagementRate
        JPanel propertyManagementRatePanel = new JPanel();
        
        propertyManagementRateLabel = new JLabel("Property Management Rate(%): ");        
        propertyManagementRateLabel.setFont(new Font("Arial", Font.PLAIN, 12));    
        propertyManagementRatePanel.add(propertyManagementRateLabel);
        
        propertyManagementRateTextField = new JTextField("", 20);    
        propertyManagementRateTextField.setPreferredSize(new Dimension(100,50));        
        propertyManagementRateTextField.setFont(new Font("Arial", Font.PLAIN, 12));    
        propertyManagementRatePanel.add(propertyManagementRateTextField);
        
        mainBox.add(propertyManagementRatePanel);
        
        //button
        calculateResults = new JButton("Calculate Results");
        calculateResults.setPreferredSize(new Dimension(100,80));
        calculateResults.setFont(new Font("Arial", Font.PLAIN, 30));
        ListenForButton lForButton = new ListenForButton();
        
        calculateResults.addActionListener(lForButton);
        
        mainBox.add(calculateResults);
        
        //adds the box to the JFrame
        this.add(mainBox);
        
        this.setVisible(true);
        
        
    }

    private class ListenForButton implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            
            if (e.getSource() == calculateResults){
                
                try{
                    purchasePrice = Double.parseDouble(purchasePriceTextField.getText());
                    afterRepairValue = Double.parseDouble(afterRepairValueTextField.getText());
                    closingCosts = Double.parseDouble(closingCostsTextField.getText());
                    repairCosts = Double.parseDouble(repairCostsTextField.getText());
                    percentDownPayment = Double.parseDouble(percentDownPaymentTextField.getText());
                    loanIR = Double.parseDouble(loanIRTextField.getText());
                    yearsAmortized = Integer.parseInt(yearsAmortizedTextField.getText());
                    grossMonthlyRent = Double.parseDouble(grossMonthlyRentTextField.getText());
                    electricityExpense = Double.parseDouble(electricityExpenseTextField.getText());
                    waterExpense = Double.parseDouble(waterExpenseTextField.getText());
                    garbageExpense = Double.parseDouble(garbageExpenseTextField.getText());
                    hOA = Double.parseDouble(hOATextField.getText());
                    monthlyInsurance = Double.parseDouble(monthlyInsuranceTextField.getText());
                    propertyTaxes = Double.parseDouble(propertyTaxesTextField.getText());
                    vacancyRate = Double.parseDouble(vacancyRateTextField.getText());
                    repairsRate = Double.parseDouble(repairsRateTextField.getText());
                    capEx = Double.parseDouble(capExTextField.getText());
                    propertyManagementRate = Double.parseDouble(propertyManagementRateTextField.getText());
                }
                
                catch(NumberFormatException excep){
                    JOptionPane.showMessageDialog(RentalPropertyCalculatorGUI.this, "Incorrect Information Type", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                title = titleTextField.getText();
                address = addressTextField.getText();
                purchasePrice = Double.parseDouble(purchasePriceTextField.getText());
                afterRepairValue = Double.parseDouble(afterRepairValueTextField.getText());
                closingCosts = Double.parseDouble(closingCostsTextField.getText());
                repairCosts = Double.parseDouble(repairCostsTextField.getText());
                percentDownPayment = Double.parseDouble(percentDownPaymentTextField.getText());
                loanIR = Double.parseDouble(loanIRTextField.getText());
                yearsAmortized = Integer.parseInt(yearsAmortizedTextField.getText());
                grossMonthlyRent = Double.parseDouble(grossMonthlyRentTextField.getText());
                electricityExpense = Double.parseDouble(electricityExpenseTextField.getText());
                waterExpense = Double.parseDouble(waterExpenseTextField.getText());
                garbageExpense = Double.parseDouble(garbageExpenseTextField.getText());
                hOA = Double.parseDouble(hOATextField.getText());
                monthlyInsurance = Double.parseDouble(monthlyInsuranceTextField.getText());
                propertyTaxes = Double.parseDouble(propertyTaxesTextField.getText());
                vacancyRate = Double.parseDouble(vacancyRateTextField.getText());
                repairsRate = Double.parseDouble(repairsRateTextField.getText());
                capEx = Double.parseDouble(capExTextField.getText());
                propertyManagementRate = Double.parseDouble(propertyManagementRateTextField.getText());
                
                CalculationResults cR = new CalculationResults(title, address,  purchasePrice,
                         afterRepairValue, closingCosts, repairCosts, percentDownPayment, loanIR,
                         yearsAmortized, grossMonthlyRent, electricityExpense, waterExpense, garbageExpense,
                         hOA, monthlyInsurance, propertyTaxes, vacancyRate, repairsRate, capEx,
                         propertyManagementRate);
                
            }
            
            }
        

    }

}
    

