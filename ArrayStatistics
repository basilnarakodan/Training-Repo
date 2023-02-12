package com.aurionpro.test;

public class ArrayStatistics {

	public static void main(String[] args) {
		System.out.println("Sum: " + findSum(args));
		System.out.println("Avg: " + findSum(args) / args.length);
		System.out.println("min: " + findMin(args));
		System.out.println("max: " + findMax(args));
		System.out.println("median: "+findMedian(args));
		System.out.println("frequency of numbers: ");
		findFrequency(args);
	}
	
	public static int findMin(String[] args) {
		int min = Integer.parseInt(args[0]);
		for (int i = 0; i < args.length; i++) {
			if (min > Integer.parseInt(args[i])) {
				min = Integer.parseInt(args[i]);;
			}
		}
		return min;
	}
	public static int findMax(String[] args) {
		int max = Integer.parseInt(args[0]);
		for (int i = 0; i < args.length; i++) {
			if (max < Integer.parseInt(args[i])) {
				max = Integer.parseInt(args[i]);;
			}
		}
		return max;
	}
	public static int findSum(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum+=Integer.parseInt(args[i]);
		}
		return sum;
	}
	public static double findMedian(String[] args) {
		double median;
		int length=args.length;
		if (length % 2 == 0) {
			median = (Double.parseDouble(args[(length / 2)-1]) + Double.parseDouble(args[(length / 2)])) / 2;
		} else
			median = Integer.parseInt(args[length / 2]);
		return median;
	}

	public static void findFrequency(String[] args) {
		int length = args.length;
		int[] arr=new int[length];
		boolean[] visited=new boolean[length];
		for (int i = 0; i < args.length; i++) {
			arr[i] = Integer.parseInt(args[i]);			
		}
		for(int i=0;i<length;i++) {
			int count=1;
			if(visited[i]==true) {
				continue;
			}
			for(int j=i+1;j<length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println(arr[i]+": "+count+" times");
		}
	}
}
