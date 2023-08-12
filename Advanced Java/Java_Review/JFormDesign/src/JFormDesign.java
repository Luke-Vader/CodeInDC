import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * Created by JFormDesigner on Thu Aug 10 10:01:58 PDT 2023
 */



/**
 * @author 300359473
 */
public class JFormDesign extends JFrame {
    public JFormDesign() throws SQLException, ClassNotFoundException {
        initComponents();
    }

    private void employeeMouseClicked(MouseEvent e)
    {
        Double income= 0.0, tax = 0.0, afterTax = 0.0;

        DefaultTableModel df = (DefaultTableModel) employee.getModel();
        int index1 = employee.getSelectedRow();

        txtEmpNum.setText(df.getValueAt(index1,0).toString());
        txtNameEmp.setText(df.getValueAt(index1,1).toString());
        txtMonthlyInc.setText(df.getValueAt(index1,2).toString());
        txtIncome.setText(df.getValueAt(index1,2).toString());


        String option = df.getValueAt(index1,3).toString();


        income =Double.parseDouble(txtIncome.getText());

        if(option.equals("Single"))
        {
            btnSingle.setSelected(true);
            tax = income * 0.15;
            afterTax = income-tax;
        }
        if(option.equals("Married"))
        {
            btnMarried.setSelected(true);
            tax = income * 0.10;
            afterTax = income-tax;
        }

        String memberType = df.getValueAt(index1,4).toString();


        if(memberType.equals("Yes"))
        {
            chkMember.setSelected(true);
            afterTax = (income-tax) - 100;
        }
        else {
            chkMember.setSelected(false);
            afterTax = income -tax;
        }

        txtTax.setText(String.valueOf(tax));
        txtAfterTax.setText(String.valueOf(afterTax));



    }


    private void btnAdd(ActionEvent e) throws SQLException {
        String empNum, name, status = "", memberType;
        Double monthlyIncome = 0.0;



            if(txtEmpNum.getText().equals("") || txtNameEmp.getText().equals("") || txtMonthlyInc.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter value");
                return;
            }

            try
            {
                monthlyIncome = Double.valueOf(txtMonthlyInc.getText());
            }
            catch(NumberFormatException s)
            {
                JOptionPane.showMessageDialog(null,"Enter a numeric data.");
                txtMonthlyInc.setText("");
                return;
            }

            empNum = txtEmpNum.getText();
            name = txtNameEmp.getText();










        String quer1 = "SELECT * from employee where Emp_number=?";
        PreparedStatement query = conobj.prepareStatement(quer1);
        query.setString(1,empNum);

        ResultSet rs = query.executeQuery();

        if(rs.isBeforeFirst())
        {
            JOptionPane.showMessageDialog(null, "The employee number already exists!");
            txtEmpNum.setText("");
            txtNameEmp.setText("");
            txtIncome.setText("");
            txtEmpNum.requestFocus();
            return;
        }
        if(btnSingle.isSelected())
        {
            status = "Single";
        }
        if(btnMarried.isSelected())
        {
            status = "Married";
        }

        if(chkMember.isSelected())
        {
            memberType = "Yes";
        }
        else {
            memberType="No";
        }

        String quer2 = "INSERT INTO employee VALUES (?,?,?,?,?)";
        query = conobj.prepareStatement(quer2);

        query.setString(1,empNum);
        query.setString(2,name);
        query.setDouble(3,monthlyIncome);
        query.setString(4,status);
        query.setString(5,memberType);

        query.executeUpdate();
        JOptionPane.showMessageDialog(null,"One record added.");
        updateTable();

        txtIncome.setText("");
        txtTax.setText("");
        txtAfterTax.setText("");
    }

    private void btnEditMouseClicked(MouseEvent e) throws SQLException {
        DefaultTableModel df = (DefaultTableModel) employee.getModel();
        int index1 = employee.getSelectedRow();

        String empNum, name, status="", memberType;
        Double monthlyIncome =0.0;

        empNum = txtEmpNum.getText();
        name = txtNameEmp.getText();
        monthlyIncome = Double.valueOf(txtMonthlyInc.getText());

        if(btnSingle.isSelected())
        {
            status = "Single";
        }
        if(btnMarried.isSelected())
        {
            status = "Married";
        }

        if(chkMember.isSelected())
        {
            memberType = "Yes";
        }
        else {
            memberType="No";
        }

        String oldValue = df.getValueAt(index1,0).toString();
        PreparedStatement query = conobj.prepareStatement("UPDATE employee set Emp_number=?, Name=?, Income=?, Status=?, Member_type=? where Emp_number=?");


        query.setString(1,empNum);
        query.setString(2,name);
        query.setDouble(3,monthlyIncome);
        query.setString(4,status);
        query.setString(5,memberType);
        query.setString(6,oldValue);

        query.executeUpdate();
        JOptionPane.showMessageDialog(null,"One record edited.");

        updateTable();

        txtIncome.setText("");
        txtTax.setText("");
        txtAfterTax.setText("");

    }

    private void btnDeleteMouseClicked(MouseEvent e) throws SQLException {
        String empNum, name, status="", memberType;
        Double monthlyIncome =0.0;

        empNum = txtEmpNum.getText();

        int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete the record?",
        "Delete", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

        if(result==JOptionPane.NO_OPTION)
        {
            return;
        }
        PreparedStatement query = conobj.prepareStatement("DELETE from employee WHERE Emp_number=?");
        query.setString(1,empNum);


        query.executeUpdate();
        JOptionPane.showMessageDialog(null,"One record deleted.");

        updateTable();

        txtIncome.setText("");
        txtTax.setText("");
        txtAfterTax.setText("");
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Mary Claudy Vencio
        label1 = new JLabel();
        txtEmpNum = new JTextField();
        label2 = new JLabel();
        txtNameEmp = new JTextField();
        label3 = new JLabel();
        txtMonthlyInc = new JTextField();
        btnSingle = new JRadioButton();
        btnMarried = new JRadioButton();
        chkMember = new JCheckBox();
        label4 = new JLabel();
        scrollPane2 = new JScrollPane();
        employee = new JTable();
        textArea1 = new JTextArea();
        txtIncome = new JTextField();
        label5 = new JLabel();
        txtTax = new JTextField();
        label6 = new JLabel();
        txtAfterTax = new JTextField();
        btnAdd = new JButton();
        btnEdit = new JButton();
        btnDelete = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Enter the Employee Number");
        contentPane.add(label1, "cell 0 0");
        contentPane.add(txtEmpNum, "cell 1 0 3 1");

        //---- label2 ----
        label2.setText("Enter the name of the employee");
        contentPane.add(label2, "cell 0 1");
        contentPane.add(txtNameEmp, "cell 1 1 3 1");

        //---- label3 ----
        label3.setText("Enter the monthly income");
        contentPane.add(label3, "cell 0 2");
        contentPane.add(txtMonthlyInc, "cell 1 2 3 1");

        //---- btnSingle ----
        btnSingle.setText("Single");
        contentPane.add(btnSingle, "cell 1 3");

        //---- btnMarried ----
        btnMarried.setText("Married");
        contentPane.add(btnMarried, "cell 3 3");

        //---- chkMember ----
        chkMember.setText("Union Member");
        contentPane.add(chkMember, "cell 1 4");

        //---- label4 ----
        label4.setText("The Income");
        contentPane.add(label4, "cell 0 5");

        //======== scrollPane2 ========
        {

            //---- employee ----
            employee.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    employeeMouseClicked(e);
                }
            });
            scrollPane2.setViewportView(employee);
        }
        contentPane.add(scrollPane2, "cell 1 5 3 8");
        contentPane.add(textArea1, "cell 4 5");
        contentPane.add(txtIncome, "cell 0 6");

        //---- label5 ----
        label5.setText("Total Tax");
        contentPane.add(label5, "cell 0 8");
        contentPane.add(txtTax, "cell 0 9");

        //---- label6 ----
        label6.setText("Income after tax");
        contentPane.add(label6, "cell 0 11");
        contentPane.add(txtAfterTax, "cell 0 12");

        //---- btnAdd ----
        btnAdd.setText("Add");
        btnAdd.addActionListener(e -> {
            try {
                btnAdd(e);
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });
        contentPane.add(btnAdd, "cell 1 13");

        //---- btnEdit ----
        btnEdit.setText("Edit");
        btnEdit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    btnEditMouseClicked(e);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        contentPane.add(btnEdit, "cell 2 13");

        //---- btnDelete ----
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    btnDeleteMouseClicked(e);
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        contentPane.add(btnDelete, "cell 3 13");
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        var buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(btnSingle);
        buttonGroup1.add(btnMarried);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Mary Claudy Vencio
    private JLabel label1;
    private JTextField txtEmpNum;
    private JLabel label2;
    private JTextField txtNameEmp;
    private JLabel label3;
    private JTextField txtMonthlyInc;
    private JRadioButton btnSingle;
    private JRadioButton btnMarried;
    private JCheckBox chkMember;
    private JLabel label4;
    private JScrollPane scrollPane2;
    private JTable employee;
    private JTextArea textArea1;
    private JTextField txtIncome;
    private JLabel label5;
    private JTextField txtTax;
    private JLabel label6;
    private JTextField txtAfterTax;
    private JButton btnAdd;
    private JButton btnEdit;
    private JButton btnDelete;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    Connection1 con = new Connection1();
    Connection conobj = con.connect();

    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        JFormDesign form1 = new JFormDesign();
        form1.updateTable();
        form1.setVisible(true);
    }

    public void updateTable() throws SQLException
    {
        String quer1 = "SELECT * from employee";
        PreparedStatement query = conobj.prepareStatement(quer1);

        ResultSet rs = query.executeQuery();

        DefaultTableModel df = (DefaultTableModel) employee.getModel();
        df.setRowCount(0);
        rs.last();

        int z = rs.getRow();
        rs.beforeFirst();

        String[][] array = new String[0][];

        if (z > 0)
        {
            array = new String[z][5];
        }
        int j=0;
        while(rs.next())
        {
            array[j][0] = rs.getString("Emp_number");
            array[j][1] = rs.getString("Name");
            array[j][2] = rs.getString("Income");
            array[j][3] = rs.getString("Status");
            array[j][4] = rs.getString("Member_type");
            ++j;
        }
        String[] cols = {"Emp_number", "Name", "Income", "Status", "Member_type"};
        DefaultTableModel model = new DefaultTableModel(array,cols);
        employee.setModel(model);
        employee.setDefaultEditor(Object.class,null);

        //to set the default options at load of the form
        btnSingle.setSelected(true);
        chkMember.setSelected(true);
    }


}
