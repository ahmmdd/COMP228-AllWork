package com.centennialcollege.comp228_lab2;

// DRIVER CLASS
public class Program {

	public static void main(String[] args) throws Exception {
        try {
        	int n = InputHelper.getIntegerInput("What value in Fibonacci do you want the values? ");
        	
            for(int i=0;i<=n;i++){
            	MyThread f = new MyThread(i);
                f.start();
                f.join();
            	System.out.print(f.answer + " ");
            }
        }
        catch(Exception e) {
            System.out.println("usage: java Fib NUMBER");
        }
    }
}
