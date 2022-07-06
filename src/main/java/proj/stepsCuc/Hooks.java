package proj.stepsCuc;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import proj.DriverManager;

public class Hooks {
    @Before
    public void before() {
        DriverManager.getWebdriver();
    }

    @After
    public void after() {
        DriverManager.closeDriver();
    }
}
