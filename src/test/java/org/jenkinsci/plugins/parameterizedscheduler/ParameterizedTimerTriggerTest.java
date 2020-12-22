package org.jenkinsci.plugins.parameterizedscheduler;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class ParameterizedTimerTriggerTest {

	@Test
	public void ctor() throws Exception {
		String parameterizedSpecification = "* * * * *%foo=bar";
		ParameterizedTimerTrigger testObject = new ParameterizedTimerTrigger(parameterizedSpecification);

		assertSame(parameterizedSpecification, testObject.getParameterizedSpecification());
	}
}
