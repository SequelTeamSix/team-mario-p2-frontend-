package teamup.p2backend.ControllerTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import teamup.p2backend.controller.EventController;
import teamup.p2backend.model.Event;
import teamup.p2backend.model.Sport;
import teamup.p2backend.service.EventService;
import teamup.p2backend.service.SportService;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(EventController.class)
public class EControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EventService eventService;

    @MockBean
    private SportService sportService;

    @BeforeEach
    void Test() {
        Sport sp1 = new Sport("Hockey");
        Event eve1 = new Event(999, "Ozy", "House", "date", "12", "expert", sp1, "Ozymandius");
    }

    @Test
    public void save() throws Exception {
        Sport sp1 = new Sport("Hockey");
        Event eve1 = new Event(999, "Ozy", "House", "date", "12", "expert", sp1, "Ozymandius");

        when(eventService.saveEvent(any(Event.class))).thenReturn(eve1);

        mockMvc.perform(post("/")
                        .content(String.valueOf(eve1))
                .contentType(MediaType.APPLICATION_JSON)).andDo(print())
        .andExpect(status().isOk()).andExpect((ResultMatcher) content().json(String.valueOf(eve1)));
    }
    }




