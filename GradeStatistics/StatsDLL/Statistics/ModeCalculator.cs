

namespace StatsDLL
{
    public class ModeCalculator
    {
        public static double HasMode(List<StudentModel> studentList, Func<StudentModel, double> termSelector)
        {
            double currentValue = termSelector(studentList[0]);
            int consecutiveCount = 1;

            for (int i = 1; i < studentList.Count; i++)
            {
                double nextValue = termSelector(studentList[i]);

                if (currentValue == nextValue)
                {
                    consecutiveCount++;
                }
                else
                {
                    consecutiveCount = 1;
                }

                if (consecutiveCount > 1)
                {
                    return currentValue;
                }

                currentValue = nextValue;
            }

            return 0;
        }



    }
}
