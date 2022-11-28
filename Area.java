public class Area {
    public static double triangle(double s) {
        return Math.sqrt(3)/4*s*s;
    }

    public static double triangle(double sideA, double sideB, double sideC) {
        double pO2 = (sideA+sideB+sideC)/2;
        double temp = pO2*(pO2-sideA)*(pO2-sideB)*(pO2-sideC)
        return Math.sqrt(temp);
    }

    public static double triangle(double height, double base) {
        return height*base/2;
    }

    public static double square(double sideLength) {
        return sidelength*sidelength;
    }

    public static double pentagon(double sideLength) {
        double insd = 5*(5+2*Math.sqrt(5))
        return (insd*sideLength*sideLength)/4;
    }

    public static double hexagon(double sideLength) {
        return (3*Math.sqrt(3))/2*sideLength*sideLength;
    }
    
    public static double octagon(double sideLength) {
        return 2*(1 + Math.sqrt(2))*sideLength*sideLength;
    }
    
    public static double icosagon(double sideLength) {
        return 5 * sideLength * sideLength * (1 + Math.sqrt(5) + Math.sqrt(5 + 2*Math.sqrt(5)));
    }
}
