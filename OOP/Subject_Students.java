class Subject {
    String subID;
    String name;
    int maxMarks;
    int marksObtain;

    public String geSubID() {
        return subID;
    }
    public String getName() {
        return name;
    }
    public int getMaxMarks() {
        return maxMarks;
    }
    public int marksObtain() {
        return marksObtain;
    }

    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }
    public void setMarksObtain(int marksObtain) {
        this.marksObtain = marksObtain;
    }

    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;
    }
    
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+ marksObtain;
    }

}


public class Subject_Students {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101", "Discrete Math", 100);
        subs[1] = new Subject("s102", "Physics", 100);
        subs[2] = new Subject("s103", "Programming Principles II", 100);

        for (Subject s: subs) 
        System.out.println(s);
    }

    
}
