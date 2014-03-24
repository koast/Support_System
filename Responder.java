import java.util.Random;
import java.util.ArrayList;

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
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        frases = new ArrayList<>();
        frases.add("That sounds interesting. Tell me more...");
        frases.add("This will be important, i noting that...");
        frases.add("Wait a moment, i need to ask about of this to other department");
        frases.add("The technical service don't take care about that sorry");
        frases.add("Sorry, I don't understand you, can u explain it in other way?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return frases.get(aleatorio.nextInt(5));        
    }
}
