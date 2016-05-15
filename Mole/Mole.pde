PImage mallet;
PImage mallet2;
void setup() {
  mallet = loadImage("mallet.png");
  mallet.resize(100,100);
 mallet2 = loadImage("mallet 2.png");
  size(400, 400);
  drawBackground();

}
void draw() {
 fill(153,102,34);
if(mallet
 drawBackground();
  image(mallet,mouseX,mouseY);
  if(mousePressed){
  image(mallet2,mouseX,mouseY);
  }
}
void drawBackground(){
    background(78, 166, 51); // green grass
  fill(0, 0, 0);
  ellipse(200, 200, 100, 30); // holes!
  ellipse(70, 119, 100, 30);
  ellipse(300, 60, 100, 30);
  ellipse(297, 350, 100, 30);
  drawMole(200,170);
drawMole(70,89);
drawMole(300,30);
drawMole(297,320);
}
void drawHammer(int mouseX, int mouseY){
 fill(153,102,34);
 rect(mouseX-50,mouseY-25,25,100);
}
void drawMole(int moleX, int moleY) {
  noStroke();
  fill(125, 93, 43);
  ellipse(moleX, moleY, 60, 60); // face
  fill(255, 237, 209);
  ellipse(moleX, moleY+10, 33, 28); 
  fill(0, 0, 0);
  ellipse(moleX-10, moleY-15, 10, 10); // eyes
  ellipse(moleX+10, moleY-15, 10, 10);
  ellipse(moleX, moleY-5, 10, 10); // nose
  ellipse(moleX, moleY+10, 20, 5); // mouth
}




