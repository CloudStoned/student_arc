Imports MySql.Data.MySqlClient

Public Class transachisto

    Dim mysqlconn As MySqlConnection
    Dim command As MySqlCommand
    Dim dataset As New DataTable

    Private Sub ButtonBack_Click(sender As Object, e As EventArgs) Handles ButtonBack.Click

        Me.Hide()
        usermenu.Show()

    End Sub
    Private Sub ButtonLoadTransaction_Click(sender As Object, e As EventArgs) Handles ButtonLoadTransaction.Click

        dataset.Clear()
        UserTable.DataSource = dataset
        mysqlconn = New MySqlConnection
        mysqlconn.ConnectionString = "server=localhost;userid=root;database=banksys;convert zero datetime=True"
        Dim SDA As New MySqlDataAdapter
        Dim bSource As New BindingSource

        Try
            mysqlconn.Open()
            Dim Query As String
            Query = "SELECT transid AS 'Transaction ID', accnum AS 'Account Number', transtype AS 'Transaction Type', amount AS 'Amount', dot AS 'Date of Transaction', targaccnum AS 'Target Account Number' FROM banksys.transac WHERE accnum = '" & usermenu.LabelAccountNumber.Text & "'"
            command = New MySqlCommand(Query, mysqlconn)
            SDA.SelectCommand = command
            SDA.Fill(dataset)
            bSource.DataSource = dataset
            UserTable.DataSource = bSource
            SDA.Update(dataset)

            mysqlconn.Close()
        Catch ex As MySqlException
            MessageBox.Show(ex.Message)

        Finally
            mysqlconn.Dispose()

        End Try

    End Sub

    Private Sub transachisto_Load(sender As Object, e As EventArgs) Handles MyBase.Load
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

            End While

            mysqlconn.Close()

        Catch ex As MySqlException
            MessageBox.Show(ex.Message)
        Finally
            mysqlconn.Dispose()
        End Try
    End Sub
End Class