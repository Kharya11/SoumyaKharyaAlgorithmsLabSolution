package com.LabAssignment2.currencyDenomination.main;
import com.LabAssignment2.currencyDenomination.model.*;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DenominationsSorting ds = new DenominationsSorting();
		
		System.out.println("Enter the size of the currency denominations");
		int num_ele = sc.nextInt();
		int[] array = new int[num_ele];
		int[] pays = new int[num_ele];
		
		System.out.println("Enter the currency denomination values");
		for (int i = 0; i < num_ele; i++) {
			array[i] = sc.nextInt();
		}
		
		//Sorting array
		ds.mergerSort(array, 0, array.length-1);
		
		for (int i = 0; i < num_ele; i++) {
			//System.out.print(array[i]);
		}
		
		
		//int [] array= {123,18,12,5};
		//int [] pays= {0,0,0,0};
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		//int amount = 153;
		
		boolean status = false;
		int count=0;
		int bal=0;
		int cal=0;
		
		for (int i = 0; i < array.length; i++) {
			bal = amount - cal;
			count = 0;
			status = false;
			while(status == false) {
				count++;
				if((array[i]*count)> bal) {
					break;
				}
			}
			count--;
			cal=cal+(array[i]*count);
			pays[i]=count;
			if(cal >= amount) {
				break;
			}
		}
		if(cal == amount) {
			for (int i = 0; i <pays.length ; i++) {
				if(pays[i] > 0) {
					System.out.println(array[i]+":"+pays[i]);
				}
			}
		}else {
			System.out.println("Can't get exact denomination");
		}
		sc.close();
		
	}

}
