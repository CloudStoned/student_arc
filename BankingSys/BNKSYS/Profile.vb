Imports System.Configuration
Imports MySql.Data.MySqlClient
Imports Mysqlx.XDevAPI

Public Class Profile

    Dim mysqlconn As MySqlConnection
    Dim command As New MySqlCommand

    Private Sub Profile_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        mysqlconn = New MySqlConnection
        mysqlconn.ConnectionString = "server=localhost;userid=root;database=banksys"
        Dim reader As MySqlDataReader

        LabelUsername.Text = usermenu.LabelUsername.Text

        Try
            mysqlconn.Open()
            Dim Query As String
            Query = "SELECT * From banksys.users where username = '" & usermenu.LabelUsername.Text & "'"

            command = New MySqlCommand(Query, mysqlconn)
            reader = command.ExecuteReader

            While reader.Read

                LabelAccountName.Text = reader.GetString("accname")
                LabelAccountNumber.Text = reader.GetString("accnum")
                LabelAccountType.Text = reader.GetString("type")
                LabelPrimaryAddress.Text = reader.GetString("adrs")
                LabelBirthDate.Text = reader.GetString("dob")

            End While

            mysqlconn.Close()

        Catch ex As Exception

            MessageBox.Show(ex.Message)

        Finally
            mysqlconn.Dispose()

        End Try

    End Sub

    Private Sub ButtonChangePin_Click(sender As Object, e As EventArgs) Handles ButtonChangePin.Click
        Me.Hide()
        ChangePin.Show()

    End Sub


    Private Sub ButtonBack_Click(sender As Object, e As EventArgs) Handles ButtonBack.Click

        Me.Hide()
        usermenu.Show()

    End Sub

    Private Sub DEL_BTN_Click(sender As Object, e As EventArgs) Handles DEL_BTN.Click
        Me.Hide()
        DeleteAccount.Show()
    End Sub
End Class