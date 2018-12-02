package com.thread;

/**
 * 实现runnable接口，不能直接调用start方法，需要包在thread里面(runable里面没有start方法)
 * @author Administrator
 *
 */
public class MyThread2 implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0; i < 10;i++){
			System.out.println("我是线程2--" + i);
		}

	}

}
