package pe.com.negociodigital.generic;

import pe.com.negociodigital.exceptions.TransformException;
import pe.com.negociodigital.exceptions.ValidateException;

public interface ElectronicDocument {

	public String transformToXML() throws TransformException;
	
	public boolean validateDocument() throws ValidateException;
}
