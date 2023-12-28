class Base {
    Base(){
        System.out.println("Base class Constructor");
    }
    public void show() {
        System.out.println("Base class show() method");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        Base obj = new Base();
        Base obj2 =new Base() {
            public void show() {
                System.out.println("Anonymous class overridden show() method");
            }
        };

        obj.show();
        obj2.show();
    }
}
