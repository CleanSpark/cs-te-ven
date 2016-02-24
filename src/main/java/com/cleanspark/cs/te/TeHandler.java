package com.cleanspark.cs.te;

import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeFactory;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import com.cleanspark.cs.wrapper.TePayload;
import com.cleanspark.cs.wrapper.TeSignedObject;
 
public class TeHandler extends AbstractHandler{

	    private Scanner scanner;
	    static DatatypeFactory datatypeFactory;

		public TeHandler(){
	    }
		
	    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{	    	
	    	scanner = new Scanner(request.getInputStream(), "UTF-8");
	    	String message = "";
	    	if(scanner.hasNext()){
	    		message = scanner.next();
	    	}	
			TePayload payload;
			TeSignedObject signedObject = new TeSignedObject();
			try {
				payload = (TePayload) VirtualEndNode.getUnmarshaller().unmarshal(new StringReader(message));
				signedObject = payload.getTeSignedObject();
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if(signedObject.getEiCreateTenderType() != null){
				System.out.println("I GOT IT");
			}
	    	
	    }
		
}
