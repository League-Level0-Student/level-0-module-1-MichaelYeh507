int x = 400; 
int y = 600; 
boolean launch = false;

void setup() {
    background(0, 0, 40); size(800, 800);
    //moon
    fill(#F7F7F7);
    ellipse(90, 80, 150, 150);
    //smallest circle on moon
    noStroke();
    fill(#C6C6C6);
    ellipse(100, 25, 20, 20);
    //biggest circle on moon
    fill(#C6C6C6);
    ellipse(125, 85, 65, 65);
    //medium circle on moon
    fill(#C6C6C6);
    ellipse(50, 115, 20, 20);
    //top star
    fill(#F7F7F7);
    ellipse(760, 150, 3, 3);
    //middle star
    fill(#F7F7F7);
    ellipse(700, 600, 3, 3);
    //bottom star
    fill(#F7F7F7);
    ellipse(450, 750, 3, 3);
    //display launch instructions
    text("Press mouse to launch the rocket.", 100, 600);
}

void draw() {
    // background  
    setup();
    // rocket image
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
    // rocket movement
    if (y >= 0 && launch == true){
      y -= 3;
    }

 }

void mousePressed(){
  launch = true;
}
