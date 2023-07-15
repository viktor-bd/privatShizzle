package dk.getShredded.model;

import java.time.Period;

public class Set {

    private SetRepetitionRange repetitions;
    private Period restDuration;

    private String name;

    public Set(String name, SetRepetitionRange repetitions, Period restDuration) {
        this.name = name;
        this.repetitions = repetitions;
        this.restDuration = restDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SetRepetitionRange getRepetitions() {
        return repetitions;
    }

    public Period getRestDuration() {
        return restDuration;
    }

    public void setRepetitions(SetRepetitionRange repetitions) {
        this.repetitions = repetitions;
    }

    public void setRestDuration(Period restDuration) {
        this.restDuration = restDuration;
    }

}
