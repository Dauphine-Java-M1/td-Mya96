package Model;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
class Point{
	
	public Point (int x,int y) {
		this.x=x;
		this.y=y;
	}
	public Point(Point point) {
		point = new Point(x,y);
	}
	public int getX(){
		return x;
	}
	public int getY() {
		return y;
	}
	public Point getPoint(){
		return point;
		}
		public void affiche() {
	
		System.out.println(point);
		
	}
		public static boolean isSameAs(Point point) {
			if (point.equals(point)) {
				return true;
			}
			return false;
			
			
		}
		public void translate(int dx, int dy) {
			x+=dx;
			y+=dy;	
		}
    private int x,y;
    private Point point;
	
public static void main(String[]args) {
	Point p1=new Point(1,2);
	Point p2=p1;
	Point p3=new Point(1,2);
	
	ArrayList<Point> list = new ArrayList<Point>();
	list.add(p1);
	System.out.println(list.indexOf(p2));
	System.out.println(list.indexOf(p3));
}
	
	
}

