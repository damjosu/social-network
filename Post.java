import java.util.ArrayList;
/**
 * Write a description of class Post here.
 * 
 * @author (josu) 
 * @version ()
 */
public class Post
{
    private String userName;
    private long timeStamp;
    private int likes;

    /**
     * Constructor for objects of class Post
     */
    public Post(String userName)
    {
        this.userName = userName;
        timeStamp = System.currentTimeMillis();
        likes = 0;
    }

    public String getUserName()
    {
        return userName;
    }

    public long getTimeStamp()
    {
        return timeStamp;
    }

    /**
     * Aumenta el contador de likes en uno
     */
    public void like()
    {
        likes++;
    }

    public int getLikes()
    {
        return likes;
    }

    /**
     * Disminuye el contador de likes en uno. Si ya es cero no hace nada.
     */
    public void unlike()
    {
        if(likes > 0)
        {
            likes--;
        }
    }

    public String toString() {
        return ("Autor: " + userName + "Likes: " + likes +
            timeString(System.currentTimeMillis()));
    }

    /**
     * Devuelve el tiempo en string
     *
     * @param tiempo actual en milisegundos.
     * @return informacion en min y segundos del tiempo que ha transcurrido 
     *          desde que subimos la foto hasta ahora.
     */
    public String timeString(long time){
        long diferencia = time - timeStamp;
        int segundos = (int)diferencia/1000;
        int minutos = segundos/60;
        int horas = minutos/60;
        minutos -= horas*60;
        segundos -= minutos*60;

        String tiempo = " ";
        if(horas != 0)
        {
            tiempo += horas + " horas ";
        }
        if(minutos != 0)
        {
            tiempo += minutos + " minutos ";
        }
        tiempo += segundos + " segundos ";
        return tiempo;        
    }
}
