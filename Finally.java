
public class Finally {

	
	public static void main (String[] args) {
		int x;
		try {
			throwException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	public static void throwException() throws Exception {
		try {
			System.out.println("throwException()");
			throw new Exception();
		}
		
		finally {
			System.err.println("finally: throwException");
		}
		
		
	}
	
	
	public static void doesNotThrowException() {
		try {
			System.out.println("doesnotthrowException()");
		}
		catch(Exception e) {
			System.out.println("Exception handled: doesnotthrowExcpetion");
		}
		finally {
			System.err.println("finally: doesnotthrowException");
		}
		
		
	}
}
