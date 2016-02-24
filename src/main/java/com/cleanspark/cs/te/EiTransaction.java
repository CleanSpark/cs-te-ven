package com.cleanspark.cs.te;

import java.io.StringWriter;

import javax.xml.bind.JAXBException;

import org.oasis_open.docs.ns.energyinterop._201110.EiTransactionType;

import com.cleanspark.cs.wrapper.TePayload;
import com.cleanspark.cs.wrapper.TeSignedObject;
import EiTransaction.EiCreateTransactionType;

public class EiTransaction {
	public String EiCreateTransactionType(EiTransactionType eiTransaction, String partyID, String counterPartyID, String refID){
		EiCreateTransactionType transaction = new EiCreateTransactionType();
		transaction.setEiTransaction(eiTransaction);
		transaction.setPartyID(partyID);
		transaction.setRefID(refID);
		transaction.setCounterPartyID(counterPartyID);
		TeSignedObject signedObj = new TeSignedObject();
		signedObj.setCreateTransactionType(transaction);		
		
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
