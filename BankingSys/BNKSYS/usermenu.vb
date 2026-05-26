Imports System.Windows.Controls
Imports MySql.Data.MySqlClient

Public Class usermenu
    Dim mysqlconn As MySqlConnection
    Dim command As New MySqlCommand
    Dim label As New Login

    Private Sub usermenu_OnLoad(sender As Object, e As EventArgs) Handles MyBase.VisibleChanged

        mysqlconn = New MySqlConnection
        mysqlconn.ConnectionString =
            "server=localhost;userid=root;database=banksys"
        Dim READER As MySqlDataReader

        Try
            mysqlconn.Open()
            Dim Query As String
            Query = "select * from banksys.users where username = '" & Login.UN_TB.Text & "'"
            command = New MySqlCommand(Query, mysqlconn)
            READER = command.ExecuteReader
            While READER.Read

                LabelUsername.Text = READER.GetString("username")
                LabelBalance.Text = "Php " + READER.GetString("bal")
                LabelAccountNumber.Text = READER.GetInt64("accnum")

            End While

            mysqlconn.Close()

        Catch ex As MySqlException
            MessageBox.Show(ex.Message)
        Finally
            mysqlconn.Dispose()
        End Try

    End Sub


    Private Sub ButtonDeposit_Click(sender As Object, e As EventArgs) Handles ButtonDeposit.Click
        Me.Hide()
        Deposit.Show()

    End Sub

    Private Sub ButtonWithdraw_Click(sender As Object, e As EventArgs) Handles ButtonWithdraw.Click

        Me.Hide()
        withdraw.Show()

    End Sub

    Private Sub ButtonTransaction_Click(sender As Object, e As EventArgs) Handles ButtonTransaction.Click

        Me.Hide()
        transachisto.Show()

    End Sub

    Private Sub ButtonSendMoney_Click(sender As Object, e As EventArgs) Handles ButtonSendMoney.Click
        Me.Hide()
        SendMoneyToAccount.Show()

    End Sub

    Private Sub ButtonProfile_Click(sender As Object, e As EventArgs) Handles ButtonProfile.Click

        Me.Hide()
        Profile.Show()

    End Sub

    Private Sub ButtonLogout_Click(sender As Object, e As EventArgs) Handles ButtonLogout.Click
        Login.Show()
        Me.Hide()
    End Sub


End Class