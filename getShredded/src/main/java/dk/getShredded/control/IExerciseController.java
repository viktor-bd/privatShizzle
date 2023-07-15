package dk.getShredded.control;

import dk.getShredded.model.Exercise;

public interface IExerciseController extends ControllerIF<Exercise> {
Exercise findByMuscleGroup(String muscleGroup);
}
