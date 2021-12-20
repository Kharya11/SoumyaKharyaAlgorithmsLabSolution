package com.labAssignmentDS.main;
import java.util.Scanner;

import com.labAssignmentDS.model.PayMonneyTransaction;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transaction array.\n");
		int txnArr=sc.nextInt();
		int [] txnArrayVal=new int[txnArr];
		
		System.out.println("Enter the value of transaction array.\n");
		for(int i=0; i < txnArr; i++)
		{
			txnArrayVal[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved.\n");
		int trgtNum=sc.nextInt();
		
		for(int i=0;i<trgtNum;i++)
		{
			System.out.println("Enter the targets value.\n");
			int trgt_val=sc.nextInt();
			PayMonneyTransaction pt=new PayMonneyTransaction();
			int temp = pt.isTargetAchieved(txnArrayVal,trgt_val);
			
			if(temp==-1)
			{
				System.out.println("Tareget not matched");
			}
			
			else 
			{
				System.out.println("Tareget achived after "+temp+" transaction");
			}
		}
		
		sc.close();

}
}
