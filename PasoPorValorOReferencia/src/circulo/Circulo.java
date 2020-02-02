package circulo;

public class Circulo {
private int x;
private int y;
private int radius;

public Circulo (int x, int y) {
	this.x = x;
	this.y = y;
	this.radius = 1;
}
	
	public Circulo (int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public int getx() {
		return this.x;
		
	}
	
	public void setx(int valorNuevo) {
		this.x=valorNuevo;
		
	}
	
}

