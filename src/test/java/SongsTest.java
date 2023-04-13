import bean.Songs;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import serching.SearchByColumn;

import static org.junit.Assert.*;

public class SongsTest
{
    Songs s=null;
    @Before
    public void setUp()
    {
        s = new Songs(1,"NATU-NATU","00:03:34","Justin_Beiber","RRR-South-Movie","Action Song","src/main/resources/Natu-Natu(PagalWorld).wav");
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

