package pe.com.negociodigital.context;

import java.io.Serializable;
import java.util.Date;

import pe.com.negociodigital.beans.Customer;
import pe.com.negociodigital.enums.CurrencyType;
import pe.com.negociodigital.enums.DocumentType;

public class DocumentContext implements Serializable 
{
	private static final long serialVersionUID = 3663367892857688192L;
	
	private Date fechaEmision;
	private DocumentType tipoDocumento;
	private CurrencyType tipoMoneda;
	private String numeroDocumento;
	private Customer cliente;

}
