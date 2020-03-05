package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot bob = new Robot("mini");
	
	public void run() {
		bob.setPenWidth(5);
		bob.setX(100);
		bob.setY(500);
		bob.setSpeed(100);
		bob.penDown();
		drawFlatRoof("medium", "orange");
		drawPointyHouse("small", "red");
		drawFlatRoof("large", "green");
		drawPointyHouse("small", "purple");
		drawFlatRoof("medium", "blue");
		drawPointyHouse("medium", "yellow");
		drawFlatRoof("large", "purple");
		drawPointyHouse("small", "red");
		drawFlatRoof("medium", "pueple");
		drawPointyHouse("medium", "orange");
		
	}
void drawHouse(int height) {
	bob.move(height);
	bob.turn(90);
	bob.move(25);
	bob.turn(90);
	bob.move(height);
	bob.turn(-90);
	bob.move(25);
	bob.turn(-90);
	}
void drawFlatRoof(String height, String color) {
	if (color.equals("red"))
	{
		bob.setPenColor(219, 20, 20);
	}
	if (color.equals("orange"))
	{
		bob.setPenColor(242, 111, 24);
	}
	if(color.equals("yellow")) 
	{
		bob.setPenColor(255, 225, 0);
	}
	if (color.equals("green"))
	{
		bob.setPenColor(32, 214, 32);
	}
	if (color.equals("blue"))
	{
		bob.setPenColor(0, 55, 255);
	}
	if(color.equals("purple")) 
	{
		bob.setPenColor(75, 11, 224);
	}
	int newHeight = 0;
	if(height.equals("small"))
	{
		newHeight += 60;
	}
	if(height.equals("medium"))
	{
		newHeight += 120;
	}
	if(height.equals("large"))
	{
		newHeight += 250;
	}
	bob.move(newHeight);
	bob.turn(90);
	bob.move(25);
	bob.turn(90);
	bob.move(newHeight);
	bob.turn(-90);
	bob.setPenColor(28, 107, 10);
	bob.move(25);
	bob.turn(-90);
	
}
void drawPointyHouse(String height, String color) {
	if (color.equals("red"))
	{
		bob.setPenColor(219, 20, 20);
	}
	if (color.equals("orange"))
	{
		bob.setPenColor(242, 111, 24);
	}
	if(color.equals("yellow")) 
	{
		bob.setPenColor(255, 225, 0);
	}
	if (color.equals("green"))
	{
		bob.setPenColor(32, 214, 32);
	}
	if (color.equals("blue"))
	{
		bob.setPenColor(0, 55, 255);
	}
	if(color.equals("purple")) 
	{
		bob.setPenColor(75, 11, 224);
	}
	int newHeight = 0;
	if(height.equals("small"))
	{
		newHeight += 60;
	}
	if(height.equals("medium"))
	{
		newHeight += 120;
	}
	if(height.equals("large"))
	{
		newHeight += 250;
	}
	bob.move(newHeight);
	bob.turn(45);
	bob.move(25);
	bob.turn(90);
	bob.move(25);
	bob.turn(45);
	bob.move(newHeight);
	bob.turn(-90);
	bob.setPenColor(28, 107, 10);
	bob.move(25);
	bob.turn(-90);
	}
}
