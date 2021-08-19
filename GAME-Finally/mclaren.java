import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bvochido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mclaren extends Actor
{
    private int speed;
    
    public mclaren (int v){
         speed = v; 
        
    }
    
    /**
     * Act - do whatever the Bvochido wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         //Add your action code here.
        if(Greenfoot.isKeyDown("right")) {  
            if(getX() <460)
          setLocation(getX()+ speed,getY());
        }
      if(Greenfoot.isKeyDown("left")) { 
          if(getX() >140) 
          setLocation(getX()-speed,getY());
        }
      if(Greenfoot.isKeyDown("up")) { 
           if(getY() >300)
          setLocation(getX(),getY() - speed);
        }
       if(Greenfoot.isKeyDown("down")) { 
           if(getY() < 640) 
          setLocation(getX(),getY() + speed);
        }
        
    }
    
    public void checkCollision(){
        Actor collided = getOneIntersectingObject(ferrari.class);
        if(collided != null){
            getWorld().removeObject(collided); 
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }

    public void aumentar_velocidad(){
        speed++;
    }
}

