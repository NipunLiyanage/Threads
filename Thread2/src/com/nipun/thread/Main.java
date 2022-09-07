package com.nipun.thread;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try {
            Printer printer = new Printer();
            Thread t = new Thread(printer);

            System.out.println("Main thread priority " + Thread.currentThread().getPriority());
            System.out.println("Child thread priority " + t.getPriority());
            t.start();
            t.interrupt();

            for (int j = 0; j <= 10; j++) {
                System.out.println("From Parent" + Thread.currentThread().getName() + " " + j);
            }

            System.out.println("************************Done*************************");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
