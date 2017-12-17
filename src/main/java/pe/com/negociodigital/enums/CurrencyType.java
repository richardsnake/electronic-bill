package pe.com.negociodigital.enums;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;

public final class CurrencyType implements Serializable
{
	/**
     * Enumeraci&oacute;n para D&oacute;lares Ajustados. El c&oacute;digo de la moneda es <code>7</code>.
     */
    public static final CurrencyType ADJUSTED_DOLLARS = new CurrencyType("7", "D\u00F3lares Ajustados");
    /**
     * Enumeraci&oacute;n para Soles Ajustados. El c&oacute;digo de la moneda es <code>5</code>.
     */
    public static final CurrencyType ADJUSTED_SOLES = new CurrencyType("5", "Soles Ajustados");
    /**
     * Enumeraci&oacute;n para D&oacute;lares. El c&oacute;digo de la moneda es <code>2</code>.
     */
    public static final CurrencyType DOLLARS = new CurrencyType("2", "D\u00F3lares");
    /**
     * Enumeraci&oacute;n para D&oacute;lares Indexados. El c&oacute;digo de la moneda es <code>6</code>.
     */
    public static final CurrencyType INDEXED_DOLLARS = new CurrencyType("6", "D\u00F3lares Indexados");
    /**
     * Enumeraci&oacute;n para Soles Indexados. El c&oacute;digo de la moneda es <code>4</code>.
     */
    public static final CurrencyType INDEXED_SOLES = new CurrencyType("4", "Soles Indexados");
    /**
     * Enumeraci&oacute;n para Soles Nominales. El c&oacute;digo de la moneda es <code>3</code>.
     */
    public static final CurrencyType NOMINAL_SOLES = new CurrencyType("3", "Soles Nominales");
    /**
     * Enumeraci&oacute;n para Soles. El c&oacute;digo de la moneda es <code>1</code>.
     */
    public static final CurrencyType SOLES = new CurrencyType("1", "Soles");
    
    
    private static final HashMap<String, CurrencyType> enumsMap = new HashMap<String, CurrencyType>();
    
    private static final long serialVersionUID = -1759361188915069517L;
    
    static
    {
        enumsMap.put(SOLES.getCode(), SOLES);
        enumsMap.put(DOLLARS.getCode(), DOLLARS);
        enumsMap.put(NOMINAL_SOLES.getCode(), NOMINAL_SOLES);
        enumsMap.put(INDEXED_SOLES.getCode(), INDEXED_SOLES);
        enumsMap.put(ADJUSTED_SOLES.getCode(), ADJUSTED_SOLES);
        enumsMap.put(INDEXED_DOLLARS.getCode(), INDEXED_DOLLARS);
        enumsMap.put(ADJUSTED_DOLLARS.getCode(), ADJUSTED_DOLLARS);
    }
    
    private String code;
    private String description;

    /**
     * Retorna la enumeraci&oacute;n que corresponde al c&oacute;digo pasado como par&aacute;metro.
     * 
     * @param code El c&oacute;digo de la moneda. El par&aacute;metro pasado puede tener los siguientes valores: '1',
     *            '2', '3', '4', '5', '6' o '7'.
     * @return La enumeraci&oacute;n correspondiente. Si no existe una enumeraci&oacute;n con el c&oacute;digo indicado
     *         retorna null.
     */
    public static CurrencyType fromCode(String code)
    {
        return (CurrencyType) enumsMap.get(code);
    }

    private CurrencyType(String code, String description)
    {
        this.code = code;
        this.description = description;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof CurrencyType))
        {
            return false;
        }
        CurrencyType c = (CurrencyType) obj;
        return code.equals(c.code);
    }

    /**
     * Retorna el c&oacute;digo de la moneda.
     */
    public String getCode()
    {
        return code;
    }

    /**
     * Retorna la descripci&oacute;n de la moneda.
     */
    public String getDescription()
    {
        return description;
    }

    @Override
    public int hashCode()
    {
        return code.hashCode();
    }

    /**
     * La informaci&oacute;n de la enumeraci&oacute;n en el siguiente formato:
     * 
     * <pre>
     *  {code='1',description='Soles'}
     * </pre>
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "{code='" + code + "',description='" + description + "'}";
    }

    /**
     * M&eacute;todo para obtener la misma instancia de la enumeraci&oacute;n en el momento de la
     * deserializaci&oacute;n.
     * 
     * @see java.io.Serializable
     */
    private Object readResolve() throws ObjectStreamException
    {
        return enumsMap.get(code);
    }

}
