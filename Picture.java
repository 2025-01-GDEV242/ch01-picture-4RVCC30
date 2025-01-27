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
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void erase()
    {
        if(drawn)
        {
 
            wall.makeInvisible();
            wall.moveHorizontal(-1 * wall.getX());
            wall.moveVertical(-1 * wall.getY());
            

            window.makeInvisible();
            window.moveHorizontal(-1 * window.getX());
            window.moveVertical(-1 * window.getY());
            
            
            roof.makeInvisible();
            roof.moveHorizontal(-1 * roof.getX());
            roof.moveVertical(-1 * roof.getY());
            
            
            sun.makeInvisible();
            sun.moveHorizontal(-1 * sun.getX());
            sun.moveVertical(-1 * sun.getY());
            
            drawn = false;
        }
    }
    public void draw()
    {
        if(!drawn) {
            wall.changeColor("black");
            wall.moveHorizontal(-70);
            wall.moveVertical(60);
            wall.changeSize(30);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(60);
            window.changeSize(30);
            window.makeVisible();
    
            roof.changeColor("red");
            roof.changeSize(100, 100);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(-40);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("black");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("black");
        window.changeColor("black");
        roof.changeColor("red");
        sun.changeColor("yellow");
    }
}
