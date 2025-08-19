package opps_practical;

// Base class
class A {
    void m1() {
        System.out.println("Inside A's m1 method");
    }
}

// Derived class B
class B extends A {
    // overriding m1()
    void m1() {
        System.out.println("Inside B's m1 method");
    }
}

// Derived class C
class C extends A {
    // overriding m1()
    void m1() {
        System.out.println("Inside C's m1 method");
    }
}

// Driver class
public class dynamic {
    public static void main(String args[]) {
        // object of type A
        A a = new A();
        // object of type B
        B b = new B();
        // object of type C
        C c = new C();

        // obtain a reference of type A
        A ref;

        // ref refers to an A object
        ref = a;
        ref.m1();   // Inside A's m1 method

        // now ref refers to a B object
        ref = b;
        ref.m1();   // Inside B's m1 method

        // now ref refers to a C object
        ref = c;
        ref.m1();   // Inside C's m1 method
    }
}