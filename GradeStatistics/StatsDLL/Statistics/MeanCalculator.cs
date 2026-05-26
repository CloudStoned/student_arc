
namespace StatsDLL
{
    public class MeanCalculator
    {
        public static double CalculateMean(List<StudentModel> studentList, Func<StudentModel, double> termSelector)
        {

            double sum = 0;
            int counter = 0;
            double mean;

            foreach (var student in studentList)
            {
                double value = termSelector(student);
                sum += value;
                counter++;
            }

            mean = sum / counter;

            return mean;
        }
    }
}
