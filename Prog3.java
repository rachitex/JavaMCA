/*Write a program to find Maximum, Minimum and Average number*/

class Prog3{
	public static void main(String[] args){
		int[] a = { 5,8,9,6,7,1,0,3,4,2 };

		System.out.println("The Numbers Entered Are: ");
		for(int i=0;i<9;i++){
			System.out.println(a[i]);
		}


		// To Find Maximum Value
		int max = a[0];
		for(int i = 0; i < 9; i++){
            		if(max < a[i]){
                		max = a[i];
            		}
        	}
		System.out.println("\n\nThe Maximum Number is "+max);

		// To Find Minimum Value
		int min = a[0];
		for(int i = 0; i < 9; i++){
            		if(min > a[i]){
                		min = a[i];
            		}
        	}
		System.out.println("\n\nThe Minimum Number is "+min);

		// To Find Average Value
		int sum=0;
		for(int i =0; i<9; i++){
			sum=sum+a[i];
}
int avg = sum/9;
System.out.println("\n\nThe Average value is "+avg);
	}
}
