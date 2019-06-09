import io.github.rainestormee.jnewsapi.NewsClient;
import io.github.rainestormee.jnewsapi.exceptions.NewsAPIException;
import io.github.rainestormee.jnewsapi.objects.HTTPParameter;
import org.junit.jupiter.api.Test;

public class NewsTests {

    private final NewsClient client = new NewsClient("bb554838724b452fb14adf8661be7646");

    @Test
    public void topHeadlinesTest() throws NewsAPIException {
        assert (client.topheadlines(new HTTPParameter("q", "bitcoin")).getArticles().get(0) != null);
    }

    @Test
    public void everythingTest() throws NewsAPIException {
        assert (client.everything(new HTTPParameter("q", "android")).getArticles().get(0) != null);
    }

    @Test
    public void sourcesTest() throws NewsAPIException {
        assert (client.sources(new HTTPParameter("q", "cnn")).getSources().get(0) != null);
    }
}