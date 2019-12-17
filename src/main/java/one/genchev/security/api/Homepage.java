package one.genchev.security.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homepage {

    @GetMapping
    public String viewHomepage() {
        return "<h1>Homepage</h1>";
    }
}
