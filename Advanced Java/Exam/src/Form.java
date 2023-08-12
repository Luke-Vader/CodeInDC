import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {

    private JButton button;
    private JLabel label;

    public static void main(String[] args){
        Form form = new Form();
        form.setTitle("Exam");
        form.setVisible(true);

        JButton button = new JButton("Click me!");
        form.add(button);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Hello world!");
            }
        });

    }

    public Form(){
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
    }


}
