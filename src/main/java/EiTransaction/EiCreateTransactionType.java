package EiTransaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.oasis_open.docs.ns.energyinterop._201110.EiTransactionType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eiCreateTenderType", propOrder = {
    "counterPartyID",
    "eiTenders",
    "partyID",
    "requestID"
})

public class EiCreateTransactionType {
	
	@XmlElement(required = true)
    protected String counterPartyID;
	@XmlElement(required = true)
    protected EiTransactionType eiTransaction;
    @XmlElement(required = true)
    protected String partyID;
    @XmlAttribute(required = true)
    protected String refID;
	
    public String getCounterPartyID() {
		return counterPartyID;
	}
	public void setCounterPartyID(String counterPartyID) {
		this.counterPartyID = counterPartyID;
	}
	public EiTransactionType getEiTransaction() {
		return eiTransaction;
	}
	public void setEiTransaction(EiTransactionType eiTransaction) {
		this.eiTransaction = eiTransaction;
	}
	public String getPartyID() {
		return partyID;
	}
	public void setPartyID(String partyID) {
		this.partyID = partyID;
	}
	public String getRefID() {
		return refID;
	}
	public void setRefID(String refID) {
		this.refID = refID;
	}
}

