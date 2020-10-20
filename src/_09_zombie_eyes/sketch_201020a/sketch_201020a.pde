PImage face;

void setup() {
  size(1000, 800);
  face = loadImage("face.jpg");
  face.resize(1000, 1000);
  image(face, 0, 0);
  ellipse(x, y, width, height);
}

void draw() {
  if (mousePressed) {
    print(mouseX + " ");
    println(" " + mouseY);
  }
}
