import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ferrari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ferrari extends Actor
{
    private int speed;
    
    public ferrari(int v){
        speed = v;
    }
    
    /**
     * Act - do whatever the Ferrari wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY() + speed);
        if (getY ()>=getWorld().getHeight() - 1 ){
            MyWorld juego = (MyWorld) getWorld();
            juego.removeObject(this);
            juego.aumentar_puntuacion(10);
            juego.disminuir_num_rivales();
            juego.aumentar_num_adelantamientos();
            
        }
    }
}
