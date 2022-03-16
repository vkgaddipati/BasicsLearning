package BasicsLearning;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello World");
        printStars();
    A.a();
    B.b();
    C.c();

    }

     public static void printStars(){
        for(int i = 1; i<=10; i++){
            for(int j = 1; j < i; j++){
                System.out.println("*");
            }
        }

    }
}

class A {
    public static void a() {
        System.out.println("This is from CLass A");
    }
}

class B {
     public static void b() {
        System.out.println("This is from CLass B");
    }
}
class C {
    public static void c() {
        System.out.println("This is from CLass C");
    }
}
