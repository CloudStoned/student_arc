<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class ChangePin
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
        Me.PanelTop = New System.Windows.Forms.Panel()
        Me.LabelBank = New System.Windows.Forms.Label()
        Me.LabelUsername = New System.Windows.Forms.Label()
        Me.ButtonChangePin = New System.Windows.Forms.Button()
        Me.ButtonBack = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.TBChangePwd = New System.Windows.Forms.TextBox()
        Me.CheckBox1 = New System.Windows.Forms.CheckBox()
        Me.PanelTop.SuspendLayout()
        Me.SuspendLayout()
        '
        'PanelTop
        '
        Me.PanelTop.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.PanelTop.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.PanelTop.BackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.PanelTop.Controls.Add(Me.LabelBank)
        Me.PanelTop.Controls.Add(Me.LabelUsername)
        Me.PanelTop.ForeColor = System.Drawing.SystemColors.ButtonFace
        Me.PanelTop.Location = New System.Drawing.Point(12, -3)
        Me.PanelTop.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.PanelTop.Name = "PanelTop"
        Me.PanelTop.Size = New System.Drawing.Size(776, 66)
        Me.PanelTop.TabIndex = 26
        '
        'LabelBank
        '
        Me.LabelBank.AutoSize = True
        Me.LabelBank.Font = New System.Drawing.Font("Elephant", 11.25!)
        Me.LabelBank.Location = New System.Drawing.Point(592, 27)
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
        Me.LabelUsername.Location = New System.Drawing.Point(12, 15)
        Me.LabelUsername.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.LabelUsername.Name = "LabelUsername"
        Me.LabelUsername.Size = New System.Drawing.Size(214, 49)
        Me.LabelUsername.TabIndex = 0
        Me.LabelUsername.Text = "Username"
        '
        'ButtonChangePin
        '
        Me.ButtonChangePin.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonChangePin.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(125, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.ButtonChangePin.FlatAppearance.BorderSize = 2
        Me.ButtonChangePin.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonChangePin.Font = New System.Drawing.Font("Elephant", 10.2!)
        Me.ButtonChangePin.ForeColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(125, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.ButtonChangePin.Location = New System.Drawing.Point(361, 324)
        Me.ButtonChangePin.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.ButtonChangePin.Name = "ButtonChangePin"
        Me.ButtonChangePin.Size = New System.Drawing.Size(114, 44)
        Me.ButtonChangePin.TabIndex = 24
        Me.ButtonChangePin.Text = "Change Pin"
        Me.ButtonChangePin.UseVisualStyleBackColor = True
        '
        'ButtonBack
        '
        Me.ButtonBack.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonBack.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonBack.FlatAppearance.BorderSize = 2
        Me.ButtonBack.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonBack.Font = New System.Drawing.Font("Elephant", 10.2!)
        Me.ButtonBack.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonBack.Location = New System.Drawing.Point(12, 429)
        Me.ButtonBack.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.ButtonBack.Name = "ButtonBack"
        Me.ButtonBack.Size = New System.Drawing.Size(114, 44)
        Me.ButtonBack.TabIndex = 25
        Me.ButtonBack.Text = "Back"
        Me.ButtonBack.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Elephant", 28.2!)
        Me.Label1.ForeColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(125, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.Label1.Location = New System.Drawing.Point(212, 166)
        Me.Label1.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(422, 49)
        Me.Label1.TabIndex = 2
        Me.Label1.Text = "Enter New Password"
        '
        'TBChangePwd
        '
        Me.TBChangePwd.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.TBChangePwd.BackColor = System.Drawing.Color.White
        Me.TBChangePwd.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.TBChangePwd.Font = New System.Drawing.Font("Elephant", 19.8!)
        Me.TBChangePwd.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.TBChangePwd.Location = New System.Drawing.Point(225, 234)
        Me.TBChangePwd.Margin = New System.Windows.Forms.Padding(2)
        Me.TBChangePwd.MaxLength = 35
        Me.TBChangePwd.Name = "TBChangePwd"
        Me.TBChangePwd.Size = New System.Drawing.Size(365, 42)
        Me.TBChangePwd.TabIndex = 27
        Me.TBChangePwd.Text = "Password"
        Me.TBChangePwd.UseSystemPasswordChar = True
        '
        'CheckBox1
        '
        Me.CheckBox1.AutoSize = True
        Me.CheckBox1.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.CheckBox1.Location = New System.Drawing.Point(225, 295)
        Me.CheckBox1.Name = "CheckBox1"
        Me.CheckBox1.Size = New System.Drawing.Size(99, 17)
        Me.CheckBox1.TabIndex = 28
        Me.CheckBox1.Text = "Show Password"
        Me.CheckBox1.UseVisualStyleBackColor = True
        '
        'ChangePin
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(800, 486)
        Me.Controls.Add(Me.CheckBox1)
        Me.Controls.Add(Me.TBChangePwd)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.PanelTop)
        Me.Controls.Add(Me.ButtonChangePin)
        Me.Controls.Add(Me.ButtonBack)
        Me.Margin = New System.Windows.Forms.Padding(2)
        Me.MinimumSize = New System.Drawing.Size(784, 525)
        Me.Name = "ChangePin"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Change Pin"
        Me.PanelTop.ResumeLayout(False)
        Me.PanelTop.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents PanelTop As Panel
    Friend WithEvents LabelBank As Label
    Friend WithEvents LabelUsername As Label
    Friend WithEvents ButtonChangePin As Button
    Friend WithEvents ButtonBack As Button
    Friend WithEvents Label1 As Label
    Friend WithEvents TBChangePwd As TextBox
    Friend WithEvents CheckBox1 As CheckBox
End Class
