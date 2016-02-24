package EiTender;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.oasis_open.docs.ns.energyinterop._201110.ArrayofResponses;
import org.oasis_open.docs.ns.energyinterop._201110.EiResponseType;
import org.oasis_open.docs.ns.energyinterop._201110.EiTenderType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eiCreatedTenderType", propOrder = {
    "counterPartyID",
    "eiResponse",
    "partyID",
    "responses",
    "tenderID"
})

public class EiCreatedTenderType {

	@XmlElement(required = true)
    protected String counterPartyID;
    @XmlElement(required = true)
    protected EiResponseType eiResponse;
    @XmlElement(required=true)
    protected String partyID;
    @XmlElement(required=true)
    protected ArrayofResponses responses;
    @XmlAttribute(required=true)
    protected ArrayList<String> tenderID;
	
	
	public String getCounterPartyID() {
		return counterPartyID;
	}
	public void setCounterPartyID(String counterPartyID) {
		this.counterPartyID = counterPartyID;
	}
	public String getPartyID() {
		return partyID;
	}
	public void setPartyID(String partyID) {
		this.partyID = partyID;
	}
	public EiResponseType getEiResponse() {
		return eiResponse;
	}
	public void setEiResponse(EiResponseType eiResponse) {
		this.eiResponse = eiResponse;
	}
	public void setResponses(ArrayofResponses responses) {
		this.responses = responses;
	}
	public ArrayofResponses geResponses() {
		return responses;
	}
	public ArrayList<String> getTenderID() {
		  if (tenderID == null) {
			  tenderID = new ArrayList<String>();
	        }
	        return this.tenderID;
	}
	public void setTenderID(ArrayList<String> tenderID) {
		this.tenderID = tenderID;
	}
}
