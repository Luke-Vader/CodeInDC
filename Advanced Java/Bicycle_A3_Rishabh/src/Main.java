import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main implements ActionListener, ItemListener {

    //UI elements
    public static JFrame frame;
    public static JLabel labelCustomerName;
    public static JLabel labelNumber;

    public static JTextField tfCustomerName;
    public static JTextField tfNumberOfDays;


    //model class
    static Bicycle bicycle;
    private JTextField textField1;
    private JTextField textField2;

    public static void main(String[] args) {

        //initialising the bicycle object
        bicycle = new Bicycle();
        Form form = new Form();
//        SwingUtilities.invokeLater(Main::startApp);
    }

    private static void startApp() {
        frame = new JFrame("Bicycle Exercise");
        frame.setLayout(new GridLayout(6,10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //panel to get details
        JPanel panelInput = new JPanel();
        panelInput.setLayout(new GridLayout(2, 10));

        labelCustomerName = new JLabel("Customer Name");
        tfCustomerName = new JTextField();
        labelNumber = new JLabel("Number of Days");
        tfNumberOfDays = new JTextField();

        panelInput.add(labelCustomerName);
        panelInput.add(tfCustomerName);
        panelInput.add(labelNumber);
        panelInput.add(tfNumberOfDays);



        frame.add(panelInput);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}