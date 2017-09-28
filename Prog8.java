/* Write a program to display the usage of break and continue */

class Prog8{
	public static void main(String args[]){
		int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		for(int i = 0; i < 10; i++){
			if(a[i] == 20){
				continue;
			}
			if(a[i] == 80){
				break;
			}
			System.out.println(a[i]);
		}
	}
} 