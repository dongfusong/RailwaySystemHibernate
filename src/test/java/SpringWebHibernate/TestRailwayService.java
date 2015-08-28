package SpringWebHibernate;

import SpringWebHibernate.models.RailwayService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

/**
 * Created by Thoughtworks on 15/8/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestRailwayService {
    @Autowired
    RailwayService railwayService;

    @Before
    public void setUp(){
        railwayService.clear();
        railwayService.addRailwayEdge("A", "B", 12);
        railwayService.addRailwayEdge("A", "C", 12);
    }
    @After
    public void tearDown(){

    }
    @Test
    public void test(){
        assertEquals(true, railwayService.canReach("A", "C")) ;
    }
}
