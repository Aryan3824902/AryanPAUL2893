class OuterClass {
    int outerValue = 50;
    static int staticValue = 100;
    public void Displayabc()
    {
        System.out.println("outer value is"+ outerValue);
    }

    static class StaticNestedClass {
        void display() {
            System.out.println("Static Value: " + staticValue);
        }
    }
}

public class StaticClassDemo {
    public static void main(String[] args) {
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.display();
        OuterClass ob1 = new OuterClass();
        ob1.Displayabc();
     }
}