/* Write a program to display usage of break and continue statement */

class LabelContinue{
	public static void main(String args[]){
		int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Loop1: 
			for(int i = 0; i < 10; i++){
				if(i == 3){
					continue Loop1;
				}
				if(i == 8){
					break;
				}
				System.out.println(a[i]);
			}
	}
}
