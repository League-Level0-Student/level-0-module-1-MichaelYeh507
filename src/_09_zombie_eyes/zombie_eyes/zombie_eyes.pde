
void setup() {
  PImage face = loadImage("11021ac040438214430837e55f4225b7-3d-smile-emoticon-emoji-by-vexels.png");
  image(face, 0, 0);
  size(600, 600);
}
void draw() {
  fill(#FF0000, #0CE535, #0C1FE5);
  ellipse(320, 205, 20, 45);
  fill(#FF0000, #0CE535, #0C1FE5);
  ellipse(190, 205, 20, 45);

}

void mouseMoved() {
  fill(#0CE535);
  ellipse(320, 205, 20, 45);
  fill(#0C1FE5);
  ellipse(190, 205, 20, 45);

}
