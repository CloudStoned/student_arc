<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class DeleteAccount
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
        Me.TBPassword = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.ButtonBack = New System.Windows.Forms.Button()
        Me.Button1 = New System.Windows.Forms.Button()
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
        Me.PanelTop.Location = New System.Drawing.Point(-4, -3)
        Me.PanelTop.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.PanelTop.Name = "PanelTop"
        Me.PanelTop.Size = New System.Drawing.Size(776, 66)
        Me.PanelTop.TabIndex = 13
        '
        'LabelBank
        '
        Me.LabelBank.Anchor = System.Windows.Forms.AnchorStyles.Top
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
        Me.LabelUsername.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.LabelUsername.AutoSize = True
        Me.LabelUsername.Font = New System.Drawing.Font("Elephant", 28.2!)
        Me.LabelUsername.Location = New System.Drawing.Point(12, 15)
        Me.LabelUsername.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.LabelUsername.Name = "LabelUsername"
        Me.LabelUsername.Size = New System.Drawing.Size(214, 49)
        Me.LabelUsername.TabIndex = 0
        Me.LabelUsername.Text = "Username"
        '
        'TBPassword
        '
        Me.TBPassword.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.TBPassword.BackColor = System.Drawing.Color.White
        Me.TBPassword.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.TBPassword.Font = New System.Drawing.Font("Elephant", 19.8!)
        Me.TBPassword.ForeColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(0, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.TBPassword.Location = New System.Drawing.Point(197, 232)
        Me.TBPassword.Margin = New System.Windows.Forms.Padding(2)
        Me.TBPassword.MaxLength = 35
        Me.TBPassword.Name = "TBPassword"
        Me.TBPassword.Size = New System.Drawing.Size(365, 42)
        Me.TBPassword.TabIndex = 31
        Me.TBPassword.Text = "Password"
        Me.TBPassword.UseSystemPasswordChar = True
        '
        'Label1
        '
        Me.Label1.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Elephant", 28.2!)
        Me.Label1.ForeColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(0, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.Label1.Location = New System.Drawing.Point(158, 165)
        Me.Label1.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(490, 49)
        Me.Label1.TabIndex = 28
        Me.Label1.Text = "Enter Current Password"
        '
        'ButtonBack
        '
        Me.ButtonBack.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonBack.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonBack.FlatAppearance.BorderSize = 2
        Me.ButtonBack.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonBack.Font = New System.Drawing.Font("Elephant", 10.2!)
        Me.ButtonBack.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonBack.Location = New System.Drawing.Point(11, 443)
        Me.ButtonBack.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.ButtonBack.Name = "ButtonBack"
        Me.ButtonBack.Size = New System.Drawing.Size(114, 44)
        Me.ButtonBack.TabIndex = 30
        Me.ButtonBack.Text = "Back"
        Me.ButtonBack.UseVisualStyleBackColor = True
        '
        'Button1
        '
        Me.Button1.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.Button1.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(0, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.Button1.FlatAppearance.BorderSize = 2
        Me.Button1.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Button1.Font = New System.Drawing.Font("Elephant", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Button1.ForeColor = System.Drawing.Color.FromArgb(CType(CType(192, Byte), Integer), CType(CType(0, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.Button1.Location = New System.Drawing.Point(333, 328)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(114, 44)
        Me.Button1.TabIndex = 32
        Me.Button1.Text = "Delete"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'CheckBox1
        '
        Me.CheckBox1.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.CheckBox1.AutoSize = True
        Me.CheckBox1.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.CheckBox1.Location = New System.Drawing.Point(197, 289)
        Me.CheckBox1.Name = "CheckBox1"
        Me.CheckBox1.Size = New System.Drawing.Size(99, 17)
        Me.CheckBox1.TabIndex = 33
        Me.CheckBox1.Text = "Show Password"
        Me.CheckBox1.UseVisualStyleBackColor = True
        '
        'DeleteAccount
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(253, Byte), Integer), CType(CType(249, Byte), Integer), CType(CType(245, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(768, 499)
        Me.Controls.Add(Me.CheckBox1)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.TBPassword)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.ButtonBack)
        Me.Controls.Add(Me.PanelTop)
        Me.Margin = New System.Windows.Forms.Padding(2)
        Me.MinimumSize = New System.Drawing.Size(784, 525)
        Me.Name = "DeleteAccount"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Delete Account"
        Me.PanelTop.ResumeLayout(False)
        Me.PanelTop.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents PanelTop As Panel
    Friend WithEvents LabelBank As Label
    Friend WithEvents LabelUsername As Label
    Friend WithEvents TBPassword As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents ButtonBack As Button
    Friend WithEvents Button1 As Button
    Friend WithEvents CheckBox1 As CheckBox
End Class
