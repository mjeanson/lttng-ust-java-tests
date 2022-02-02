package org.lttng.ust.agent.utils;

public final class Log4j2EventRuleFactory extends EventRuleFactory {

    private static final int levelAllValue = Integer.MAX_VALUE;

    public Log4j2EventRuleFactory() {
        super(levelAllValue);
    }
}