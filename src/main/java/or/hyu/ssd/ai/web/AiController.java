package or.hyu.ssd.ai.web;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal/ai")
public class AiController {

    @GetMapping("/sample")
    public Map<String, Object> sample() {
        return Map.of(
                "service", "ssd-ai-orchestrator",
                "provider", "external-ai",
                "status", "ready");
    }
}
