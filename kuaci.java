import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kuaci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kuaci extends makanan
{
    int speed = 2;
    public void act()
    {
        kuaci x = new kuaci();
        Actor i = getOneIntersectingObject(kuaci.class);
        move(speed);
        CheckDouble(i);
        end();
    }
}
