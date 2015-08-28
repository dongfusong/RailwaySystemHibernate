package SpringWebHibernate;

import SpringWebHibernate.controllers.RequestCheckCodeController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
/**
 * Created by Thoughtworks on 15/8/19.
 */

public class TestRequestCheckCode {

    private MockMvc mockMv;

    @Before
    void setup(){
        RequestCheckCodeController requestCheckCodeController =
                new RequestCheckCodeController();
        mockMv = MockMvcBuilders.standaloneSetup(requestCheckCodeController).build();
    }

    @Test
    void testRequestCheckCode_success() throws Exception {
        mockMv.perform(get("/huipayDeliverWater/checkCode/"))
            .andExpect(jsonPath("$.resultInfo", is("success")));
    }


}
