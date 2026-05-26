Imports System.Deployment.Application
Imports MySql.Data.MySqlClient
Public Class Admin
    Dim conn As MySqlConnection

    Private Sub CRTACC_BTN_Click_1(sender As Object, e As EventArgs)
        Create_Account.Show()
        Me.Hide()
    End Sub
    Private Sub SHWUSERS_BTN_Click(sender As Object, e As EventArgs) Handles SHWUSERS_BTN.Click
        showusers.Show()
        Me.Hide()
    End Sub

    Private Sub UPDTACC_BTN_Click(sender As Object, e As EventArgs) Handles UPDTACC_BTN.Click
        Modifyacc.Show()
        Modifyacc.Load_ComboBox()
        Me.Hide()
    End Sub

    Private Sub DELACCNT_BTN_Click(sender As Object, e As EventArgs) Handles DELACCNT_BTN.Click
        dLt_form.Show()
        Me.Hide()
    End Sub

    Private Sub EXIT_BTN_Click(sender As Object, e As EventArgs) Handles EXIT_BTN.Click
        Login.Show()
        Me.Hide()
    End Sub
End Class