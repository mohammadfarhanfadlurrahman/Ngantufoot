import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cong2 extends treespawn2
{
    /**
     * Act - do whatever the cong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int framecong = 0;
    
    private static final GreenfootImage r1 = new GreenfootImage("congl1.png");
    private static final GreenfootImage r2 = new GreenfootImage("congl2.png");
    private static final GreenfootImage r3 = new GreenfootImage("congl3.png");
    private static final GreenfootImage r4 = new GreenfootImage("congl4.png");
    public void act() 
    {
        setLocation(getX() -2, getY());
        hits();
        tembok();
        //move(-2);
        congkan();
    } 
    
    public void tembok()
    {
        if (getX() <= 21)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void congkan()
    {
        
        if(framecong == 1)
        {
            setImage(r1);
        }
        if(framecong == 10)
        {
            setImage(r2);
        }
        if(framecong == 20)
        {
            setImage(r3);
        }
        if(framecong == 30)
        {
            setImage(r4);
        }
        if(framecong == 40)
        {
            
            framecong = 0;
        }
       
        framecong++;
    }
}
