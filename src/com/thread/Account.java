package com.thread;

public class Account {
	
	private int amount = 500;
	
	public int getAmount(){
		return amount;
	}
	
	//取钱的方法
	public void getMoney(int num){
		amount = amount-num;
	}

}
