package EiTender;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


import org.oasis_open.docs.ns.energyinterop._201110.EiTargetType;
import org.oasis_open.docs.ns.energyinterop._201110.EiTenderType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eiDistributeTenderType", propOrder = {
    "eiTarget",
    "eiTender",
    "partyID",
    "requestID"
})

public class EiDistributeTenderType {
	
	@XmlElement(required = true)
    protected EiTargetType eiTarget;
	@XmlElement(required = true)
    protected EiTenderType eiTender;
    @XmlElement(required = true)
    protected String partyID;
    @XmlAttribute(required=true)
    protected String requestID;
    
    public EiTargetType getEiTarget() {
		return eiTarget;
	}
	public void setEiTarget(EiTargetType eiTarget) {
		this.eiTarget = eiTarget;
	}
	public EiTenderType getEiTender() {
		return eiTender;
	}
	public void setEiTender(EiTenderType eiTender) {
		this.eiTender = eiTender;
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
		
}




	
	

