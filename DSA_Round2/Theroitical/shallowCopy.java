package DSA_Round2.Theroitical;

// shallow copy is the copy if the original ibject and it also change the original object
class Pen {
    String color;
}

class Student {
    String name;
    Pen pen;

}

public class shallowCopy {
    public static void main(String[] args) {
        Pen bluePen = new Pen();
        bluePen.color = "Blue";

        Student s1 = new Student();
        s1.name = "nimay";
        s1.pen = bluePen;

        Student s2 = new Student();
        s2.name = "amit";
        s2.pen = s1.pen; //shallow copy same pen object

        s2.pen.color = "red";

        System.out.println(s2.pen.color);

    }

}