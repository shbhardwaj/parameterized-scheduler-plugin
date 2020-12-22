package org.jenkinsci.plugins.parameterizedscheduler;

import hudson.scheduler.CronTab;
import org.junit.Test;
import org.jvnet.localizer.LocaleProvider;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParameterizedCronTabTest {

	static
	{
		LocaleProvider.setProvider(new LocaleProvider()
		{
			@Override
			public Locale get()
			{
				return Locale.ENGLISH;
			}
		});
	}

	@Test
	public void ctor_happyPath() throws Exception {
		Map<String, String> parameters = new HashMap<>();
		parameters.put("one", "onevalue");
		CronTab testCronTab = new CronTab("* * * * *");
		ParameterizedCronTab testObject = new ParameterizedCronTab(testCronTab, parameters);

		assertEquals(parameters, testObject.getParameterValues());
		assertTrue(testObject.check(new GregorianCalendar()));
		assertTrue(testObject.checkSanity().startsWith("Do you really mean"));
	}

}
