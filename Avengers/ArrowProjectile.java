import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ArrowProjectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrowProjectile extends HeroProjectile
{
    
    
    public ArrowProjectile() 
    {
        GreenfootImage up = new GreenfootImage("./images/arrow.png");
        this.speed = 6;
        this.damage = 10;
        up.scale(80,40);
        setImage(up);
    }   
        
}
