package com.centennialcollege.comp228_lab2;

public class MyThread extends Thread {
	private int _x;
    public int answer;

    public MyThread(int x) {
        this._x = x;
    }

    public void run() {
    	if(_x == 0){ answer = 0;}
    	else if( _x <= 2 ){
            answer = 1;}
        else {
            try {
            	MyThread f1 = new MyThread(_x-1);
            	MyThread f2 = new MyThread(_x-2);
                f1.start();
                f2.start();
                f1.join();
                f2.join();
                answer = f1.answer + f2.answer;
            }
            catch(InterruptedException ex) { }
        }
    }

    
}
