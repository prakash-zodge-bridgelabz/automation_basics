package Selenium;

import org.testng.annotations.*;

/*
+-----------------------------------------------------------------------+
|                      1) Before Suite                                  |
|   +---------------------------------------------------------------+   |
|   |                  2) Before Test                               |   |
|   |   +-------------------------------------------------------+   |   |
|   |   |              3) Before Class                          |   |   |
|   |   |   +-----------------------------------------------+   |   |   |
|   |   |   |          4) Before Method                     |   |   |   |
|   |   |   |   +---------------------------------------+   |   |   |   |
|   |   |   |   |      5) public void methodName()      |   |   |   |   |
|   |   |   |   |           {.............}             |   |   |   |   |
|   |   |   |   +---------------------------------------+   |   |   |   |
|   |   |   |          6) After Method                      |   |   |   |
|   |   |   +-----------------------------------------------+   |   |   |
|   |   |              7) After Class                           |   |   |
|   |   +-------------------------------------------------------+   |   |
|   |                  8) After Test                                |   |
|   +---------------------------------------------------------------+   |
|                      9) After Suite                                   |
+-----------------------------------------------------------------------+


*/

public class TestNG {
    @Test
    public void add(){
        System.out.println("Test -> add");
    }
    @BeforeMethod
    public void Test1(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void Test2(){
        System.out.println("After Method");
    }
    @BeforeTest
    public void Test3(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void Test4(){
        System.out.println("After Test");
    }
    @BeforeSuite
    public void Test5(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void Test6(){
        System.out.println("After Suite");
    }
    @BeforeClass
    public void Test7(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void Test8(){
        System.out.println("After Class");
    }
    @Test
    public void A(){
        System.out.println("Test A");
    }
    @Test
    public void B(){
        System.out.println("Test B");
    }
}
