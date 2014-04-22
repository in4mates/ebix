package org.ebix.umm.uml2text.ods

class Styles extends OdsPart {
	
	override String fileName() {
		return "styles.xml"
	}
	
	override String content() '''
		<?xml version="1.0" encoding="UTF-8"?>
		<office:document-styles 
				xmlns:office="urn:oasis:names:tc:opendocument:xmlns:office:1.0" 
				xmlns:style="urn:oasis:names:tc:opendocument:xmlns:style:1.0" 
				xmlns:text="urn:oasis:names:tc:opendocument:xmlns:text:1.0" 
				xmlns:table="urn:oasis:names:tc:opendocument:xmlns:table:1.0" 
				xmlns:draw="urn:oasis:names:tc:opendocument:xmlns:drawing:1.0" 
				xmlns:fo="urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0" 
				xmlns:xlink="http://www.w3.org/1999/xlink" 
				xmlns:dc="http://purl.org/dc/elements/1.1/" 
				xmlns:meta="urn:oasis:names:tc:opendocument:xmlns:meta:1.0" 
				xmlns:number="urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0" 
				xmlns:presentation="urn:oasis:names:tc:opendocument:xmlns:presentation:1.0" 
				xmlns:svg="urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0" 
				xmlns:chart="urn:oasis:names:tc:opendocument:xmlns:chart:1.0" 
				xmlns:dr3d="urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0" 
				xmlns:math="http://www.w3.org/1998/Math/MathML" 
				xmlns:form="urn:oasis:names:tc:opendocument:xmlns:form:1.0" 
				xmlns:script="urn:oasis:names:tc:opendocument:xmlns:script:1.0" 
				xmlns:ooo="http://openoffice.org/2004/office" 
				xmlns:ooow="http://openoffice.org/2004/writer" 
				xmlns:oooc="http://openoffice.org/2004/calc" 
				xmlns:dom="http://www.w3.org/2001/xml-events" 
				xmlns:rpt="http://openoffice.org/2005/report" 
				xmlns:of="urn:oasis:names:tc:opendocument:xmlns:of:1.2" 
				xmlns:xhtml="http://www.w3.org/1999/xhtml" 
				xmlns:grddl="http://www.w3.org/2003/g/data-view#" 
				xmlns:css3t="http://www.w3.org/TR/css3-text/" 
				office:version="1.1">
			<office:font-face-decls>
				<style:font-face style:name="Liberation Sans" svg:font-family="&apos;Liberation Sans&apos;" style:font-family-generic="swiss" style:font-pitch="variable"/>
				<style:font-face style:name="DejaVu Sans" svg:font-family="&apos;DejaVu Sans&apos;" style:font-family-generic="system" style:font-pitch="variable"/>
				<style:font-face style:name="Lohit Hindi" svg:font-family="&apos;Lohit Hindi&apos;" style:font-family-generic="system" style:font-pitch="variable"/>
				<style:font-face style:name="WenQuanYi Micro Hei" svg:font-family="&apos;WenQuanYi Micro Hei&apos;" style:font-family-generic="system" style:font-pitch="variable"/>
			</office:font-face-decls>
			<office:styles>
				<style:default-style style:family="table-cell">
					<style:paragraph-properties style:tab-stop-distance="0.5in"/>
					<style:text-properties style:font-name="Liberation Sans" fo:language="en" fo:country="US" style:font-name-asian="DejaVu Sans" style:language-asian="zh" style:country-asian="CN" style:font-name-complex="DejaVu Sans" style:language-complex="hi" style:country-complex="IN"/>
				</style:default-style>
				<number:number-style style:name="N0">
					<number:number number:min-integer-digits="1"/>
				</number:number-style>
				<number:currency-style style:name="N104P0" style:volatile="true">
					<number:currency-symbol number:language="en" number:country="US">$</number:currency-symbol>
					<number:number number:decimal-places="2" number:min-integer-digits="1" number:grouping="true"/>
				</number:currency-style>
				<number:currency-style style:name="N104">
					<style:text-properties fo:color="#ff0000"/>
					<number:text>-</number:text>
					<number:currency-symbol number:language="en" number:country="US">$</number:currency-symbol>
					<number:number number:decimal-places="2" number:min-integer-digits="1" number:grouping="true"/>
					<style:map style:condition="value()&gt;=0" style:apply-style-name="N104P0"/>
				</number:currency-style>
				<style:style style:name="Default" style:family="table-cell">
					<style:text-properties style:font-name-asian="WenQuanYi Micro Hei" style:font-name-complex="Lohit Hindi"/>
				</style:style>
				<style:style style:name="Result" style:family="table-cell" style:parent-style-name="Default">
					<style:text-properties fo:font-style="italic" style:text-underline-style="solid" style:text-underline-width="auto" style:text-underline-color="font-color" fo:font-weight="bold"/>
				</style:style>
				<style:style style:name="Result2" style:family="table-cell" style:parent-style-name="Result" style:data-style-name="N104"/>
				<style:style style:name="Heading" style:family="table-cell" style:parent-style-name="Default">
					<style:table-cell-properties style:text-align-source="fix" style:repeat-content="false"/>
					<style:paragraph-properties fo:text-align="center"/>
					<style:text-properties fo:font-size="16pt" fo:font-style="italic" fo:font-weight="bold"/>
				</style:style>
				<style:style style:name="Heading1" style:family="table-cell" style:parent-style-name="Heading">
					<style:table-cell-properties style:rotation-angle="90"/>
				</style:style>
			</office:styles>
			<office:automatic-styles>
				<style:page-layout style:name="Mpm1">
					<style:page-layout-properties style:writing-mode="lr-tb"/>
					<style:header-style>
						<style:header-footer-properties fo:min-height="0.2957in" fo:margin-left="0in" fo:margin-right="0in" fo:margin-bottom="0.0984in"/>
					</style:header-style>
					<style:footer-style>
						<style:header-footer-properties fo:min-height="0.2957in" fo:margin-left="0in" fo:margin-right="0in" fo:margin-top="0.0984in"/>
					</style:footer-style>
				</style:page-layout>
				<style:page-layout style:name="Mpm2">
					<style:page-layout-properties style:writing-mode="lr-tb"/>
					<style:header-style>
						<style:header-footer-properties fo:min-height="0.2957in" fo:margin-left="0in" fo:margin-right="0in" fo:margin-bottom="0.0984in" fo:border="2.49pt solid #000000" fo:padding="0.0071in" fo:background-color="#c0c0c0">
							<style:background-image/>
						</style:header-footer-properties>
					</style:header-style>
					<style:footer-style>
						<style:header-footer-properties fo:min-height="0.2957in" fo:margin-left="0in" fo:margin-right="0in" fo:margin-top="0.0984in" fo:border="2.49pt solid #000000" fo:padding="0.0071in" fo:background-color="#c0c0c0">
							<style:background-image/>
						</style:header-footer-properties>
					</style:footer-style>
				</style:page-layout>
			</office:automatic-styles>
			<office:master-styles>
				<style:master-page style:name="Default" style:page-layout-name="Mpm1">
					<style:header><text:p><text:sheet-name>???</text:sheet-name></text:p></style:header>
					<style:header-left style:display="false"/>
					<style:footer><text:p>Page <text:page-number>1</text:page-number></text:p></style:footer>
					<style:footer-left style:display="false"/>
				</style:master-page>
				<style:master-page style:name="Report" style:page-layout-name="Mpm2">
					<style:header>
						<style:region-left><text:p><text:sheet-name>???</text:sheet-name> (<text:title>???</text:title>)</text:p></style:region-left>
						<style:region-right><text:p><text:date style:data-style-name="N2" text:date-value="2012-07-29">07/29/2012</text:date>, <text:time>19:00:13</text:time></text:p></style:region-right>
					</style:header>
					<style:header-left style:display="false"/>
					<style:footer><text:p>Page <text:page-number>1</text:page-number> / <text:page-count>99</text:page-count></text:p></style:footer>
					<style:footer-left style:display="false"/>
				</style:master-page>
			</office:master-styles>
		</office:document-styles>
	'''
	
}