namespace StatsDLL
{
    public class DataTableDesign
    {
        public static void DisplayData(List<StudentModel> students)
        {
            Console.WriteLine("----------------------------------------------------------------");
            Console.WriteLine("|                       Students Grade                         |");
            Console.WriteLine("----------------------------------------------------------------");
            Console.WriteLine("| Student Name |    Prelim    |    Midterm    |    Finals      |");
            Console.WriteLine("----------------------------------------------------------------");

            foreach (var student in students)
            {
                Console.WriteLine($"| {student.studentName,-12} | {student.prelim,13:F2} | {student.midterm,13:F2} | {student.finals,13:F2} |");
                Console.WriteLine("---------------------------------------------------------------");
            }

        }
    }
}


