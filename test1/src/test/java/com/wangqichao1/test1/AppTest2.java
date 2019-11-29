package com.wangqichao1.test1;

import junit.framework.TestCase;

public class AppTest2 extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void testApp()
    {
    	App a=new App();
        a.getnum();
        a.count();
        App b=new App();
        b.getnum();
        b.count();
        App c=new App();
        c.getnum();
        c.count();
        assertTrue( true );
    } 

}
