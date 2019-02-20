package MidPractice;

public class ExternalTicket extends Ticket {
    private String companyName;
    private String contactInfo;

    public ExternalTicket(){}
    public ExternalTicket(String description, Date submitted, String companyName, String contactInfo ){
        super.setTicketDescription ( description );
        super.setDateSubmitted ( submitted );
        this.companyName = companyName;
        this.contactInfo = contactInfo;
    }

    @Override
    public void shortDisplay() {

    }

    @Override
    public void longDisplay() {

    }
}
