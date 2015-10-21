import java.text.DateFormat;
import java.util.Date;

class ThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   Date d= new Date();
	   
	   DateFormat formatter = DateFormat.getDateTimeInstance(
               DateFormat.LONG, 
               DateFormat.LONG);
	   
	   ThreadDemo( String name){
	       threadName = name;
	       System.out.println("Creating " +  threadName );
	   }
	   public void run() {
	      System.out.println("Running " +  threadName );
	      try {
	    	  for(int i=0;i<100;i++){
	            System.out.println("Thread: " + threadName + ", " + i+ " and the time log is "+formatter.format(System.currentTimeMillis()));
	            // Let the thread sleep for a while.
	            Thread.sleep(50);
	         }
	     } catch (InterruptedException e) {
	         System.out.println("Thread " +  threadName + " interrupted.");
	     }
	     System.out.println("Thread " +  threadName + " exiting.");
	   }
	   
	   

	}

	public class MultiThread {
	   public static void main(String args[]) {
		   
	          ThreadDemo T1 = new ThreadDemo( "Thread");
	          T1.start();
		   
	      
	   }   
	}