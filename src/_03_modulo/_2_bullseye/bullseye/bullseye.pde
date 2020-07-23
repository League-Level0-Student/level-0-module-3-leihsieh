int x = 400;
int y = 400;
void setup() {
 
  size(450,450);
  background(255,255,255);
  
  fill(#FF0000);
  for(int i = 0; i < 9; i++){
    ellipse(225,225,x,y);
    x-=50;
    y-=50;
  
    if(x % 100 == 0){
      fill(#FF0000);
    }
    
    else{
      fill(0,0,0);
    }
  }
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.

  
  
  //Use an if statement and modulo to alternate the color of your rings.
    

    

}
