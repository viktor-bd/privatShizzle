package dk.getShredded.model;

import java.util.List;

public class Exercise {
    private String name;

    private int uniqueID;


    public Exercise(String name, int uniqueID) {
        this.name = name;
        this.uniqueID = uniqueID;

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




}
