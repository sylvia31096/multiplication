package microservices.book.multiplication.challenge;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * This class provides a REST API to POST the attempts from users
 */

@Slf4j
@RequiredArgsConstructor
@RestController

@RequestMapping("/attempts")
class ChallengeAttemptController {
    
    private final ChallengeService challengeService;

    @PostMapping(value="path")
    public ResponseEntity<ChallengeAttempt> postResult(
        @RequestBody @Valid ChallengeAttemptDTO challengeAttemptDTO) {
        
        return ResponseEntity.ok(challengeService.verifyAttempt(challengeAttemptDTO));
    }
    
}
