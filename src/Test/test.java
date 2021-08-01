package Test;

public class test {
    public static void main(String[] args) {
        defaultMethodDemo defaultMethodDemo = new defaultMethodDemo() {
            @Override
            public int add(int i) {
                return multiply(i, 100);
            }
        };
        int add=defaultMethodDemo.add(12);
        System.out.println(add);

        int multiply=defaultMethodDemo.multiply(4,5);
        System.out.println(multiply);
    }


}
