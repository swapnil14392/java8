package java8.thread;



public class ThreadWithLambdaExpression {

	public static void main(String[] args) {
		
		Runnable runnable=()->{
									for(int i=0 ;i<5;i++)
									{
										System.out.println("Child Thread-"+i);
									}
							  };
							  
		  Thread thread= new Thread(runnable);
			thread.start(); //Note after this line Child thread and Main Thread will be executed simultaneously
			
			
			//Below for loop will be run by main thread i.e main method
			for(int i=0 ;i<5;i++)
			{
				System.out.println("Main Thread-"+i);
			}
		
	}

}
