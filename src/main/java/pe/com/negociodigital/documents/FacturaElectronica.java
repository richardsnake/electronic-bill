package pe.com.negociodigital.documents;

import oasis.names.specification.ubl.schema.xsd.invoice_2.InvoiceType;
import pe.com.negociodigital.context.DocumentContext;
import pe.com.negociodigital.exceptions.TransformException;
import pe.com.negociodigital.exceptions.ValidateException;
import pe.com.negociodigital.generic.ElectronicDocument;

public class FacturaElectronica extends InvoiceType implements ElectronicDocument
{
	private static final long serialVersionUID = 4789132688486451796L;

	private DocumentContext context;
	
	public FacturaElectronica(DocumentContext context)
	{
		this.setContext(context);
	}
	
	public String transformToXML() throws TransformException{
		// TODO Auto-generated method stub
		return null;
	}

	public boolean validateDocument() throws ValidateException{
		// TODO Auto-generated method stub
		return false;
	}

	public DocumentContext getContext() {
		return context;
	}

	public void setContext(DocumentContext context) {
		this.context = context;
	}

	
}
