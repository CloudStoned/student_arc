namespace StatsDLL
{
    public class GradeCalculator
    {
        public static double CalculateFinalPeriod(double prelim, double midterm, double finals)
        {
            double roundedUpFinalGrade = prelim + midterm + finals;
            return Math.Ceiling(roundedUpFinalGrade / 3);
        }
    }
}
