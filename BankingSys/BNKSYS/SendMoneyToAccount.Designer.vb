<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class SendMoneyToAccount
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
        Me.ButtonBack = New System.Windows.Forms.Button()
        Me.ButtonNext = New System.Windows.Forms.Button()
        Me.TextBoxAccountNumber = New System.Windows.Forms.TextBox()
        Me.PanelWhite = New System.Windows.Forms.Panel()
        Me.LabelAmount = New System.Windows.Forms.Label()
        Me.LabelBank = New System.Windows.Forms.Label()
        Me.LabelSendMoney = New System.Windows.Forms.Label()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.PanelWhite.SuspendLayout()
        Me.Panel1.SuspendLayout()
        Me.SuspendLayout()
        '
        'ButtonBack
        '
        Me.ButtonBack.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonBack.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.ButtonBack.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.ButtonBack.FlatAppearance.BorderSize = 2
        Me.ButtonBack.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonBack.Font = New System.Drawing.Font("Elephant", 10.2!)
        Me.ButtonBack.Location = New System.Drawing.Point(12, 423)
        Me.ButtonBack.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.ButtonBack.Name = "ButtonBack"
        Me.ButtonBack.Size = New System.Drawing.Size(90, 45)
        Me.ButtonBack.TabIndex = 58
        Me.ButtonBack.Text = "Back"
        Me.ButtonBack.UseVisualStyleBackColor = True
        '
        'ButtonNext
        '
        Me.ButtonNext.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.ButtonNext.BackColor = System.Drawing.Color.FromArgb(CType(CType(253, Byte), Integer), CType(CType(249, Byte), Integer), CType(CType(245, Byte), Integer))
        Me.ButtonNext.FlatAppearance.BorderColor = System.Drawing.Color.FromArgb(CType(CType(254, Byte), Integer), CType(CType(95, Byte), Integer), CType(CType(85, Byte), Integer))
        Me.ButtonNext.FlatAppearance.BorderSize = 2
        Me.ButtonNext.FlatStyle = System.Windows.Forms.FlatStyle.Flat
        Me.ButtonNext.Font = New System.Drawing.Font("Elephant", 10.2!)
        Me.ButtonNext.ForeColor = System.Drawing.Color.FromArgb(CType(CType(254, Byte), Integer), CType(CType(95, Byte), Integer), CType(CType(85, Byte), Integer))
        Me.ButtonNext.Location = New System.Drawing.Point(332, 307)
        Me.ButtonNext.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.ButtonNext.Name = "ButtonNext"
        Me.ButtonNext.Size = New System.Drawing.Size(90, 45)
        Me.ButtonNext.TabIndex = 59
        Me.ButtonNext.Text = "Next"
        Me.ButtonNext.UseVisualStyleBackColor = False
        '
        'TextBoxAccountNumber
        '
        Me.TextBoxAccountNumber.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.TextBoxAccountNumber.BackColor = System.Drawing.Color.FromArgb(CType(CType(254, Byte), Integer), CType(CType(95, Byte), Integer), CType(CType(85, Byte), Integer))
        Me.TextBoxAccountNumber.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.TextBoxAccountNumber.Cursor = System.Windows.Forms.Cursors.IBeam
        Me.TextBoxAccountNumber.Font = New System.Drawing.Font("Elephant", 25.8!)
        Me.TextBoxAccountNumber.ForeColor = System.Drawing.Color.White
        Me.TextBoxAccountNumber.Location = New System.Drawing.Point(196, 218)
        Me.TextBoxAccountNumber.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.TextBoxAccountNumber.MaxLength = 12
        Me.TextBoxAccountNumber.Name = "TextBoxAccountNumber"
        Me.TextBoxAccountNumber.RightToLeft = System.Windows.Forms.RightToLeft.No
        Me.TextBoxAccountNumber.Size = New System.Drawing.Size(344, 52)
        Me.TextBoxAccountNumber.TabIndex = 55
        Me.TextBoxAccountNumber.Text = "0"
        Me.TextBoxAccountNumber.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'PanelWhite
        '
        Me.PanelWhite.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.PanelWhite.BackColor = System.Drawing.Color.White
        Me.PanelWhite.Controls.Add(Me.LabelAmount)
        Me.PanelWhite.Location = New System.Drawing.Point(182, 171)
        Me.PanelWhite.Margin = New System.Windows.Forms.Padding(2, 3, 2, 3)
        Me.PanelWhite.Name = "PanelWhite"
        Me.PanelWhite.Size = New System.Drawing.Size(372, 61)
        Me.PanelWhite.TabIndex = 57
        '
        'LabelAmount
        '
        Me.LabelAmount.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.LabelAmount.AutoSize = True
        Me.LabelAmount.BackColor = System.Drawing.Color.White
        Me.LabelAmount.Font = New System.Drawing.Font("Elephant", 20.25!)
        Me.LabelAmount.ForeColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.LabelAmount.Location = New System.Drawing.Point(33, 14)
        Me.LabelAmount.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.LabelAmount.Name = "LabelAmount"
        Me.LabelAmount.Size = New System.Drawing.Size(332, 35)
        Me.LabelAmount.TabIndex = 4
        Me.LabelAmount.Text = "Enter Account Number"
        '
        'LabelBank
        '
        Me.LabelBank.AutoSize = True
        Me.LabelBank.BackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.LabelBank.Font = New System.Drawing.Font("Elephant", 11.25!)
        Me.LabelBank.ForeColor = System.Drawing.Color.White
        Me.LabelBank.Location = New System.Drawing.Point(579, 33)
        Me.LabelBank.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.LabelBank.Name = "LabelBank"
        Me.LabelBank.Size = New System.Drawing.Size(173, 20)
        Me.LabelBank.TabIndex = 56
        Me.LabelBank.Text = "Clark Cloud Holdings"
        '
        'LabelSendMoney
        '
        Me.LabelSendMoney.AutoSize = True
        Me.LabelSendMoney.BackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.LabelSendMoney.Font = New System.Drawing.Font("Elephant", 24.0!)
        Me.LabelSendMoney.ForeColor = System.Drawing.Color.White
        Me.LabelSendMoney.Location = New System.Drawing.Point(23, 17)
        Me.LabelSendMoney.Margin = New System.Windows.Forms.Padding(4, 0, 4, 0)
        Me.LabelSendMoney.Name = "LabelSendMoney"
        Me.LabelSendMoney.Size = New System.Drawing.Size(214, 41)
        Me.LabelSendMoney.TabIndex = 54
        Me.LabelSendMoney.Text = "Send Money"
        '
        'Panel1
        '
        Me.Panel1.Anchor = System.Windows.Forms.AnchorStyles.Top
        Me.Panel1.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.Panel1.BackColor = System.Drawing.Color.FromArgb(CType(CType(0, Byte), Integer), CType(CType(21, Byte), Integer), CType(CType(36, Byte), Integer))
        Me.Panel1.Controls.Add(Me.LabelBank)
        Me.Panel1.Controls.Add(Me.LabelSendMoney)
        Me.Panel1.Location = New System.Drawing.Point(3, 2)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(766, 82)
        Me.Panel1.TabIndex = 60
        '
        'SendMoneyToAccount
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink
        Me.BackColor = System.Drawing.Color.FromArgb(CType(CType(253, Byte), Integer), CType(CType(249, Byte), Integer), CType(CType(245, Byte), Integer))
        Me.ClientSize = New System.Drawing.Size(768, 486)
        Me.Controls.Add(Me.ButtonBack)
        Me.Controls.Add(Me.ButtonNext)
        Me.Controls.Add(Me.TextBoxAccountNumber)
        Me.Controls.Add(Me.PanelWhite)
        Me.Controls.Add(Me.Panel1)
        Me.Margin = New System.Windows.Forms.Padding(2)
        Me.MinimumSize = New System.Drawing.Size(784, 525)
        Me.Name = "SendMoneyToAccount"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Send Money"
        Me.PanelWhite.ResumeLayout(False)
        Me.PanelWhite.PerformLayout()
        Me.Panel1.ResumeLayout(False)
        Me.Panel1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents ButtonBack As Button
    Friend WithEvents ButtonNext As Button
    Friend WithEvents TextBoxAccountNumber As TextBox
    Friend WithEvents PanelWhite As Panel
    Friend WithEvents LabelAmount As Label
    Friend WithEvents LabelBank As Label
    Friend WithEvents LabelSendMoney As Label
    Friend WithEvents Panel1 As Panel
End Class
