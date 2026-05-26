namespace StatsDLL
{
    public class RangeCalculator
    {
        public static double CalculateRange(List<StudentModel> students, Func<StudentModel, double> termSelector)
        {
            double max = students.Max(termSelector);
            double min = students.Min(termSelector);

            return max - min;

        }
    }
}
