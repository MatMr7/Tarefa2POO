
public class MovablePoint implements Movable{
	
	protected int x;
	protected int y;
	protected int xSpeed;
	protected int ySpeed;
	
	
	public MovablePoint(int x,int y,int xSpeed,int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		
	}
	
	public String toString() {

		return "x = "+this.x+" y = "+this.y +" ";

	}
	
	
	
	public void moveUp() {
		this.y += this.ySpeed;
		
	}
	
	public void moveDown() {
		this.y -= this.ySpeed;
		
	}
	
	public void moveLeft() {
		this.x += xSpeed;
		
	}
	
	public void moveRight() {
		this.x -= xSpeed;
	}
	
	

}
