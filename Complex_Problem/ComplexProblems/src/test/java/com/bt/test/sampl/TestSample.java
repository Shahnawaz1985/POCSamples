package com.bt.test.sampl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bt.cp.bean.SimpleBean;

public class TestSample {
	
	SimpleBean simpleBean;
	
	@Before
	public void fixture(){
		simpleBean = new SimpleBean();
	}
	
	@Test
	public void testAdd(){
		Assert.assertEquals(6, simpleBean.add(3, 3));
	}
	
	@After
	public void destruct(){
		simpleBean = null;
	}

}
