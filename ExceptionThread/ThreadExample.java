/* This program shows the declaration of Thread by extending Thread class */

class ThreadExample extends Thread{
	public void run(){
		System.out.println("Thread is running...");
	}
	public static void main(String args[]){
		ThreadExample t1=new ThreadExample();
		t1.start();
	}
}