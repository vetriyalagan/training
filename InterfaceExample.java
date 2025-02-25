
	interface A {
    void test();
}

interface B {
    void test();
}

public class InterfaceExample implements A, B {
    
    public void test() {
        System.out.print("test");
    }

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.test(); 
    }
}
