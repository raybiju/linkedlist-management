package com.cvt.management;

import java.util.*;

public class LinkedListManagement {
	
	Scanner sc=new Scanner(System.in);
	int num;
	LinkedList<Integer> list=new LinkedList<Integer>();
	
	public void addNumbers()
	{
	System.out.println("how many numbers you want to add");
	 num=sc.nextInt();
	 System.out.println("take the numbers");
	for(int i=0;i<num;i++)
	{
		
		list.add(sc.nextInt());
	}
	
	System.out.println(list);
	
		
	}
	
	public void getNumbers()
	{
		System.out.println("choose the partition number from the above list");
		int x=sc.nextInt();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		LinkedList<Integer> list3=new LinkedList<Integer>();
		LinkedList<Integer> finallist=new LinkedList<Integer>();
		
		
		for(int i=0;i<num;i++)
		{
			if(list.get(i)<x)
			{
			list2.add(list.get(i));	
			}
			else {
				
				list3.add(list.get(i));
			}
			
			
		}
		
		finallist.addAll(list2);
		finallist.addAll(list3);
		System.out.println(finallist);		
	}

}
