package com.basicprograms.classes;

public class TestClass 
{
	public static void main(String[] args)
	{
		int a[] = {12,56,34,23,76,32,75,90,345};

		for(int t:a)
		{
			System.out.print(t+" ");
		}
		System.out.println("\nArray in Ascending order");
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
				{
					min = j;
				}
			}
			a[i] = a[i]+a[min];
			a[min] = a[i]-a[min];
			a[i] = a[i]-a[min];
		}
		
		for(int t:a)
		{
			System.out.print(t+" ");
		}
//		System.out.println("\nArray descending order");
//		for(int i=0;i<a.length-1;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]<a[j])
//				{
//					a[i] = a[i]+a[j];
//					a[j] = a[i]-a[j];
//					a[i] = a[i]-a[j];
//				}
//			}
//		}
//		for(int t:a)
//		{
//			System.out.print(t+" ");
//		}
	}
}

