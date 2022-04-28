import java.util.ArrayList;

public class BeanTest  {
    public static void main(String[] args) {

        Album album1= new Album();
        Album album2= new Album();
        Quote quote1= new Quote();
        Quote quote2= new Quote();
        Author author1= new Author(1,"Jocko Willink");
        Author author2= new Author(2,"Popeye");

        quote1.setAuthor(author1);
        quote1.setContent("Got beat? Good, you learned. Unexpected problems? Good, we have the opportunity to figure out a solution... If you can say the word good, your still breathing.");
        quote2.setAuthor(author2);
        quote2.setContent("I am what I am and that's all that I am");

        album1.setId(1);
        album1.setAlbumName("Hip Hop Frontline");
        album1.setArtistName("Dj Kay Slay");
        album1.setGenre("Hip Hop");
        album2.setId(2);
        album2.setAlbumName("The Rise and Fall of Slaughterhouse");
        album2.setGenre("Hip Hop");
        album2.setArtistName("Joell Ortiz and Kxng Crook");


        ArrayList<Quote> quotes= new ArrayList<>();

        quotes.add(quote1);
        quotes.add(quote2);

        for(Quote quote:quotes){
            System.out.println(quote.getAuthor().getName());
            System.out.println(quote.getContent());
        }





    }
}
