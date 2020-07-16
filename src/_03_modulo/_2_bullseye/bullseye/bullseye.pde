int x = 400;
int y = 400;
void setup() {
 
  size(450,450);
  background(255,255,255);
  
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.

  fill(#FF0000);
  for(int i = 0; i < 5; i++){
    ellipse(225,225,x,y);
    x-=80;
    y-=80;
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
