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
        a.getnum(1);
        a.count();
       App b=new App();
        b.getnum(-1);
        b.count();
        App c=new App();
        c.getnum(0);
        c.count();
        assertTrue( true );
    } 

}
