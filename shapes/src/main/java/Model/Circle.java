package Model;

public class Circle  {
public Circle(Point p, double r) {
	this.p=p;
	this.r=r;
	}
public String toString() {
	return "Le centre du cercle a pour coordonnées "+p.getX()+ 
			" " +p.getY()+
			" et pour rayon "+this.r+ " Sa surface est égale à "+this.surface() ;
}
public void translate(int dx, int dy) {
	p.translate(dx, dy);
}
public Point getCenter() {
	return p;
}
public double surface () {
	double s= Math.PI*(r*r);
	return s;
}
public boolean contains(Point a ) {
    if(Math.sqrt((a.getX()*a.getX())+ (a.getY()*a.getY())) <= r) {
		return true;
    }
    return false;
}
public boolean contains(Point a, Circle...circles) {
	Circle c = new Circle(p, r);
    if(Math.sqrt(((a.getX()-p.getX())*(a.getX()-p.getX()))+ ((a.getY()-p.getY())*(a.getY()-p.getY()))) <= r) {
		return true;
    }
    return false;
}

private double r;
private Point p;

public static void main(String[] args) {
	Circle c1=new Circle(new Point(1,2), 1);
	/*c.getCenter().translate(1,1);
	System.out.println(c1);
	c.surface();*/
	Point a = new Point (10,20);
	c1.contains(a);
}
}
