import java.util.ArrayList;

public class PhotoPost extends Comments
{
    private String filename;
    private String caption;

    /**
     * Constructor de la clase PhotoPost
     *
     * @param author el nombre de usuario que crea el post
     * @param filename el nombre del archivo de la foto
     * @param caption el título asociado a la foto
     *
     **/
    public PhotoPost (String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }

    /**
     * Devuelve el nombre del archivo de la imagen
     *
     * @return filename el nombre del archivo de imagen del post
     **/
    public String getImageFilename()
    {
        return filename;
    }

    /**
     * Devuelve el titulo asociado a la imagen
     * 
     * @return caption el título asociado a la imagen
     **/
    public String getCaption()
    {
        return caption;
    }

    public void display()
    {
        System.out.println("Autor del mensaje" + getUserName());
        System.out.println("Foto: " + filename);
        System.out.println("Título: " + caption);
        System.out.println("Me gusta " + getLikes());
        System.out.println(timeString(System.currentTimeMillis()));
        if(getComments().isEmpty())
        {
            System.out.println("No hay comentarios aun para este post");
        }
        else
        {                      
            for (String comment : getComments())
            {
                System.out.println(comment);
            }
        }
    }
}