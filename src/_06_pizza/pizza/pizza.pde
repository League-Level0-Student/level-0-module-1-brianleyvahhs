PImage pepperoni;
void setup() {
    size(400,400);
    pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(30, 30);
}
void draw() {
    fill(200, 200, 200);
    ellipse(300, 300, 300, 300);
    fill(255,0,0);
    image(pepperoni, 100, 100);
    image(pepperoni, 150, 150);
    image(pepperoni, 200, 200);
    image(pepperoni, 150, 150);
    image(pepperoni, 100, 100);
}
