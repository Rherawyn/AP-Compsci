float lx;
float ly;

float linex = 600;
float liney = 1000;
float linery;
float linerx;
float linea = 2;
float la;
float liner;

void pattern1() {
  fill(50, 50, 50);
  //rect(0, 0, 1200, 1000);

  liney = liney - 0.5;

  if ( linex >= 600) {
    la = 0.01;
  } else if (linex < 600) {
    la = -0.01;
  }

  linea =  linea - la;

  linex = linex + linea;

  liner = (1)/(linex-linerx);

  linery = liney;

  linerx = linex;

  rotate(radians(5));
  lines(lx, ly);

  //buttons
  rotate(radians(0));
  triangle(1150, 600, 1100, 550, 1100, 650);
}

void lines (float x, float y) {
  pushMatrix();
  translate(x, y);
  line(linex-100, liney, linex+100, liney);
  popMatrix();
}
