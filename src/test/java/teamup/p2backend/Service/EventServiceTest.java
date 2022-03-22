package teamup.p2backend.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import teamup.p2backend.repository.EventRepository;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

public abstract class EventServiceTest {
        protected MockMvc mvc;
        @Autowired
        WebApplicationContext webApplicationContext;

        protected void setUp() {
            mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        }
        protected String mapToJson(Object obj) throws JsonProcessingException {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(obj);
        }
        protected <T> T mapFromJson(String json, Class<T> clazz)
                throws JsonParseException, JsonMappingException, IOException {

            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, clazz);
        }
    }