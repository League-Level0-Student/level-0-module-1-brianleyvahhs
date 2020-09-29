PImage pepperoni;
PImage pizza;
void setup() {
    size(600,500);
    pepperoni = loadImage("pepperoni.png");
    pepperoni.resize(50, 50);
    pizza = loadImage("pizza.jpg");
    pizza.resize(600, 500);
}
void draw() {
  background(pizza);
    fill(255,0,0);
    image(pepperoni, 200, 100);
    image(pepperoni, 200, 200);
    image(pepperoni, 200, 300);
    
    image(pepperoni, 275, 100);
    image(pepperoni, 275, 200);
    image(pepperoni, 275, 300);
    
    image(pepperoni, 350, 100);
    image(pepperoni, 350, 200);
    image(pepperoni, 350, 300);
  }
