
public class Book implements GameThing, Readable, Openable

{
	 public boolean isOpen = false;      //Start out closed


	public String getName()

    {

          return "A dusty old book";

    }

    public String getDescription()

    {
    	if(isOpen == false)
        {
    		return "This book appears to be old and dusty. It's also quite heavy and it's close.";
        }
    	else
    	{
    		return "This book appears to be old and dusty. It's also quite heavy and it's open.";
    	}

    	
          
          
          
    }
    
    public void read()

    {
    	if(isOpen != false)
        {
    		System.out.println("It appears to be an old magic book. It's hard to understand5, but it appear to be talking of about a spell to erase the memory");
        }
    	else
    	{
    		System.out.println("I can't read closed books.");
    	}
          

    }
    
    public void open()
    {
    	if(isOpen != true)
    	{
    		System.out.println("The book make a creaky sound \n The pages are kind of blurry.");
    		
    		isOpen = true;
    	}
    	else
    	{
    		System.out.println("The book is already open.");
    	}
    }
    
    public void close()
    {
    	if(isOpen !=false)
    	{
    		System.out.println("Thud, it's close.");
    		
    		isOpen = false;
    	}
    	else
    	{
    		System.out.println("The book it's already close.");
    	}
    }
}
