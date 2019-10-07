import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch

void setup() {
 size(600, 600);
 fill(#E89F00);
 ellipse(300, 300, 600, 600);
 fill(#E50004);
 ellipse(300, 300, 550, 550);
 fill(#FFDA03);
 ellipse(300, 300, 500, 500);
 minim = new Minim(this);      //in the setup method
sound = minim.loadFile("414566__pjcohen__agogo-bell-low-velocity16.wav");      //in the setup method
}
void draw() {
   
  PImage pepperoni = loadImage("3879062-pepperoni-png-91-images-in-collection-page-1-pepperoni-png-576_618_preview.png");
  pepperoni.resize(50, 80);
  image(pepperoni, 300, 300);
  
  if(mousePressed) {
    image(pepperoni, mouseX, mouseY);
// Put next 2 lines where you want the sound to play
sound.play();
sound.rewind();




}
}
