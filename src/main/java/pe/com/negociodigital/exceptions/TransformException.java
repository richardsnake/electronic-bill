package pe.com.negociodigital.exceptions;

public class TransformException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4550105240279669948L;

	public TransformException()
	{
		super();
	}
	
	public TransformException(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	public TransformException(String message)
	{
		super(message);
	}
	
	public TransformException(Throwable cause)
	{
		super(cause);
	}
	
}
