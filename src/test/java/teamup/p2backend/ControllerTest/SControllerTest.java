/*
package teamup.p2backend.ControllerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import teamup.p2backend.controller.SportController;
import teamup.p2backend.model.Sport;
import teamup.p2backend.repository.SportRepository;
import teamup.p2backend.service.SportService;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@WebMvcTest(SportController.class)
public class SControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private SportRepository sportRepository;

        @MockBean
        private SportService sportService;

        private List<Sport> sportList;

        @BeforeEach
        void setUp() {
            List<Sport> sportList = new ArrayList<>();
            Sport sp1 = new Sport("BasketBall");
            Sport sp2 = new Sport("Soccer");
            sportList.add(sp1);
            sportList.add(sp2);
        }
    @Test
    public void saveTest() throws Exception {
        Sport sp1 = new Sport("Hockey");
        Mockito.when(sportService.saveSport(any(Sport.class))).thenReturn(sp1);
        this.mockMvc.perform(post("/sport")
                        .content("{\"sportname\": \"Hockey\"}")
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }
    @Test
    public void getSport() throws Exception {
        Mockito.when(sportService.findSport(any(String.class))).thenReturn(new Sport("soccer"));
        this.mockMvc.perform(MockMvcRequestBuilders.get("/sport/sportname/soccer"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("{\"sportname\": \"soccer\"}"));
    }

    @Test
    public void delete() throws Exception {
        Mockito.when(sportRepository.findBySportname("soccer")).thenReturn(new Sport("soccer"));

        sportRepository.deleteByName("soccer");

        verify(sportRepository, times(1)).deleteByName("soccer");
    }

}
/*/