class bms extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("bms college of engineering"+i);
			try
			{
				Thread.sleep(10000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			}
		}
}
class cse extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("cse"+i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			}
		}
}
class lab8{
	public static void main(String a[]){
		bms obj1=new bms();
		cse obj2=new cse();
		obj1.start();
		obj2.start();
	}
}