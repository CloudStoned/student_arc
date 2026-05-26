namespace GradeComputation
{
    public class StudentGradeComputation
    {
        public StudentGradeComputationModel studentGradeComputationModel = new StudentGradeComputationModel();
        public StudentGradeComputation()
        {

        }

        public double CalculatePrelimGrade()
        {

            return (((studentGradeComputationModel.prelimQuiz      / 60) * 0.4) * 100) 
                 + (((studentGradeComputationModel.prelimMajorExam / 50) * 0.6) * 100);
        }

        public double CalculateMidtermGrade()
        {
            return (((studentGradeComputationModel.midtermQuiz / 60) * 0.2) * 100)      + (((studentGradeComputationModel.midtermRecitaion / 100) * 0.2) * 100) + 
                   (((studentGradeComputationModel.midtermMajorExam / 50) * 0.3) * 100) + (((studentGradeComputationModel.midtermProject / 20) * 0.3) * 100);
        }

        public double CalculateFinalGrade()
        {
            return ((studentGradeComputationModel.finalProject / 100) * 100);
        }

        public double CalculateOverallRating()
        {
            double prelimWeight = 0.2;
            double midtermWeight = 0.3;
            double finalWeight = 0.5;

            double prelimGrade = CalculatePrelimGrade();
            double midtermGrade = CalculateMidtermGrade();
            double finalGrade = CalculateFinalGrade();

            return (prelimGrade * prelimWeight) + (midtermGrade * midtermWeight)
                   + (finalGrade * finalWeight);
        }


    }
}