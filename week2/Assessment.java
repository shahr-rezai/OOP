package week2;
public class Assessment{
enum Grades{
  A_PLUS, A, A_MINUS, B_PLUS, B, B_MINUS, C_PLUS, C, C_MINUS, D_PLUS, D, D_MINUS, F;
  
}
public static class StudentAssessment{
private String name;
private int actualMark;
private int possibleMarks;
private int fudgeMark2;

public StudentAssessment(String name, int actualMark, int possibleMarks, int fudgeMark2){
  this.name=name;
  this.actualMark=actualMark;
  this.possibleMarks=possibleMarks;
  this.fudgeMark2= fudgeMark2;
}
public String getName(){
  return name;
}
public void setName(String name){
  this.name=name;
}
public int getActualMark(){
  return actualMark;
}
public void setActualMark(int actualMark){
  this.actualMark=actualMark;
}
public int getPossibleMarks(){
  return possibleMarks;
}
public void setPossibleMarks(int possibleMarks){
  this.possibleMarks=possibleMarks;
  
}
public int getFudgeMark2(){
  return fudgeMark2;
}
public void setFudgeMark2(int fudgeMark2){
  this.fudgeMark2=fudgeMark2;

}

public Grades computeGrades(StudentAssessment student){
  int c_mark= student.actualMark+student.fudgeMark2;
  double percentage=((double)c_mark/student.possibleMarks)*100;
  

  if (percentage >= 90) return Grades.A;
        else if (percentage >= 85) return Grades.A_MINUS;
        else if (percentage >= 80) return Grades.B_PLUS;
        else if (percentage >= 75) return Grades.B;
        else if (percentage >= 70) return Grades.B_MINUS;
        else if (percentage >= 65) return Grades.C_PLUS;
        else if (percentage >= 60) return Grades.C;
        else if (percentage >= 55) return Grades.C_MINUS;
        else if (percentage >= 50) return Grades.D;
        else return Grades.F;

}
public void penalize(int penalty){
  this.fudgeMark2= -penalty;

}
public void penalize(Grades newGrades){
    int bestFudge2 = 0;
    for (int i = 0; i <= actualMark; i++) {
        this.fudgeMark2 = -i;
        if (computeGrades() == newGrades) {
            bestFudge2 = -i;
            break;
        }
    }
    this.fudgeMark2 = bestFudge2; // Apply the best penalty
}

  @Override
    public String toString() {
    return "Assessment [name=" + name + ", mark=" + actualMark + ", totalMark=" + possibleMarks + ", fudgeMark="
            + fudgeMark2 + ", computeGrade()=" + computeGrades()+"]";
    }


}


}
