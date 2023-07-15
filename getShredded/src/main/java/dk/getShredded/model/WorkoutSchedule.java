package dk.getShredded.model;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.List;

public class WorkoutSchedule {

    private HashMap<DayOfWeek, List<ExerciseSchedule>> workoutSchedule;

    public WorkoutSchedule(HashMap<DayOfWeek, List<ExerciseSchedule>> workoutSchedule) {
        this.workoutSchedule = workoutSchedule;
    }

    public HashMap<DayOfWeek, List<ExerciseSchedule>> getWorkoutSchedule() {
        return workoutSchedule;
    }

    public void setWorkoutSchedule(HashMap<DayOfWeek, List<ExerciseSchedule>> workoutSchedule) {
        this.workoutSchedule = workoutSchedule;
    }

    public void addExerciseSchedule(DayOfWeek dayOfWeek, List<ExerciseSchedule> exerciseSchedule) {
        workoutSchedule.put(dayOfWeek, exerciseSchedule);
    }

    public void removeExerciseSchedule(DayOfWeek dayOfWeek) {
        workoutSchedule.remove(dayOfWeek);
    }

    public void updateExerciseSchedule(DayOfWeek dayOfWeek, List<ExerciseSchedule> exerciseSchedule) {
        workoutSchedule.replace(dayOfWeek, exerciseSchedule);
    }

    public void clearWorkoutSchedule() {
        workoutSchedule.clear();
    }


}
