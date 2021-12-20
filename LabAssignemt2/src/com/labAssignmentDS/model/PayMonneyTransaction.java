package com.labAssignmentDS.model;

public class PayMonneyTransaction {

	
	
	public  int isTargetAchieved(int [] txnArrayVal,int trgt_val) 
	{ 
		int sum=0;
		
		for(int i=0;i<txnArrayVal.length;i++)
		{
			sum+=txnArrayVal[i];
			
			if(sum >=trgt_val)
			{
				return i+1;
				
			}
					
	    }
		return -1;

	}
	
		
	
	}
