package pe.com.negociodigital.documents;

import oasis.names.specification.ubl.schema.xsd.creditnote_2.CreditNoteType;
import pe.com.negociodigital.context.DocumentContext;
import pe.com.negociodigital.exceptions.TransformException;
import pe.com.negociodigital.exceptions.ValidateException;
import pe.com.negociodigital.generic.ElectronicDocument;

public class NotaCreditoElectronica extends CreditNoteType implements ElectronicDocument
{
	private static final long serialVersionUID = 3433226063173496485L;

	private DocumentContext context;
	
	public NotaCreditoElectronica(DocumentContext context)
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
