public abstract class Show<T> implements Cloneable {
    // Implements clone in abstract class to make use of generics
    @Override
    public T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}
