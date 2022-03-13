package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
		super(AccNo, accNm, accBal, creditLimit);	
	}

	public void withdraw(float creditLimit)
	{
		System.out.println("Your account Balance is:  " + accBal+ " With Creadit limit: " +creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [accBal=" + accBal + ", getCreditLimit()=" + getCreditLimit() + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

}
