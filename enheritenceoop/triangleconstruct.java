package enheritenceoop;

public class triangleconstruct extends shapeconstruct {
int base;
int height;
public triangleconstruct(int base, int height,int borderWidth,String color) {
	super(color,borderWidth);
	this.base = base;
	this.height = height;
}
public int getBase() {
	return base;
}
public int getHeight() {
	return height;
}

}
