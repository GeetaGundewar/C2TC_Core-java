package com.tns.application;
import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	
	private static final float MINBAL=1000;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
	}

	public  void withdraw (float accBal) {
		System.out.println("Your Balance is:  "+accBal);	
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accBal=" + accBal + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	
}
