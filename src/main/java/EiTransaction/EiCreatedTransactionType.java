package main.java.EiTransaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.oasis_open.docs.ns.energyinterop._201110.ArrayofResponses;
import org.oasis_open.docs.ns.energyinterop._201110.EiResponseType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eiCreatedTenderType", propOrder = {
    "counterPartyID",
    "eiResponse",
    "partyID",
    "responses",
    "transactionID"
})

public class EiCreatedTransactionType {
	
	@XmlElement(required = true)
    protected String counterPartyID;
	@XmlElement(required = true)
    protected EiResponseType eiResponse;
    @XmlElement(required = true)
    protected String partyID;
    @XmlAttribute(required = true)
    protected ArrayofResponses responses;
	
    public String getCounterPartyID() {
		return counterPartyID;
	}
	public void setCounterPartyID(String counterPartyID) {
		this.counterPartyID = counterPartyID;
	}
	public EiResponseType getEiResponse() {
		return eiResponse;
	}
	public void setEiResponse(EiResponseType eiResponse) {
		this.eiResponse = eiResponse;
	}
	public String getPartyID() {
		return partyID;
	}
	public void setPartyID(String partyID) {
		this.partyID = partyID;
	}
	public ArrayofResponses getResponses() {
		return responses;
	}
	public void setResponses(ArrayofResponses responses) {
		this.responses = responses;
	}
}

