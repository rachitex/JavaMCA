/* This program shows the usage of Daemon thread */

class DaemonExample extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("This is Daemon thread");
		}else{
			System.out.println("This is User thread");
		}
	}
	public static void main(String args[]){
		DaemonExample t1=new DaemonExample();
		DaemonExample t2=new DaemonExample();
		DaemonExample t3=new DaemonExample();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}