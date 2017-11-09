/* This program shows the declaration of Thread using Runnable Interface */

class ThreadExample1 implements Runnable{
	public void run(){
		System.out.println("Thread is running...");
	}
	public static void main(String args[]){
		ThreadExample te=new ThreadExample();
		Thread t=new Thread(te);
		t.start();
	}
}