package prob2C;

import java.util.ArrayList;

public class Section {

    public int sectionNum;
    private ArrayList<Student> students;

    public Section(int sectionNum, ArrayList<Student> students) throws Exception {
        this.sectionNum = sectionNum;
        if (this.students ==null || this.students.size() < 1) {
            throw new Exception("Needs to have at least 1 section");
        }
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
