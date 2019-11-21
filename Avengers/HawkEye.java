import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hawkeye here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HawkEye extends Player implements IPlayer
{
    /**
     * Act - do whatever the HawkEye wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HawkEye() 
    {
        GreenfootImage up = new GreenfootImage("./images/hawkeye.png");
        up.scale(150,150);
        setImage(up);
    }  
    public void act() 
    {
        super.act();
    }
    public void displayInfo() {
        String name = this.getClass().getName();
        getWorld().showText(name, 1100, 55);
        GreenfootImage character = new GreenfootImage("./images/hawkeye.png");
        GreenfootImage health = new GreenfootImage("./images/health.png");
        GreenfootImage superpower = new GreenfootImage("./images/power.png");
        character.scale(70,70);
        health.scale(30,30);
        superpower.scale(30,30);
        getWorld().getBackground().drawImage(character, 950, 45 );
        getWorld().getBackground().drawImage(health, 1020, 65 );
        getWorld().getBackground().drawImage(superpower, 1020, 95 );
        
    }
    public GreenfootImage getSuperPowerImage()
    {
        GreenfootImage spimage = new GreenfootImage("./images/hero/hawkeye/super.png");
        spimage.scale(130,130);
        return spimage;
    }
    public GreenfootImage getAttackingImage()
    {
        GreenfootImage attimage = new GreenfootImage("./images/hero/hawkeye/shoot.png");
        attimage.scale(130,130);
        return attimage;
    }
    public GreenfootImage getIdleImage()
    {
        GreenfootImage idleimage = new GreenfootImage("./images/hero/hawkeye/idle.png");
        idleimage.scale(160,130);
        return idleimage;
    }
    public void fireProjectile()
    {
        getWorld().addObject(new ArrowProjectile(), getX(), getY());
    } 
}