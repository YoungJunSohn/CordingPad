package main.accessModifier.testPack1;

public class A {
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열형!");

    public A(boolean b){}; //public 접근제한자
    A(int b){}; //default 접근제한자
    private A(String b){}; //private 접근제한자


}//A
