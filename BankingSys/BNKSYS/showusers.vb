Imports System.Deployment.Application
Imports MySql.Data.MySqlClient
Public Class showusers

    Dim conn As MySqlConnection
    Dim COMMAND As MySqlCommand
    Dim dset As New DataTable

    Private Sub LDING_BTN_Click(sender As Object, e As EventArgs) Handles LDING_BTN.Click
        dset.Clear()

        conn = New MySqlConnection
        conn.ConnectionString =
            "server=localhost;userid=root;database=banksys;convert zero datetime=True"
        Dim SDA As New MySqlDataAdapter
        Dim bSource As New BindingSource

        Try
            conn.Open()
            Dim Query As String
            Query = "select accnum AS 'Account No.', username AS 'Username', fname AS 'First Name', lname AS 'Last Name', adrs AS 'Address', dob AS 'Date of Birth', type AS 'Account Type', bal AS 'Balance' from banksys.users"
            COMMAND = New MySqlCommand(Query, conn)
            SDA.SelectCommand = COMMAND
            SDA.Fill(dset)
            bSource.DataSource = dset
            DataGridView1.DataSource = bSource
            SDA.Update(dset)

            conn.Close()

            conn.Close()
        Catch ex As MySqlException
            MessageBox.Show(ex.Message)
        Finally
            conn.Dispose()
        End Try
    End Sub

    Private Sub BACK_BTN_Click(sender As Object, e As EventArgs) Handles BACK_BTN.Click
        Admin.Show()
        Me.Hide()
    End Sub
End Class