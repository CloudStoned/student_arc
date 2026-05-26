<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class transachisto
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim DataGridViewCellStyle1 As System.Windows.Forms.DataGridViewCellStyle = New System.Windows.Forms.DataGridViewCellStyle()
        Dim DataGridViewCellStyle2 As System.Windows.Forms.DataGridViewCellStyle = New System.Windows.Forms.DataGridViewCellStyle()
        Dim DataGridViewCellStyle3 As System.Windows.Forms.DataGridViewCellStyle = New System.Windows.Forms.DataGridViewCellStyle()
        Dim DataGridViewCellStyle4 As System.Windows.Forms.DataGridViewCellStyle = New System.Windows.Forms.DataGridViewCellStyle()
        Dim DataGridViewCellStyle5 As System.Windows.Forms.DataGridViewCellStyle = New System.Windows.Forms.DataGridViewCellStyle()
        Me.UserTable = New System.Windows.Forms.DataGridView()
        Me.ButtonLoadTransaction = New System.Windows.Forms.Button()
        Me.ButtonBack = New System.Windows.Forms.Button()
        Me.PanelTop = New System.Windows.Forms.Panel()
        Me.LabelBank = New System.Windows.Forms.Label()
        Me.LabelUsername = New System.Windows.Forms.Label()
        CType(Me.UserTable, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.PanelTop.SuspendLayout()
        Me.SuspendLayout()
        '
        'UserTable
        '
        Me.UserTable.AllowUserToDeleteRows = False
        Me.UserTable.AllowUserToOrderColumns = True
        DataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter
        DataGridViewCellStyle1.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        DataGridViewCellStyle1.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(56, Byte), Integer))
        DataGridViewCellStyle1.SelectionBackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(56, Byte), Integer))
        DataGridViewCellStyle1.SelectionForeColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.UserTable.AlternatingRowsDefaultCellStyle = DataGridViewCellStyle1
        Me.UserTable.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.UserTable.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.DisplayedCells
        Me.UserTable.AutoSizeRowsMode = System.Windows.Forms.DataGridViewAutoSizeRowsMode.DisplayedCells
        Me.UserTable.BackgroundColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        DataGridViewCellStyle2.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter
        DataGridViewCellStyle2.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        DataGridViewCellStyle2.Font = New System.Drawing.Font("Elephant", 12.0!)
        DataGridViewCellStyle2.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(56, Byte), Integer))
        DataGridViewCellStyle2.SelectionBackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(56, Byte), Integer))
        DataGridViewCellStyle2.SelectionForeColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        DataGridViewCellStyle2.WrapMode = System.Windows.Forms.DataGridViewTriState.[True]
        Me.UserTable.ColumnHeadersDefaultCellStyle = DataGridViewCellStyle2
        Me.UserTable.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize
        Me.UserTable.Cursor = System.Windows.Forms.Cursors.Hand
        DataGridViewCellStyle3.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter
        DataGridViewCellStyle3.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        DataGridViewCellStyle3.Font = New System.Drawing.Font("Elephant", 12.0!)
        DataGridViewCellStyle3.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(56, Byte), Integer))
        DataGridViewCellStyle3.SelectionBackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(56, Byte), Integer))
        DataGridViewCellStyle3.SelectionForeColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        DataGridViewCellStyle3.WrapMode = System.Windows.Forms.DataGridViewTriState.[False]
        Me.UserTable.DefaultCellStyle = DataGridViewCellStyle3
        Me.UserTable.GridColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(56, Byte), Integer))
        Me.UserTable.Location = New System.Drawing.Point(21, 88)
        Me.UserTable.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.UserTable.Name = "UserTable"
        DataGridViewCellStyle4.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter
        DataGridViewCellStyle4.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        DataGridViewCellStyle4.Font = New System.Drawing.Font("Elephant", 12.0!)
        DataGridViewCellStyle4.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(56, Byte), Integer))
        DataGridViewCellStyle4.SelectionBackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(56, Byte), Integer))
        DataGridViewCellStyle4.SelectionForeColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        DataGridViewCellStyle4.WrapMode = System.Windows.Forms.DataGridViewTriState.[True]
        Me.UserTable.RowHeadersDefaultCellStyle = DataGridViewCellStyle4
        Me.UserTable.RowHeadersWidth = 51
        DataGridViewCellStyle5.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter
        DataGridViewCellStyle5.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        DataGridViewCellStyle5.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(56, Byte), Integer))
        DataGridViewCellStyle5.SelectionBackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(56, Byte), Integer))
        DataGridViewCellStyle5.SelectionForeColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.UserTable.RowsDefaultCellStyle = DataGridViewCellStyle5
        Me.UserTable.RowTemplate.Height = 50
        Me.UserTable.RowTemplate.Resizable = System.Windows.Forms.DataGridViewTriState.[True]
        Me.UserTable.Size = New System.Drawing.Size(748, 289)
        Me.UserTable.TabIndex = 0
        '
        'ButtonLoadTransaction
        '
        Me.ButtonLoadTransaction.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonLoadTransaction.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(50, Byte), Integer), CType(CType(205, Byte), Integer), CType(CType(51, Byte), Integer))
        Me.ButtonLoadTransaction.FlatAppearance.BorderSize = 2
        Me.ButtonLoadTransaction.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonLoadTransaction.Font = New System.Drawing.Font("Elephant", 10.2!)
        Me.ButtonLoadTransaction.ForeColor = System.Drawing.Color.FromArgb(CType(CType(50, Byte), Integer), CType(CType(205, Byte), Integer), CType(CType(51, Byte), Integer))
        Me.ButtonLoadTransaction.Location = New System.Drawing.Point(555, 435)
        Me.ButtonLoadTransaction.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.ButtonLoadTransaction.Name = "ButtonLoadTransaction"
        Me.ButtonLoadTransaction.Size = New System.Drawing.Size(214, 44)
        Me.ButtonLoadTransaction.TabIndex = 1
        Me.ButtonLoadTransaction.Text = "Load Transactions"
        Me.ButtonLoadTransaction.UseVisualStyleBackColor = True
        '
        'ButtonBack
        '
        Me.ButtonBack.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonBack.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.ButtonBack.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonBack.FlatAppearance.BorderSize = 2
        Me.ButtonBack.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonBack.Font = New System.Drawing.Font("Elephant", 10.8!)
        Me.ButtonBack.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonBack.Location = New System.Drawing.Point(25, 435)
        Me.ButtonBack.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.ButtonBack.Name = "ButtonBack"
        Me.ButtonBack.Size = New System.Drawing.Size(108, 44)
        Me.ButtonBack.TabIndex = 2
        Me.ButtonBack.Text = "Back"
        Me.ButtonBack.UseVisualStyleBackColor = False
        '
        'PanelTop
        '
        Me.PanelTop.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.PanelTop.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.PanelTop.BackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.PanelTop.Controls.Add(Me.LabelBank)
        Me.PanelTop.Controls.Add(Me.LabelUsername)
        Me.PanelTop.ForeColor = System.Drawing.SystemColors.ButtonFace
        Me.PanelTop.Location = New System.Drawing.Point(1, -3)
        Me.PanelTop.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.PanelTop.Name = "PanelTop"
        Me.PanelTop.Size = New System.Drawing.Size(803, 66)
        Me.PanelTop.TabIndex = 9
        '
        'LabelBank
        '
        Me.LabelBank.AutoSize = True
        Me.LabelBank.Font = New System.Drawing.Font("Elephant", 11.25!)
        Me.LabelBank.Location = New System.Drawing.Point(595, 26)
        Me.LabelBank.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.LabelBank.Name = "LabelBank"
        Me.LabelBank.Size = New System.Drawing.Size(173, 20)
        Me.LabelBank.TabIndex = 1
        Me.LabelBank.Text = "Clark Cloud Holdings"
        '
        'LabelUsername
        '
        Me.LabelUsername.AutoSize = True
        Me.LabelUsername.Font = New System.Drawing.Font("Elephant", 28.2!)
        Me.LabelUsername.Location = New System.Drawing.Point(11, 12)
        Me.LabelUsername.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.LabelUsername.Name = "LabelUsername"
        Me.LabelUsername.Size = New System.Drawing.Size(214, 49)
        Me.LabelUsername.TabIndex = 0
        Me.LabelUsername.Text = "Username"
        '
        'transachisto
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(804, 493)
        Me.Controls.Add(Me.PanelTop)
        Me.Controls.Add(Me.ButtonBack)
        Me.Controls.Add(Me.ButtonLoadTransaction)
        Me.Controls.Add(Me.UserTable)
        Me.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.MinimumSize = New System.Drawing.Size(784, 525)
        Me.Name = "transachisto"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Transaction History"
        CType(Me.UserTable, System.ComponentModel.ISupportInitialize).EndInit()
        Me.PanelTop.ResumeLayout(False)
        Me.PanelTop.PerformLayout()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents UserTable As DataGridView
    Friend WithEvents ButtonLoadTransaction As Button
    Friend WithEvents ButtonBack As Button
    Friend WithEvents PanelTop As Panel
    Friend WithEvents LabelBank As Label
    Friend WithEvents LabelUsername As Label
End Class
