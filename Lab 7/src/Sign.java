public class Sign implements GameThing, Readable, Edible
{
	public String getName()

    {

          return "A chocolate sign";

    }

    public String getDescription()

    {

              return "This is a small chocolate sign. There seems to be some partially faded writing in it.";

    }

    public void read()

    {

          System.out.println("You can see the following message: \"Luis was here!\"");

    }
    
    public void eat()
    {
    	System.out.println("This chocolate taste wierd, maybe it's a little old. I will eat it anyway.");
    	
    	AdventureEpsilon.theRoom.removeThing(AdventureEpsilon.theSign);
    }
}