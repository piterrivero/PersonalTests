package com.test.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        ExceptionsTests.class, //test case 1
        WordServiceTest.class     //test case 2
})

public class SuiteTest {
	//normally, this is an empty class
}
	

