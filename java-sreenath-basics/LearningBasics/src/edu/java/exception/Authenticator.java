package edu.java.exception;

public class Authenticator {
	
	boolean isReady = false;
	
	public void startAuthentication(){
		isReady = true;
	}
	public boolean authenticate (String a, String b) throws Exception{
		try{
			if (isReady){
					try{
						if (a.equals("admin") && b.equals("password"))	{
							return true;
							}
						throw new Exception("Invalid Credentials");
					}
					catch (MyCustomException e){
						System.err.println(e.getMessage());
						}
			}
			else{
				throw new MyCustomException();
			}
		}
		catch (MyCustomException e1){
			System.err.println(e1.getWhatIWrote());
		}
		catch (Exception exceptionName2){}	 		// we can have 2 exception handling blocks like catch d finally for only one try block.
		
		finally {
			System.out.println("Validation completed");
		}
		return false;
		}
	}
