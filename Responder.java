import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random aleatorio;
    private ArrayList<String> frases;
    private HashMap<String,String> contestacion;

    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        frases = new ArrayList<>();
        contestacion = new HashMap<>();
        contestacion.put("computer","Check your operating system, which is?");
        contestacion.put("internet","Check the cable, you still have this problem?");
        contestacion.put("monitor","Check the display unit,can you see something?");
        contestacion.put("keyboard","Is the cable connected?");
        frases.add("That sounds interesting. Tell me more...");
        frases.add("This will be important, i am noting that...");
        frases.add("Wait a moment, i need to ask about of this to other department");
        frases.add("The technical service don't take care about that sorry");
        frases.add("Sorry, I don't understand you, can u explain it in other way?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> context)
    {
        String response = null;
        String[] inputString = null;
        int index = 0;
        boolean text = false;
        Iterator<String> it = context.iterator();
        while(it.hasNext() && !text)
        {
            response = contestacion.get(it.next());
            
            if(response != null || !it.hasNext())
            {
                text = true;
            }
        }
        if (response == null)
        {
            response = frases.get(aleatorio.nextInt(frases.size()));
        }
        return response;
    }
}
