Imports MySql.Data.MySqlClient

Public Class SendMoneyToAccount

    Dim mysqlconn As MySqlConnection
    Dim command As New MySqlCommand

    Private Sub ButtonBack_Click(sender As Object, e As EventArgs)

        Me.Hide()
        usermenu.Show()

    End Sub

    Private Sub ButtonNext_Click(sender As Object, e As EventArgs)

        mysqlconn = New MySqlConnection
        mysqlconn.ConnectionString = "server=localhost;userid=root;database=banksys"
        Dim reader As MySqlDataReader

        If TextBoxAccountNumber.Text = usermenu.LabelAccountNumber.Text Then

            MessageBox.Show("You are prohibited to send money to yourself.")

        Else

            Try
                mysqlconn.Open()
                Dim Query As String
                Query = "SELECT accnum From banksys.users where accnum = '" & TextBoxAccountNumber.Text & "'"

                Dim count As Integer = 0

                command = New MySqlCommand(Query, mysqlconn)
                reader = command.ExecuteReader

                While reader.Read

                    count += 1

                End While

                If count = 1 Then

                    Me.Hide()
                    sendmoney.Show()

                ElseIf count = 0 Then

                    MessageBox.Show("Account not found.")
                    TextBoxAccountNumber.Clear()

                End If

                mysqlconn.Close()

            Catch ex As Exception

                MessageBox.Show(ex.Message)

            Finally
                mysqlconn.Dispose()

            End Try

        End If

    End Sub

    Private Sub ButtonBack_Click_1(sender As Object, e As EventArgs) Handles ButtonBack.Click
        usermenu.Show()
        Me.Hide()
    End Sub

    Private Sub ButtonNext_Click_1(sender As Object, e As EventArgs) Handles ButtonNext.Click
        sendmoney.Show()
        Me.Hide()
    End Sub
End Class