package ball;

class Ball {

	private int radius;
	private int height;
	
	public Ball (int radius,int height ) {
		this.radius = radius;
		this.height = height;
	}
	public Ball () {
		this.radius = 0;
		this.height = 0;
	}
	
	public double calculateVolume() {
		return ((4/3)*Math.PI*radius*radius*radius);
	}
	
	public String toString() {
		return "Ball Radius="+radius+"m, Height="+height+"m";	
	}
}

