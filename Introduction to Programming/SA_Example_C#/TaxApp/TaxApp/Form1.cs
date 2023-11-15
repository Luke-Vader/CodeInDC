using System.Windows.Forms;
using System;

namespace TaxApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void btnCompute_Click(object sender, EventArgs e)
        {
            string inValue;
            double purchaseAmt,
            percent,
            ans;
            while (double.TryParse(txtPurchase.Text,
            out purchaseAmt) == false)
            {
                MessageBox.Show("Value entered must be numeric");
                txtPurchase.Text = "0.0";
                txtPurchase.Focus();
            }
            inValue = lblTaxPercent.Text;
            inValue = inValue.Remove(inValue.Length - 1, 1);
            percent = double.Parse(inValue) / 100;
            ans = (purchaseAmt * percent) + purchaseAmt;
            txtTotalDue.Text = string.Format("{0:C}", ans);
        }
    }
}