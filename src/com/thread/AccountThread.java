package com.thread;

public class AccountThread implements Runnable {
	private Account ac = new Account();

	
	@Override
	public void run() {
		
		for(int i = 0;i < 5;i++){
			account(100);
		}
	}
	
	public void account(int amount){
		if(ac.getAmount() >= amount ){
			System.out.println(Thread.currentThread().getName()+"可以取钱");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"开始取款");
			ac.getMoney(amount);
			System.out.println(Thread.currentThread().getName()+"取款完成,账户余额" + ac.getAmount());
		}
	}
	
	
}
