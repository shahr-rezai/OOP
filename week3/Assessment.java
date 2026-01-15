enum Grade{
    A, 
    A_MINUS, 
    B_PLUS, 
    B, 
    B_MINUS, 
    C_PLUS, 
    C, 
    C_MINUS, 
    D, 
    F;
}
public class Assessment {
    String name;
    int mark;
    int totalMark;
    int fudgeMark;
    public Assessment(String name, int mark, int totalMark, int fudgeMark) {
        this.name = name;
        this.mark = mark;
        this.totalMark = totalMark;
        this.fudgeMark = fudgeMark;
    }
    public Grade computeGrade()
    {
        int c_mark=mark+fudgeMark;//mark+=fudgemark
        double total=((double)c_mark/(double)totalMark)/100;
        if(total>=90) return Grade.A;
        else if(total>=85) return Grade.A_MINUS;
        else if(total>=80) return Grade.B_PLUS;
        else if(total>=75) return Grade.B;
        else if(total>=70) return Grade.B_MINUS;
        else if(total>=65) return Grade.C_PLUS;
        else if(total>=60) return Grade.C;
        else if(total>=55) return Grade.C_MINUS;
        else if(total>=50) return Grade.D;
        else return Grade.F;
    }
    public void penalize(int penalty)
    {
        this.fudgeMark=-penalty;
    }
    public void penalize(Grade newGrade)
    {
        int bestFudge=0;
        for(int i=0;i<mark;i++)
        {
            fudgeMark=-i;
            if(computeGrade()==newGrade)
            {
                bestFudge=-i;
            }
            else if(bestFudge!=0)
            {
                break;
            }
        }   
        fudgeMark=bestFudge;
    }
    @Override
    public String toString() {
        return "Assessment [name=" + name + ", mark=" + mark + ", totalMark=" + totalMark + ", computeGrade()="
                + computeGrade() + "]";
    }
    
    
}