package Logica;

import it.unical.mat.embasp.languages.Id;
import it.unical.mat.embasp.languages.Param;

@Id("click")
public class Click {
	
	@Param(0)
	private String value;
	
	public Click() {}
	
	public Click(String value)
	{
		this.value = value;
	}
	
	public String getValue()
	{
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Click [value=" + value + "]";
	}
	
}
