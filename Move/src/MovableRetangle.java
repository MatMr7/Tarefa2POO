
public class MovableRetangle implements Movable{
	
	private MovablePoint topSide;
	private MovablePoint botSide;
	
	public MovableRetangle(int x,int y1,int y2,int xSpeed,int ySpeed) {
		
		this.topSide = new MovablePoint(x,y1,xSpeed,ySpeed);
		this.botSide = new MovablePoint(x,y2,xSpeed,ySpeed);
		
	}
	
	public String toString() {
		return "Ponto 1 :" + topSide.toString()+"\n Ponto 2 : "+botSide.toString();
	}

	@Override
	public void moveUp() {
		topSide.moveUp();
		botSide.moveUp();
		
	}

	@Override
	public void moveDown() {
		this.topSide.moveDown();
		this.botSide.moveDown();
		
		
	}

	@Override
	public void moveLeft() {
		
		this.topSide.moveLeft();
		this.botSide.moveLeft();
		
	}

	@Override
	public void moveRight() {
		
		this.topSide.moveRight();
		this.botSide.moveRight();
		
	}

}
