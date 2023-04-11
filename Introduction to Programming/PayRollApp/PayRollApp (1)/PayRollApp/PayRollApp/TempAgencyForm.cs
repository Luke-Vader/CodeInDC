/* TempAgencyForm.cs
 * This partial class contains program
 * statements written to handle the two
 * button click events.
 */

using System;
using System.IO;
using System.Windows.Forms;

namespace PayRollApp
{
    public partial class TempAgencyForm : Form
    {
        public TempAgencyForm()
        {
            InitializeComponent();
        }

        private void btnCalculate_Click(object sender, EventArgs e)
        {
            int dependants;
            double hours;
            string[] name = new string[2];
            string medical = "";
            string status = "";
            double total = 0;

            while(!double.TryParse(txtBxHours.Text, out hours))
            {
                MessageBox.Show("Numeric Value should be entered");
                txtBxHours.Text = 0.0.ToString();
                txtBxHours.Focus();
            }

            if(!int.TryParse(txtBxDep.Text, out dependants)) 
                MessageBox.Show("Invalid Input, 0 will be default");

            txtBxName.Text.Trim();
            name = txtBxName.Text.Split(' ');
            if(name.Length < 2)
            {
                txtBxName.Text = "Please enter full name";
                txtBxName.Focus();
            }
            else
            {
                if (hours > 0)
                {
                    Employee employee = new Employee(name[0], name[1], dependants, hours);
                    txtBxGross.Text = employee.DetermineGross().ToString();
                    txtBxSoc.Text = employee.DetermineSocialSecurity().ToString("c");
                    txtBxFed.Text = employee.DetermineFederalTax().ToString("c");
                    txtBxAgency.Text = employee.DetermineAgencyFee().ToString("c");

                    if (chkBxBasic.Checked)
                        medical = "Basic Coverage";
                    else if (chkBxExtended.Checked)
                    {
                        medical = "Extended Coverage";
                        total = 200;
                    }
                    else if (chkBxBasic.Checked == true && chkBxExtended.Checked == true)
                        medical = "Full Coverage";

                    if (rbContract.Checked)
                        status = rbContract.Text;
                    else if (rbFT.Checked)
                        status = rbFT.Text;
                    else if (rbPT.Checked)
                        status = rbPT.Text;

                    txtBxNet.Text = (employee.DetermineNet() + total).ToString("c") +
                        " Dept: " + listDept.SelectedItem.ToString() 
                        + " | " + medical 
                        + " | " + status;

                    lblGross.Visible = true;
                    lblSoc.Visible = true;
                    lblAgency.Visible = true;
                    lblFed.Visible = true;
                    lblNet.Visible = true;

                    txtBxAgency.Visible = true;
                    txtBxDep.Visible = true;
                    txtBxSoc.Visible = true;
                    txtBxFed.Visible = true;
                    txtBxGross.Visible = true;
                    txtBxNet.Visible = true;
                    
                }
            }
        }

        private void btnReset_Click(object sender, EventArgs e)
        {
            
        }

        private void listDept_SelectedIndexChanged(object sender, EventArgs e)
        {
            string departments = "";
            foreach (string dept in listDept.SelectedItems) departments += dept + " ";
            lblDepartments.Text = departments;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            listDept.Items.Add(txtBxAddDept.Text);
        }
    }
}
