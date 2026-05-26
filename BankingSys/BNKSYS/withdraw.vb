Imports MySql.Data.MySqlClient

Public Class withdraw

    Dim mysqlconn As MySqlConnection
    Dim command As New MySqlCommand



    Private Sub ButtonBack_Click(sender As Object, e As EventArgs) Handles ButtonBack.Click
        TextBoxWithdraw.Text = "0"
        Me.Hide()
        usermenu.Show()

    End Sub

    Private Sub ButtonZero_Click(sender As Object, e As EventArgs) Handles ButtonZero.Click

        If TextBoxWithdraw.Text <> "0" Then

            If TextBoxWithdraw.TextLength < 9 Then

                TextBoxWithdraw.Text += "0"

            End If

        End If

    End Sub

    Private Sub ButtonOne_Click(sender As Object, e As EventArgs) Handles ButtonOne.Click

        If TextBoxWithdraw.Text = "0" Then

            TextBoxWithdraw.Clear()

        End If

        If TextBoxWithdraw.TextLength < 9 Then

            TextBoxWithdraw.Text += "1"

        End If

    End Sub

    Private Sub ButtonTwo_Click(sender As Object, e As EventArgs) Handles ButtonTwo.Click

        If TextBoxWithdraw.Text = "0" Then

            TextBoxWithdraw.Clear()

        End If

        If TextBoxWithdraw.TextLength < 9 Then

            TextBoxWithdraw.Text += "2"

        End If

    End Sub

    Private Sub ButtonThree_Click(sender As Object, e As EventArgs) Handles ButtonThree.Click

        If TextBoxWithdraw.Text = "0" Then

            TextBoxWithdraw.Clear()

        End If

        If TextBoxWithdraw.TextLength < 9 Then

            TextBoxWithdraw.Text += "3"

        End If

    End Sub

    Private Sub ButtonFour_Click(sender As Object, e As EventArgs) Handles ButtonFour.Click

        If TextBoxWithdraw.Text = "0" Then

            TextBoxWithdraw.Clear()

        End If

        If TextBoxWithdraw.TextLength < 9 Then

            TextBoxWithdraw.Text += "4"

        End If

    End Sub

    Private Sub ButtonFive_Click(sender As Object, e As EventArgs) Handles ButtonFive.Click

        If TextBoxWithdraw.Text = "0" Then

            TextBoxWithdraw.Clear()

        End If

        If TextBoxWithdraw.TextLength < 9 Then

            TextBoxWithdraw.Text += "5"

        End If

    End Sub

    Private Sub ButtonSix_Click(sender As Object, e As EventArgs) Handles ButtonSix.Click

        If TextBoxWithdraw.Text = "0" Then

            TextBoxWithdraw.Clear()

        End If

        If TextBoxWithdraw.TextLength < 9 Then

            TextBoxWithdraw.Text += "6"

        End If

    End Sub

    Private Sub ButtonSeven_Click(sender As Object, e As EventArgs) Handles ButtonSeven.Click

        If TextBoxWithdraw.Text = "0" Then

            TextBoxWithdraw.Clear()

        End If

        If TextBoxWithdraw.TextLength < 9 Then

            TextBoxWithdraw.Text += "7"

        End If

    End Sub

    Private Sub ButtonEight_Click(sender As Object, e As EventArgs) Handles ButtonEight.Click

        If TextBoxWithdraw.Text = "0" Then

            TextBoxWithdraw.Clear()

        End If

        If TextBoxWithdraw.TextLength < 9 Then

            TextBoxWithdraw.Text += "8"

        End If

    End Sub

    Private Sub ButtonNine_Click(sender As Object, e As EventArgs) Handles ButtonNine.Click

        If TextBoxWithdraw.Text = "0" Then

            TextBoxWithdraw.Clear()

        End If

        If TextBoxWithdraw.TextLength < 9 Then

            TextBoxWithdraw.Text += "9"

        End If

    End Sub

    Private Sub ButtonDelete_Click(sender As Object, e As EventArgs) Handles ButtonDelete.Click

        TextBoxWithdraw.Text = TextBoxWithdraw.Text.Substring(0, TextBoxWithdraw.Text.Length - 1)

        If TextBoxWithdraw.Text = "" Then
            TextBoxWithdraw.Text = "0"
        End If

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

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

        If Not (IsNumeric(TextBoxWithdraw.Text)) Then

            MessageBox.Show("Input must contains numbers only.")
            TextBoxWithdraw.Text = "0"
            WithdrawFlag = 1

        ElseIf Balance - TextBoxWithdraw.Text < 500 Then

            MessageBox.Show("Amount must not exceed the limit amount.")
            WithdrawFlag = 1

        End If

        If WithdrawFlag = 0 Then
            Try
                mysqlconn.Open()
                Dim Query As String
                Query = "UPDATE banksys.users SET bal = bal - '" & TextBoxWithdraw.Text & "' WHERE accnum = '" & usermenu.LabelAccountNumber.Text & "'"

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
                Query = "INSERT INTO banksys.transac(accnum, transtype, amount, dot) VALUES('" & usermenu.LabelAccountNumber.Text & "', 'Withdraw', '" & TextBoxWithdraw.Text & "', now())"
                command = New MySqlCommand(Query, mysqlconn)
                reader = command.ExecuteReader

                MessageBox.Show("Amount withdrawn successfully.")
                usermenu.Show()
                Me.Hide()
                mysqlconn.Close()

            Catch ex As Exception

                MessageBox.Show(ex.Message)

            Finally
                mysqlconn.Dispose()

            End Try
        End If

    End Sub

End Class