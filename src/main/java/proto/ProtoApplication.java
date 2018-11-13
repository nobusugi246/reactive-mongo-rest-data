package proto;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import proto.dataset.PersonRepository;

@Slf4j
@SpringBootApplication
public class ProtoApplication {

    @Autowired
    private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProtoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
    private void ready() {
	    log.info("ready");
        personRepository.deleteAll();
    }
}
