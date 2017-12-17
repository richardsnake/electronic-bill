package pe.com.negociodigital.documents.test;

import java.lang.annotation.Retention;

import javax.xml.datatype.XMLGregorianCalendar;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IssueDateType;
import oasis.names.specification.ubl.schema.xsd.invoice_2.InvoiceType;
import pe.com.negociodigital.documents.FacturaElectronica;

public class InvoiceTest {

	private InvoiceType invoice;
	private FacturaElectronica factura;
	private Retention per;
	//private 

	public String getInvoice() {
		return "";
	}

	public void setInvoice(String invoice) {
		//this.invoice = invoice;
	}
	
	public void test()
	{
		//invoice.setIssueDate(null);
		/*invoice.setAccountingSupplierParty(null);	
		UBLExtensionsType type = new UBLExtensionsType();
		UBLExtensionType ext = new UBLExtensionType();
		ext.setExtensionContent(null);
		ExtensionContentType extype = new ExtensionContentType();
		//extype.*/
		//type.setUblExtension(arg0);
		//invoice
		//DespatchAdviceType 
		//CreditNoteType
		//DebitNoteType
		//Retention ret;
		//oasis.names.specification.ubl.schema.xsd.ordercancellation_2.OrderCancellationType order;
		//order.se
		//VoidedDocuments docs;
		//invoice.setIssueDate(new IssueDateType(new xm));
		
		//XMLGregorianCalendar cale
	}

	public FacturaElectronica getFactura() {
		return factura;
	}

	public void setFactura(FacturaElectronica factura) {
		this.factura = factura;
	}
	
	
}
