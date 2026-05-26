namespace StatsDLL
{
    public class StandarDeviationCalculator : VarianceCalculator
    {
        public static double CalculateStandardDeviation(List<StudentModel> studentList, Func<StudentModel, double> termSelector)
        {
            double variance = CalculateVariance(studentList, termSelector);
            return Math.Sqrt(variance);
        }

    }
}
