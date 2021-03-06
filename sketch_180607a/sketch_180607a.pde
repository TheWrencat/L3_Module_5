// 1. Follow the recipe instructions inside the Segment class.
// This class will be used to represent each part of the moving snake.
public class Segment {
  //2. Create x and y member variables to hold the location of each segment.
  int x;
  int y;
  // 3. Add a constructor with parameters to initialize each variable.
  Segment(int x, int y){
    this.x = x;
    this.y = y;
  }
  // 4. Add getter and setter methods for both the x and y member variables.
  void setX(int x){
   this.x = x; 
  }
  void setY(int y){
    this.y = y;
  }
  int getX(){
   return x;
  }
  int getY(){
   return y; 
  }
}
// 5. Create (but do not initialize) a Segment variable to hold the head of the Snake
Segment head;

// 6. Create and initialize String to hold the direction of your snake e.g. "up"
final String up = "up";
final String down = "down";
final String left = "left";
final String right = "right";
String direction = down;

// 7. Create and initialize a variable to hold how many pieces of food the snake has eaten.
int foodEaten = 0;

// 8. Create and initialize foodX and foodY variables to hold the location of the food.
// (Hint: use the random method to set both the x and y to random locations within the screen size (500 by 500).)
int foodX = ((int)random(50)*10);
int foodY = ((int)random(50)*10);

void setup() {
  // 9. Set the size of your sketch (500 by 500).
  size(500, 500);

  // 10. initialize your head to a new segment.
head = new Segment(250, 250);
  // 11. Use the frameRate(int rate) method to set the rate to 20.
frameRate(20);
}

void draw() {
  background(0);

  //12. Call the drawFood, drawSnake, move, and collision methods.
  drawFood();

  drawTail();
  drawSnake();
  move();
  collision();
}

// 13. Complete the drawFood method below. (Hint: each piece of food should be a 10 by 10 rectangle).
void drawFood() {
  fill(255, 255, 255);
  rect(foodX, foodY, 10, 10);
}

//14. Draw the snake head
void drawSnake() {
  fill(255, 255, 255);
  rect(head.x, head.y, 10, 10);
  //test your code
}

// 15. Complete the move method below.
void move() {
  // 16. Create a switch statement using your direction variable. Depending on the direction, add a new segment to your snake.
  // The first case will look like this
  switch(direction) {
  case up:
   head = new Segment(head.getX(), head.getY() - 10);
  break;
  case down:
   head = new Segment(head.getX(), head.getY() + 10);
  break;
  case left:
   head = new Segment(head.getX() - 10, head.getY());
  break;
  case right:
   head = new Segment(head.getX() + 10, head.getY());
  break;
  }

  // 17. Call the checkBoundaries method to make sure the snake doesn't go off the screen.
checkBoundaries();
}

// 18. Complete the keyPressed method below. Use if statements to set your direction variable depending on what key is pressed. 
void keyPressed() {

    if(direction==down){
      if( keyCode== UP){
        direction = down;
      }
    }else if( keyCode== UP){
    direction = up;
    }
    if(direction==up){
      if( keyCode== DOWN){
        direction = up;
      }
    }else if( keyCode== DOWN){
      direction = down;
    }
    if(direction==right){
      if( keyCode== LEFT){
        direction = right;
      }
    }else if( keyCode== LEFT){
    direction = left;
    }
    if(direction==left){
      if( keyCode== RIGHT){
        direction = left;
      }
    }else if( keyCode== RIGHT){
    direction = right;
  
}
}
// 19. check if your head is out of bounds (teleport you snake to the other side).
void checkBoundaries() {
  
  if(0>head.x){
   head.x = 500;
  }
  if(500<head.x){
   head.x = 0;
  }
   if(0>head.y){
   head.y = 500;
  }
  if(500<head.y){
   head.y = 0;
  }

}


//20. Make sure that the key for your current direction’s opposite doesn’t work(i.e. If you’re going up, down key shouldn’t work)
// It's up there.
// 21. Complete the missing parts of the collision method below.
void collision() {
  // If the segment is colliding with a piece of food...
  if(head.x == foodX && head.y == foodY){
    
  
    // Increase the amount of food eaten and set foodX and foodY to new random locations.
    foodEaten ++;
    foodX = ((int)random(50)*10);
    foodY = ((int)random(50)*10);
  }
}


/**
 ** Part 2: making the tail 
 **/
//  1. Create and initialize an ArrayList of Segments. (This will be your snake!)
ArrayList<Segment> body = new ArrayList<Segment>();
// 2. Complete the missing parts of the drawTail method below.
void drawTail() {
  // Add your head to your ArrayList
body.add(head);
  // Draw a 10 by 10 rectangle for each Segment in your snake ArrayList.
for(Segment n: body){
  fill(255, 255, 255);
  rect(n.x, n.y, 10, 10);
}

  // While the snake size is greater than your food, remove the first Segment in your snake.
  while(body.size() > foodEaten){
    body.remove(0);
  }
}

// 3. Complete the missing parts of the bodyCollision method below.
void bodyCollision() {
  // If different segments have the same location...
        // Set food back to 3.
   for(Segment m: body){
    if(head.x == m.x && head.y == m.y){
      foodEaten = 3;
    }
  }
    
}