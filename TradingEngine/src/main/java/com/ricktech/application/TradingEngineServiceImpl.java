package com.ricktech.application;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com.ricktech.event.model.RequestConfirmation;

@Service
public class TradingEngineServiceImpl implements TradingEngineService {
	
	private static final String EVENTFILENAME = "event";
	private static final String EVENTFILEEXT = ".xml";
	private static final String DELIMITER = ",";
	private static final int NUMEVENTFILES = 7;
	
	private List<RequestConfirmation> requests = new ArrayList<RequestConfirmation>();
	
    public void parseEventFiles() {
    	try {
    		requests.clear();
    		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		// Due to having limited amount of time I am taking a shortcut and just looping through the available files.
		// With more time I would allow for a variable abount of input files with differing names.
    		for (int eventfileindex=0; eventfileindex<=NUMEVENTFILES; ++eventfileindex) {
    			InputStream instream = classloader.getResourceAsStream(EVENTFILENAME + eventfileindex + EVENTFILEEXT);
                RequestConfirmation requestConfirmation = unmarshallEvent(instream);
                addRequest(requestConfirmation);
    		}
    	}
    	catch (JAXBException e) 
        {
            e.printStackTrace();
        }
    }
    
	

	private RequestConfirmation unmarshallEvent(InputStream instream) throws JAXBException{
        JAXBContext jaxbContext;
        jaxbContext = JAXBContext.newInstance(RequestConfirmation.class);              
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        RequestConfirmation event = (RequestConfirmation) jaxbUnmarshaller.unmarshal(instream);
        return event;
     }
	// Take the complete list of requests and filter them before printing the filtered list
	// With more time I would parameterise the filter with lamda expression to allow for dynamic filters to be passed
	public void printEvents() {
		List<RequestConfirmation> reqs = requests
				.stream()
				.filter(pred -> ("USD".equals(pred.getTrade().getVarianceOptionTransactionSupplement().getEquityPremium().getPaymentAmount().getCurrency()) && "BISON_BANK".equals(pred.getTrade().getVarianceOptionTransactionSupplement().getSellerPartyReference().getHref())) ||
						        ("AUD".equals(pred.getTrade().getVarianceOptionTransactionSupplement().getEquityPremium().getPaymentAmount().getCurrency()) && "EMU_BANK".equals(pred.getTrade().getVarianceOptionTransactionSupplement().getSellerPartyReference().getHref())))
				.collect(Collectors.toList());
		reqs.forEach(req->{
			printEvent(req);
		});		
	 }
	
	// print single supplieed request
	public void printEvent(RequestConfirmation req) {
		System.out.print(req.getTrade().getVarianceOptionTransactionSupplement().getBuyerPartyReference().getHref() + DELIMITER +
			  	req.getTrade().getVarianceOptionTransactionSupplement().getSellerPartyReference().getHref() + DELIMITER +
				req.getTrade().getVarianceOptionTransactionSupplement().getEquityPremium().getPaymentAmount().getAmount().getContent() + DELIMITER +
				req.getTrade().getVarianceOptionTransactionSupplement().getEquityPremium().getPaymentAmount().getCurrency() + System.getProperty("line.separator"));
	}
    
    private void addRequest(RequestConfirmation request) {
		requests.add(request);
	}
    
    public List<RequestConfirmation> getRequests() {
		return requests;
	}
 
}
