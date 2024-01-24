package testclass;

import base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageclass.Login;

import java.io.FileNotFoundException;

public class Logintest extends Base {

    Login lg;

    public Logintest() throws FileNotFoundException {
        super();

    }

    @BeforeMethod
    public void setup() throws FileNotFoundException {

        init();

        lg = new Login();

    }


    @Test
    public void login(){

        lg.loginpage();

      String title =   driver.getTitle();
        System.out.println(title);


    }

    @AfterMethod
    public void teardown(){

    }
}
