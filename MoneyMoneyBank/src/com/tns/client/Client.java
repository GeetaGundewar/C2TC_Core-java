package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {
	
	public static void main(String [] args) {
		
		BankFactory bf =new MMBankFactory();
		SavingAcc sa =new MMSavingAcc(1,"Reema",1000,true);
		sa.withdrow(sa.getAccBal());
		sa.toString();
		
		CurrentAcc ca=new MMCurrentAcc(2,"Seema",2000,4000);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		
	}

}
