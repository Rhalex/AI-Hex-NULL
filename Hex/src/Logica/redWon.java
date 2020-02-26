package Logica;

import it.unical.mat.embasp.languages.Id;
import it.unical.mat.embasp.languages.Param;

@Id("redWon")
public class redWon {
	
	@Param(0)
	private int x=0;
	
	@Param(1)
	private int y=0;
	
	public redWon() {}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean empty()
	{
		return (x+y) == 0;
	}
	
	@Override
	public String toString() {
		return "redWon [x=" + x + ", y=" + y + "]";
	}
	
}
