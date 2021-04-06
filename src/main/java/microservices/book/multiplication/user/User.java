package microservices.book.multiplication.user;
import lombok.*;
import javax.persistence.*;

/**
 * Stores information to identify User
 */

@Entity
@Data
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

public class User {
   

    @Id
    @GeneratedValue
    private Long id;
    private String alias;

    public User(final String userAlias) {
        this(null, userAlias);
        }
}
