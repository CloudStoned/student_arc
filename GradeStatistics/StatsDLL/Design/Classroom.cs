namespace StatsDLL
{
    public class Classroom
    {
        public static void AddStudentsToList()
        {
            StudentModel studentA = new StudentModel();
            studentA.studentName = "Student A";
            studentA.prelim = 78.88;
            studentA.midterm = 85.00;
            studentA.finals = 100.00;
            StudentModel.studentsList.Add(studentA);

            StudentModel studentB = new StudentModel();
            studentB.studentName = "Student B";
            studentB.prelim = 56.76;
            studentB.midterm = 98.00;
            studentB.finals = 100.00;
            StudentModel.studentsList.Add(studentB);

            StudentModel studentC = new StudentModel();
            studentC.studentName = "Student C";
            studentC.prelim = 98.00;
            studentC.midterm = 87.92;
            studentC.finals = 99.00;
            StudentModel.studentsList.Add(studentC);

            StudentModel studentD = new StudentModel();
            studentD.studentName = "Student D";
            studentD.prelim = 87.98;
            studentD.midterm = 85.00;
            studentD.finals = 98.00;
            StudentModel.studentsList.Add(studentD);

            StudentModel studentE = new StudentModel();
            studentE.studentName = "Student E";
            studentE.prelim = 89.00;
            studentE.midterm = 90.15;
            studentE.finals = 97.00;
            StudentModel.studentsList.Add(studentE);

            StudentModel studentF = new StudentModel();
            studentF.studentName = "Student F";
            studentF.prelim = 90.00;
            studentF.midterm = 90.11;
            studentF.finals = 89.90;
            StudentModel.studentsList.Add(studentF);

        }
    }
}
