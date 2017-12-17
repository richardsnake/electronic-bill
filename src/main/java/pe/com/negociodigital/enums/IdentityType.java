package pe.com.negociodigital.enums;

import java.io.Serializable;
import java.util.HashMap;

public final class IdentityType implements Serializable{
	/**
	 * 
	 */
	
	private static final IdentityType DNI = new IdentityType("DNI");
	private static final IdentityType RUC = new IdentityType("RUC");
	private static final IdentityType PASSPORT = new IdentityType("PASSPORT");
	
	private static final long serialVersionUID = 6455576958483778842L;
	
	private String type;
	
	public IdentityType()
	{
		
	}
	
	public IdentityType(String type)
	{
		this.type = type;
	}
	
	public static final HashMap<String, IdentityType> enumIdentity = new HashMap<String, IdentityType>();
	static{
		enumIdentity.put("DNI", DNI);
		enumIdentity.put("RUC", RUC);
		enumIdentity.put("PASSPORT", PASSPORT);
	}
	
	public IdentityType fromType(String type){
		return (IdentityType)enumIdentity.get(type);
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
