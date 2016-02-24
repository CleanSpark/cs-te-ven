package com.cleanspark.cs.te;

import ietf.params.xml.ns.icalendar_2.ArrayOfProperties;
import ietf.params.xml.ns.icalendar_2.ArrayOfVcalendarContainedComponents;

import java.io.StringWriter;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.oasis_open.docs.ns.emix._2011._06.ArrayOfWarrants;
import org.oasis_open.docs.ns.emix._2011._06.EmixBaseType;
import org.oasis_open.docs.ns.emix._2011._06.EnvelopeContentsType;
import org.oasis_open.docs.ns.emix._2011._06.ProductType;
import org.oasis_open.docs.ns.energyinterop._201110.EiResponseType;
import org.oasis_open.docs.ns.energyinterop._201110.EiTenderType;
import org.oasis_open.docs.ns.energyinterop._201110.ObjectFactory;

import com.cleanspark.cs.wrapper.TePayload;
import com.cleanspark.cs.wrapper.TeSignedObject;

import EiTender.EiCreateTenderType;
import EiTender.EiCreatedTenderType;


public class EiTender {
	
	public static String EiCreateTenderType(EiTenderType tender){
		EiCreateTenderType createTender = new EiCreateTenderType();
		createTender.setPartyID("PartyID");
		createTender.setCounterPartyID("CounterPartyID");
		createTender.setRequestID("REQ_12345");
		createTender.getEiTenders().add(tender);
		TeSignedObject signedObj = new TeSignedObject();
		signedObj.setEiCreateTenderType(createTender);		
		
		TePayload payload = new TePayload();
		payload.setTeSignedObject(signedObj);

	    StringWriter out = new StringWriter();
	    try {
			VirtualEndNode.getMarshaller().marshal(payload, out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	    
	    return out.toString();

	}
	
	public static String EiCreatedTenderType(){
		EiCreatedTenderType createdTender = new EiCreatedTenderType();
		createdTender.setCounterPartyID("CounterParty");
		EiResponseType response = new EiResponseType();
		response.setResponseDescription("Accepted");
		response.setResponseCode("200");
		createdTender.setEiResponse(response);
		TeSignedObject signedObj = new TeSignedObject();
		signedObj.setEiCreatedTenderType(createdTender);		
		
		TePayload payload = new TePayload();
		payload.setTeSignedObject(signedObj);

	    StringWriter out = new StringWriter();
	    try {
			VirtualEndNode.getMarshaller().marshal(payload, out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	    
	    return out.toString();

	}
	
}
