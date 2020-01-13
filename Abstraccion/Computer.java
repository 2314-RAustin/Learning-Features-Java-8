package Abstraccion;

/**
 * Computer
 */
public class Computer
{
    enum powerState
    {
        OFF,
        ON,
        SUSPEND;
    }

    public Computer(){}

    public void setState(powerState state)
    {
        switch(state)
        {
            case OFF:
            break;
            case ON:
            break;
            case SUSPEND:
            break;
        }
    }
    public static void main(String[] args)
    {
        
    }
}