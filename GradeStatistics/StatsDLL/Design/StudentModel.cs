namespace StatsDLL 
{
    public class StudentModel
    {
        public string studentName { get; set; }
        public double prelim { get; set; }
        public double midterm { get; set; }
        public double finals { get; set; }

        public static List<StudentModel> studentsList = new List<StudentModel>();
    }
}

