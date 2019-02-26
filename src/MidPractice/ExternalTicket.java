package MidPractice;

public class ExternalTicket extends Ticket {
    private String companyName;
    private String contactInfo;

    public ExternalTicket(){}
    public ExternalTicket(String description, Date submitted, String companyName, String contactInfo ){
        super();
        super.setTicketDescription ( description );
        super.setDateSubmitted ( submitted );
        super.setTicketId ( getTicketCount ()+1000 );
        this.companyName = companyName;
        this.contactInfo = contactInfo;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getCompanyName(){
        return companyName;
    }

    public void setContactInfo(String phone){
        this.contactInfo = phone;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public void shortDisplay() {
        System.out.println ( getTicketId ()+": "+getDateSubmitted ().toString ()+" - "+getCompanyName ()+" "+completeToString () );
    }

    @Override
    public void longDisplay() {
        System.out.println ( "ID: "+ getTicketId () );
        System.out.println ( "Date Submitted: "+getDateSubmitted ().toString () );
        System.out.println ( "Description: "+getTicketDescription () );
        System.out.println ( "Status: "+completeToString () );
        System.out.println ( "Contact Info: "+getContactInfo () );
    }
}
