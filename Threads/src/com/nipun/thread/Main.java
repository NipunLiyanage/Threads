package com.nipun.thread;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.setDaemon(true);
        printer.start();

        for(int j=0; j<=10; j++){
            System.out.println("From Parent" + Thread.currentThread().getName()+" " +j);
        }

        System.out.println("************************Done*************************");

    }
}
