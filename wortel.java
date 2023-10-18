import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wortel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wortel extends makanan
{
    int speed = 2;
    public void act()
    {
        wortel x = new wortel();
        Actor i = getOneIntersectingObject(wortel.class);
        move(speed);
        CheckDouble(i);
        end();
    }
}
