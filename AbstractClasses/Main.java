package Abstract_Class;

public class Main {
    public static void main(String[] args) {
        daughter d=new daughter();
        d.fun("manan");
        Son s=new Son();
        s.fun("herman");
        Parent.greeting();
        Son.greeting();// we can use parent class methods with the help of child class.(Easy stuff)
        s.normal();
    }
}

