import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hamster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hamster extends Actor
{
    /**
     * Act - do whatever the hamster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    public void act()
    {
        getWorld().showText("Score : " + score, 70,30);
        gerak();
        bom();
        wortel();
        kacang();
        kuaci();
    }

    public void gerak(){
        if(Greenfoot.isKeyDown("left")){
            if(getX()>=0){
                setLocation(getX()-5,getY());
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<=800){
                setLocation(getX()+5,getY());
            }
        }
    }
    
    public void bom(){
        if(isTouching(bom.class)){
            getWorld().showText("GAME OVER \n Score :"+score,400,250);
            Greenfoot.stop();
        }
    }
    
    public void wortel(){
        if(isTouching(wortel.class)){
            score = score + 5;
            removeTouching(wortel.class);
        }
    }
    
    public void kacang(){
        if(isTouching(kacang.class)){
            score = score + 10;
            removeTouching(kacang.class);
        }
    }
    
    public void kuaci(){
        if(isTouching(kuaci.class)){
            score = score + 7;
            removeTouching(kuaci.class);
        }
    }
}
