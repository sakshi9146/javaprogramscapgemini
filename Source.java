package com.edu;

 public class Source{
	public int getSecondSmallest(int[] arr) {
		if(arr.length<2) {
			throw new IllegalArgumentException("Array must have atleast two elements ");
		}
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int num :arr) {
			if(num<smallest) {
				secondSmallest = smallest;
				smallest=num;
				
			}else if(num<secondSmallest &&num!=smallest) {
				secondSmallest= num;
				
			}
		}
		return secondSmallest;
	}
	



	public static void main(String[] args) {
		int arr[]= {23, 45, 32, 22, 20, 96};
		Source source= new Source();
		int secondSmallest= source.getSecondSmallest(arr);
		System.out.println(secondSmallest);

	}

}
