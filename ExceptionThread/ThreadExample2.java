/* This program shows the usage of join() */

class ThreadExample2 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){  
   			try{  
    				Thread.sleep(500);  
   			}catch(Exception e){System.out.println(e);}  
  				System.out.println(i);  
		} 
	}
	public static void main(String args[]){
		ThreadExample2 t1=new ThreadExample2();
		ThreadExample2 t2=new ThreadExample2();
		ThreadExample2 t3=new ThreadExample2();
		t1.start();  
 		try{  
  			t1.join();  
 		}catch(Exception e){System.out.println(e);}  
  
 		t2.start();
		try{  
  			t2.join();  
 		}catch(Exception e){System.out.println(e);}  
 		t3.start();  
	}
}