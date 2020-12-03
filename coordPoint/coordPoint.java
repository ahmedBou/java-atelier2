package coordPoint;

public class coordPoint {
	private int coord;

	
	coordPoint(int coord){
		this.coord = coord;
	}
	
	public int getCoord() {
		return this.coord;
	}

	public static void main(String[] args) {
		
		coordPoint a = new coordPoint(12);
		coordPoint b = new coordPoint(30);
		coordPoint c = new coordPoint(50);
		
		System.out.println(a.getCoord());
		System.out.println(b.getCoord());
		System.out.println(c.getCoord());
		
	}
	
	
	
}
