package edu.ujs.schoolwork;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SchoolworkApplicationTests {

    @Test
    void contextLoads() {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
    }

}
