Imports MySql.Data.MySqlClient

Public Class ChangePin

    Dim mysqlconn As MySqlConnection
    Dim command As New MySqlCommand

    Private Sub ChangePin_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        LabelUsername.Text = usermenu.LabelUsername.Text

    End Sub

    Private Sub ButtonBack_Click(sender As Object, e As EventArgs) Handles ButtonBack.Click

        Me.Hide()
        Profile.Show()

    End Sub

    Private Sub ButtonChangePin_Click(sender As Object, e As EventArgs) Handles ButtonChangePin.Click

        Dim PinFlag As Integer = 0

        If TBChangePwd.Text = "Password" Then

            MessageBox.Show("Please input a different password.")
            PinFlag = 1

        End If

        If TBChangePwd.TextLength < 4 Then

            MessageBox.Show("Please input a password longer than 3 characters.")
            PinFlag = 1

        End If

        If TBChangePwd.TextLength > 35 Then

            MessageBox.Show("Please innput a password shorter than 25 characters.")
            PinFlag = 1

        End If

        If PinFlag = 0 Then

            Dim mysqlconn = New MySqlConnection
            mysqlconn.ConnectionString = "server=localhost;userid=root;database=banksys"
            Dim reader As MySqlDataReader

            Try
                mysqlconn.Open()
                Dim Query As String
                Query = "UPDATE banksys.users SET password='" & TBChangePwd.Text & "' WHERE username = '" & usermenu.LabelUsername.Text & "'"
                command = New MySqlCommand(Query, mysqlconn)
                reader = command.ExecuteReader

                MessageBox.Show("Password has been successfully updated.")
                mysqlconn.Close()

            Catch ex As MySqlException
                MessageBox.Show(ex.Message)

            Finally
                mysqlconn.Dispose()

            End Try

            Me.Hide()
            Profile.Show()

        End If

    End Sub

    Private Sub CheckBox1_CheckedChanged(sender As Object, e As EventArgs) Handles CheckBox1.CheckedChanged
        If CheckBox1.Checked = True Then
            TBChangePwd.UseSystemPasswordChar = False

        Else
            TBChangePwd.UseSystemPasswordChar = True
        End If
    End Sub
End Class