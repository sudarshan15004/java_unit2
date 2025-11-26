abstract class Shape { 
abstract void draw(); 
public void info() { 
System.out.println("A generic shape"); 
} 
}
class Triangle extends Shape { 
void draw() { 
System.out.println("Drawing triangle"); 
} 
} 
public class AbstractDemo { 
public static void main(String[] args) { 
Shape s = new Triangle(); 
s.draw(); 
s.info(); 
} 
} 
