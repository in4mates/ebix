/*
 *  UMM Schema Generator
 *  Copyright (C) 2014  ebIX, the European forum for energy Business Information eXchange. 
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.ebix.umm.templates.xsd


import org.ebix.umm.umm.BIELibrary
import org.ebix.umm.umm.MA

class BieLibraryExtension {
    
    def String fileName(BIELibrary library) {
        return "ebIX_BusinessInformationEntities_" + library.versionIdentifier.replaceAll("\\.", "p") + ".xsd"
    }

    def String fileName(BIELibrary library, String directory) {
        directory + "/" + fileName(library)
    }
    
    def String fileName(BIELibrary library, MA ma) {
    	if(ma !=null){
    		return "ebIX_MessageBusinessInformationEntities_" + ma.name +"_"+ library.versionIdentifier.replaceAll("\\.", "p") + ".xsd"
    	}
    	return "ebIX_BusinessInformationEntities_" + library.versionIdentifier.replaceAll("\\.", "p") + ".xsd"
    }

    def String fileName(BIELibrary library, String directory, MA ma) {
        directory + "/" + fileName(library, ma)
    }

    def String namespace(BIELibrary library, MA ma) {
        var String namespace = library.baseURN
        if (ma != null) {
            namespace = namespace + "-" + ma.name
        }
        return namespace
    }
	
}