package DSA_Round2.OOPs;

class Addition {
    // overloading

    void add(int a, int b) {
        System.out.println(a + b);

    }

    // overloading
    void add(float a, float b) {
        System.out.println(a + b);

    }

}

class Child extends Addition {
    @Override
    void add(int a, int b) {
        System.out.println(a + b);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        Addition add = new Addition();
        Child add1 = new Child();

        add.add(24.2f, 21.3f);
        add.add(24, 21);

        add1.add(10, 5);

    }

}
