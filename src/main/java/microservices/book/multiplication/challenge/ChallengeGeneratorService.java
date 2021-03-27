package microservices.book.multiplication.challenge;

public interface ChallengeGeneratorService {

    /**
     * @return randomly generate challenges with factors between 11 and 99
     */
    
     Challenge randomChallenge();
}
