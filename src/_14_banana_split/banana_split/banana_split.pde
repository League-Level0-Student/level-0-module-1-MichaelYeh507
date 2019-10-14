void setup(){
  size(200, 200);
  background(#CF0EED);
}

void draw(){
 int yPos = 50;
  for (int i11 = 0; i11 < 3; i11++) {
    text("ice cream", 50, yPos);
    yPos += 10;
  }
  text("banana", 50, 100);
 }
