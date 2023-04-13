import bean.Songs;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import serching.SearchByColumn;


import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;


public class SearchByColumnTest
{
    SearchByColumn col;
    @Before
    public void setUp(){
        col = new SearchByColumn();
    }

    @After
    public void tearDown(){
        col = null;
    }

    @Test
public void Searchsong()
    {
    ArrayList<Songs> list = col.searchBySong("NATU");
    assertNotEquals(1,list.size());
}
       @Test
        public void SearchGenre()
       {
           ArrayList<Songs> list1=col.searchByGenre("GENRE");
           assertNotEquals(2,(list1.size()));
       }
}