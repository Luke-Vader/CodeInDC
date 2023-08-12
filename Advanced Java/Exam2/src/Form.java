import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Form extends JFrame {

    private JButton button1;
    private JPanel Main;

    public Form() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("This is easy");
                ResultSet resultSet;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "");
                    Statement statement = conn.createStatement();
                    // Result set get the result of the SQL query
                    resultSet = statement
                            .executeQuery("select * from mysql.help_category");
                    if (resultSet != null){
                        while(resultSet.next()){
                            System.out.println(resultSet.getString("name"));
                        }
                    }
                }catch (Exception exception){
                    System.out.println(exception.getMessage());
                    System.out.println("done");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setContentPane(new Form().Main);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setVisible(true);



        System.out.println("Hello");

    }
}
