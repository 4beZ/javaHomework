import javax.swing.*;
import javax.tools.JavaCompiler;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUI  extends JFrame {
    private JButton button = new JButton("Add new computer");
    private JButton shopButton = new JButton("Show shop");
    private JTextField input = new JTextField("", 5);
    private JTextField findComputerInput = new JTextField("", 5);
    private JButton delete_computer = new JButton("Delete computer");
    private JButton find_computer = new JButton("Find computer");
    private JLabel labelNull = new JLabel("");

    Shop shop;

    public GUI (Shop shop) {
        super("Computer Shop");
        this.shop = shop;
        this.setBounds(300, 300, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4, 2, 10, 10));
        button.addActionListener(new ButtonEventListener());
        delete_computer.addActionListener(new DeleteListener());
        shopButton.addActionListener(new ShopShowListener());
        find_computer.addActionListener(new FindComputerListener());
        container.add(button);
        container.add(labelNull);
        container.add(delete_computer);
        container.add(input);
        container.add(find_computer);
        container.add(findComputerInput);
        container.add(shopButton);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            AddComputerGUI addGUI = new AddComputerGUI(shop);
            addGUI.setVisible(true);
        }
    }

    class FindComputerListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message = shop.findComputer(findComputerInput.getText());
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }

    class ShopShowListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message = shop.toString();
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }

    class DeleteListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message;
            if(shop.deleteComputer(input.getText())) {
                message = "Computer removed successfully!";
            }
            else
                message = "Haven't found computer with name \"" + input.getText() + "\"";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
