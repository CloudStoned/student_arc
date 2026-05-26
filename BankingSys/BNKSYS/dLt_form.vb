Imports System.Management
Imports System.Windows.Forms.VisualStyles.VisualStyleElement
Imports MySql.Data.MySqlClient

Public Class dLt_form
    Dim conn As MySqlConnection
    Dim COMMAND As MySqlCommand

    Private Sub UNDEL_TB_MouseEnter(sender As Object, e As EventArgs) Handles UNDEL_TB.MouseEnter
        If UNDEL_TB.Text = "Account Name" Then
            UNDEL_TB.Text = ""
            UNDEL_TB.ForeColor = Color.Black
        End If
    End Sub

    Private Sub UNDEL_TB_MouseLeave(sender As Object, e As EventArgs) Handles UNDEL_TB.MouseLeave
        If UNDEL_TB.Text = "" Then
            UNDEL_TB.Text = "Account Name"
            UNDEL_TB.ForeColor = Color.Red
        End If
    End Sub

    Private Sub Button1_Click_2(sender As Object, e As EventArgs) Handles Button1.Click
        Admin.Show()
        Me.Hide()
    End Sub

    Private Sub DEL_BTN_Click(sender As Object, e As EventArgs) Handles DEL_BTN.Click
        conn = New MySqlConnection
        conn.ConnectionString = "server=localhost; userid=root; database=banksys"

        Dim READER As MySqlDataReader

        If (MsgBox("This will delete all of your data. Are you sure?", vbQuestion + vbYesNo, "Warning")) = vbYes Then

            Try
                conn.Open()
                Dim Query As String
                Query = "Delete from banksys.users where accname ='" & UNDEL_TB.Text & "'"
                COMMAND = New MySqlCommand(Query, conn)
                READER = COMMAND.ExecuteReader

                MessageBox.Show("Data Deleted")
                conn.Close()

            Catch ex As Exception
                MessageBox.Show(ex.Message)
            End Try

        End If

    End Sub

    Private Sub UNDEL_TB_TextChanged(sender As Object, e As EventArgs) Handles UNDEL_TB.TextChanged

    End Sub
End Class