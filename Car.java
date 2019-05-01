//car
import java.util.concurrent.TimeUnit;

public class Car {
	
	int pos, vel, acc;
	int trackLength;
	
	public Car() {
		//Starting position
		pos = 0;
		//Starting velocity
		vel = 1;
		//Starting acceleration
		acc = 5;
		
		trackLength = 40;
	}
	
	//drive
	public void DriveFw() throws InterruptedException {
		for(int p = pos; p < trackLength; p += 1) {
			UpdatePos(p);
			UpdateVel(acc);
			DrawProgress(vel);
		}
	}
	
	//update velocity
	public void UpdateVel(int a) {
		vel += a;
	}
	
	//update position
	public void UpdatePos(int p) {
		pos = p;
	}
	
	//draw car
	public void DrawProgress(int speed) throws InterruptedException {
			System.out.print("  o");
			TimeUnit.MILLISECONDS.sleep(200 / (1 + (speed / 10)));
	}
	
	///////////////////////////////////////////////
	public static void main(String[] args) throws InterruptedException {
		Car drive = new Car();
		drive.DriveFw();
	}
	
}
