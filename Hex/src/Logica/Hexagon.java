package Logica;

import it.unical.mat.embasp.languages.Id;
import it.unical.mat.embasp.languages.Param;

@Id("hex")
public class Hexagon
{
	/*@Param(0)
	private String id;
	
	@Param(1)
	private String l1;
	
	@Param(2)
	private String l2;
	
	@Param(3)
	private String l3;
	
	@Param(4)
	private String l4;
	
	@Param(5)
	private String l5;
	
	@Param(6)
	private String l6;
	
	@Param(7)
	private String color;*/
	
	@Param(0)
	private int id;
	
	@Param(1)
	private int l1;
	
	@Param(2)
	private int l2;
	
	@Param(3)
	private int l3;
	
	@Param(4)
	private int l4;
	
	@Param(5)
	private int l5;
	
	@Param(6)
	private int l6;
	
	@Param(7)
	private String color;
	
	public Hexagon() {}
	
	public Hexagon(int id, int l1, int l2, int l3, int l4, int l5, int l6)
	{
		this.id = id;
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
		this.l5 = l5;
		this.l6 = l6;
		this.color="white";
	}
	
	public Hexagon(Hexagon h)
	{
		this.id = h.id;
		this.l1 = h.l1;
		this.l2 = h.l2;
		this.l3 = h.l3;
		this.l4 = h.l4;
		this.l5 = h.l5;
		this.l6 = h.l6;
		this.color = h.color;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getL1() {
		return l1;
	}

	public void setL1(int l1) {
		this.l1 = l1;
	}

	public int getL2() {
		return l2;
	}

	public void setL2(int l2) {
		this.l2 = l2;
	}

	public int getL3() {
		return l3;
	}

	public void setL3(int l3) {
		this.l3 = l3;
	}

	public int getL4() {
		return l4;
	}

	public void setL4(int l4) {
		this.l4 = l4;
	}

	public int getL5() {
		return l5;
	}

	public void setL5(int l5) {
		this.l5 = l5;
	}

	public int getL6() {
		return l6;
	}

	public void setL6(int l6) {
		this.l6 = l6;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Hexagon [id=" + id + ", l1=" + l1 + ", l2=" + l2 + ", l3=" + l3 + ", l4=" + l4 + ", l5=" + l5 + ", l6="
				+ l6 + ", color=" + color + "]";
	}	
		
}
