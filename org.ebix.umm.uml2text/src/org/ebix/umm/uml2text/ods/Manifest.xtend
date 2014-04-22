package org.ebix.umm.uml2text.ods

class Manifest extends OdsPart {
	
	override String fileName() {
		return "META-INF/manifest.xml"
	}
	
	override String content() '''
		<?xml version="1.0" encoding="UTF-8"?>
		<manifest:manifest xmlns:manifest="urn:oasis:names:tc:opendocument:xmlns:manifest:1.0">
			<manifest:file-entry manifest:media-type="application/vnd.oasis.opendocument.spreadsheet" manifest:full-path="/"/>
			<manifest:file-entry manifest:media-type="text/xml" manifest:full-path="meta.xml"/>
			<manifest:file-entry manifest:media-type="text/xml" manifest:full-path="content.xml"/>
			<manifest:file-entry manifest:media-type="text/xml" manifest:full-path="styles.xml"/>
		</manifest:manifest>
	'''
	
}