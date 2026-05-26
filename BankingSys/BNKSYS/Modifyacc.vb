Imports System.Management
Imports System.Windows.Controls
Imports System.Windows.Controls.Primitives
Imports System.Windows.Forms.VisualStyles.VisualStyleElement
Imports MySql.Data.MySqlClient
Public Class Modifyacc
    Dim conn As MySqlConnection
    Dim COMMAND As MySqlCommand
    Dim type As String

    Public Sub Load_ComboBox()

        ComboBox1.Items.Clear()

        conn = New MySqlConnection
        conn.ConnectionString =
            "server=localhost;userid=root;database = banksys"

        Dim READER As MySqlDataReader

        Try
            conn.Open()
            Dim Query As String
            Query = "select * from banksys.users"
            COMMAND = New MySqlCommand(Query, conn)
            READER = COMMAND.ExecuteReader
            While READER.Read
                Dim accnum = READER.GetInt64("accnum")
                Dim accname = READER.GetString("accname")
                ComboBox1.Items.Add("" & accnum & "" & " - " & "(" & accname & ")")
            End While

            conn.Close()
        Catch ex As MySqlException
            MessageBox.Show(ex.Message)
        Finally
            conn.Dispose()
        End Try

    End Sub



    Private Sub UPDT_BTN_Click_1(sender As Object, e As EventArgs) Handles UPDT_BTN.Click
        conn = New MySqlConnection
        conn.ConnectionString =
            "server=localhost;userid=root;database=banksys"
        Dim READER As MySqlDataReader

        Try
            conn.Open()
            Dim Query As String
            Query = "update banksys.users set username ='" & UN_TB.Text & "',password ='" & PW_TB.Text & "',fname ='" & FN_TB.Text & "', lname ='" & LN_TB.Text & "', adrs ='" & ADR_TB.Text & "' , type ='" & type & "'  where accnum = '" & ComboBox1.Text & "'"
            COMMAND = New MySqlCommand(Query, conn)
            READER = COMMAND.ExecuteReader

            MessageBox.Show("Data Updated")
            conn.Close()

        Catch ex As MySqlException
            MessageBox.Show(ex.Message)
        Finally
            conn.Dispose()
        End Try
    End Sub



    Private Sub Modifyacc_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        conn = New MySqlConnection
        conn.ConnectionString =
            "server=localhost;userid=root;database = banksys"

        Dim READER As MySqlDataReader

        Try
            conn.Open()
            Dim Query As String
            Query = "select * from banksys.users"
            COMMAND = New MySqlCommand(Query, conn)
            READER = COMMAND.ExecuteReader
            While READER.Read
                Dim accnum = READER.GetInt64("accnum")
                Dim accname = READER.GetString("accname")
                ComboBox1.Items.Add("" & accnum & "" & " - " & "(" & accname & ")")
            End While

            conn.Close()
        Catch ex As MySqlException
            MessageBox.Show(ex.Message)
        Finally
            conn.Dispose()
        End Try


    End Sub

    Private Sub ComboBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ComboBox1.SelectedIndexChanged
        conn = New MySqlConnection
        conn.ConnectionString =
            "server=localhost;userid=root;database=banksys"
        Dim READER As MySqlDataReader

        Try
            conn.Open()
            Dim Query As String
            Query = "select * from banksys.users where accnum = '" & ComboBox1.Text & "'"
            COMMAND = New MySqlCommand(Query, conn)
            READER = COMMAND.ExecuteReader
            While READER.Read
                UN_TB.Text = READER.GetString("username")
                PW_TB.Text = READER.GetString("password")
                FN_TB.Text = READER.GetString("fname")
                LN_TB.Text = READER.GetString("lname")
                ADR_TB.Text = READER.GetString("adrs")
                TYPE_TB.Text = READER.GetString("type")

            End While

            conn.Close()



        Catch ex As MySqlException
            MessageBox.Show(ex.Message)
        Finally
            conn.Dispose()
        End Try
    End Sub


    Private Sub Button1_Click(sender As Object, e As EventArgs)
        Admin.Show()
        Me.Hide()
    End Sub

    Private Sub SAV_RDBTN_CheckedChanged(sender As Object, e As EventArgs)
        type = "Savings"
    End Sub

    Private Sub CUR_RDBTN_CheckedChanged(sender As Object, e As EventArgs)
        type = "Current"
    End Sub

    Private Sub Button1_Click_1(sender As Object, e As EventArgs) Handles Button1.Click
        Admin.Show()
        Me.Hide()
    End Sub

    Private Sub SHOW_CHCKBOX_CheckedChanged(sender As Object, e As EventArgs) Handles SHOW_CHCKBOX.CheckedChanged
        If SHOW_CHCKBOX.Checked = True Then
            PW_TB.UseSystemPasswordChar = False

        Else
            PW_TB.UseSystemPasswordChar = True
        End If
    End Sub
End Class