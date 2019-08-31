import java.util.*;
class Points {
double x1,y1;
double d;
Points(){
x1 = 0;
y1 = 0;
}
Points (double a,double b) {
x1 = a;
y1 = b;
}
Points (Points ob) {
x1 = ob.x1;
y1 = ob.y1;
}
double Dist(Points ob){
d = Math.sqrt(Math.pow(ob.x1-x1,2) - Math.pow(ob.y1-y1,2));
return d;
}
}

class Pointdist{
public static void main(String args[])
{
double c;
Points ob1 = new Points(6,2);
Points ob2 = new Points(7,3);
c = ob2.Dist(ob1);
System.out.println("Distance between the points is :" + " " + c);
}
}
