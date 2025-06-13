package levelTwo.genericsPackages;

public class List<T> {
    private T[] objects;
    private int size;
    public List(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public Object get(int index) {
        return objects[index];
    }

    public int getSize() {
        return size;
    }
}
