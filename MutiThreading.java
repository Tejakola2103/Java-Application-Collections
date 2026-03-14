import java.util.*;
class Number{

	synchronized void m1() {
	for(int i=1;i<=20;i++){
	  if(i%2==0)
	  System.out.println(i);
	
     try{
	Thread.sleep(2000);
	}
	catch(InterruptedException e){
       e.printStackTrace();
    }
	}
   }

	synchronized void m2(){
	for(int i=20;i<=40;i++){
	 if(i%2==1)
	  System.out.println(i);
	
	try{
	Thread.sleep(2000);
	}
	catch(InterruptedException e)
         {e.printStackTrace();
	}
    }
	}

	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Number obj=new Number();
	Runnable r1=()->{
	 obj.m1();
	};
	 
	Runnable r2=()->{
	 obj.m2();
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
   }
}
