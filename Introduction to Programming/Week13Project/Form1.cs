using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using System.Windows.Forms;

namespace Week13Project
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            due.Visible = false;
        }

        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            MessageBox.Show("Thank You!");
        }

        private void btnCompute_Click(object sender, EventArgs e)
        {
            double amt;
            while(!double.TryParse(amount.Text, out amt))
            {
                MessageBox.Show("Amount is supposed to be in Double");
                amount.Text = 0.0.ToString();
                amount.Focus();
            }

            double dueAmount = double.Parse(amount.Text) + 
                (double.Parse(amount.Text) * double.Parse(percentage.Text) / 100);
            due.Text = dueAmount.ToString();
            due.Visible = true; 
        }

        private void btnClose_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnReset_Click(object sender, EventArgs e)
        {
            amount.Text = String.Empty;
            due.Text = String.Empty;
            percentage.Text = String.Empty;
            due.Visible = false;
        }
    }
}
