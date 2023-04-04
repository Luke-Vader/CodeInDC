using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SimpleCalculator
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btn_mult_Click(object sender, EventArgs e)
        {
            label_output.ForeColor = Color.Black;
            if (Validate(input_first.Text) && Validate(input_second.Text))
                label_output.Text = (int.Parse(input_first.Text) * int.Parse(input_second.Text)).ToString();
        }

        private bool Validate(string input)
        {
            int a;
            if (!int.TryParse(input, out a))
            {
                label_output.Text = "Value must be numeric and > 0";
                label_output.ForeColor = Color.Red;
                return false;
            }
            else
                return true;
            
        }

        private void btn_add_Click(object sender, EventArgs e)
        {
            label_output.ForeColor = Color.Black;
            if (Validate(input_first.Text) && Validate(input_second.Text))
                label_output.Text = (int.Parse(input_first.Text) + int.Parse(input_second.Text)).ToString();
        }

        private void btn_reset_Click(object sender, EventArgs e)
        {
            input_first.Text = String.Empty;
            input_second.Text = String.Empty;
            label_output.Text = String.Empty;
            label_output.ForeColor = Color.Black;
        }
    }
}
