package com.nipun.thread;

public class Printer extends Thread{



    @Override
    public void run(){
        for(int i=0; i<=100; i++){
            System.out.println("From Child" +currentThread().getName()+" " +i);
        }
    }

    public void run(int x){
        for(int i=0; i<=10; i++){
            System.out.println("From Child" +currentThread().getName()+" " +i);
        }
    }

}
