import java.awt.Color;

import java.util.*;


public class TurtleProg
{
    public static void main(String[] args)
    {
        World foo = new World();
        Turtle bar = new Turtle(foo);
        
        Scanner s = new Scanner(System.in);
        System.out.println("a");
        s.nextInt();
        
        
        
        while(true)
        {
            int dir = s.nextInt();
            
            if (dir==2)
            {
                bar.turnLeft();
                bar.turnLeft();
                bar.forward(s.nextInt());
            };
            if(dir==4)
            {
                bar.turnLeft();
                bar.forward(s.nextInt());
            };
            if(dir==8)
            {
                bar.forward(s.nextInt());
            };
            if(dir==6)
            {
                bar.turnRight();
                bar.forward(s.nextInt());
            };
                
            
        
    }
};
}