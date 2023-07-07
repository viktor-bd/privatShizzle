package dk.model;

import java.util.List;

public class Exercise {
    private String name;
    private List sets;
    private int uniqueID;


    public Exercise(String name, int uniqueID, List sets) {
        this.name = name;
        this.uniqueID = uniqueID;
        this.sets = sets;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getSets() {
        return sets;
    }

    public void setSets(List sets) {
        this.sets = sets;
    }


}
