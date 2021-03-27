package microservices.book.multiplication.challenge;

import lombok.Value;
import javax.validation.constraints.*;

/**
 * Attempt coming from the user
 */
@Value
public class ChallengeAttemptDTO {

    @Min(1) @Max(99)    
    int factorA, factorB;
    @NotBlank
    String userAlias;
    @Positive
    int guess;
}
