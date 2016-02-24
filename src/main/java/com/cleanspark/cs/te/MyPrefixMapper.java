package com.cleanspark.cs.te;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class MyPrefixMapper extends NamespacePrefixMapper {

	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion,
			boolean requirePrefix) {
		if(namespaceUri.equals("urn:ietf:params:xml:ns:icalendar-2.0")) {
			return "xcal";
		} else if(namespaceUri.equals("urn:ietf:params:xml:ns:icalendar-2.0:stream")) {
			return "strm";
		} else if(namespaceUri.equals("http://www.opengis.net/gml/3.2")) {
			return "gml";
//		} else if(namespaceUri.equals("http://naesb.org/espi")) {
//			return "";
		} else if(namespaceUri.equals("http://docs.oasis-open.org/ns/emix/2011/06")) {
			return "emix";
		} else if(namespaceUri.equals("http://docs.oasis-open.org/ns/emix/2011/06/power")) {
			return "power";
		}else if(namespaceUri.equals("http://docs.oasis-open.org/ns/energyinterop/201110")) {
			return "ei";
		} else if(namespaceUri.equals("http://docs.oasis-open.org/ns/energyinterop/201110/payloads")) {
			return "pyld";
		} else if(namespaceUri.equals("http://openadr.org/oadr-2.0b/2012/07")) {
			return "oadr";
//		} else if(namespaceUri.equals("http://openadr.org/oadr-2.0b/2012/07/xmldsig-properties")) {
//			return "";
		} else if(namespaceUri.equals("http://www.w3.org/2000/09/xmldsig#")) {
			return "ds";
		}else if(namespaceUri.equals("http://www.w3.org/2005/Atom")) {
			return "atom";
		} else if(namespaceUri.equals("http://www.w3.org/2009/xmldsig11#")) {
			return "dsig11";
		} 
		
		return "";
	}

}
