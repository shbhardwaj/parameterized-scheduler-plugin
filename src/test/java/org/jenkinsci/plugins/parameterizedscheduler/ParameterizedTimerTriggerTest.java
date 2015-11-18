package org.jenkinsci.plugins.parameterizedscheduler;

import static org.junit.Assert.assertSame;

import org.jenkinsci.plugins.parameterizedscheduler.ParameterizedTimerTrigger;
import org.junit.Test;

public class ParameterizedTimerTriggerTest {

	@Test
	public void ctor() throws Exception {
		String parameterizedSpecification = "* * * * *%foo=bar";
		ParameterizedTimerTrigger testObject = new ParameterizedTimerTrigger(parameterizedSpecification);

		assertSame(parameterizedSpecification, testObject.getParameterizedSpecification());

	}
}
