package roughWork;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

/**
 * Created by mayan on 10/9/17.
 */
public class HelpDesk {

    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, Category category ){
        enquiries.offer(new Enquiry(customer,category));
    }
    public void processPrinterEnquiry(){
        final Predicate<Enquiry> predicate = enquiry -> enquiry.getCategory() == Category.PRINTER;
        final String message = "Printer message";
        processEnquiry(enquiries.peek(),predicate,message);
    }
    private void processEnquiry(Enquiry enquiry,Predicate<Enquiry> predicate,String message){
        if(enquiry !=null && predicate.test(enquiry)){
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        }
    }
    public void processGeneralEnquiry(){
        final Predicate<Enquiry> predicate = enquiry -> enquiry.getCategory() != Category.PRINTER;
        final String message = "General message";
        processEnquiry(enquiries.peek(),predicate,message);
    }
    public void processAllEnquries(){
         //final roughWork.Enquiry enquiry = enquiries.remove();
         //enquiry.getCustomer().reply("Please dont use haha");
         Enquiry enquiry;
         while((enquiry = enquiries.poll()) !=null ){
             enquiry.getCustomer().reply("Do not use our product");
         }
    }
    public void main(String[] args){
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.JACK,Category.PHONE);
        helpDesk.enquire(Customer.JILL,Category.PRINTER);
        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
    }
}
