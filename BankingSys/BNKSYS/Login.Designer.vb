<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Login
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.UN_TB = New System.Windows.Forms.TextBox()
        Me.PN_TB = New System.Windows.Forms.TextBox()
        Me.LGN_BTN = New System.Windows.Forms.Button()
        Me.SGN_BTN = New System.Windows.Forms.Button()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.CheckBox1 = New System.Windows.Forms.CheckBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Panel1.SuspendLayout()
        Me.SuspendLayout()
        '
        'UN_TB
        '
        Me.UN_TB.AcceptsTab = True
        Me.UN_TB.AllowDrop = True
        Me.UN_TB.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.UN_TB.BorderStyle = System.Windows.Forms.BorderStyle.None
        Me.UN_TB.Font = New System.Drawing.Font("Elephant", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.UN_TB.Location = New System.Drawing.Point(241, 333)
        Me.UN_TB.Name = "UN_TB"
        Me.UN_TB.Size = New System.Drawing.Size(327, 25)
        Me.UN_TB.TabIndex = 0
        '
        'PN_TB
        '
        Me.PN_TB.AcceptsTab = True
        Me.PN_TB.AllowDrop = True
        Me.PN_TB.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.PN_TB.BorderStyle = System.Windows.Forms.BorderStyle.None
        Me.PN_TB.Font = New System.Drawing.Font("Elephant", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.PN_TB.Location = New System.Drawing.Point(241, 393)
        Me.PN_TB.Name = "PN_TB"
        Me.PN_TB.Size = New System.Drawing.Size(327, 25)
        Me.PN_TB.TabIndex = 1
        Me.PN_TB.Text = "Password"
        Me.PN_TB.UseSystemPasswordChar = True
        '
        'LGN_BTN
        '
        Me.LGN_BTN.AllowDrop = True
        Me.LGN_BTN.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.LGN_BTN.BackColor = System.Drawing.Color.FromArgb(CType(CType(1, Byte), Integer), CType(CType(25, Byte), Integer), CType(CType(54, Byte), Integer))
        Me.LGN_BTN.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(254, Byte), Integer), CType(CType(95, Byte), Integer), CType(CType(85, Byte), Integer))
        Me.LGN_BTN.FlatAppearance.BorderSize = 2
        Me.LGN_BTN.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(128, Byte), Integer))
        Me.LGN_BTN.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(128, Byte), Integer))
        Me.LGN_BTN.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.LGN_BTN.Font = New System.Drawing.Font("Elephant", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.LGN_BTN.ForeColor = System.Drawing.Color.White
        Me.LGN_BTN.Location = New System.Drawing.Point(241, 467)
        Me.LGN_BTN.Name = "LGN_BTN"
        Me.LGN_BTN.Size = New System.Drawing.Size(119, 56)
        Me.LGN_BTN.TabIndex = 3
        Me.LGN_BTN.Text = "Login"
        Me.LGN_BTN.UseVisualStyleBackColor = False
        '
        'SGN_BTN
        '
        Me.SGN_BTN.AllowDrop = True
        Me.SGN_BTN.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.SGN_BTN.BackColor = System.Drawing.Color.FromArgb(CType(CType(1, Byte), Integer), CType(CType(25, Byte), Integer), CType(CType(54, Byte), Integer))
        Me.SGN_BTN.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(254, Byte), Integer), CType(CType(95, Byte), Integer), CType(CType(85, Byte), Integer))
        Me.SGN_BTN.FlatAppearance.BorderSize = 2
        Me.SGN_BTN.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(128, Byte), Integer))
        Me.SGN_BTN.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(128, Byte), Integer))
        Me.SGN_BTN.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.SGN_BTN.Font = New System.Drawing.Font("Elephant", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.SGN_BTN.ForeColor = System.Drawing.Color.White
        Me.SGN_BTN.Location = New System.Drawing.Point(449, 469)
        Me.SGN_BTN.Name = "SGN_BTN"
        Me.SGN_BTN.Size = New System.Drawing.Size(119, 54)
        Me.SGN_BTN.TabIndex = 3
        Me.SGN_BTN.Text = "Create Account"
        Me.SGN_BTN.UseVisualStyleBackColor = False
        '
        'Label4
        '
        Me.Label4.AllowDrop = True
        Me.Label4.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.Label4.AutoSize = True
        Me.Label4.BackColor = System.Drawing.Color.FromArgb(CType(CType(252, Byte), Integer), CType(CType(239, Byte), Integer), CType(CType(249, Byte), Integer))
        Me.Label4.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Label4.Font = New System.Drawing.Font("Elephant", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.ForeColor = System.Drawing.Color.Black
        Me.Label4.Location = New System.Drawing.Point(390, 480)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(33, 21)
        Me.Label4.TabIndex = 4
        Me.Label4.Text = "Or"
        '
        'Panel1
        '
        Me.Panel1.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.Panel1.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.Panel1.BackColor = System.Drawing.Color.FromArgb(CType(CType(252, Byte), Integer), CType(CType(239, Byte), Integer), CType(CType(249, Byte), Integer))
        Me.Panel1.Controls.Add(Me.CheckBox1)
        Me.Panel1.Controls.Add(Me.LGN_BTN)
        Me.Panel1.Controls.Add(Me.Label2)
        Me.Panel1.Controls.Add(Me.Label1)
        Me.Panel1.Controls.Add(Me.Label4)
        Me.Panel1.Controls.Add(Me.SGN_BTN)
        Me.Panel1.Controls.Add(Me.PN_TB)
        Me.Panel1.Controls.Add(Me.UN_TB)
        Me.Panel1.ForeColor = System.Drawing.SystemColors.InactiveCaptionText
        Me.Panel1.Location = New System.Drawing.Point(131, -15)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(776, 768)
        Me.Panel1.TabIndex = 5
        '
        'CheckBox1
        '
        Me.CheckBox1.AutoSize = True
        Me.CheckBox1.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.CheckBox1.Location = New System.Drawing.Point(241, 434)
        Me.CheckBox1.Name = "CheckBox1"
        Me.CheckBox1.Size = New System.Drawing.Size(99, 17)
        Me.CheckBox1.TabIndex = 5
        Me.CheckBox1.Text = "Show Password"
        Me.CheckBox1.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.AllowDrop = True
        Me.Label2.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.Label2.AutoSize = True
        Me.Label2.BackColor = System.Drawing.Color.FromArgb(CType(CType(252, Byte), Integer), CType(CType(239, Byte), Integer), CType(CType(249, Byte), Integer))
        Me.Label2.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Label2.Font = New System.Drawing.Font("Elephant", 20.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.ForeColor = System.Drawing.Color.Black
        Me.Label2.Location = New System.Drawing.Point(323, 278)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(138, 35)
        Me.Label2.TabIndex = 0
        Me.Label2.Text = "Holdings"
        '
        'Label1
        '
        Me.Label1.AllowDrop = True
        Me.Label1.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.Label1.AutoSize = True
        Me.Label1.BackColor = System.Drawing.Color.FromArgb(CType(CType(252, Byte), Integer), CType(CType(239, Byte), Integer), CType(CType(249, Byte), Integer))
        Me.Label1.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.Label1.Font = New System.Drawing.Font("Elephant", 20.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.ForeColor = System.Drawing.Color.Black
        Me.Label1.Location = New System.Drawing.Point(276, 243)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(237, 35)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Clark and Cloud"
        '
        'Login
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(252, Byte), Integer), CType(CType(239, Byte), Integer), CType(CType(249, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(1039, 749)
        Me.Controls.Add(Me.Panel1)
        Me.Name = "Login"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "C & C  Holdings"
        Me.Panel1.ResumeLayout(False)
        Me.Panel1.PerformLayout()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents PN_TB As TextBox
    Friend WithEvents LGN_BTN As Button
    Friend WithEvents SGN_BTN As Button
    Friend WithEvents Label4 As Label
    Friend WithEvents Panel1 As Panel
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents CheckBox1 As CheckBox
    Public WithEvents UN_TB As TextBox
End Class
