Imports System.Windows.Forms.VisualStyles.VisualStyleElement
Imports MySql.Data.MySqlClient
Public Class Login
    Dim conn As MySqlConnection
    Dim COMMAND As MySqlCommand
    Private Sub check_Click(sender As Object, e As EventArgs)
        conn = New MySqlConnection
        conn.ConnectionString =
            "server=localhost; userid=root; database=banksys"

        Try
            conn.Open()
            MessageBox.Show("Connected")
            conn.Close()

        Catch ex As MySqlException
            MessageBox.Show(ex.Message)
        Finally
            conn.Dispose()
        End Try
    End Sub

    Private Sub LGN_BTN_Click(sender As Object, e As EventArgs) Handles LGN_BTN.Click

        If UN_TB.Text = "admin" And PN_TB.Text = "admin" Then
            MessageBox.Show("Welcome Admin")
            Admin.Show()
            Me.Hide()

        Else

            conn = New MySqlConnection
            conn.ConnectionString =
            "server=localhost; userid=root; database=banksys"

            Dim READER As MySqlDataReader

            Try
                conn.Open()
                Dim Query As String
                Query = "select * from banksys.users where username='" & UN_TB.Text & "' and password='" & PN_TB.Text & "'"
                COMMAND = New MySqlCommand(Query, conn)
                READER = COMMAND.ExecuteReader
                Dim count As Integer
                count = 0

                While READER.Read
                    count = count + 1
                End While

                If count = 1 Then
                    MessageBox.Show("Welcome To Clark & Cloud Holdings")
                    Me.Hide()
                    usermenu.Show()

                ElseIf count > 1 Then
                    MessageBox.Show("Duplicate Account")

                Else
                    MessageBox.Show("Incorrect Username or Password")
                End If

                conn.Close()

            Catch ex As MySqlException
                MessageBox.Show(ex.Message)

            Finally
                conn.Dispose()
            End Try
        End If

    End Sub

    Private Sub SGN_BTN_Click(sender As Object, e As EventArgs) Handles SGN_BTN.Click
        Create_Account.Show()
        Me.Hide()
    End Sub

    Private Sub UN_TB_MouseEnter(sender As Object, e As EventArgs) Handles UN_TB.MouseEnter
        If UN_TB.Text = "Username" Then
            UN_TB.Text = ""
            UN_TB.ForeColor = Color.Black
        End If
    End Sub

    Private Sub UN_TB_MouseLeave(sender As Object, e As EventArgs) Handles UN_TB.MouseLeave
        If UN_TB.Text = "" Then
            UN_TB.Text = "Username"
            UN_TB.ForeColor = Color.Gray
        End If
    End Sub

    Private Sub CheckBox1_CheckedChanged(sender As Object, e As EventArgs) Handles CheckBox1.CheckedChanged
        If CheckBox1.Checked = True Then
            PN_TB.UseSystemPasswordChar = False
        Else
            PN_TB.UseSystemPasswordChar = True
        End If
    End Sub

    Private Sub PN_TB_MouseEnter(sender As Object, e As EventArgs) Handles PN_TB.MouseEnter
        If PN_TB.Text = "Password" Then
            PN_TB.Text = ""
            PN_TB.ForeColor = Color.Black
        End If
    End Sub

    Private Sub PN_TB_MouseLeave(sender As Object, e As EventArgs) Handles PN_TB.MouseLeave
        If PN_TB.Text = "" Then
            PN_TB.Text = "Password"
            PN_TB.ForeColor = Color.Gray
        End If
    End Sub

End Class
