package main.class_instance;

class A{
    //static 키워드는 클래스영역에 멤버필드와 멤버메서드를 생성하도록 한다.
    public static String star = "****";
    public static void abcd(){
        System.out.println("나는야 클래스영역!");
    }


    public String hello = "hello!";
    public void abc(){
        System.out.println("나는야 인스턴스영역!");
    }

} //A

//인스턴스와 클래스의 관계를 코딩으로 이해하기 위해 작성!
public class ClassA {
    public static void main(String[] args) {
        A sample = new A();
        String star =  A.star;
        System.out.println(star);

//        String hello = A.hello;//컴파일 에러 why? > 인스턴스영역에서 생성된 hello에는 접근이 허용되지 않기 때문
//        System.out.println(star);

        A.abcd();
//        A.abc();//마찬가지로 컴파일 에러를 발생시킨다. > 인스턴스영역에서 생성된 메서드로의 접근이 불가능하기 때문


    }
}//ClassA
