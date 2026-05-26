Imports MySql.Data.MySqlClient

Public Class Deposit

    Dim mysqlconn As MySqlConnection
    Dim command As New MySqlCommand

    Private Sub ButtonDeposit_Click(sender As Object, e As EventArgs) Handles ButtonDeposit.Click

        mysqlconn = New MySqlConnection
        mysqlconn.ConnectionString = "server=localhost;userid=root;database=banksys"
        Dim reader As MySqlDataReader
        Dim DepositFlag As Integer = 0

        If Not (IsNumeric(TextBoxDeposit.Text)) Then

            MessageBox.Show("Input must contain numbers only.")
            TextBoxDeposit.Text = "0"
            DepositFlag = 1

        ElseIf TextBoxDeposit.Text < 500 Then

            MessageBox.Show("Amount must be P500.00 and above.")
            DepositFlag = 1

        End If

        If DepositFlag = 0 Then

            Try
                mysqlconn.Open()
                Dim Query As String
                Query = "UPDATE banksys.users SET bal = bal + '" & TextBoxDeposit.Text & "' WHERE accnum = '" & usermenu.LabelAccountNumber.Text & "'"
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
                Query = "INSERT INTO banksys.transac(accnum, transtype, amount, dot) VALUES('" & usermenu.LabelAccountNumber.Text & "', 'Deposit', '" & TextBoxDeposit.Text & "', now())"
                command = New MySqlCommand(Query, mysqlconn)
                reader = command.ExecuteReader

                MessageBox.Show("Amount deposited successfully.")
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

    Private Sub ButtonBack_Click(sender As Object, e As EventArgs) Handles ButtonBack.Click
        TextBoxDeposit.Text = "0"
        Me.Hide()
        usermenu.Show()

    End Sub

    Private Sub ButtonZero_Click(sender As Object, e As EventArgs) Handles ButtonZero.Click

        If TextBoxDeposit.Text <> "0" Then

            If TextBoxDeposit.TextLength < 9 Then

                TextBoxDeposit.Text += "0"

            End If

        End If

    End Sub

    Private Sub ButtonOne_Click(sender As Object, e As EventArgs) Handles ButtonOne.Click

        If TextBoxDeposit.Text = "0" Then

            TextBoxDeposit.Clear()

        End If

        If TextBoxDeposit.TextLength < 9 Then

            TextBoxDeposit.Text += "1"

        End If

    End Sub

    Private Sub ButtonTwo_Click(sender As Object, e As EventArgs) Handles ButtonTwo.Click

        If TextBoxDeposit.Text = "0" Then

            TextBoxDeposit.Clear()

        End If

        If TextBoxDeposit.TextLength < 9 Then

            TextBoxDeposit.Text += "2"

        End If

    End Sub

    Private Sub ButtonThree_Click(sender As Object, e As EventArgs) Handles ButtonThree.Click

        If TextBoxDeposit.Text = "0" Then

            TextBoxDeposit.Clear()

        End If

        If TextBoxDeposit.TextLength < 9 Then

            TextBoxDeposit.Text += "3"

        End If

    End Sub

    Private Sub ButtonFour_Click(sender As Object, e As EventArgs) Handles ButtonFour.Click

        If TextBoxDeposit.Text = "0" Then

            TextBoxDeposit.Clear()

        End If

        If TextBoxDeposit.TextLength < 9 Then

            TextBoxDeposit.Text += "4"

        End If

    End Sub

    Private Sub ButtonFive_Click(sender As Object, e As EventArgs) Handles ButtonFive.Click

        If TextBoxDeposit.Text = "0" Then

            TextBoxDeposit.Clear()

        End If

        If TextBoxDeposit.TextLength < 9 Then

            TextBoxDeposit.Text += "5"

        End If

    End Sub

    Private Sub ButtonSix_Click(sender As Object, e As EventArgs) Handles ButtonSix.Click

        If TextBoxDeposit.Text = "0" Then

            TextBoxDeposit.Clear()

        End If

        If TextBoxDeposit.TextLength < 9 Then

            TextBoxDeposit.Text += "6"

        End If

    End Sub

    Private Sub ButtonSeven_Click(sender As Object, e As EventArgs) Handles ButtonSeven.Click

        If TextBoxDeposit.Text = "0" Then

            TextBoxDeposit.Clear()

        End If

        If TextBoxDeposit.TextLength < 9 Then

            TextBoxDeposit.Text += "7"

        End If

    End Sub

    Private Sub ButtonEight_Click(sender As Object, e As EventArgs) Handles ButtonEight.Click

        If TextBoxDeposit.Text = "0" Then

            TextBoxDeposit.Clear()

        End If

        If TextBoxDeposit.TextLength < 9 Then

            TextBoxDeposit.Text += "8"

        End If

    End Sub

    Private Sub ButtonNine_Click(sender As Object, e As EventArgs) Handles ButtonNine.Click

        If TextBoxDeposit.Text = "0" Then

            TextBoxDeposit.Clear()

        End If

        If TextBoxDeposit.TextLength < 9 Then

            TextBoxDeposit.Text += "9"

        End If

    End Sub

    Private Sub ButtonDelete_Click(sender As Object, e As EventArgs) Handles ButtonDelete.Click

        TextBoxDeposit.Text = TextBoxDeposit.Text.Substring(0, TextBoxDeposit.Text.Length - 1)

        If TextBoxDeposit.Text = "" Then
            TextBoxDeposit.Text = "0"
        End If

    End Sub

End Class