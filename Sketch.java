  import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */

  float circleX = random(0, 400);
  float circleY = random(0, 400);
  float circleDiameter = random(0, 400);

  float rectX = random(0, 400);
  float rectY = random(0, 400);
  float rectXX = random(0, 400);
  float rectYY = random(0, 400);

  float triangleX = random(0, 400);
  float triangleY = random(0, 400);
  float triangleXX = random(0, 400);
  float triangleYY = random(0, 400);
  float triangleXXX = random(0, 400);
  float triangleYYY = random(0, 400);

  float rect2X = random(0, 400);
  float rect2Y = random(0, 400);
  float rect2XX = random(0, 400);
  float rect2YY = random(0, 400);

  int hour = hour();
  int minute = minute();
  int second = second();

  public void setup() {
    background(0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
 
  
   ellipse(circleX, circleY, circleDiameter, circleDiameter);
   if (circleX < 200 && circleY < 200) {
    fill (255, 0, 0);
   }
   else if (circleX < 200 && circleY > 200) {
    fill (0, 255, 0);
   }
   else if (circleX > 200 && circleY < 200) {
    fill (0, 0, 255);
   }
   else if (circleX > 200 && circleY > 200) {
    fill (255, 255, 0);
   }

    
   rect(rectX, rectY, rectXX, rectYY);
   if (rectX < 200 && rectY < 200) {
    fill (255, 0, 0);
   }
   else if (rectX < 200 && rectY > 200) {
    fill (0, 255, 0);
   }
   else if (rectX > 200 && rectY < 200) {
    fill (0, 0, 255);
   }
   else if (rectX > 200 && rectY > 200) {
    fill (255, 255, 0);
   }

    
   triangle(triangleX, triangleY, triangleXX, triangleYY, triangleXXX, triangleYYY);
   if (triangleX < 200 && triangleY < 200) {
    fill (255, 0, 0);
   }
   else if (triangleX < 200 && triangleY > 200) {
    fill (0, 255, 0);
   }
   else if (triangleX > 200 && triangleY < 200) {
    fill (0, 0, 255);
   }
   else if (triangleX > 200 && triangleY > 200) {
    fill (255, 255, 0);
   }


   rect(rect2X, rect2Y, rect2XX, rect2YY);
   if (rect2X < 200 && rect2Y < 200) {
    fill (255, 0, 0);
   }
   else if (rect2X < 200 && rect2Y > 200) {
    fill (0, 255, 0);
   }
   else if (rect2X > 200 && rect2Y < 200) {
    fill (0, 0, 255);
   }
   else if (rect2X > 200 && rect2Y > 200) {
    fill (255, 255, 0);
   }

   
   size(400, 400);
   text ("The hours are: " + hour , 1, 10);
   text ("The minutes are: " + minute , 1, 20);
   text ("The seconds are: " + second , 1, 30);
    
    }
  // define other methods down here.
}