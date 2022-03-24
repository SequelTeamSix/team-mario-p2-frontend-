/* package teamup.p2backend.Repository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import teamup.p2backend.model.Sport;
import teamup.p2backend.repository.EventRepository;
import teamup.p2backend.repository.SportRepository;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class SportRepositoryTest {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private SportRepository sportRepository;

    @BeforeEach
    void TestCase() {
        Sport sp1 = new Sport("Hockey");
        sportRepository.save(sp1);
        List<Sport> sportList = Arrays.asList(
                new Sport("Hockey"),
                new Sport("Bowling")
        );
        sportRepository.saveAll(sportList);
    }

    @AfterEach
    public void remove() {
        eventRepository.deleteAll();
    }

    @Test
    void saveAll() {
        List<Sport> sportList = Arrays.asList(
                new Sport("Basketball"),
                new Sport("Football")
        );

        Iterable<Sport> allSport = sportRepository.saveAll(sportList);

        AtomicInteger validIdFound = new AtomicInteger();
        allSport.forEach(sport -> {
                    if (sport.getSportname().matches("Basketball|Football")) {
                        validIdFound.getAndIncrement();

                    }

                });
            assertThat(validIdFound.intValue()).isEqualTo(2);
       }

        @Test
        void findAll(){
            List<Sport> allSport = sportRepository.findAll();
            assertThat(allSport.size()).isGreaterThanOrEqualTo(1);
        }
    }

*/