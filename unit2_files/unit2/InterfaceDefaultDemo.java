interface Printer { 

 

    default void printInfo() { 

        System.out.println("Default printing behavior"); 

    } 

 

    static void show() { 

        System.out.println("Static method inside interface"); 

    } 

 

    void print();  // abstract method 

} 

 

class LaserPrinter implements Printer { 

 

    @Override 

    public void print() { 

        System.out.println("Laser printer is printing..."); 

    } 

} 

 

public class InterfaceDefaultDemo { 

    public static void main(String[] args) { 

        LaserPrinter lp = new LaserPrinter(); 

 

        lp.print();        // abstract method implementation 

        lp.printInfo();    // default method from interface 

        Printer.show();    // static method from interface 

    } 

} 