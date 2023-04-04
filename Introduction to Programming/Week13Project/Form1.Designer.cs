namespace Week13Project
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblTitle = new System.Windows.Forms.Label();
            this.lblAmount = new System.Windows.Forms.Label();
            this.lblPercentage = new System.Windows.Forms.Label();
            this.lblDue = new System.Windows.Forms.Label();
            this.amount = new System.Windows.Forms.TextBox();
            this.percentage = new System.Windows.Forms.TextBox();
            this.due = new System.Windows.Forms.TextBox();
            this.btnCompute = new System.Windows.Forms.Button();
            this.btnReset = new System.Windows.Forms.Button();
            this.btnClose = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lblTitle
            // 
            this.lblTitle.AutoSize = true;
            this.lblTitle.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitle.Location = new System.Drawing.Point(124, 18);
            this.lblTitle.Name = "lblTitle";
            this.lblTitle.Size = new System.Drawing.Size(170, 24);
            this.lblTitle.TabIndex = 0;
            this.lblTitle.Text = "Tax Calculator App";
            // 
            // lblAmount
            // 
            this.lblAmount.AutoSize = true;
            this.lblAmount.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblAmount.Location = new System.Drawing.Point(75, 69);
            this.lblAmount.Name = "lblAmount";
            this.lblAmount.Size = new System.Drawing.Size(104, 20);
            this.lblAmount.TabIndex = 1;
            this.lblAmount.Text = "Total Amount";
            // 
            // lblPercentage
            // 
            this.lblPercentage.AutoSize = true;
            this.lblPercentage.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblPercentage.Location = new System.Drawing.Point(59, 104);
            this.lblPercentage.Name = "lblPercentage";
            this.lblPercentage.Size = new System.Drawing.Size(120, 20);
            this.lblPercentage.TabIndex = 2;
            this.lblPercentage.Text = "Tax Percentage";
            // 
            // lblDue
            // 
            this.lblDue.AutoSize = true;
            this.lblDue.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblDue.Location = new System.Drawing.Point(101, 139);
            this.lblDue.Name = "lblDue";
            this.lblDue.Size = new System.Drawing.Size(78, 20);
            this.lblDue.TabIndex = 3;
            this.lblDue.Text = "Total Due";
            // 
            // amount
            // 
            this.amount.Location = new System.Drawing.Point(203, 71);
            this.amount.Name = "amount";
            this.amount.Size = new System.Drawing.Size(138, 20);
            this.amount.TabIndex = 0;
            // 
            // percentage
            // 
            this.percentage.Location = new System.Drawing.Point(203, 104);
            this.percentage.Name = "percentage";
            this.percentage.Size = new System.Drawing.Size(137, 20);
            this.percentage.TabIndex = 1;
            // 
            // due
            // 
            this.due.Location = new System.Drawing.Point(203, 142);
            this.due.Name = "due";
            this.due.Size = new System.Drawing.Size(137, 20);
            this.due.TabIndex = 2;
            // 
            // btnCompute
            // 
            this.btnCompute.Location = new System.Drawing.Point(78, 198);
            this.btnCompute.Name = "btnCompute";
            this.btnCompute.Size = new System.Drawing.Size(75, 23);
            this.btnCompute.TabIndex = 3;
            this.btnCompute.Text = "Compute";
            this.btnCompute.UseVisualStyleBackColor = true;
            this.btnCompute.Click += new System.EventHandler(this.btnCompute_Click);
            // 
            // btnReset
            // 
            this.btnReset.Location = new System.Drawing.Point(181, 198);
            this.btnReset.Name = "btnReset";
            this.btnReset.Size = new System.Drawing.Size(75, 23);
            this.btnReset.TabIndex = 4;
            this.btnReset.Text = "Reset";
            this.btnReset.UseVisualStyleBackColor = true;
            this.btnReset.Click += new System.EventHandler(this.btnReset_Click);
            // 
            // btnClose
            // 
            this.btnClose.Location = new System.Drawing.Point(287, 198);
            this.btnClose.Name = "btnClose";
            this.btnClose.Size = new System.Drawing.Size(75, 23);
            this.btnClose.TabIndex = 5;
            this.btnClose.Text = "Close";
            this.btnClose.UseVisualStyleBackColor = true;
            this.btnClose.Click += new System.EventHandler(this.btnClose_Click);
            // 
            // Form1
            // 
            this.AcceptButton = this.btnCompute;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.CancelButton = this.btnClose;
            this.ClientSize = new System.Drawing.Size(433, 253);
            this.Controls.Add(this.btnClose);
            this.Controls.Add(this.btnReset);
            this.Controls.Add(this.btnCompute);
            this.Controls.Add(this.due);
            this.Controls.Add(this.percentage);
            this.Controls.Add(this.amount);
            this.Controls.Add(this.lblDue);
            this.Controls.Add(this.lblPercentage);
            this.Controls.Add(this.lblAmount);
            this.Controls.Add(this.lblTitle);
            this.Name = "Form1";
            this.Text = "Tax Calculator";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.Form1_FormClosing);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lblTitle;
        private System.Windows.Forms.Label lblAmount;
        private System.Windows.Forms.Label lblPercentage;
        private System.Windows.Forms.Label lblDue;
        private System.Windows.Forms.TextBox amount;
        private System.Windows.Forms.TextBox percentage;
        private System.Windows.Forms.TextBox due;
        private System.Windows.Forms.Button btnCompute;
        private System.Windows.Forms.Button btnReset;
        private System.Windows.Forms.Button btnClose;
    }
}

