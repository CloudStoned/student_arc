using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace GradeComputation
{
    public class StudentGradeComputationModel
    {
        public string studentNumber { set; get; }
        public string studentName { set; get; }
        public string studentCourse { set; get; }
        public double prelimQuiz {set; get; }
        public double prelimMajorExam { set; get; }
        public double midtermQuiz { set; get; }
        public double midtermMajorExam { set; get; }
        public double midtermRecitaion { set; get; }
        public double midtermProject { set; get; }
        public double finalProject { set; get; }

        public double prelimGrade;
        public double midtermGrade;
        public double finalGrade;
        public double overallRating;


        public StudentGradeComputationModel()
        {

        }
    }
}
