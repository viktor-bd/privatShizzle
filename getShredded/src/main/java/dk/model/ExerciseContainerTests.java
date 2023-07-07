package dk.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ExerciseContainerTests {
    private ExerciseContainer SUT;
    public ExerciseContainerTests(){
        this.SUT = ExerciseContainer.getInstance();
    }
    @Test

    public void given1ShouldReturnExercise(){
        Exercise foo = new Exercise("foo", 1, new ArrayList());
        SUT.add(foo);
        var actual = this.SUT.get(1);
        assert(actual != null);

    }
    @Test
    public void givenShouldReturnNull(){
        var actual = this.SUT.get(1);
        assert(actual == null);

    }

    @Test
    public void givenIntShouldReturnExercise(){
        Exercise foo = new Exercise("foo", 2, new ArrayList());
        SUT.add(foo);
        var actual = this.SUT.get(2);
        assert(actual != null);

    }
}


