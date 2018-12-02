package com.thread;

public class Test {
	public static void main(String[] args) {
		MyThread1 mt = new MyThread1();
		MyThread2 mt2 = new MyThread2();
		Thread th = new Thread(mt2);
		mt.start();
		th.start();
	}
	

}
