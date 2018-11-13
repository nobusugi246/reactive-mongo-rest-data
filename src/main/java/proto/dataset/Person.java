package proto.dataset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
public class Person {
    @Id
    public String id;

    public String firstName;
    public String lastName;
}
