package SpringWebHibernate;


import SpringWebHibernate.controllers.RailwayController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 * Created by huipay on 15/8/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestRailwayController {
    private MockMvc mockMvc;

    @Autowired
    RailwayController homeController;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
    }

    @Test
    public void testAddEdge() throws Exception {
        mockMvc.perform(get("/addEdge/A/B/23")).andDo(print())
                .andExpect(jsonPath("$.resultInfo", is("success")));
    }

    @Test
    public void testAutoConstruct() throws Exception {
        mockMvc.perform(post("/createNode").contentType(MediaType.APPLICATION_JSON).
                content("{\"name\": \"dongfusong\"}"))
                .andDo(print());
    }
}
