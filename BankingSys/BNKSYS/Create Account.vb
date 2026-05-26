Imports System.Diagnostics.Eventing.Reader
Imports System.Drawing.Drawing2D
Imports System.Management
Imports System.Net
Imports System.Windows.Forms.VisualStyles.VisualStyleElement
Imports MySql.Data.MySqlClient

Public Class Create_Account
    Dim conn As MySqlConnection
    Dim COMMAND As MySqlCommand
    Dim type As String

    Private Sub CRT_ACC_Click(sender As Object, e As EventArgs) Handles CRT_ACC.Click
        conn = New MySqlConnection
        conn.ConnectionString =
            "server=localhost; userid=root; database=banksys"
        Dim READER As MySqlDataReader

        Dim DepositFlag As Integer = 0

        If Not (IsNumeric(DEP_TB.Text)) Then

            MessageBox.Show("Input must contains numbers only.")
            DEP_TB.Text = "0"
            DepositFlag = 1

        ElseIf DEP_TB.Text < 500 Then

            MessageBox.Show("Amount must be greater than P500.00")
            DepositFlag = 1

        End If

        If DepositFlag = 0 Then


            Try
                conn.Open()
                Dim Query As String
                Query = "insert into banksys.users (username, password, accname, fname, lname, adrs, age, dob, type, bal) values ('" & UN_TB.Text & "', '" & PW_TB.Text & "', '" & ANM_TB.Text & "', '" & FN_TB.Text & "', '" & LN_TB.Text & "', '" & ADR_TB.Text & "', '" & AGE_TB.Text & "',  '" & DOB.Text & "', '" & type & "', '" & DEP_TB.Text & "')"
                COMMAND = New MySqlCommand(Query, conn) 'connector db to this' 
                READER = COMMAND.ExecuteReader

                MessageBox.Show("Account Successfuly Created")
                Login.Show()
                Me.Hide()

            Catch ex As Exception
                MessageBox.Show(ex.Message)

            Finally
                conn.Dispose()
            End Try

        End If

    End Sub

    Private Sub Button1_Click_1(sender As Object, e As EventArgs)
        Admin.Show()
        Me.Hide()
    End Sub

    Private Sub SAV_RDBTN_CheckedChanged(sender As Object, e As EventArgs) Handles SAV_RDBTN.CheckedChanged
        type = "Savings"
    End Sub

    Private Sub CUR_RDBTN_CheckedChanged(sender As Object, e As EventArgs) Handles CUR_RDBTN.CheckedChanged
        type = "Current"
    End Sub

    Private Sub BTN7_Click(sender As Object, e As EventArgs) Handles BTN7.Click
        If DEP_TB.Text <> "0" Then
            DEP_TB.Text += "7"
        Else
            DEP_TB.Text = "7"
        End If
    End Sub

    Private Sub BTN8_Click(sender As Object, e As EventArgs) Handles BTN8.Click
        If DEP_TB.Text <> "0" Then
            DEP_TB.Text += "8"
        Else
            DEP_TB.Text = "8"
        End If
    End Sub

    Private Sub BTN9_Click(sender As Object, e As EventArgs) Handles BTN9.Click
        If DEP_TB.Text <> "0" Then
            DEP_TB.Text += "9"
        Else
            DEP_TB.Text = "9"
        End If
    End Sub

    Private Sub BTN4_Click(sender As Object, e As EventArgs) Handles BTN4.Click
        If DEP_TB.Text <> "0" Then
            DEP_TB.Text += "4"
        Else
            DEP_TB.Text = "4"
        End If
    End Sub

    Private Sub BTN5_Click(sender As Object, e As EventArgs) Handles BTN5.Click
        If DEP_TB.Text <> "0" Then
            DEP_TB.Text += "5"
        Else
            DEP_TB.Text = "5"
        End If
    End Sub

    Private Sub BTN6_Click(sender As Object, e As EventArgs) Handles BTN6.Click
        If DEP_TB.Text <> "0" Then
            DEP_TB.Text += "6"
        Else
            DEP_TB.Text = "6"
        End If
    End Sub

    Private Sub BTN1_Click(sender As Object, e As EventArgs) Handles BTN1.Click
        If DEP_TB.Text <> "0" Then
            DEP_TB.Text += "1"
        Else
            DEP_TB.Text = "1"
        End If
    End Sub

    Private Sub BTN2_Click(sender As Object, e As EventArgs) Handles BTN2.Click
        If DEP_TB.Text <> "0" Then
            DEP_TB.Text += "2"
        Else
            DEP_TB.Text = "2"
        End If
    End Sub

    Private Sub BTN3_Click(sender As Object, e As EventArgs) Handles BTN3.Click
        If DEP_TB.Text <> "0" Then
            DEP_TB.Text += "3"
        Else
            DEP_TB.Text = "3"
        End If
    End Sub

    Private Sub BTN0_Click(sender As Object, e As EventArgs) Handles BTN0.Click
        If DEP_TB.Text <> "0" Then
            DEP_TB.Text += "0"
        Else
            DEP_TB.Text = "0"
        End If
    End Sub

    Private Sub CLEAR_Click(sender As Object, e As EventArgs) Handles CLEAR.Click
        DEP_TB.Clear()
    End Sub

    Private Sub Button1_Click_2(sender As Object, e As EventArgs) Handles Button1.Click
        Login.Show()
        Me.Hide()
    End Sub

    Private Sub ADR_TB_MouseEnter(sender As Object, e As EventArgs) Handles ADR_TB.MouseEnter
        If ADR_TB.Text = "Address" Then
            ADR_TB.Text = ""
            ADR_TB.ForeColor = Color.Black
        End If
    End Sub

    Private Sub ADR_TB_MouseLeave(sender As Object, e As EventArgs) Handles ADR_TB.MouseLeave
        If ADR_TB.Text = "" Then
            ADR_TB.Text = "Address"
            ADR_TB.ForeColor = Color.Gray
        End If
    End Sub

    Private Sub AGE_TB_MouseEnter(sender As Object, e As EventArgs) Handles AGE_TB.MouseEnter
        If AGE_TB.Text = "Age" Then
            AGE_TB.Text = ""
            AGE_TB.ForeColor = Color.Black
        End If
    End Sub

    Private Sub AGE_TB_MouseLeave(sender As Object, e As EventArgs) Handles AGE_TB.MouseLeave
        If AGE_TB.Text = "" Then
            AGE_TB.Text = "Age"
            AGE_TB.ForeColor = Color.Gray
        End If
    End Sub

    Private Sub Ctrl_KeyDown(sender As Object, e As KeyEventArgs) Handles UN_TB.KeyDown, SAV_RDBTN.KeyDown, PW_TB.KeyDown, MyBase.KeyDown, LN_TB.KeyDown, FN_TB.KeyDown, DOB.KeyDown, CUR_RDBTN.KeyDown, ANM_TB.KeyDown, AGE_TB.KeyDown, ADR_TB.KeyDown
        If e.KeyCode = Keys.Enter Then
            SendKeys.Send("{TAB}")

        Else
            Exit Sub
        End If

        e.SuppressKeyPress = True
    End Sub

    Private Sub Create_Account_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        UN_TB.Focus()
    End Sub

    Private Sub CheckBox1_CheckedChanged(sender As Object, e As EventArgs) Handles CheckBox1.CheckedChanged
        If CheckBox1.Checked = True Then
            PW_TB.UseSystemPasswordChar = False
        Else
            PW_TB.UseSystemPasswordChar = True
        End If
    End Sub

    Private Sub Label14_Click(sender As Object, e As EventArgs) Handles Label14.Click

    End Sub

    Private Sub Label13_Click(sender As Object, e As EventArgs) Handles Label13.Click

    End Sub

    Private Sub Label12_Click(sender As Object, e As EventArgs) Handles Label12.Click

    End Sub

    Private Sub Label11_Click(sender As Object, e As EventArgs) Handles Label11.Click

    End Sub

    Private Sub Label10_Click(sender As Object, e As EventArgs) Handles Label10.Click

    End Sub

    Private Sub Label9_Click(sender As Object, e As EventArgs) Handles Label9.Click

    End Sub

    Private Sub Label8_Click(sender As Object, e As EventArgs) Handles Label8.Click

    End Sub

    Private Sub PW_TB_TextChanged(sender As Object, e As EventArgs) Handles PW_TB.TextChanged

    End Sub

    Private Sub UN_TB_TextChanged(sender As Object, e As EventArgs) Handles UN_TB.TextChanged

    End Sub

    Private Sub DOB_ValueChanged(sender As Object, e As EventArgs) Handles DOB.ValueChanged

    End Sub

    Private Sub ANM_TB_TextChanged(sender As Object, e As EventArgs) Handles ANM_TB.TextChanged

    End Sub

    Private Sub AGE_TB_TextChanged(sender As Object, e As EventArgs) Handles AGE_TB.TextChanged

    End Sub

    Private Sub ADR_TB_TextChanged(sender As Object, e As EventArgs) Handles ADR_TB.TextChanged

    End Sub

    Private Sub LN_TB_TextChanged(sender As Object, e As EventArgs) Handles LN_TB.TextChanged

    End Sub

    Private Sub FN_TB_TextChanged(sender As Object, e As EventArgs) Handles FN_TB.TextChanged

    End Sub
End Class