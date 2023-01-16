package EU8.week17_abstraction_exception.kahoot_Qs;

class A{
    public void print(){
        System.out.println("Adil");
    }
}

class B extends A {
    @Override
    public void print(){
        System.out.println("Emil");
    }
}
public class Test1 extends B{
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.print();
    }
}
