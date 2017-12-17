package pe.com.negociodigital.documents;

import oasis.names.specification.ubl.schema.xsd.debitnote_2.DebitNoteType;
import pe.com.negociodigital.context.DocumentContext;
import pe.com.negociodigital.exceptions.TransformException;
import pe.com.negociodigital.exceptions.ValidateException;
import pe.com.negociodigital.generic.ElectronicDocument;

public class NotaDebitoElectronica extends DebitNoteType implements ElectronicDocument
{
	private static final long serialVersionUID = 6725780478955328157L;

	private DocumentContext context;
	
	public NotaDebitoElectronica(DocumentContext context)
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
