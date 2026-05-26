namespace StatsDLL
{
    public class MedianCalculator
    {
        private static List<StudentModel> SortStudentList(List<StudentModel> students, Func<StudentModel, double> termSelector)
        {
            var sortedStudentList = students.OrderBy(termSelector).ToList();
            return sortedStudentList;
        }

        public static double CalculateMedian(List<StudentModel> studentList, Func<StudentModel, double> termSelector)
        {
            var sortedStudentList = SortStudentList(studentList, termSelector);
            int count = sortedStudentList.Count;
            double median;

            if (count % 2 == 0)
            {
                double value1 = termSelector(sortedStudentList[count / 2 - 1]);
                double value2 = termSelector(sortedStudentList[count / 2]);
                median = (value1 + value2) / 2.0;

            }

            else
            {
                median = termSelector(sortedStudentList[count / 2]);
            }

            return median;
        }

    }
}
