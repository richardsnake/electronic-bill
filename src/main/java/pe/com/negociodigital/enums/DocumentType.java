package pe.com.negociodigital.enums;

import java.io.Serializable;
import java.util.HashMap;

public final class DocumentType implements Serializable
{
	private static final long serialVersionUID = 2266756850534178484L;
	private String type;
	private String descripcion;
	
	public static final DocumentType FACTURA_TYPE = new DocumentType("01", "Factura Electronica");
	public static final DocumentType GUIA_REMISION_TYPE = new DocumentType("02", "Guia de remision");
	public static final DocumentType BOLETA_TYPE = new DocumentType("03", "Boleta de venta");
	
	public static final DocumentType RETENCION_BAJA_TYPE = new DocumentType("05", "Retencion");
	public static final DocumentType PERCEPCION_TYPE = new DocumentType("06", "Percepcion");	
	public static final DocumentType NOTA_CREDITO_TYPE = new DocumentType("07", "Nota de credito");
	public static final DocumentType NOTA_DEBITO_TYPE = new DocumentType("08", "Nota de debito");
	
	public static final DocumentType RESUMEN_DIARIO_TYPE = new DocumentType("09", "Resumen diario");
	public static final DocumentType COMUNICAION_BAJA_TYPE = new DocumentType("10", "Comunicacion de baja");

	
	
	private DocumentType(String type, String description)
	{
		this.type = type;
		this.descripcion = description;
	}
	
	private  static final HashMap<String, DocumentType>  documentsMap = new HashMap<String, DocumentType>();
	static{
		documentsMap.put(FACTURA_TYPE.getType(), FACTURA_TYPE);
		documentsMap.put(GUIA_REMISION_TYPE.getType(), GUIA_REMISION_TYPE);
		documentsMap.put(BOLETA_TYPE.getType(), BOLETA_TYPE);
		
		documentsMap.put(RETENCION_BAJA_TYPE.getType(), RETENCION_BAJA_TYPE);
		documentsMap.put(PERCEPCION_TYPE.getType(), PERCEPCION_TYPE);
		documentsMap.put(NOTA_CREDITO_TYPE.getType(), NOTA_CREDITO_TYPE);
		documentsMap.put(NOTA_DEBITO_TYPE.getType(), NOTA_DEBITO_TYPE);
		
		documentsMap.put(RESUMEN_DIARIO_TYPE.getType(), RESUMEN_DIARIO_TYPE);
		documentsMap.put(COMUNICAION_BAJA_TYPE.getType(), COMUNICAION_BAJA_TYPE);			
	}
	
	public DocumentType formType(String type)
	{
		return (DocumentType) documentsMap.get(type);
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}		
}