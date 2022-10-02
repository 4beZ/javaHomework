import javax.swing.*;
import javax.tools.JavaCompiler;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AddComputerGUI  extends JFrame {
    private JLabel name = new JLabel("Name: ");
    private JLabel processor = new JLabel("Processor: ");
    private JLabel motherBoard = new JLabel("Mother board: ");
    private JLabel price = new JLabel("Price: ");
    private JButton button = new JButton("Add new computer");
    private JTextField nameInput = new JTextField("", 5);
    private JTextField processorInput = new JTextField("", 5);
    private JTextField motherboardInput = new JTextField("", 5);
    private JTextField priceInput = new JTextField("", 5);
    Shop shop;

    public AddComputerGUI (Shop shop) {
        super("Add Computer");
        this.shop = shop;
        this.setBounds(300, 300, 300, 300);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5, 2, 2, 2));
        button.addActionListener(new ButtonEventListener());
        container.add(name);
        container.add(nameInput);
        container.add(processor);
        container.add(processorInput);
        container.add(motherBoard);
        container.add(motherboardInput);
        container.add(price);
        container.add(priceInput);
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            Computer comp = new Computer();
            comp.setProcessor(processorInput.getText());
            comp.setPrice(Integer.parseInt(priceInput.getText()));
            comp.setName(nameInput.getText());
            comp.setMotherBoard(motherboardInput.getText());
            shop.addComputer(comp);
            String message = "Computer Added";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
