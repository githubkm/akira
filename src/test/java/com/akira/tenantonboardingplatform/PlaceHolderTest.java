package com.akira.tenantonboardingplatform;

import org.junit.Test;

import junit.framework.Assert;

public class PlaceHolderTest {
	
	@Test
	public void testPlaceHolder() {
		Assert.assertTrue(new PlaceHolder().temp());
	}

}
