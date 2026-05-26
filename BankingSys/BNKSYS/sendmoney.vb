Imports MySql.Data.MySqlClient

Public Class sendmoney

    Dim mysqlconn As MySqlConnection
    Dim command As New MySqlCommand



    Private Sub ButtonBack_Click(sender As Object, e As EventArgs) Handles ButtonBack.Click

        TextBoxSendMoney.Text = "0"
        Me.Hide()
        SendMoneyToAccount.Show()

    End Sub

    Private Sub ButtonZero_Click(sender As Object, e As EventArgs) Handles ButtonZero.Click

        If TextBoxSendMoney.Text <> "0" Then

            If TextBoxSendMoney.TextLength < 9 Then

                TextBoxSendMoney.Text += "0"

            End If

        End If

    End Sub

    Private Sub ButtonOne_Click(sender As Object, e As EventArgs) Handles ButtonOne.Click

        If TextBoxSendMoney.Text = "0" Then

            TextBoxSendMoney.Clear()

        End If

        If TextBoxSendMoney.TextLength < 9 Then

            TextBoxSendMoney.Text += "1"

        End If

    End Sub

    Private Sub ButtonTwo_Click(sender As Object, e As EventArgs) Handles ButtonTwo.Click

        If TextBoxSendMoney.Text = "0" Then

            TextBoxSendMoney.Clear()

        End If

        If TextBoxSendMoney.TextLength < 9 Then

            TextBoxSendMoney.Text += "2"

        End If

    End Sub

    Private Sub ButtonThree_Click(sender As Object, e As EventArgs) Handles ButtonThree.Click

        If TextBoxSendMoney.Text = "0" Then

            TextBoxSendMoney.Clear()

        End If

        If TextBoxSendMoney.TextLength < 9 Then

            TextBoxSendMoney.Text += "3"

        End If

    End Sub

    Private Sub ButtonFour_Click(sender As Object, e As EventArgs) Handles ButtonFour.Click

        If TextBoxSendMoney.Text = "0" Then

            TextBoxSendMoney.Clear()

        End If

        If TextBoxSendMoney.TextLength < 9 Then

            TextBoxSendMoney.Text += "4"

        End If

    End Sub

    Private Sub ButtonFive_Click(sender As Object, e As EventArgs) Handles ButtonFive.Click

        If TextBoxSendMoney.Text = "0" Then

            TextBoxSendMoney.Clear()

        End If

        If TextBoxSendMoney.TextLength < 9 Then

            TextBoxSendMoney.Text += "5"

        End If

    End Sub

    Private Sub ButtonSix_Click(sender As Object, e As EventArgs) Handles ButtonSix.Click

        If TextBoxSendMoney.Text = "0" Then

            TextBoxSendMoney.Clear()

        End If

        If TextBoxSendMoney.TextLength < 9 Then

            TextBoxSendMoney.Text += "6"

        End If

    End Sub

    Private Sub ButtonSeven_Click(sender As Object, e As EventArgs) Handles ButtonSeven.Click

        If TextBoxSendMoney.Text = "0" Then

            TextBoxSendMoney.Clear()

        End If

        If TextBoxSendMoney.TextLength < 9 Then

            TextBoxSendMoney.Text += "7"

        End If

    End Sub

    Private Sub ButtonEight_Click(sender As Object, e As EventArgs) Handles ButtonEight.Click

        If TextBoxSendMoney.Text = "0" Then

            TextBoxSendMoney.Clear()

        End If

        If TextBoxSendMoney.TextLength < 9 Then

            TextBoxSendMoney.Text += "8"

        End If

    End Sub

    Private Sub ButtonNine_Click(sender As Object, e As EventArgs) Handles ButtonNine.Click

        If TextBoxSendMoney.Text = "0" Then

            TextBoxSendMoney.Clear()

        End If

        If TextBoxSendMoney.TextLength < 9 Then

            TextBoxSendMoney.Text += "9"

        End If

    End Sub

    Private Sub ButtonDelete_Click(sender As Object, e As EventArgs) Handles ButtonDelete.Click

        TextBoxSendMoney.Text = TextBoxSendMoney.Text.Substring(0, TextBoxSendMoney.Text.Length - 1)

        If TextBoxSendMoney.Text = "" Then
            TextBoxSendMoney.Text = "0"
        End If

    End Sub

    Private Sub SEND_BTN_Click(sender As Object, e As EventArgs) Handles SEND_BTN.Click

        mysqlconn = New MySqlConnection
        mysqlconn.ConnectionString = "server=localhost;userid=root;database=banksys"
        Dim reader As MySqlDataReader
        Dim WithdrawFlag As Integer = 0
        Dim Balance As Integer = 0

        Try
            mysqlconn.Open()
            Dim Query As String
            Query = "SELECT bal FROM banksys.users WHERE username = '" & usermenu.LabelUsername.Text & "'"

            command = New MySqlCommand(Query, mysqlconn)
            reader = command.ExecuteReader

            While reader.Read

                Balance = reader.GetInt32("bal")

            End While

        Catch ex As Exception

            MessageBox.Show(ex.Message)

        Finally
            mysqlconn.Dispose()

        End Try

        If Not (IsNumeric(TextBoxSendMoney.Text)) Then

            MessageBox.Show("Input must contains numbers only.")
            TextBoxSendMoney.Text = "0"
            WithdrawFlag = 1

        ElseIf Balance - TextBoxSendMoney.Text < 500 Then

            MessageBox.Show("Amount must not exceed the limit amount.")
            WithdrawFlag = 1

        End If

        If WithdrawFlag = 0 Then
            Try
                mysqlconn.Open()
                Dim Query As String
                Query = "UPDATE banksys.users SET bal = bal - '" & TextBoxSendMoney.Text & "' WHERE accnum = '" & usermenu.LabelAccountNumber.Text & "'"

                command = New MySqlCommand(Query, mysqlconn)
                reader = command.ExecuteReader
                mysqlconn.Close()

            Catch ex As Exception

                MessageBox.Show(ex.Message)

            Finally
                mysqlconn.Dispose()

            End Try

            Try
                mysqlconn.Open()
                Dim Query As String
                Query = "UPDATE banksys.users SET bal = bal + '" & TextBoxSendMoney.Text & "' WHERE accnum = '" & SendMoneyToAccount.TextBoxAccountNumber.Text & "'"

                command = New MySqlCommand(Query, mysqlconn)
                reader = command.ExecuteReader

                MessageBox.Show("Amount sent successfully.")
                mysqlconn.Close()

            Catch ex As Exception

                MessageBox.Show(ex.Message)

            Finally
                mysqlconn.Dispose()

            End Try

            Try
                mysqlconn.Open()
                Dim Query As String
                Query = "INSERT INTO banksys.transac(accnum, transtype, amount, dot, targaccnum) VALUES('" & usermenu.LabelAccountNumber.Text & "', 'Withdraw', '" & TextBoxSendMoney.Text & "', now(), '" & SendMoneyToAccount.TextBoxAccountNumber.Text & "')"
                command = New MySqlCommand(Query, mysqlconn)
                reader = command.ExecuteReader

                mysqlconn.Close()

            Catch ex As Exception

                MessageBox.Show(ex.Message)

            Finally
                mysqlconn.Dispose()

            End Try

            Try
                mysqlconn.Open()
                Dim Query As String
                Query = "INSERT INTO banksys.transac(accnum, transtype, amount, dot) VALUES('" & SendMoneyToAccount.TextBoxAccountNumber.Text & "', 'Deposit', '" & TextBoxSendMoney.Text & "', now())"
                command = New MySqlCommand(Query, mysqlconn)
                reader = command.ExecuteReader

                mysqlconn.Close()

            Catch ex As Exception

                MessageBox.Show(ex.Message)

            Finally
                mysqlconn.Dispose()

            End Try

        End If
    End Sub
End Class