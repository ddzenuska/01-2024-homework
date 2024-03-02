package io.codelex.syntax.constructors;

public class ConstructorDemo {
    public static void main(String args[]) {
        /*
        //todo
        Constructor cuboid1 = new Constructor();
        double vol;
        vol = cuboid1.volume();
        System.out.println("Volume is " + vol);
        Constructor cuboid2 = new Constructor(8, 11, 9);
        vol = cuboid2.volume();
        System.out.println("Volume is " + vol);        
         */
    }
}

class Constructor {
    double width;
    double height;
    double depth;
    
    /*
    //todo - wrap this code in a no-arg constructor
    System.out.println("Constructor without parameter");
    width = 10;
    height = 10;
    depth = 10;
     */
    
    /*
    //todo - wrap this code in a no-arg constructor
    System.out.println("Constructor with parameter");
    width = a;
    height = b;
    depth = c;
     */

    double volume() {
        return width * height * depth;
    }
}
