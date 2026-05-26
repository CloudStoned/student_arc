<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class usermenu
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
        Me.PanelTop = New System.Windows.Forms.Panel()
        Me.LabelBank = New System.Windows.Forms.Label()
        Me.LabelUsername = New System.Windows.Forms.Label()
        Me.ButtonSendMoney = New System.Windows.Forms.Button()
        Me.ButtonTransaction = New System.Windows.Forms.Button()
        Me.ButtonWithdraw = New System.Windows.Forms.Button()
        Me.ButtonDeposit = New System.Windows.Forms.Button()
        Me.PanelBalance = New System.Windows.Forms.Panel()
        Me.LabelAccountNumber = New System.Windows.Forms.Label()
        Me.LabelBalance = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.LabelBalanceText = New System.Windows.Forms.Label()
        Me.ButtonProfile = New System.Windows.Forms.Button()
        Me.ButtonLogout = New System.Windows.Forms.Button()
        Me.PanelTop.SuspendLayout()
        Me.PanelBalance.SuspendLayout()
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
        Me.PanelTop.Location = New System.Drawing.Point(0, -3)
        Me.PanelTop.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.PanelTop.Name = "PanelTop"
        Me.PanelTop.Size = New System.Drawing.Size(776, 66)
        Me.PanelTop.TabIndex = 8
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
        'ButtonSendMoney
        '
        Me.ButtonSendMoney.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonSendMoney.AutoEllipsis = True
        Me.ButtonSendMoney.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.ButtonSendMoney.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.ButtonSendMoney.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonSendMoney.FlatAppearance.BorderSize = 2
        Me.ButtonSendMoney.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonSendMoney.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonSendMoney.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonSendMoney.Font = New System.Drawing.Font("Elephant", 12.0!)
        Me.ButtonSendMoney.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonSendMoney.Location = New System.Drawing.Point(434, 332)
        Me.ButtonSendMoney.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.ButtonSendMoney.Name = "ButtonSendMoney"
        Me.ButtonSendMoney.Size = New System.Drawing.Size(164, 50)
        Me.ButtonSendMoney.TabIndex = 4
        Me.ButtonSendMoney.Text = "Send Money"
        Me.ButtonSendMoney.UseVisualStyleBackColor = False
        '
        'ButtonTransaction
        '
        Me.ButtonTransaction.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonTransaction.AutoEllipsis = True
        Me.ButtonTransaction.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.ButtonTransaction.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.ButtonTransaction.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonTransaction.FlatAppearance.BorderSize = 2
        Me.ButtonTransaction.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonTransaction.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonTransaction.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonTransaction.Font = New System.Drawing.Font("Elephant", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.ButtonTransaction.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonTransaction.Location = New System.Drawing.Point(164, 332)
        Me.ButtonTransaction.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.ButtonTransaction.Name = "ButtonTransaction"
        Me.ButtonTransaction.Size = New System.Drawing.Size(164, 50)
        Me.ButtonTransaction.TabIndex = 3
        Me.ButtonTransaction.Text = "Transaction History"
        Me.ButtonTransaction.UseVisualStyleBackColor = False
        '
        'ButtonWithdraw
        '
        Me.ButtonWithdraw.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonWithdraw.AutoEllipsis = True
        Me.ButtonWithdraw.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.ButtonWithdraw.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.ButtonWithdraw.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonWithdraw.FlatAppearance.BorderSize = 2
        Me.ButtonWithdraw.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonWithdraw.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonWithdraw.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonWithdraw.Font = New System.Drawing.Font("Elephant", 12.0!)
        Me.ButtonWithdraw.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonWithdraw.Location = New System.Drawing.Point(434, 255)
        Me.ButtonWithdraw.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.ButtonWithdraw.Name = "ButtonWithdraw"
        Me.ButtonWithdraw.Size = New System.Drawing.Size(164, 50)
        Me.ButtonWithdraw.TabIndex = 2
        Me.ButtonWithdraw.Text = "Withdraw"
        Me.ButtonWithdraw.UseVisualStyleBackColor = False
        '
        'ButtonDeposit
        '
        Me.ButtonDeposit.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonDeposit.AutoEllipsis = True
        Me.ButtonDeposit.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.ButtonDeposit.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.ButtonDeposit.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonDeposit.FlatAppearance.BorderSize = 2
        Me.ButtonDeposit.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonDeposit.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonDeposit.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonDeposit.Font = New System.Drawing.Font("Elephant", 12.0!)
        Me.ButtonDeposit.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonDeposit.Location = New System.Drawing.Point(164, 255)
        Me.ButtonDeposit.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.ButtonDeposit.Name = "ButtonDeposit"
        Me.ButtonDeposit.Size = New System.Drawing.Size(164, 50)
        Me.ButtonDeposit.TabIndex = 1
        Me.ButtonDeposit.Text = "Deposit"
        Me.ButtonDeposit.UseVisualStyleBackColor = False
        '
        'PanelBalance
        '
        Me.PanelBalance.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.PanelBalance.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.PanelBalance.BackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.PanelBalance.Controls.Add(Me.LabelAccountNumber)
        Me.PanelBalance.Controls.Add(Me.LabelBalance)
        Me.PanelBalance.Controls.Add(Me.Label1)
        Me.PanelBalance.Controls.Add(Me.LabelBalanceText)
        Me.PanelBalance.Location = New System.Drawing.Point(164, 90)
        Me.PanelBalance.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.PanelBalance.Name = "PanelBalance"
        Me.PanelBalance.Size = New System.Drawing.Size(434, 134)
        Me.PanelBalance.TabIndex = 14
        '
        'LabelAccountNumber
        '
        Me.LabelAccountNumber.AutoSize = True
        Me.LabelAccountNumber.Font = New System.Drawing.Font("Elephant", 12.0!)
        Me.LabelAccountNumber.ForeColor = System.Drawing.SystemColors.ControlLight
        Me.LabelAccountNumber.Location = New System.Drawing.Point(102, 113)
        Me.LabelAccountNumber.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.LabelAccountNumber.Name = "LabelAccountNumber"
        Me.LabelAccountNumber.Size = New System.Drawing.Size(146, 21)
        Me.LabelAccountNumber.TabIndex = 4
        Me.LabelAccountNumber.Text = "123 123 123 123"
        '
        'LabelBalance
        '
        Me.LabelBalance.AutoSize = True
        Me.LabelBalance.BackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.LabelBalance.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.LabelBalance.Font = New System.Drawing.Font("Elephant", 30.0!)
        Me.LabelBalance.ForeColor = System.Drawing.Color.White
        Me.LabelBalance.Location = New System.Drawing.Point(66, 47)
        Me.LabelBalance.Margin = New System.Windows.Forms.Padding(2, 0, 2, 0)
        Me.LabelBalance.Name = "LabelBalance"
        Me.LabelBalance.Size = New System.Drawing.Size(288, 51)
        Me.LabelBalance.TabIndex = 3
        Me.LabelBalance.Text = "P 10,000.00"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Elephant", 12.0!)
        Me.Label1.ForeColor = System.Drawing.SystemColors.ControlLight
        Me.Label1.Location = New System.Drawing.Point(7, 113)
        Me.Label1.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(96, 21)
        Me.Label1.TabIndex = 2
        Me.Label1.Text = "Accnt No. :"
        '
        'LabelBalanceText
        '
        Me.LabelBalanceText.AutoSize = True
        Me.LabelBalanceText.Font = New System.Drawing.Font("Elephant", 12.0!)
        Me.LabelBalanceText.ForeColor = System.Drawing.SystemColors.ControlLight
        Me.LabelBalanceText.Location = New System.Drawing.Point(20, 11)
        Me.LabelBalanceText.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.LabelBalanceText.Name = "LabelBalanceText"
        Me.LabelBalanceText.Size = New System.Drawing.Size(74, 21)
        Me.LabelBalanceText.TabIndex = 2
        Me.LabelBalanceText.Text = "Balance"
        '
        'ButtonProfile
        '
        Me.ButtonProfile.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonProfile.AutoEllipsis = True
        Me.ButtonProfile.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.ButtonProfile.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.ButtonProfile.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonProfile.FlatAppearance.BorderSize = 2
        Me.ButtonProfile.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonProfile.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonProfile.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonProfile.Font = New System.Drawing.Font("Elephant", 12.0!)
        Me.ButtonProfile.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonProfile.Location = New System.Drawing.Point(164, 406)
        Me.ButtonProfile.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.ButtonProfile.Name = "ButtonProfile"
        Me.ButtonProfile.Size = New System.Drawing.Size(164, 50)
        Me.ButtonProfile.TabIndex = 5
        Me.ButtonProfile.Text = "Profile"
        Me.ButtonProfile.UseVisualStyleBackColor = False
        '
        'ButtonLogout
        '
        Me.ButtonLogout.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonLogout.AutoEllipsis = True
        Me.ButtonLogout.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.ButtonLogout.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.ButtonLogout.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonLogout.FlatAppearance.BorderSize = 2
        Me.ButtonLogout.FlatAppearance.MouseDownBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonLogout.FlatAppearance.MouseOverBackColor = System.Drawing.Color.FromArgb(CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer), CType(CType(224, Byte), Integer))
        Me.ButtonLogout.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonLogout.Font = New System.Drawing.Font("Elephant", 12.0!)
        Me.ButtonLogout.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonLogout.Location = New System.Drawing.Point(434, 406)
        Me.ButtonLogout.Margin = New System.Windows.Forms.Padding(4, 3, 4, 3)
        Me.ButtonLogout.Name = "ButtonLogout"
        Me.ButtonLogout.Size = New System.Drawing.Size(164, 50)
        Me.ButtonLogout.TabIndex = 6
        Me.ButtonLogout.Text = "Logout"
        Me.ButtonLogout.UseVisualStyleBackColor = False
        '
        'usermenu
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(245, Byte), Integer), CType(CType(252, Byte), Integer), CType(CType(253, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(776, 576)
        Me.Controls.Add(Me.PanelBalance)
        Me.Controls.Add(Me.PanelTop)
        Me.Controls.Add(Me.ButtonSendMoney)
        Me.Controls.Add(Me.ButtonLogout)
        Me.Controls.Add(Me.ButtonProfile)
        Me.Controls.Add(Me.ButtonTransaction)
        Me.Controls.Add(Me.ButtonWithdraw)
        Me.Controls.Add(Me.ButtonDeposit)
        Me.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.MinimumSize = New System.Drawing.Size(784, 480)
        Me.Name = "usermenu"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Main Menu"
        Me.PanelTop.ResumeLayout(False)
        Me.PanelTop.PerformLayout()
        Me.PanelBalance.ResumeLayout(False)
        Me.PanelBalance.PerformLayout()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents PanelTop As Panel
    Friend WithEvents LabelBank As Label
    Friend WithEvents LabelUsername As Label
    Friend WithEvents ButtonSendMoney As Button
    Friend WithEvents ButtonTransaction As Button
    Friend WithEvents ButtonWithdraw As Button
    Friend WithEvents ButtonDeposit As Button
    Friend WithEvents PanelBalance As Panel
    Friend WithEvents LabelAccountNumber As Label
    Friend WithEvents LabelBalance As Label
    Friend WithEvents LabelBalanceText As Label
    Friend WithEvents ButtonProfile As Button
    Friend WithEvents ButtonLogout As Button
    Friend WithEvents Label1 As Label
End Class
