package teamup.p2backend;

import teamup.p2backend.model.Event;
import teamup.p2backend.model.Sport;
import teamup.p2backend.model.User;
import teamup.p2backend.service.EventService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.apache.log4j.Logger;

@SpringBootApplication
public class P2BackendApplication {
    static Logger log = Logger.getLogger(P2BackendApplication.class.getName());
    public static void main(String[] args) {
        log.info("Initiating Backend Logs");
        SpringApplication.run(P2BackendApplication.class, args);
    }

}
