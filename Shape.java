import java.util.*;

class Shape{
    double redious;
    double height;
    double width;

    Shape(double redious){
        this.redious = redious;
    }

    Shape(double height, double width){
        this.height = height;
        this.width = width;
    }

    double getPerimeter(double radious){
        double perimeter = Math.PI * redious * 2;
        return perimeter;
    }

    double getArea(double radious){
        double rediousSquare = Math.pow(radious,2);
        double area = Math.PI * rediousSquare;
        return area;
    }
    
    double getArea(double height, double width){
        double area = height * width;
        return area;
    }
    
    double getPerimeter(double height, double width){
        double perimeter = 2 * (height + width);
        return perimeter;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the serial no for Shape");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        int option = in.nextInt();
        if (option == 1) {
            System.out.println("Enter the radious");
            double radious = in.nextDouble();
            Shape circle = new Shape(radious);
            double area = circle.getArea(radious);
            double perimeter = circle.getPerimeter(radious);
            System.out.println("Area of shape is : "+ area +" and perimeter is : " + perimeter);
        }
        else if (option == 2) {
            System.out.println("Enter the height and width");
            double height = in.nextDouble();
            double width = in.nextDouble();
            Shape rectangle = new Shape(height, width);
            double area = rectangle.getArea(height, width);
            double perimeter = rectangle.getPerimeter(height, width);
            System.out.println("Area of shape is : "+ area +" and perimeter is : " + perimeter);
        }
        else{
            System.out.println("Enter valid Option");
        }
        
    }
}
