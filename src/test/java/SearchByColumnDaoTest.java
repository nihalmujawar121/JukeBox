import bean.Song;
import dao.SearchByColumnDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;


public class SearchByColumnDaoTest
{
    SearchByColumnDao searchByColumnDao;
    @Before
    public void setUp(){
        searchByColumnDao = new SearchByColumnDao();
    }

    @After
    public void tearDown(){
        searchByColumnDao = null;
    }

    @Test
public void Searchsong()
    {
    ArrayList<Song> list = searchByColumnDao.searchBySong("NATU");
    assertNotEquals(1,list.size());
}
       @Test
        public void SearchGenre()
       {
           ArrayList<Song> list1= searchByColumnDao.searchByGenre("GENRE");
           assertNotEquals(2,(list1.size()));
       }
}