import bean.Song;
import dao.SearchByColumn;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;


public class SearchByColumnTest
{
    SearchByColumn searchByColumn;
    @Before
    public void setUp(){
        searchByColumn = new SearchByColumn();
    }

    @After
    public void tearDown(){
        searchByColumn = null;
    }

    @Test
public void Searchsong()
    {
    ArrayList<Song> list = searchByColumn.searchBySong("NATU");
    assertNotEquals(1,list.size());
}
       @Test
        public void SearchGenre()
       {
           ArrayList<Song> list1=searchByColumn.searchByGenre("GENRE");
           assertNotEquals(2,(list1.size()));
       }
}