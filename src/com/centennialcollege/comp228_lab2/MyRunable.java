package com.centennialcollege.comp228_lab2;

public class MyRunable implements Runnable {
	// PRIVATE INSTANCE VARIABLE
	private int _number;

	public MyRunable(int number) {
		this._number = number;
	}

	@Override
	public void run() {
		Task1();
	}

	private synchronized void Task1() {
		// TASK
		for (int index = 0; index < 10; index++) {
			System.out.println("Runnable " + this._number + " Count: " + index);
			try {
				Thread.sleep(1000); // wait for 1000 ms = 1 sec
			} catch (InterruptedException exception) {
				System.err.println("Runnable Interrupted: " + exception);
			}
		}
	}

}
