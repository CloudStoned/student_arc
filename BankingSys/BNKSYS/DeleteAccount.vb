Imports MySql.Data.MySqlClient

Public Class DeleteAccount

    Dim mysqlconn As MySqlConnection
    Dim command As New MySqlCommand

    Private Sub DeleteAccount_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        LabelUsername.Text = usermenu.LabelUsername.Text

    End Sub

    Private Sub ButtonBack_Click(sender As Object, e As EventArgs) Handles ButtonBack.Click

        Me.Hide()
        Profile.Show()

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        mysqlconn = New MySqlConnection
        mysqlconn.ConnectionString = "server=localhost;userid=root;database=banksys"
        Dim READER As MySqlDataReader
        Dim Password As String = ""

        Try

            mysqlconn.Open()

            Dim Query As String
            Query = "SELECT * FROM banksys.users WHERE password ='" & TBPassword.Text & "'"
            command = New MySqlCommand(Query, mysqlconn)
            READER = command.ExecuteReader

            Dim count As Integer = 0

            While READER.Read

                Password = READER.GetString("password")

            End While

            mysqlconn.Close()

            If TBPassword.Text = Password Then

                If (MsgBox("This will delete all of your data. Are you sure?", vbQuestion + vbYesNo, "Warning")) = vbYes Then

                    Try

                        mysqlconn.Open()
                        Dim Query2 As String
                        Query2 = "DELETE FROM banksys.users where password ='" & TBPassword.Text & "' and username = '" & usermenu.LabelUsername.Text & "'"
                        command = New MySqlCommand(Query2, mysqlconn)
                        READER = command.ExecuteReader

                        MessageBox.Show("Account has been deleted.")

                        mysqlconn.Close()


                    Catch ex As MySqlException

                        MessageBox.Show(ex.Message)

                    Finally

                        mysqlconn.Dispose()
                        Me.Hide()
                        Login.Show()

                    End Try

                End If

            Else

                MessageBox.Show("Wrong password.")

            End If

            mysqlconn.Close()

        Catch ex As MySqlException

            MessageBox.Show(ex.Message)

        Finally

            mysqlconn.Dispose()

        End Try



    End Sub

    Private Sub CheckBox1_CheckedChanged(sender As Object, e As EventArgs) Handles CheckBox1.CheckedChanged
        If CheckBox1.Checked = True Then
            TBPassword.UseSystemPasswordChar = False
        Else
            TBPassword.UseSystemPasswordChar = True
        End If
    End Sub
End Class