package com.nipun.thread;

public class Printer implements Runnable{


    @Override
    public void run(){
        for(int i=0; i<=20; i++){
            System.out.println("From Child" +Thread.currentThread().getName()+" " +i);

            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();

            }

        }
    }




}
