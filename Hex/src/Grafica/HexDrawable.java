package Grafica;

import java.awt.Color;

public class HexDrawable {
	int x;
	int y;
	Color color;
	
	public HexDrawable(int x, int y, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if( obj instanceof HexDrawable)
		{
			HexDrawable h = (HexDrawable) obj;
			return (h.x == x) && (h.y == y) && (h.color == color);
		}	
		return false;
	}

	@Override
	public String toString() {
		return "HexDrawable [x=" + x + ", y=" + y + ", color=" + color + "]";
	}	
	
}
