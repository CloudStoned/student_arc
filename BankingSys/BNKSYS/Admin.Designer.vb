<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Admin
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
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.DELACCNT_BTN = New System.Windows.Forms.Button()
        Me.EXIT_BTN = New System.Windows.Forms.Button()
        Me.UPDTACC_BTN = New System.Windows.Forms.Button()
        Me.SHWUSERS_BTN = New System.Windows.Forms.Button()
        Me.Panel2 = New System.Windows.Forms.Panel()
        Me.Panel1.SuspendLayout()
        Me.Panel2.SuspendLayout()
        Me.SuspendLayout()
        '
        'Panel1
        '
        Me.Panel1.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.Panel1.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.Panel1.BackColor = System.Drawing.Color.FromArgb(CType(CType(1, Byte), Integer), CType(CType(25, Byte), Integer), CType(CType(54, Byte), Integer))
        Me.Panel1.Controls.Add(Me.Label1)
        Me.Panel1.Controls.Add(Me.Label2)
        Me.Panel1.ForeColor = System.Drawing.SystemColors.ButtonFace
        Me.Panel1.Location = New System.Drawing.Point(144, 2)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(776, 66)
        Me.Panel1.TabIndex = 2
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Elephant", 11.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(575, 27)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(173, 20)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Clark Cloud Holdings"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Elephant", 20.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(32, 15)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(105, 35)
        Me.Label2.TabIndex = 0
        Me.Label2.Text = "Admin"
        '
        'DELACCNT_BTN
        '
        Me.DELACCNT_BTN.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.DELACCNT_BTN.AutoEllipsis = True
        Me.DELACCNT_BTN.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.DELACCNT_BTN.BackColor = System.Drawing.Color.FromArgb(CType(CType(1, Byte), Integer), CType(CType(25, Byte), Integer), CType(CType(54, Byte), Integer))
        Me.DELACCNT_BTN.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(128, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.DELACCNT_BTN.FlatAppearance.BorderSize = 2
        Me.DELACCNT_BTN.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.DELACCNT_BTN.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.DELACCNT_BTN.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.DELACCNT_BTN.Font = New System.Drawing.Font("Elephant", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.DELACCNT_BTN.ForeColor = System.Drawing.Color.Transparent
        Me.DELACCNT_BTN.Location = New System.Drawing.Point(331, 361)
        Me.DELACCNT_BTN.Name = "DELACCNT_BTN"
        Me.DELACCNT_BTN.Size = New System.Drawing.Size(165, 50)
        Me.DELACCNT_BTN.TabIndex = 3
        Me.DELACCNT_BTN.Text = "Delete Account"
        Me.DELACCNT_BTN.UseVisualStyleBackColor = False
        '
        'EXIT_BTN
        '
        Me.EXIT_BTN.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.EXIT_BTN.AutoEllipsis = True
        Me.EXIT_BTN.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.EXIT_BTN.BackColor = System.Drawing.Color.FromArgb(CType(CType(1, Byte), Integer), CType(CType(25, Byte), Integer), CType(CType(54, Byte), Integer))
        Me.EXIT_BTN.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(128, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.EXIT_BTN.FlatAppearance.BorderSize = 2
        Me.EXIT_BTN.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.EXIT_BTN.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.EXIT_BTN.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.EXIT_BTN.Font = New System.Drawing.Font("Elephant", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.EXIT_BTN.ForeColor = System.Drawing.Color.Transparent
        Me.EXIT_BTN.Location = New System.Drawing.Point(331, 431)
        Me.EXIT_BTN.Name = "EXIT_BTN"
        Me.EXIT_BTN.Size = New System.Drawing.Size(165, 50)
        Me.EXIT_BTN.TabIndex = 4
        Me.EXIT_BTN.Text = "Exit"
        Me.EXIT_BTN.UseVisualStyleBackColor = False
        '
        'UPDTACC_BTN
        '
        Me.UPDTACC_BTN.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.UPDTACC_BTN.AutoEllipsis = True
        Me.UPDTACC_BTN.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.UPDTACC_BTN.BackColor = System.Drawing.Color.FromArgb(CType(CType(1, Byte), Integer), CType(CType(25, Byte), Integer), CType(CType(54, Byte), Integer))
        Me.UPDTACC_BTN.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(128, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.UPDTACC_BTN.FlatAppearance.BorderSize = 2
        Me.UPDTACC_BTN.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.UPDTACC_BTN.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.UPDTACC_BTN.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.UPDTACC_BTN.Font = New System.Drawing.Font("Elephant", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.UPDTACC_BTN.ForeColor = System.Drawing.Color.Transparent
        Me.UPDTACC_BTN.Location = New System.Drawing.Point(331, 213)
        Me.UPDTACC_BTN.Name = "UPDTACC_BTN"
        Me.UPDTACC_BTN.Size = New System.Drawing.Size(165, 50)
        Me.UPDTACC_BTN.TabIndex = 1
        Me.UPDTACC_BTN.Text = "Modify Account"
        Me.UPDTACC_BTN.UseVisualStyleBackColor = False
        '
        'SHWUSERS_BTN
        '
        Me.SHWUSERS_BTN.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.SHWUSERS_BTN.AutoEllipsis = True
        Me.SHWUSERS_BTN.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.SHWUSERS_BTN.BackColor = System.Drawing.Color.FromArgb(CType(CType(1, Byte), Integer), CType(CType(25, Byte), Integer), CType(CType(54, Byte), Integer))
        Me.SHWUSERS_BTN.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(128, Byte), Integer), CType(CType(0, Byte), Integer))
        Me.SHWUSERS_BTN.FlatAppearance.BorderSize = 2
        Me.SHWUSERS_BTN.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.SHWUSERS_BTN.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(255, Byte), Integer), CType(CType(192, Byte), Integer), CType(CType(192, Byte), Integer))
        Me.SHWUSERS_BTN.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.SHWUSERS_BTN.Font = New System.Drawing.Font("Elephant", 12.0!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.SHWUSERS_BTN.ForeColor = System.Drawing.Color.Transparent
        Me.SHWUSERS_BTN.Location = New System.Drawing.Point(331, 287)
        Me.SHWUSERS_BTN.Name = "SHWUSERS_BTN"
        Me.SHWUSERS_BTN.Size = New System.Drawing.Size(165, 50)
        Me.SHWUSERS_BTN.TabIndex = 2
        Me.SHWUSERS_BTN.Text = "Show All Users"
        Me.SHWUSERS_BTN.UseVisualStyleBackColor = False
        '
        'Panel2
        '
        Me.Panel2.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.Panel2.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.Panel2.BackColor = System.Drawing.Color.FromArgb(CType(CType(252, Byte), Integer), CType(CType(239, Byte), Integer), CType(CType(249, Byte), Integer))
        Me.Panel2.Controls.Add(Me.UPDTACC_BTN)
        Me.Panel2.Controls.Add(Me.EXIT_BTN)
        Me.Panel2.Controls.Add(Me.DELACCNT_BTN)
        Me.Panel2.Controls.Add(Me.SHWUSERS_BTN)
        Me.Panel2.ForeColor = System.Drawing.SystemColors.ButtonFace
        Me.Panel2.Location = New System.Drawing.Point(144, 2)
        Me.Panel2.Name = "Panel2"
        Me.Panel2.Size = New System.Drawing.Size(776, 760)
        Me.Panel2.TabIndex = 16
        '
        'Admin
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.ClientSize = New System.Drawing.Size(1039, 749)
        Me.Controls.Add(Me.Panel1)
        Me.Controls.Add(Me.Panel2)
        Me.Name = "Admin"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Admin"
        Me.Panel1.ResumeLayout(False)
        Me.Panel1.PerformLayout()
        Me.Panel2.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents Panel1 As Panel
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents DELACCNT_BTN As Button
    Friend WithEvents EXIT_BTN As Button
    Friend WithEvents UPDTACC_BTN As Button
    Friend WithEvents SHWUSERS_BTN As Button
    Friend WithEvents Panel2 As Panel
End Class
