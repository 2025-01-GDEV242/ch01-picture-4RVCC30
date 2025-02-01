/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square[] Squares = {null,null};
    private Triangle[] Triangles = {null};
    private Circle[] Circles = {null};
    private Person[] People = {null,null};
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        Squares[0] = new Square();
        Squares[1] = new Square();
        Triangles[0] = new Triangle();  
        Circles[0] = new Circle();
        People[0] = new Person();
        People[1] = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void erase()
    {
        if(drawn)
        {
 
            for(Square s : Squares)
            {
                s.makeInvisible();
                s.moveHorizontal(-1 * s.getX());
                s.moveVertical(-1 * s.getY());
            }
            
            for(Triangle t : Triangles)
            {
                t.makeInvisible();
                t.moveHorizontal(-1 * t.getX());
                t.moveVertical(-1 * t.getY());
            }
            
            for(Circle c : Circles)
            {
                c.makeInvisible();
                c.moveHorizontal(-1 * c.getX());
                c.moveVertical(-1 * c.getY());
            }
            
            for(Person p : People)
            {
                p.makeInvisible();
                p.moveHorizontal(-1 * p.getX());
                p.moveVertical(-1 * p.getY());
            }
            
            drawn = false;
        }
    }
    public void draw()
    {
        if(!drawn) {
            Squares[0].changeColor("black");
            Squares[0].moveHorizontal(-70);
            Squares[0].moveVertical(60);
            Squares[0].changeSize(30);
                       
            Squares[1].changeColor("black");
            Squares[1].moveHorizontal(-120);
            Squares[1].moveVertical(60);
            Squares[1].changeSize(30);
            
            Triangles[0].changeColor("red");
            Triangles[0].changeSize(100, 100);
            Triangles[0].moveHorizontal(20);
            Triangles[0].moveVertical(-60);
               
            Circles[0].changeColor("yellow");
            Circles[0].moveHorizontal(-40);
            Circles[0].moveVertical(-40);
            Circles[0].changeSize(80);
            
            People[0].changeColor("blue");
            People[0].moveHorizontal(-160);
            People[0].moveVertical(-80);
            People[0].changeSize(160,80);
            
            People[1].changeColor("green");
            People[1].moveHorizontal(40);
            People[1].moveVertical(-80);
            People[1].changeSize(160,80);
            
            Triangles[0].makeVisible();
            Circles[0].makeVisible();
            People[0].makeVisible();
            People[1].makeVisible();
            Squares[1].makeVisible();
            Squares[0].makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        Squares[0].changeColor("black");
        
        
        Squares[1].changeColor("black");
        Triangles[0].changeColor("black");
        Circles[0].changeColor("black");
        for(Person p : People)
            {
                p.changeColor("black");
            }
        for(Circle c : Circles)
            {
                c.changeColor("black");
            }
        for(Triangle t : Triangles)
            {
                t.changeColor("black");
            }
        for(Square s : Squares)
            {
                s.changeColor("black");
            }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        Squares[0].changeColor("black");
        Squares[1].changeColor("black");
        Triangles[0].changeColor("red");
        Circles[0].changeColor("yellow");
        People[0].changeColor("blue");
        People[1].changeColor("green");
    }
}
