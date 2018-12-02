package com.thread;

/**
 * 当多个用户需要访问同一个资源时
 * @author Administrator
 *
 */
public class AccountThreadTest {

	public static void main(String[] args) {
		AccountThread ar =	new AccountThread();
		Thread th1 = new Thread(ar);
		Thread th2 = new Thread(ar);
		th1.setName("ooo");
		th2.setName("yyy");
		th1.start();
		th2.start();
		
		

	}

}
