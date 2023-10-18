import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kacang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kacang extends makanan
{
    int speed =2;
    public void act()
    {
        kacang x = new kacang();
        Actor i = getOneIntersectingObject(kacang.class);
        move(speed);
        CheckDouble(i);
        end();
    }
}
