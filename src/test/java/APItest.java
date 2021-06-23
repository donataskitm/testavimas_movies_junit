import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class APItest {
    Movie local;
    Movie remote;

    @Before
    public void setup() {
        local = new Movie("Guardians of the Galaxy Vol. 2", 2017, "James Gunn", 7.6);

    }
    
    @Test
    public void apiTest() throws IOException {
        JSONObject json = JSON.readJsonFromUrl("https://www.omdbapi.com/?i=tt3896198&apikey=62a6e25e");
        remote = new Movie(json.getString("Title"), json.getInt("Year"), json.getString("Director"), json.getDouble("imdbRating"));
        compareMovies(local, remote);
    }

    private void compareMovies(Movie local, Movie remote){
        Assert.assertEquals(local.getTitle(), remote.getTitle());
        Assert.assertEquals(local.getYear(), remote.getYear());
        Assert.assertEquals(local.getDirector(), remote.getDirector());
        Assert.assertEquals(local.getImdbRating(), remote.getImdbRating(),0);
    }
}