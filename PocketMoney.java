import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PocketMoney extends JFrame {
    private final int SCREEN_WIDTH = 400;
    private final int SCREEN_HEIGHT = 300;

    private JLabel incomeLabel;
    private JLabel expenseLabel;
    private JLabel balanceLabel;

    private int income = 0;
    private int expense = 0;
    private int balance = 0;

    public PocketMoney() {
        super("Pocket Money");
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        incomeLabel = new JLabel("Income: " + income);
        expenseLabel = new JLabel("Expense: " + expense);
        balanceLabel = new JLabel("Balance: " + balance);

        JPanel inputPanel = new JPanel();
        JTextField amountField = new JTextField(10);
        JButton incomeButton = new JButton("Income");
        JButton expenseButton = new JButton("Expense");

        incomeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int amount = Integer.parseInt(amountField.getText());
                income += amount;
                balance += amount;

                incomeLabel.setText("Income: " + income);
                balanceLabel.setText("Balance: " + balance);

                amountField.setText("");
            }
        });

        expenseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int amount = Integer.parseInt(amountField.getText());
                expense += amount;
                balance -= amount;

                expenseLabel.setText("Expense: " + expense);
                balanceLabel.setText("Balance: " + balance);

                amountField.setText("");
            }
        });

        inputPanel.add(new JLabel("Amount: "));
        inputPanel.add(amountField);
        inputPanel.add(incomeButton);
        inputPanel.add(expenseButton);

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(3, 1));
        infoPanel.add(incomeLabel);
        infoPanel.add(expenseLabel);
        infoPanel.add(balanceLabel);

        add(inputPanel, BorderLayout.NORTH);
        add(infoPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new PocketMoney();
    }
}
