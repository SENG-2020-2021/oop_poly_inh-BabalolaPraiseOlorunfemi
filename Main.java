package com.company;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Declare a char to store the chosen quadilateral
        System.out.println("This is a program to calculate the area and perimeter of any quadilateral");
        char quad;

        System.out.println("Choose your desired quadilateral:\na)Parallelogram \nb)Trapezoid \nc)Rectangle \nd)Square \ne)Rhombus");
        Scanner scanner = new Scanner(System.in);
        quad = scanner.next().charAt(0);




        //using a switch check what the user selected and use it to calculate the perimeter and area of the desired quadilateral
        switch(quad){
            case 'a' :
                //this should be in the parallelogram case
                System.out.println("This program calculates the area and perimeter of the parallelogram.");
                System.out.println("Input the base of your Parallelogram");
                Scanner scan = new Scanner(System.in);
                float pBase = scan.nextFloat();
                System.out.println("Input the height of your Parallelogram");
                float pHeight = scan.nextFloat();
                Parallelogram p = new Parallelogram(pBase, pHeight);

                Quadilateral q = p;


                System.out.println("Input the dimension of the first pair of your Parallelogram");
                q.setLength(scan.nextFloat());
                System.out.println("Input the second pair of your Parallelogram");
                q.setBreadth(scan.nextFloat());

                System.out.printf("The area of the parallelogram with base %.2f and height %.2f is %.2f\n", pBase, pHeight, p.Area());

                System.out.println("");
                System.out.printf("The perimeter of the parallelogram with First Pair: %.2f and SecondPair: %.2f is %.2f\n", q.getLength(), q.getBreadth(), q.calculatePerimeter());
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;


            case 'b':
                //this should be in the Trapezoid case
                Scanner scn = new Scanner(System.in);
                System.out.println("Calculation for a Trapezoid");
                System.out.println("Input top length");
                float a = scn.nextFloat();
                System.out.println("Input left side");
                float b = scn.nextFloat();
                System.out.println("Input right side");
                float c = scn.nextFloat();
                System.out.println("Input bottom length");
                float d = scn.nextFloat();
                System.out.println("Input height:");
                float h = scn.nextFloat();
                Trapezoid t = new Trapezoid(a, b, c, d, h);
                System.out.printf("The perimeter of the Trapezoid with First Side: %.2f, Second Side: %.2f, Third Side: %.2f, and Fourth Side: %.2f is %.2f\n", a, b, c, d, t.calculatePerimeter());
                System.out.printf("The area of the Trapezoid with First Side: %.2f, Second Side: %.2f, Third Side: %.2f, Fourth Side: %.2f and Heigth: %.2f is %.2f\n", a, b, c, d, h, t.Areatrp());
                break;

            case 'c':
                //this should be for a Rectangle case
                Scanner rect = new Scanner(System.in);
                System.out.println("Calculation for a Rectangle");
                System.out .print("Input the length:");
                float length = rect.nextFloat();
                System.out.print("Input breadth:");
                float breadth = rect.nextFloat();
                Rectangle rec = new Rectangle(length, breadth);

                Quadilateral r = rec;

                System.out.printf("The area of the rectangle with length %.2f and breadth %.2f is %.2f", length, breadth, rec.Arearec());

                System.out.println("");
                System.out.printf("The perimeter of the Rectangle with length: %.2f and breadth: %.2f is %.2f", length, breadth, rec.Recper());
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;

            case 'd':
                //this should be for a Square case
                Scanner sqr = new Scanner(System.in);
                System.out.println("Calculation for a Square");
                System.out .print("Input the length:");
                float lengthsq = sqr.nextFloat();
                System.out.print("Input breadth:");
                float breadthsq = sqr.nextFloat();
                Square square = new Square(lengthsq, breadthsq);

                Quadilateral sq = square;

                System.out.printf("The area of the square with length %.2f and breadth %.2f is %.2f\n", lengthsq, breadthsq, square.Areasqr());

                System.out.println("");
                System.out.printf("The perimeter of the Rectangle with length: %.2f and breadth: %.2f is %.2f\n", lengthsq, breadthsq, square.Recper());
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;


            case 'e':
                //this should be for a Rhombus case
                Scanner rhm = new Scanner(System.in);
                System.out.println("Calculation for a Rhombus");
                System.out .print("Input the first diagonal:");
                float diagonal1 = rhm.nextFloat();
                System.out.print("Input first diagonal:");
                float diagonal2 = rhm.nextFloat();
                System.out.print("Input first first side:");
                float side1 = rhm.nextFloat();
                System.out.print("Input first second side:");
                float side2 = rhm.nextFloat();
                System.out.print("Input first third side:");
                float side3 = rhm.nextFloat();
                System.out.print("Input first fourth side:");
                float side4 = rhm.nextFloat();

                Rhombus rhombus = new Rhombus(diagonal1, diagonal2);

                Quadilateral rhom = rhombus;

                System.out.printf("The area of the Rhombus with diagonals %.2f and  %.2f is %.2f\n", diagonal1, diagonal2, rhombus.Arearhm());

                System.out.println("");
                System.out.printf("The perimeter of the Rhombus with first side: %.2f, second side: %.2f, third side: %.2f, fourth side: %.2f is %.2f\n", side1, side2, side3, side4, rhombus.Rhomper());
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;

        }


        System.out.println("Thanks for choosing our program!!");
    }
}

//Create class for Rhombus
class Rhombus extends Quadilateral {
    private float diagonal1;
    private float diagonal2;
    private float side1;
    private float side2;
    private float side3;
    private float side4;

    public Rhombus (float d1, float d2){
        if (d1 <= 0){
            System.out.println("You cannot have a negative or zero base. Therefore length returns to default which is 1\n");
            diagonal1 = 1;
        }
        else
            diagonal1 = d1;
        if (d2 <= 0){
            System.out.println("You cannot have a negative or zero height. Therefore breadth returns to default which is 1");
            diagonal2 = 1;
        }
        else
            diagonal2 = d2;
    }

    public float Arearhm(){
        return (diagonal1 * diagonal2)/2;
    }

    public float Rhomper(){

        return (side1 + side2 + side3 + side4);

    }


}


//Create class for square
class Square extends Quadilateral{

    private float length;
    private float breadth;

    public Square (float l, float b){
        if (l <= 0){
            System.out.println("You cannot have a negative or zero base. Therefore length returns to default which is 1\n");
            length = 1;
        }
        else
            length = l;
        if (b <= 0){
            System.out.println("You cannot have a negative or zero height. Therefore breadth returns to default which is 1");
            breadth = 1;
        }
        else
            breadth = b;
    }
    public float Areasqr(){
        return length * breadth;
    }

    public float Recper(){

        return 2 * (length + breadth);

    }



}




//create class for Rectangle
class Rectangle extends Quadilateral{

    private float length;
    private float breadth;

    public Rectangle (float l, float b){
        if (l <= 0){
            System.out.println("You cannot have a negative or zero base. Therefore length returns to default which is 1\n");
            length = 1;
        }
        else
            length = l;
        if (b <= 0){
            System.out.println("You cannot have a negative or zero height. Therefore breadth returns to default which is 1");
            breadth = 1;
        }
        else
            breadth = b;
    }
    public float Arearec(){
        return length * breadth;
    }

    public float Recper(){

        return 2 * (length + breadth);

    }

}


class Trapezoid extends Quadilateral{
    private float side1;
    private float side2;
    private float side3;
    private float side4;
    private float side5;
    public Trapezoid (float a, float b, float c, float d, float h){
        side1 = a;
        side2 = b;
        side3 = c;
        side4 = d;
        side5 = h;
    }

    public float calculatePerimeter(){
        return side1+side2+side3+side4;
    }

    public float Areatrp(){

        return ( ( (side1 + side4)/2 ) * side5);

    }

}
class Parallelogram extends Quadilateral{
    private float base;
    private float height;
    public Parallelogram (float b, float h){
        if (b <= 0){
            System.out.println("You cannot have a negative or zero base. Therfore base returns to default which is 1");
            base = 1;
        }
        else
            base = b;
        if (h <= 0){
            System.out.println("You cannot have a negative or zero height. Therfore height returns to default which is 1");
            height = 1;
        }
        else
            height = h;
    }
    public float Area(){
        return base*height;
    }

}
class Quadilateral {
    private float length;
    private float breadth;

    public void setLength(float l){
        length = l;
    }

    public float getLength(){
        return length;
    }

    public void setBreadth(float b){
        breadth = b;
    }

    public float getBreadth(){
        return breadth;
    }

    public float calculatePerimeter(){
        return 2*(length+breadth);
    }
}

