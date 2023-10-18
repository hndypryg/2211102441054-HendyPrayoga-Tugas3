import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bom extends makanan
{
    int speed = 5;
    public void act()
    {
        bom x = new bom();
        Actor i = getOneIntersectingObject(bom.class);
        move(speed);
        CheckDouble(i);
        end();
    }
}
