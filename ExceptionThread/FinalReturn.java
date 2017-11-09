/* This program returns thrice in try, catch & finally. */

class TryCatch{
	public int someFunction(int i){
		try{
			i=1;
			//i=1/0;  //If Exception arises
			System.out.println("return 1");
			return i;
		}catch(Exception e){
			i=2;
			System.out.println("return 2");
			return i;
		}finally{
			i=3;
			System.out.println("return 3");
			return i;
		}
	}
}

public class FinalReturn{
	public static void main(String args[]){
		
		TryCatch obj=new TryCatch();
		int i=0;
		obj.someFunction(i);
	}
}