namespace BankingRegister
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
            this.label_title = new System.Windows.Forms.Label();
            this.label_name = new System.Windows.Forms.Label();
            this.label_acc = new System.Windows.Forms.Label();
            this.label_og_deposit = new System.Windows.Forms.Label();
            this.input_name = new System.Windows.Forms.TextBox();
            this.input_acc = new System.Windows.Forms.TextBox();
            this.input_og_deposit = new System.Windows.Forms.TextBox();
            this.label_deposit = new System.Windows.Forms.Label();
            this.input_dep_amount = new System.Windows.Forms.TextBox();
            this.label_withdraw = new System.Windows.Forms.Label();
            this.input_with_amount = new System.Windows.Forms.TextBox();
            this.btn_create = new System.Windows.Forms.Button();
            this.btn_update = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // label_title
            // 
            this.label_title.AutoSize = true;
            this.label_title.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label_title.ForeColor = System.Drawing.SystemColors.HighlightText;
            this.label_title.Location = new System.Drawing.Point(173, 25);
            this.label_title.Name = "label_title";
            this.label_title.Size = new System.Drawing.Size(221, 31);
            this.label_title.TabIndex = 0;
            this.label_title.Text = "Banking Register";
            // 
            // label_name
            // 
            this.label_name.AutoSize = true;
            this.label_name.ForeColor = System.Drawing.SystemColors.HighlightText;
            this.label_name.Location = new System.Drawing.Point(110, 92);
            this.label_name.Name = "label_name";
            this.label_name.Size = new System.Drawing.Size(38, 13);
            this.label_name.TabIndex = 1;
            this.label_name.Text = "Name:";
            // 
            // label_acc
            // 
            this.label_acc.AutoSize = true;
            this.label_acc.ForeColor = System.Drawing.SystemColors.HighlightText;
            this.label_acc.Location = new System.Drawing.Point(110, 129);
            this.label_acc.Name = "label_acc";
            this.label_acc.Size = new System.Drawing.Size(70, 13);
            this.label_acc.TabIndex = 2;
            this.label_acc.Text = "Account No.:";
            // 
            // label_og_deposit
            // 
            this.label_og_deposit.AutoSize = true;
            this.label_og_deposit.ForeColor = System.Drawing.SystemColors.HighlightText;
            this.label_og_deposit.Location = new System.Drawing.Point(110, 161);
            this.label_og_deposit.Name = "label_og_deposit";
            this.label_og_deposit.Size = new System.Drawing.Size(84, 13);
            this.label_og_deposit.TabIndex = 3;
            this.label_og_deposit.Text = "Original Deposit:";
            // 
            // input_name
            // 
            this.input_name.Location = new System.Drawing.Point(232, 89);
            this.input_name.Name = "input_name";
            this.input_name.Size = new System.Drawing.Size(208, 20);
            this.input_name.TabIndex = 4;
            // 
            // input_acc
            // 
            this.input_acc.Location = new System.Drawing.Point(232, 122);
            this.input_acc.Name = "input_acc";
            this.input_acc.Size = new System.Drawing.Size(208, 20);
            this.input_acc.TabIndex = 5;
            // 
            // input_og_deposit
            // 
            this.input_og_deposit.Location = new System.Drawing.Point(232, 158);
            this.input_og_deposit.Name = "input_og_deposit";
            this.input_og_deposit.Size = new System.Drawing.Size(208, 20);
            this.input_og_deposit.TabIndex = 6;
            // 
            // label_deposit
            // 
            this.label_deposit.AutoSize = true;
            this.label_deposit.ForeColor = System.Drawing.SystemColors.HighlightText;
            this.label_deposit.Location = new System.Drawing.Point(110, 215);
            this.label_deposit.Name = "label_deposit";
            this.label_deposit.Size = new System.Drawing.Size(43, 13);
            this.label_deposit.TabIndex = 7;
            this.label_deposit.Text = "Deposit";
            // 
            // input_dep_amount
            // 
            this.input_dep_amount.Location = new System.Drawing.Point(113, 241);
            this.input_dep_amount.Name = "input_dep_amount";
            this.input_dep_amount.Size = new System.Drawing.Size(100, 20);
            this.input_dep_amount.TabIndex = 8;
            // 
            // label_withdraw
            // 
            this.label_withdraw.AutoSize = true;
            this.label_withdraw.ForeColor = System.Drawing.SystemColors.HighlightText;
            this.label_withdraw.Location = new System.Drawing.Point(342, 215);
            this.label_withdraw.Name = "label_withdraw";
            this.label_withdraw.Size = new System.Drawing.Size(52, 13);
            this.label_withdraw.TabIndex = 9;
            this.label_withdraw.Text = "Withdraw";
            // 
            // input_with_amount
            // 
            this.input_with_amount.Location = new System.Drawing.Point(340, 241);
            this.input_with_amount.Name = "input_with_amount";
            this.input_with_amount.Size = new System.Drawing.Size(100, 20);
            this.input_with_amount.TabIndex = 10;
            // 
            // btn_create
            // 
            this.btn_create.Location = new System.Drawing.Point(3, 309);
            this.btn_create.Name = "btn_create";
            this.btn_create.Size = new System.Drawing.Size(131, 51);
            this.btn_create.TabIndex = 11;
            this.btn_create.Text = "Create Account";
            this.btn_create.UseVisualStyleBackColor = true;
            // 
            // btn_update
            // 
            this.btn_update.Location = new System.Drawing.Point(429, 309);
            this.btn_update.Name = "btn_update";
            this.btn_update.Size = new System.Drawing.Size(128, 51);
            this.btn_update.TabIndex = 12;
            this.btn_update.Text = "Update Account";
            this.btn_update.UseVisualStyleBackColor = true;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.HotTrack;
            this.ClientSize = new System.Drawing.Size(560, 363);
            this.Controls.Add(this.btn_update);
            this.Controls.Add(this.btn_create);
            this.Controls.Add(this.input_with_amount);
            this.Controls.Add(this.label_withdraw);
            this.Controls.Add(this.input_dep_amount);
            this.Controls.Add(this.label_deposit);
            this.Controls.Add(this.input_og_deposit);
            this.Controls.Add(this.input_acc);
            this.Controls.Add(this.input_name);
            this.Controls.Add(this.label_og_deposit);
            this.Controls.Add(this.label_acc);
            this.Controls.Add(this.label_name);
            this.Controls.Add(this.label_title);
            this.Name = "Form1";
            this.Text = "Bank Register";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label_title;
        private System.Windows.Forms.Label label_name;
        private System.Windows.Forms.Label label_acc;
        private System.Windows.Forms.Label label_og_deposit;
        private System.Windows.Forms.TextBox input_name;
        private System.Windows.Forms.TextBox input_acc;
        private System.Windows.Forms.TextBox input_og_deposit;
        private System.Windows.Forms.Label label_deposit;
        private System.Windows.Forms.TextBox input_dep_amount;
        private System.Windows.Forms.Label label_withdraw;
        private System.Windows.Forms.TextBox input_with_amount;
        private System.Windows.Forms.Button btn_create;
        private System.Windows.Forms.Button btn_update;
    }
}

