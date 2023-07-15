package dk.getShredded.model;

public class SetRepetitionRange {

    private int minRepetitions;
    private int maxRepetitions;

    public static SetRepetitionRange tenToTwelve(){
        var setRepetitionRange = new SetRepetitionRange(10,12);
        return setRepetitionRange;
    }

    public SetRepetitionRange(int minRepetitions, int maxRepetitions) {
        this.minRepetitions = minRepetitions;
        this.maxRepetitions = maxRepetitions;
    }

    public int getMinRepetitions() {
        return minRepetitions;
    }

    public void setMinRepetitions(int minRepetitions) {
        this.minRepetitions = minRepetitions;
    }

    public int getMaxRepetitions() {
        return maxRepetitions;
    }

    public void setMaxRepetitions(int maxRepetitions) {
        this.maxRepetitions = maxRepetitions;
    }
}

