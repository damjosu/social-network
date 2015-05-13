import java.util.ArrayList;

public class NewsFeed
{
    private ArrayList<Post> posts;

    /**
     * Constructor de la clase NewsFeed
     *
     **/
    public NewsFeed() {
        posts = new ArrayList<>();
    }
    
    public void addPost(Post post) {
        posts.add(post);
    }
    
    /**
     * Mostramos el tablon
     */
    public void display() {
       for (Post post : posts) {
           System.out.println(post);
       }
    }
}





