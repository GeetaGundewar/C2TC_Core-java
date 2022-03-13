package com.tns.framework;

public abstract class SavingAcc extends BankAcc {

	private boolean isSalary;
	private static final float MINBAL=1000;
	
	public static float getminbal() {
		
		return MINBAL;
	}
	public float getAccBal() {
		return accBal;
	}
	
	public void withdrow(float accBal)
	{
		System.out.println("Account Balance is:  "+accBal);
	}
	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", accBal=" + accBal + ", getAccBal()=" + getAccBal()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
