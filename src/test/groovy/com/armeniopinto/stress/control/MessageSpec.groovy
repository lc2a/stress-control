/**
 * MessageSpec.java
 * 
 * Copyright (C) 2016 by Arménio Pinto
 * Please read the file LICENSE for the license details.
 */
package com.armeniopinto.stress.control

import spock.lang.*

import nl.jqno.equalsverifier.EqualsVerifier
import nl.jqno.equalsverifier.Warning

/**
 * Tests {@link Message}.
 * 
 * @author armenio.pinto
 */
class MessageSpec extends Specification {

	def "equals() and hashCode() methods"() {
		when:
		EqualsVerifier.forClass(Message.class).withRedefinedSubclass(Request.class).verify()

		then:
		noExceptionThrown()
	}
}
