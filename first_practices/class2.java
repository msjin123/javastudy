public class class2 {
    public static void main(String args[]){
        Puppy p = new Puppy();
        p.age=44;
        p.age2=20;
        Puppy.print();   // 가능
        p.print();       // 가능
        Puppy.print2();  // 안됨  (출력하는 값이 age일떄)
        p.print2();      // 가능
        Puppy p2 = new Puppy();
        p2.age=55;
        p2.print2();
        
        p.print3();
        p2.print3();
    }
}

class Puppy{
    int age;
    static int age2;
    static void print(){
        System.out.println("fdsf");
    }

    static void print2(){
        System.out.println(age2); 
    }

    void print3(){
        System.out.println(age); 
    }
}