package org.jenkinsci.plugins.parameterizedscheduler;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ParameterizedTimerTriggerCauseTest {

	@Test
	public void happyPath() {
		Map<String, String> parameters = new HashMap<>();
		parameters.put("o", "v");
		ParameterizedTimerTriggerCause testObject = new ParameterizedTimerTriggerCause(parameters);

		assertEquals(Messages.ParameterizedTimerTrigger_TimerTriggerCause_ShortDescription("{o=v}"),
				testObject.getShortDescription());
	}

}
