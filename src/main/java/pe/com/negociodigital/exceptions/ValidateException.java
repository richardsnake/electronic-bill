package pe.com.negociodigital.exceptions;

public class ValidateException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7350253428738321329L;

	public ValidateException()
	{
		super();
	}
	
	public ValidateException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	public ValidateException(String message)
	{
		super(message);
	}
	
	public ValidateException(Throwable cause)
	{
		super(cause);
	}
	
}
