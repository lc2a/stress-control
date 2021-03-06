/**
 * OrientationSpec.java
 * 
 * Copyright (C) 2016 by Arménio Pinto
 * Please read the file LICENSE for the license details.
 */
package com.armeniopinto.stress.control.sensorimotor

import spock.lang.*

import nl.jqno.equalsverifier.EqualsVerifier

/**
 * Tests {@link Orientation}.
 * 
 * @author armenio.pinto
 */
class OrientationSpec extends Specification {

	def "equals() and hashCode() methods"() {
		when:
		EqualsVerifier.forClass(Orientation.class).verify()

		then:
		noExceptionThrown()
	}
}
