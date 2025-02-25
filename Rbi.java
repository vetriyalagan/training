
	interface SBI {
  default  void test()
    {
        System.out.println("SBI");
    }
}

interface Indianbank {
  default  void test()
    {
        System.out.println("Indianbank");
    }
}
interface CUB{
   default void test(){
        System.out.println("CUB");
    }
}

public class Rbi implements SBI,Indianbank,CUB {
    
    public void test() {
        SBI.super.test();        
        Indianbank.super.test();
        CUB.super.test();       
        System.out.print("RBI"); 
    }
    public static void main(String[] args) {
        Rbi obj = new Rbi();
        obj.test(); 
    }
}
