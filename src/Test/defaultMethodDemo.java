package Test;

public interface defaultMethodDemo {
    public abstract int add(int i);


    default int multiply(int i, int b) {
        return i * b;
    }
}
