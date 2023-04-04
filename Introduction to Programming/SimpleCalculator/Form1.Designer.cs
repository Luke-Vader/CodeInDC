namespace SimpleCalculator
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
            this.label_first_value = new System.Windows.Forms.Label();
            this.label_second_value = new System.Windows.Forms.Label();
            this.input_first = new System.Windows.Forms.TextBox();
            this.input_second = new System.Windows.Forms.TextBox();
            this.btn_mult = new System.Windows.Forms.Button();
            this.btn_add = new System.Windows.Forms.Button();
            this.btn_reset = new System.Windows.Forms.Button();
            this.label_output = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label_title
            // 
            this.label_title.AutoSize = true;
            this.label_title.Font = new System.Drawing.Font("Microsoft Sans Serif", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label_title.Location = new System.Drawing.Point(93, 22);
            this.label_title.Name = "label_title";
            this.label_title.Size = new System.Drawing.Size(243, 31);
            this.label_title.TabIndex = 0;
            this.label_title.Text = "Simple Calculator";
            // 
            // label_first_value
            // 
            this.label_first_value.AutoSize = true;
            this.label_first_value.Location = new System.Drawing.Point(65, 90);
            this.label_first_value.Name = "label_first_value";
            this.label_first_value.Size = new System.Drawing.Size(56, 13);
            this.label_first_value.TabIndex = 1;
            this.label_first_value.Text = "First Value";
            // 
            // label_second_value
            // 
            this.label_second_value.AutoSize = true;
            this.label_second_value.ForeColor = System.Drawing.Color.Black;
            this.label_second_value.Location = new System.Drawing.Point(65, 131);
            this.label_second_value.Name = "label_second_value";
            this.label_second_value.Size = new System.Drawing.Size(74, 13);
            this.label_second_value.TabIndex = 2;
            this.label_second_value.Text = "Second Value";
            // 
            // input_first
            // 
            this.input_first.Location = new System.Drawing.Point(210, 82);
            this.input_first.Name = "input_first";
            this.input_first.Size = new System.Drawing.Size(100, 20);
            this.input_first.TabIndex = 3;
            this.input_first.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // input_second
            // 
            this.input_second.Location = new System.Drawing.Point(210, 131);
            this.input_second.Name = "input_second";
            this.input_second.Size = new System.Drawing.Size(100, 20);
            this.input_second.TabIndex = 4;
            this.input_second.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // btn_mult
            // 
            this.btn_mult.Location = new System.Drawing.Point(99, 196);
            this.btn_mult.Name = "btn_mult";
            this.btn_mult.Size = new System.Drawing.Size(104, 31);
            this.btn_mult.TabIndex = 5;
            this.btn_mult.Text = "Multiply";
            this.btn_mult.UseVisualStyleBackColor = true;
            this.btn_mult.Click += new System.EventHandler(this.btn_mult_Click);
            // 
            // btn_add
            // 
            this.btn_add.Location = new System.Drawing.Point(230, 196);
            this.btn_add.Name = "btn_add";
            this.btn_add.Size = new System.Drawing.Size(106, 30);
            this.btn_add.TabIndex = 6;
            this.btn_add.Text = "Add";
            this.btn_add.UseVisualStyleBackColor = true;
            this.btn_add.Click += new System.EventHandler(this.btn_add_Click);
            // 
            // btn_reset
            // 
            this.btn_reset.Location = new System.Drawing.Point(175, 252);
            this.btn_reset.Name = "btn_reset";
            this.btn_reset.Size = new System.Drawing.Size(84, 30);
            this.btn_reset.TabIndex = 7;
            this.btn_reset.Text = "Reset";
            this.btn_reset.UseVisualStyleBackColor = true;
            this.btn_reset.Click += new System.EventHandler(this.btn_reset_Click);
            // 
            // label_output
            // 
            this.label_output.AutoSize = true;
            this.label_output.Location = new System.Drawing.Point(82, 309);
            this.label_output.Name = "label_output";
            this.label_output.Size = new System.Drawing.Size(0, 13);
            this.label_output.TabIndex = 8;
            this.label_output.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClientSize = new System.Drawing.Size(424, 450);
            this.Controls.Add(this.label_output);
            this.Controls.Add(this.btn_reset);
            this.Controls.Add(this.btn_add);
            this.Controls.Add(this.btn_mult);
            this.Controls.Add(this.input_second);
            this.Controls.Add(this.input_first);
            this.Controls.Add(this.label_second_value);
            this.Controls.Add(this.label_first_value);
            this.Controls.Add(this.label_title);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label_title;
        private System.Windows.Forms.Label label_first_value;
        private System.Windows.Forms.Label label_second_value;
        private System.Windows.Forms.TextBox input_first;
        private System.Windows.Forms.TextBox input_second;
        private System.Windows.Forms.Button btn_mult;
        private System.Windows.Forms.Button btn_add;
        private System.Windows.Forms.Button btn_reset;
        private System.Windows.Forms.Label label_output;
    }
}

