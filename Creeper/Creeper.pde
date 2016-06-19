float X;
float Y;

void setup(){
 size(700,500); 
 PImage minecraft = loadImage("bam.png");//in setup method
minecraft.resize(700, 500);      //in setup method
  background(minecraft);
  PImage Creeper;  
Y=random(701);
X=random(501);  //at the top 
Creeper=loadImage("Creeper.png");    //in setup method  
Creeper.resize(5, 5);
image(Creeper,X, Y);
}

void draw(){
  if(mousePressed){
    
  if(isNear(mouseX,X)==true&&isNear(mouseY,Y)==true){
    fill(0,375,0);
    ellipse(mouseX,mouseY,40,40);
}
else{fill(375,0,0);
    ellipse(mouseX,mouseY,40,40);
}}}

 boolean isNear(float a, float b) {
      if (abs(a - b) < 20)
          return true;
    else
       return false;
}

 
