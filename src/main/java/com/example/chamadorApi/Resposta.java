package com.example.chamadorApi;

public class Resposta {
	
	private long id;
	private int overdraft;
	private int credit;
	private int investments;
	
	public void setId(long id) {
		this.id = id;
	}
	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public void setInvestments(int investments) {
		this.investments = investments;
	}
	public long getId() {
		return id;
	}
	public int getOverdraft() {
		return overdraft;
	}
	public int getCredit() {
		return credit;
	}
	public int getInvestments() {
		return investments;
	}
	
	

}
