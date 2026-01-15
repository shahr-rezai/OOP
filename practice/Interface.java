interface A {
  int age=44; // all varaibles are final and static
  String area="Mumbai"; // static we can directly use with the class name.
  void show();
  void config();
  }

interface X {
  void run();

}
interface y extends X{

}

class B implements A, y{
  public void show(){
    System.out.println("in show");
  }
  public void config(){
    System.out.println("In config");
  }
  public void run(){
    System.out.println("runing ");
  }
}

public class Interface{
  public static void main(String[] args) {
    A obj;
    obj=new B();
    obj.show();
    obj.config();

    y obj1;
    obj1 = new B();
    obj1.run();

    System.out.println(A.area);

  }
}

// class to class --> extends
//class to interface ---> implements
//interface to interface --> extends
