import bean.Song;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class SongTest
{
    Song s=null;
    @Before
    public void setUp()
    {
        s = new Song(1,"NATU-NATU","00:03:34","Justin_Beiber","RRR-South-Movie","Action Song","src/main/resources/Natu-Natu(PagalWorld).wav");
    }

    @After
    public void tearDown()
    {
        s = null;
    }

    @Test
    public void songPropertiesId()
    {
        assertEquals(1,s.getSongId());
    }
@Test
    public void checkSongName()
    {
     assertNotEquals("Chaiya-Chaiya",s.getSongName());
    }


}


