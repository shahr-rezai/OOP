import java.util.Arrays;

public class Student {
    Assessment[] assessments;
    int count;
    public Student()
    {
        assessments=new Assessment[10];
        count=0;
    }
    public void addAssessment(String name, int mark, int totalMark)
    {
        for(int i=0;i<count; i++)
        {
            if(assessments[i].name.equals(name))
            {
                System.out.println("Assessment already exist");
                return;
            }
        }
        if(count<assessments.length)
        {
            assessments[count]=new Assessment(name, mark, totalMark, 0);
            count++;
        }
        else{
            System.out.println("Maximum assessment reached");
        }
    }
    public void addAssessment(String name, Grade newGrade)
    {
        for (Assessment assessment : assessments) {
            if(assessment.name.equals(name))
            {
                assessment.penalize(newGrade);
                System.out.println("Grade updated to "+newGrade);
                return;
            }
        }
    }
    @Override
    public String toString() {
        return "Student [assessments=" + Arrays.toString(assessments) + ", count=" + count + "]";
    }
    
}