package Model;

public class Ring extends Circle{
public Ring(Point p,double r, double ri) {
	super(p, r);
	this.ri=ri;
	
}public boolean equals(Circle c1) {
	if (c1.equals(c))
		return true;
	return false;
}
public void affiche() {
	Point p = new Point(0, 0);
	Ring ring = new Ring(p, 0, 0);
	System.out.println(ring);
}
public boolean contains(Point a) {
	return super.contains(a);
}

private Circle c;
private double ri;//rayon interne
}
