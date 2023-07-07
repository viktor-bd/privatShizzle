package dk.model;

import java.util.ArrayList;

public class ExerciseContainer implements containerIF<Exercise, Integer> {

    private ArrayList<Exercise> listOfExercises;
    private static ExerciseContainer Instance;

    public ExerciseContainer() {
        listOfExercises = new ArrayList<>();
    }
    public static ExerciseContainer getInstance() {
        if (Instance == null) {
            Instance = new ExerciseContainer();
        }
        return Instance;
    }

    @Override
    public void add(Exercise item) {
        listOfExercises.add(item);
    }

    @Override
    public void remove(Exercise item) {
        listOfExercises.remove(item);
    }

    @Override
    public Exercise get(Integer uniqueID) {

        var foundExercise = listOfExercises.stream()
                .filter(exercise -> exercise.getUniqueID() == uniqueID)
                .findFirst()
                .orElse(null);
        return foundExercise;






    }
}
