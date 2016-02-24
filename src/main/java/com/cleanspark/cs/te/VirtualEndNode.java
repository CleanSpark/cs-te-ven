package main.java.com.cleanspark.cs.te;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.eclipse.jetty.server.Server;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;


public class VirtualEndNode {
	
	private static Marshaller marshaller;
	public static Marshaller getMarshaller() {
		return marshaller;
	}

	public static void setMarshaller(Marshaller marshaller) {
		VirtualEndNode.marshaller = marshaller;
	}

	private static Unmarshaller unmarshaller;
	
	public static Unmarshaller getUnmarshaller() {
		return unmarshaller;
	}

	public static void setUnmarshaller(Unmarshaller unmarshaller) {
		VirtualEndNode.unmarshaller = unmarshaller;
	}

	public static void initialize() throws Exception{
		JAXBContext jaxbContext = JAXBContext.newInstance("org.isotc211._2005.gco:"
				+ "org.isotc211._2005.gmd:"
				+ "org.isotc211._2005.gsr:"
				+ "org.isotc211._2005.gss:"
				+ "org.isotc211._2005.gts:"
				+ "org.oasis_open.docs.ns.emix._2011._06:"
				+ "org.oasis_open.docs.ns.energyinterop._201110:"
				+ "org.oasis_open.docs.ns.emix._2011._06.power:"
				+ "org.oasis_open.docs.ns.emix._2011._06.siscale:"
				+ "org.w3._1999.xlink:"
				+ "ietf.params.xml.ns.icalendar_2:"
				+ "ietf.params.xml.ns.icalendar_2:"
				+ "un.unece.uncefact.codelist.standard._5.iso42173a._2010_04_07:"
				+ "net.opengis.gml.v_3_2_1:"
				+ "com.cleanspark.cs.wrapper:"
				+ "net.opengis.gmlsf._2:", org.isotc211._2005.gco.ObjectFactory.class.getClassLoader());

		marshaller = jaxbContext.createMarshaller();
		unmarshaller = jaxbContext.createUnmarshaller();
		NamespacePrefixMapper mapper = new MyPrefixMapper();
		marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", mapper);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server(8080);
		try {
			initialize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			postMessage(EiTender.EiCreateTenderType(), "http://localhost:8081");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
public static void postMessage(String message, String url) throws Exception {
		
		String debugString = "";
		
		try {  
			HttpPost httppost = new HttpPost(url);
			StringEntity se = new StringEntity(message);
	        se.setContentType("application/xml");
            httppost.setEntity(se);
            
	        // Execute HTTP Post Request
            HttpClient client = new DefaultHttpClient();
	        org.apache.http.HttpResponse r = client.execute(httppost);
	        debugString += r.getStatusLine() + "|";
			HttpEntity responseEntity = r.getEntity();

			if (r.getStatusLine().getStatusCode() == 200) {
				BufferedReader rd = new BufferedReader(new InputStreamReader(responseEntity.getContent()));
		        String returnString = "";
		        String readln;
		        while ((readln = rd.readLine()) != null) {
		        	debugString += readln;
		        	returnString += readln;
		        }
		        rd.close();
		        httppost.releaseConnection();   
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		       
	}

}
