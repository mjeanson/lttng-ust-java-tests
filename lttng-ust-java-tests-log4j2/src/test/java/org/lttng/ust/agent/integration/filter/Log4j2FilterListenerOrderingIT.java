/*
 * Copyright (C) 2022, EfficiOS Inc.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.lttng.ust.agent.integration.filter;

import org.junit.jupiter.api.Tag;
import org.lttng.tools.ILttngSession.Domain;
import org.lttng.ust.agent.utils.EventRuleFactory;
import org.lttng.ust.agent.utils.Log4j2EventRuleFactory;


/**
 * Implementation of {@link FilterListenerOrderingITBase} for the log4j API.
 */
@Tag("agent:log4j2")
@Tag("domain:log4j2")
public class Log4j2FilterListenerOrderingIT extends Log4j2FilterListenerOrderingITBase {

    @Override
    protected Domain getDomain() {
        return Domain.LOG4J2;
    }

    @Override
    protected EventRuleFactory getEventRuleFactory() {
        if (eventRuleFactory == null) {
            eventRuleFactory = new Log4j2EventRuleFactory();
        }
        return eventRuleFactory;
    }
}