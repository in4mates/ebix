package org.ebix.umm.uml2text.model

import java.util.List
import org.eclipse.uml2.uml.Association

interface ASCC {
	def List<String> businessTerm(Association umlAssociation)
	def String definition(Association umlAssociation)
	def String dictionaryEntryName(Association umlAssociation)
	def String uniqueIdentifier(Association umlAssociation)
	def String versionIdentifier(Association umlAssociation)
	def String sequencingKey(Association umlAssociation)
}
