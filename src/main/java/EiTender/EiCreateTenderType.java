package EiTender;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.oasis_open.docs.ns.energyinterop._201110.EiTenderType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eiCreateTenderType", propOrder = {
    "counterPartyID",
    "eiTenders",
    "partyID",
    "requestID"
})

public class EiCreateTenderType {
	
	@XmlElement(required = true)
    protected String counterPartyID;
    @XmlElement(required = true)
    protected ArrayList<EiTenderType> eiTenders;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/energyinterop/201110")
    protected String partyID;
    @XmlAttribute(required=true)
    protected String requestID;
	
	
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
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public ArrayList<EiTenderType> getEiTenders() {
		  if (eiTenders == null) {
	            eiTenders = new ArrayList<EiTenderType>();
	        }
	        return this.eiTenders;
	}
	public void setEiTenders(ArrayList<EiTenderType> eiTenders) {
		this.eiTenders = eiTenders;
	}
		
}
