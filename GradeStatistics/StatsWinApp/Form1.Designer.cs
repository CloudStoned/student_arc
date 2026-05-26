namespace StatsWinApp
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
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
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            CalculateMean_BTN = new Button();
            listView1 = new ListView();
            StudentName = new ColumnHeader();
            Prelim = new ColumnHeader();
            Midterm = new ColumnHeader();
            Finals = new ColumnHeader();
            label2 = new Label();
            label3 = new Label();
            CalculateMedian_BTN = new Button();
            label4 = new Label();
            label5 = new Label();
            label6 = new Label();
            CalculateMode_BTN = new Button();
            label7 = new Label();
            label8 = new Label();
            label9 = new Label();
            CalculateRange_BTN = new Button();
            label10 = new Label();
            label11 = new Label();
            label12 = new Label();
            StandardDeviation_BTN = new Button();
            label13 = new Label();
            label14 = new Label();
            label15 = new Label();
            VarianceCalculator_BTN = new Button();
            label16 = new Label();
            label17 = new Label();
            label18 = new Label();
            listView2 = new ListView();
            columnHeader1 = new ColumnHeader();
            columnHeader2 = new ColumnHeader();
            columnHeader3 = new ColumnHeader();
            columnHeader4 = new ColumnHeader();
            FinalGrade = new ColumnHeader();
            label19 = new Label();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(335, 49);
            label1.Name = "label1";
            label1.Size = new Size(38, 15);
            label1.TabIndex = 0;
            label1.Text = "label1";
            // 
            // CalculateMean_BTN
            // 
            CalculateMean_BTN.Location = new Point(335, 12);
            CalculateMean_BTN.Name = "CalculateMean_BTN";
            CalculateMean_BTN.Size = new Size(123, 23);
            CalculateMean_BTN.TabIndex = 1;
            CalculateMean_BTN.Text = "Calculate Mean";
            CalculateMean_BTN.UseVisualStyleBackColor = true;
            CalculateMean_BTN.Click += button1_Click;
            // 
            // listView1
            // 
            listView1.Columns.AddRange(new ColumnHeader[] { StudentName, Prelim, Midterm, Finals });
            listView1.Location = new Point(12, 12);
            listView1.Name = "listView1";
            listView1.Size = new Size(295, 249);
            listView1.TabIndex = 2;
            listView1.UseCompatibleStateImageBehavior = false;
            listView1.View = View.Details;
            // 
            // StudentName
            // 
            StudentName.Text = "Student Name";
            StudentName.Width = 110;
            // 
            // Prelim
            // 
            Prelim.Text = "Prelim";
            // 
            // Midterm
            // 
            Midterm.Text = "Midterm";
            // 
            // Finals
            // 
            Finals.Text = "Finals";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(335, 77);
            label2.Name = "label2";
            label2.Size = new Size(38, 15);
            label2.TabIndex = 3;
            label2.Text = "label2";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(335, 106);
            label3.Name = "label3";
            label3.Size = new Size(38, 15);
            label3.TabIndex = 4;
            label3.Text = "label3";
            // 
            // CalculateMedian_BTN
            // 
            CalculateMedian_BTN.Location = new Point(503, 12);
            CalculateMedian_BTN.Name = "CalculateMedian_BTN";
            CalculateMedian_BTN.Size = new Size(123, 23);
            CalculateMedian_BTN.TabIndex = 5;
            CalculateMedian_BTN.Text = "Calculate Median";
            CalculateMedian_BTN.UseVisualStyleBackColor = true;
            CalculateMedian_BTN.Click += CalculateMedian_BTN_Click;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(513, 106);
            label4.Name = "label4";
            label4.Size = new Size(38, 15);
            label4.TabIndex = 8;
            label4.Text = "label4";
            // 
            // label5
            // 
            label5.AutoSize = true;
            label5.Location = new Point(513, 77);
            label5.Name = "label5";
            label5.Size = new Size(38, 15);
            label5.TabIndex = 7;
            label5.Text = "label5";
            // 
            // label6
            // 
            label6.AutoSize = true;
            label6.Location = new Point(513, 49);
            label6.Name = "label6";
            label6.Size = new Size(38, 15);
            label6.TabIndex = 6;
            label6.Text = "label6";
            // 
            // CalculateMode_BTN
            // 
            CalculateMode_BTN.Location = new Point(666, 12);
            CalculateMode_BTN.Name = "CalculateMode_BTN";
            CalculateMode_BTN.Size = new Size(123, 23);
            CalculateMode_BTN.TabIndex = 9;
            CalculateMode_BTN.Text = "Calculate Mode";
            CalculateMode_BTN.UseVisualStyleBackColor = true;
            CalculateMode_BTN.Click += CalculateMode_BTN_Click;
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Location = new Point(678, 106);
            label7.Name = "label7";
            label7.Size = new Size(38, 15);
            label7.TabIndex = 12;
            label7.Text = "label7";
            // 
            // label8
            // 
            label8.AutoSize = true;
            label8.Location = new Point(678, 77);
            label8.Name = "label8";
            label8.Size = new Size(38, 15);
            label8.TabIndex = 11;
            label8.Text = "label8";
            // 
            // label9
            // 
            label9.AutoSize = true;
            label9.Location = new Point(678, 49);
            label9.Name = "label9";
            label9.Size = new Size(38, 15);
            label9.TabIndex = 10;
            label9.Text = "label9";
            // 
            // CalculateRange_BTN
            // 
            CalculateRange_BTN.Location = new Point(335, 158);
            CalculateRange_BTN.Name = "CalculateRange_BTN";
            CalculateRange_BTN.Size = new Size(123, 23);
            CalculateRange_BTN.TabIndex = 13;
            CalculateRange_BTN.Text = "Calculate Range";
            CalculateRange_BTN.UseVisualStyleBackColor = true;
            CalculateRange_BTN.Click += CalculateRange_BTN_Click;
            // 
            // label10
            // 
            label10.AutoSize = true;
            label10.Location = new Point(335, 254);
            label10.Name = "label10";
            label10.Size = new Size(44, 15);
            label10.TabIndex = 16;
            label10.Text = "label10";
            // 
            // label11
            // 
            label11.AutoSize = true;
            label11.Location = new Point(335, 225);
            label11.Name = "label11";
            label11.Size = new Size(44, 15);
            label11.TabIndex = 15;
            label11.Text = "label11";
            // 
            // label12
            // 
            label12.AutoSize = true;
            label12.Location = new Point(335, 197);
            label12.Name = "label12";
            label12.Size = new Size(44, 15);
            label12.TabIndex = 14;
            label12.Text = "label12";
            // 
            // StandardDeviation_BTN
            // 
            StandardDeviation_BTN.Location = new Point(513, 158);
            StandardDeviation_BTN.Name = "StandardDeviation_BTN";
            StandardDeviation_BTN.Size = new Size(123, 23);
            StandardDeviation_BTN.TabIndex = 17;
            StandardDeviation_BTN.Text = "Standard Deviation";
            StandardDeviation_BTN.UseVisualStyleBackColor = true;
            StandardDeviation_BTN.Click += StandardDeviation_BTN_Click;
            // 
            // label13
            // 
            label13.AutoSize = true;
            label13.Location = new Point(513, 254);
            label13.Name = "label13";
            label13.Size = new Size(44, 15);
            label13.TabIndex = 20;
            label13.Text = "label13";
            // 
            // label14
            // 
            label14.AutoSize = true;
            label14.Location = new Point(513, 225);
            label14.Name = "label14";
            label14.Size = new Size(44, 15);
            label14.TabIndex = 19;
            label14.Text = "label14";
            // 
            // label15
            // 
            label15.AutoSize = true;
            label15.Location = new Point(513, 197);
            label15.Name = "label15";
            label15.Size = new Size(44, 15);
            label15.TabIndex = 18;
            label15.Text = "label15";
            // 
            // VarianceCalculator_BTN
            // 
            VarianceCalculator_BTN.Location = new Point(666, 158);
            VarianceCalculator_BTN.Name = "VarianceCalculator_BTN";
            VarianceCalculator_BTN.Size = new Size(123, 23);
            VarianceCalculator_BTN.TabIndex = 21;
            VarianceCalculator_BTN.Text = "Variance Calculator";
            VarianceCalculator_BTN.UseVisualStyleBackColor = true;
            VarianceCalculator_BTN.Click += VarianceCalculator_BTN_Click;
            // 
            // label16
            // 
            label16.AutoSize = true;
            label16.Location = new Point(666, 254);
            label16.Name = "label16";
            label16.Size = new Size(44, 15);
            label16.TabIndex = 24;
            label16.Text = "label16";
            // 
            // label17
            // 
            label17.AutoSize = true;
            label17.Location = new Point(666, 225);
            label17.Name = "label17";
            label17.Size = new Size(44, 15);
            label17.TabIndex = 23;
            label17.Text = "label17";
            // 
            // label18
            // 
            label18.AutoSize = true;
            label18.Location = new Point(666, 197);
            label18.Name = "label18";
            label18.Size = new Size(44, 15);
            label18.TabIndex = 22;
            label18.Text = "label18";
            // 
            // listView2
            // 
            listView2.Columns.AddRange(new ColumnHeader[] { columnHeader1, columnHeader2, columnHeader3, columnHeader4, FinalGrade });
            listView2.Location = new Point(204, 383);
            listView2.Name = "listView2";
            listView2.Size = new Size(374, 249);
            listView2.TabIndex = 25;
            listView2.UseCompatibleStateImageBehavior = false;
            listView2.View = View.Details;
            // 
            // columnHeader1
            // 
            columnHeader1.Text = "Student Name";
            columnHeader1.Width = 110;
            // 
            // columnHeader2
            // 
            columnHeader2.Text = "Prelim";
            // 
            // columnHeader3
            // 
            columnHeader3.Text = "Midterm";
            // 
            // columnHeader4
            // 
            columnHeader4.Text = "Finals";
            // 
            // FinalGrade
            // 
            FinalGrade.Text = "Final Grade";
            FinalGrade.Width = 80;
            // 
            // label19
            // 
            label19.AutoSize = true;
            label19.Font = new Font("Segoe UI", 20F, FontStyle.Regular, GraphicsUnit.Point);
            label19.Location = new Point(324, 343);
            label19.Name = "label19";
            label19.Size = new Size(152, 37);
            label19.TabIndex = 26;
            label19.Text = "Final Grade";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(806, 713);
            Controls.Add(label19);
            Controls.Add(listView2);
            Controls.Add(label16);
            Controls.Add(label17);
            Controls.Add(label18);
            Controls.Add(VarianceCalculator_BTN);
            Controls.Add(label13);
            Controls.Add(label14);
            Controls.Add(label15);
            Controls.Add(StandardDeviation_BTN);
            Controls.Add(label10);
            Controls.Add(label11);
            Controls.Add(label12);
            Controls.Add(CalculateRange_BTN);
            Controls.Add(label7);
            Controls.Add(label8);
            Controls.Add(label9);
            Controls.Add(CalculateMode_BTN);
            Controls.Add(label4);
            Controls.Add(label5);
            Controls.Add(label6);
            Controls.Add(CalculateMedian_BTN);
            Controls.Add(label3);
            Controls.Add(label2);
            Controls.Add(listView1);
            Controls.Add(CalculateMean_BTN);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Button CalculateMean_BTN;
        private ListView listView1;
        private ColumnHeader StudentName;
        private Label label2;
        private Label label3;
        private ColumnHeader Prelim;
        private ColumnHeader Midterm;
        private ColumnHeader Finals;
        private Button CalculateMedian_BTN;
        private Label label4;
        private Label label5;
        private Label label6;
        private Button CalculateMode_BTN;
        private Label label7;
        private Label label8;
        private Label label9;
        private Button CalculateRange_BTN;
        private Label label10;
        private Label label11;
        private Label label12;
        private Button StandardDeviation_BTN;
        private Label label13;
        private Label label14;
        private Label label15;
        private Button VarianceCalculator_BTN;
        private Label label16;
        private Label label17;
        private Label label18;
        private ListView listView2;
        private ColumnHeader columnHeader1;
        private ColumnHeader columnHeader2;
        private ColumnHeader columnHeader3;
        private ColumnHeader columnHeader4;
        private ColumnHeader FinalGrade;
        private Label label19;
    }
}