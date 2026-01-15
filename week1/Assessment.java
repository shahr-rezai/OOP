public class Assessment {

    // Enum for grades
    enum Grade {
        A, A_MINUS, B, B_PLUS, B_MINUS,
        C, C_PLUS, C_MINUS, D, F
    }

    // Class to hold student assessment details
    public static class StudentAssessment {
        String name;
        int mark;
        int totalMark;
        int fudgeMark;

        // Constructor
        public StudentAssessment(String name, int mark, int totalMark, int fudgeMark) {
            this.name = name;
            this.mark = mark;
            this.totalMark = totalMark;
            this.fudgeMark = fudgeMark;
        }
    }

    // Method to compute grade for a student
    public Grade computeGrade(StudentAssessment student) {
        int c_mark = student.mark + student.fudgeMark;  // total marks including fudge
        double percentage = ((double)c_mark / student.totalMark) * 100;  // calculate percentage

        if (percentage >= 90) return Grade.A;
        else if (percentage >= 85) return Grade.A_MINUS;
        else if (percentage >= 80) return Grade.B_PLUS;
        else if (percentage >= 75) return Grade.B;
        else if (percentage >= 70) return Grade.B_MINUS;
        else if (percentage >= 65) return Grade.C_PLUS;
        else if (percentage >= 60) return Grade.C;
        else if (percentage >= 55) return Grade.C_MINUS;
        else if (percentage >= 50) return Grade.D;
        else return Grade.F;
    }
    public void penalize(int penalty){
      this.fudgeMark =-penalty;
    }
    public void penalize(Grade newGrade)
    {
      int bestFudge = 0;
      for(int i=0; i<mark; i++)
      {
        fudgeMark=-i;
        if(computeGrade()==newGrade)
        {
          bestFudge=-i;
        }
        else if(bestFudge != 0)
        {
          break;
        }
      }
      fudgeMark = bestFudge;
    }
    @Override
    public String toString() {
    return "Assessment [name=" + name + ", mark=" + mark + ", totalMark=" + totalMark + ", fudgeMark="
            + fudgeMark + ", computeGrade()=" + computeGrade()+"]";
    }
}
