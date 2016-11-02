public class Apple implements GameThing, Edible
{
	public String getName()

    {

          return "A read apple";

    }

    public String getDescription()

    {

              return "This is a small apple. I wonder if I should eat it.";

    }
    
    public void eat()
    {
    	System.out.println("This apple its so jucy! I could eat a thousen like this one.");
    	
    	AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theApple);
    }
    
   
}