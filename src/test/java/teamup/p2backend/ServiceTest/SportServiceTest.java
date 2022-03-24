/*package teamup.p2backend.ServiceTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import teamup.p2backend.controller.SportController;
import teamup.p2backend.model.Sport;
import teamup.p2backend.repository.SportRepository;
import teamup.p2backend.service.SportService;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
@WebMvcTest(SportController.class)
@ExtendWith(MockitoExtension.class)
public class SportServiceTest {
    @MockBean
    SportRepository sportRepository;

    @MockBean
    SportService sportService;


    @BeforeEach
    void setUp() {
        sportService = new SportService(sportRepository);
    }

    @Test
    public void saveTest() {
        Sport s1 = new Sport("Bowling");
        sportService.saveSport(s1);

        verify(sportRepository, times(1)).save(s1);

    }

    @Test
    public void findTest() {
        Sport s1 = new Sport("Bowling");
        sportService.saveSport(s1);
        sportService.findSport("Bowling");
        verify(sportRepository, times(1)).findBySportname("Bowling");

    }

    @Test
    public void deleteTest() {
        Sport s1 = new Sport("Bowling");
        sportService.saveSport(s1);
        sportService.deleteSport("Bowling");
        verify(sportRepository, times(1)).deleteByName("Bowling");
    }
}

 */
