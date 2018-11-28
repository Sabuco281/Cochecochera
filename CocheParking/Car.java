package parcar;
/**
 * Class that models objects of type "car"
 * 
 * @Java MOOC team, UC3M
 * @2.0
 */
public class Car
{
    // Attributes of the class Car
    static int numberWheels = 4;                // Number of wheels                           
    
    Garage theGarage=null;

    
    /**
     * Constructor of a car specifying the garage object
     * @param g
     */
    public Car (Garage g){
    	theGarage = g;
    }
    /**
     * Method that is being always invoked when the program is running
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException{
    	Garage g = new Garage();
    	Car car = new Car(g);
        accelerate();
        slowDown();
        moveDown();
        accelerate();
        g.printGarage();
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }    

    /**
     * Accelerate the car
     * @throws InterruptedException 
     */
    static public void accelerate() throws InterruptedException{
        String c = "*";
        String space = " ";
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        	Thread.sleep(1000);
        }
    }
    
    /**
     * Slow down the car
     * @throws InterruptedException 
     */
    static public void slowDown() throws InterruptedException{
    	String c = "     *";
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        	Thread.sleep(1000);
        }
    	System.out.println();
    }    
    
    /**
     * Move the car downwards
     * @throws InterruptedException 
     */    
    static public void moveDown() throws InterruptedException{
    	String c = "\t\t\t\t  *";
    	for(int i=0; i<5; i++)
        {
    		if(i!=4){
    			System.out.println(c);
                }
                else{ 
    			System.out.print(c);
                }
        	Thread.sleep(1000);
        }
    }
    
}
