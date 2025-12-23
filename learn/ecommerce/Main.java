
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        User user =  new User(123,"mohamed","mmmm");
        user.SendQuery(user.buildQuery());
        boolean check = Boolean.FALSE;
        A.B.C c =  new A().new B().new C();
        // new A.B();
        System.out.println(new A().new B().new C() instanceof A.B.C);
        System.out.println(findUser().toString());
        System.out.println(Boolean.TRUE);
        if(Boolean.TRUE){
            System.out.println("hello mum");
        }
        System.out.println(check);
    }
    public static  Optional<User> findUser(){
        final User user = new User(123,"mohamed","mmmm");
        
        return Optional.ofNullable(user);
    }
}
 
class A {

    static int x = 10;

    A() {
        System.out.println("A");
    }
    void print(){

    }
     class B {

        int x = 4;

        B() {
            System.out.println("B");

        }

        class C {

            int x = 5;

            C() {
                System.out.println("C");
            }

            void print() {
                System.out.println("Hello world");
            }
        }
    }
}

class User {

    int id;
    String name;
    String passowrd;

    User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.passowrd = password;
    }

    String buildQuery() {
        return  "INSERT INTO USRER (id,name,password) VALUE (" + this.id + "," + this.passowrd + "," + this.name + ")";
    }

    @Override
    public String toString(){
        return  "User : \n{\n id : " +this.id+ ",\nname : "+this.name+",\npassword : "+this.passowrd+"\n}" ;
    }
    void SendQuery(String query) {
        
    }
}
