package MidPractice;

public class InternalTicket extends Ticket {
    private String assignedTo;

    public InternalTicket(){}
    public InternalTicket(String description, Date submitted, String assignedTo){
        super.setTicketDescription ( description );
        super.setDateSubmitted ( submitted );
        super.setTicketId ( getTicketCount ()+1000 );
        this.assignedTo = assignedTo;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    @Override
    public void shortDisplay() {
        System.out.printf ( "%d : %d/$d/%d - s%", getTicketId (),getDateSubmitted ().getMonth (),getDateSubmitted ().getDay (),getDateSubmitted ().getYear (),getAssignedTo () +completeToString ());

    }

    @Override
    public void longDisplay() {
        System.out.println ( "ID: " + getTicketId () );
        System.out.println ( "Date Submitted: " + getDateSubmitted ().toString () );
        System.out.println ( "Assigned To: "+getAssignedTo () );
        System.out.println ( "Description: "+getTicketDescription () );
        System.out.println ( "Status: "+completeToString () );
    }

}
