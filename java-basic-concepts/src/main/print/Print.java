package main.print;

public class Print {
    public static void main(String[] args) {
        String name = "손영준";
        int age = 28;
        String tel1="010", tel2="1234", tel3="5678";

        System.out.println("이름 : "+name);
        System.out.print("나이 : "+age+"\n");  // \n으로 줄바꿈을 할 수 있다.

        System.out.printf("전화 : %1$s-%2$s-%3$s", tel1,tel2,tel3);
    };//main
};
