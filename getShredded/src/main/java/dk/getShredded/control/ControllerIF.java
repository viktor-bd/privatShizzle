package dk.getShredded.control;

public interface ControllerIF<T> {
    void add(T t);
    void remove(T t);
    T get(T t);

}
