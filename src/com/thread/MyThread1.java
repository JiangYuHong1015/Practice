package com.thread;

/**
 * 继承thread类，可以直接调用start方法
 * @author Administrator
 *
 */
public class MyThread1 extends Thread {
	
	public void run() {
		for(int i = 0; i < 10; i++){
			System.out.println("我是线程1--"+i);
		}
		
	}

}
