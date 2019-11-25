package Model;

import java.util.ArrayList;

class LigneBrisée {
	public LigneBrisée(ArrayList<Point> points) {
		this.points=points;
		
	}
	
	public void add(Point p) {
		points.add(p);		
	}
	public int pointCapacity() {
		return points.size();
		}
	public int nbPoints() {
		int n=0;
		for(int i=0; i<points.size();i++)
			n+=i;
		return n;
		
	}
	public boolean contains(Point p) {
		for(Point pt : points)
			if (points.contains(pt))
				return true;
		return false;
			
	}
	
	
	
	private ArrayList<Point> points = new ArrayList<>() ;
	
	}


