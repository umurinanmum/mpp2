package prob2C;

import java.util.ArrayList;

public class Student {

    public String name;
    private ArrayList<Section> sections;
    
    

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

}
