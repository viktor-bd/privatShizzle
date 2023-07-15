package dk.getShredded.persistence;

public interface containerIF<T, Key> {
    public void add(T item);
    public void remove(T item);

    public T get(Key uniqueID);


}
