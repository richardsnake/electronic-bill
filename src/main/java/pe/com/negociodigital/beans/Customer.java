package pe.com.negociodigital.beans;

import pe.com.negociodigital.enums.IdentityType;

public class Customer {
	private String name;
	private IdentityType typeDocument;
	private String numero;
	
	public Customer(String name, IdentityType typeDocument, String numero)
	{
		this.setName(name);
		this.setTypeDocument(typeDocument);
		this.setNumero(numero);
	}
	
	public Customer(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IdentityType getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(IdentityType typeDocument) {
		this.typeDocument = typeDocument;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
