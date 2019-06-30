package belajar_objek;

class A{
    A(){
        System.out.println("Contructor dari kelas A");
    }
}

class B extends A{
    B(){
        System.out.println("Contrutor dari kelas B");
    }
}

class C extends B{
    C(){
        System.out.println("Contructor dari kelas C");
    }
}

class DemoConstructorExtends{
    public static void main(String[] args){
        System.out.println("Saat membentuk objek dari kelas A");
        A obj1 = new A();

        System.out.println("Saat membentuk objek dari kelas C");
        B obj2 = new B();

        System.out.println("Saat membentuk objek dari kelas C");
        C obj3 = new C();
    }
}