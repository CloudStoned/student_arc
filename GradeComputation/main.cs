using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GradeComputation
{
    class Program
    {
        static void PrintStudentGrades(StudentGradeComputationModel student)
        {
            Console.WriteLine("Student Number: " + student.studentNumber);
            Console.WriteLine("Student Name: " + student.studentName);
            Console.WriteLine("Student Course: " + student.studentCourse);
            Console.WriteLine("Student PrelimGrade: " + student.prelimGrade);
            Console.WriteLine("Student MidtermGrade: " + student.midtermGrade);
            Console.WriteLine("Student FinalGrade: " + student.finalGrade);
            Console.WriteLine("Student OverallRating: " + student.overallRating);
            Console.WriteLine("------------------------------------------------------");
            Console.WriteLine();
        }

        static void CalculateStudentGradesAndRatings(StudentGradeComputation studentGradeComputation, StudentGradeComputationModel student)
        {
            student.prelimGrade = studentGradeComputation.CalculatePrelimGrade();
            student.midtermGrade = studentGradeComputation.CalculateMidtermGrade();
            student.finalGrade = studentGradeComputation.CalculateFinalGrade();
            student.overallRating = studentGradeComputation.CalculateOverallRating();
        }

        static void DisplayStudentGrades(List<StudentGradeComputationModel> studentList, string userInput, string gradingPeriod)
        {
            if (string.IsNullOrWhiteSpace(userInput))
            {
                Console.WriteLine("Enter a Student Number or grading period.");
                return;
            }

            // Search for the student by student number
            var foundStudent = studentList.FirstOrDefault(student => student.studentNumber == userInput);

            if (foundStudent != null)
            {
                // Display grades for the specific grading period
                switch (gradingPeriod)
                {
                    case "prelim":
                        Console.WriteLine("Grades for Prelim Period:");
                        Console.WriteLine("PrelimGrade: " + foundStudent.prelimGrade);
                        break;
                    case "midterm":
                        Console.WriteLine("Grades for Midterm Period:");
                        Console.WriteLine("MidtermGrade: " + foundStudent.midtermGrade);
                        break;
                    case "final":
                        Console.WriteLine("Grades for Final Period:");
                        Console.WriteLine("FinalGrade: " + foundStudent.finalGrade);
                        break;
                    default:
                        // Display all grades
                        Console.WriteLine("All Grades:");
                        PrintStudentGrades(foundStudent);
                        break;
                }
            }
            else
            {
                Console.WriteLine("Student not found.");
            }
        }
        public static void Main(string[] args)
        {
            List<StudentGradeComputationModel> studentList = new List<StudentGradeComputationModel>();
            StudentGradeComputation studentGradeComputation1 = new StudentGradeComputation();
            StudentGradeComputation studentGradeComputation2 = new StudentGradeComputation();
            StudentGradeComputation studentGradeComputation3 = new StudentGradeComputation();


            StudentGradeComputationModel student1 = new StudentGradeComputationModel
            {
                studentNumber = "S202210133",
                studentName = "James, Dean A",
                studentCourse = "BSIT",
                prelimQuiz = 45.0,
                prelimMajorExam = 30.0,
                midtermQuiz = 45.0,
                midtermMajorExam = 30.0,
                midtermRecitaion = 90.0,
                midtermProject = 10.0,
                finalProject = 92.0
            };

            StudentGradeComputationModel student2 = new StudentGradeComputationModel
            {
                studentNumber = "S202210132",
                studentName = "Janella , Rein A",
                studentCourse = "BSIT",
                prelimQuiz = 30.0,
                prelimMajorExam = 30.0,
                midtermQuiz = 12.0,
                midtermMajorExam = 30.0,
                midtermRecitaion = 75.0,
                midtermProject = 10.0,
                finalProject = 100.0
            };

            StudentGradeComputationModel student3 = new StudentGradeComputationModel
            {
                studentNumber = "S202210131",
                studentName = "Sarah , Grey A",
                studentCourse = "BSIT",
                prelimQuiz = 60.0,
                prelimMajorExam = 30.0,
                midtermQuiz = 12.0,
                midtermMajorExam = 40.0,
                midtermRecitaion = 75.0,
                midtermProject = 20.0,
                finalProject = 60.0
            };

            //creating separate instances of StudentGradeComputation for each student
            //and assigning their specific StudentGradeComputationModel objects
            studentGradeComputation1.studentGradeComputationModel = student1;
            studentGradeComputation2.studentGradeComputationModel = student2;
            studentGradeComputation3.studentGradeComputationModel = student3;

            CalculateStudentGradesAndRatings(studentGradeComputation1, student1);
            CalculateStudentGradesAndRatings(studentGradeComputation2, student2);
            CalculateStudentGradesAndRatings(studentGradeComputation3, student3);


            studentList.Add(student1);
            studentList.Add(student2);
            studentList.Add(student3);

            //PrintStudentNames(studentList);

            Console.WriteLine("Enter Student Number:");
            string userInput = Console.ReadLine();

            Console.WriteLine("Enter Grading Period (prelim, midterm, final, or press Enter for all):");
            string gradingPeriod = Console.ReadLine().ToLower();

            // Call the function to display student grades
            DisplayStudentGrades(studentList, userInput, gradingPeriod);
        }
    }
}
