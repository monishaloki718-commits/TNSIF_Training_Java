package org.tnsif.acc.c2tc.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringBuffer buffer=new StringBuffer ("start\n");
		
		
		//create the first thread
		
		Thread thread1=new Thread(()->{
			buffer.append("Message from thread1\n");
		});
		
		Thread thread2=new Thread(()->{
			buffer.append("Message from thread2\n");
		});

		thread1.start();
		thread2.start();
		
		try
		{thread1.join();//wait here until the thread1 is done
		thread2.join();//wait here until the thread2 is done
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Final stringbuffer\n" + buffer.toString());

	}

}
