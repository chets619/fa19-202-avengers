import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Thor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thor extends Player
{
    public Thor(){
    }
    public void act() 
    {
        super.act();
    }
    public void displayInfo() {
        String name = this.getClass().getName();
        getWorld().showText(name, 1100, 55);
        GreenfootImage character = new GreenfootImage("./images/thor_face.jpeg");
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
        GreenfootImage spimage = new GreenfootImage("./images/hero/thor/super.png");
        spimage.scale(150,150);
        if (facing == -1)
            spimage.mirrorHorizontally();
        return spimage;
    }
    public GreenfootImage getAttackingImage()
    {
        GreenfootImage attimage = new GreenfootImage("./images/hero/thor/shoot.png");
        attimage.scale(150,150);
        if (facing == -1)
            attimage.mirrorHorizontally();
        return attimage;
    }
    public GreenfootImage getIdleImage()
    {
        GreenfootImage idleimage = new GreenfootImage("./images/hero/thor/idle.png");
        idleimage.scale(120,150);
        if (facing == -1)
            idleimage.mirrorHorizontally();
        return idleimage;
    }
    public void fireProjectile()
    {
        getWorld().addObject(new HammerProjectile(facing), getX(), getY());
    }
    protected void firingSuperpower()
    {
        if (!firingsuperpower)
            return;
        SuperPowerProjectileFactory spfactory = new SuperPowerProjectileFactory();
        if (supertimer < 300)
        {
            if (supertimer % 10 == 0)
            {
                World world = getWorld();
                world.addObject(spfactory.getSuperProjectile("LIGHTNING"), Greenfoot.getRandomNumber(world.getWidth()), 0);
            }
            supertimer++;
        }
        else
        {
            supertimer = 0;
            firingsuperpower = false;
        }
    }
}
