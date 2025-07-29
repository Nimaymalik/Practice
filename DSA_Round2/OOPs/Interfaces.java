package DSA_Round2.OOPs;

interface A {
    void showA();

}

interface B {
    void showB();

}

class C implements A, B {
    public void showA() {
        System.out.println("Inside A");
    }

    public void showB() {
        System.out.println("Inside B");
    }

}

public class Interfaces {
    public static void main(String[] args) {
        C obj=new C();
        obj.showA();
        obj.showB();

    }

}
