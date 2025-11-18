package lp.project.fact_checking;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Value("${DB_URL:NOT_FOUND}")
    private String dbUrl;

    @GetMapping("/env-check")
    public String checkEnv() {
        return dbUrl;
    }

}
