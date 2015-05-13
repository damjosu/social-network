import java.util.ArrayList;

public class MessagePost extends PostWithComments
{
    private String message;

    /**
     * Constructor de la clase MessagePost
     *
     * @param author el nombre de usuario que crea el post
     * @param text el mensaje del post
     *
     **/
    public MessagePost(String author, String text)
    {
        super(author);
        this.message = text;
    }

    /**
     * Devuelve el texto del post
     *
     * @return el texto del post
     **/
    public String getText()
    {
        return message;
    }

    /**
     * 
     */
    public void printShortSummary() 
    {
        System.out.println("Esto es un post de texto creado por: " + getUserName()); 
    }

    public String toString()
    {
        return ("Mensaje: " + message + super.toString());
    }
}