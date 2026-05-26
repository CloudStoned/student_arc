namespace StatsDLL
{
    public class VarianceCalculator : MeanCalculator
    {
        public static double CalculateVariance(List<StudentModel> studentList, Func<StudentModel, double> termSelector)
        {
            double mean = CalculateMean(studentList, termSelector);
            int counter = studentList.Count;
            double summationOfSquared = 0;

            foreach (StudentModel student in studentList)
            {
                double value = termSelector(student);
                double differenceOfValue = value - mean;
                double differenceSquared = differenceOfValue * differenceOfValue;
                summationOfSquared = summationOfSquared + differenceSquared;

            }
            double variance = summationOfSquared / (counter - 1);

            return variance;
        }
    }
}
