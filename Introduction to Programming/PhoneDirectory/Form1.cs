using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace PhoneDirectory
{
    public partial class PhoneDirectory : Form
    {
        public PhoneDirectory()
        {
            InitializeComponent();
        }

        private void saveBtn_Click(object sender, EventArgs e)
        {
            if (txtBxPhone.Text.ToString().Length != 10)
                lblError.Visible = true;
            else
            {
                lblError.Visible = false;
                try
                {
                    StreamWriter sw = new StreamWriter("PhoneRecords.txt");
                    sw.WriteLine(txtBxName.Text + "|" + txtBxAdd.Text + "|*" + txtBxPhone.Text + "*");
                    sw.Close();
                    MessageBox.Show("Record Saved Successfully");
                }
                catch (IOException exc)
                {
                    MessageBox.Show(exc.Message);
                }
            }

        }
    }
}
