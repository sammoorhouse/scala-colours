public class Threads {
	public static void main(String[] args) throws Exception{
		
		Thread.setDefaultUncaughtExceptionHandler((t, e) ->{
			System.err.println("uncaught exception: " + e.getMessage());
		});
		
		throw new Exception();
	}
}

