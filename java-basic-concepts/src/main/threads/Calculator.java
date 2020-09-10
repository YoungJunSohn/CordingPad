package main.threads;

public class Calculator {//스레드들의 공유객체
    private int memory;
    public int getMemory(){
        return memory;
    }

    public void  setMemory(int memory){
        this.memory = memory; //매개변수를 필드에 저장

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
        }
        System.out.println(Thread.currentThread().getName()+" : "+this.memory); //스레드 이름 : 메모리 값
    }//setMemory
}//Calculator

