package MidPractice;

public class InternalTicket extends Ticket {
    private String assignedTo;

    public InternalTicket(){}
    public InternalTicket(String description, Date submitted, String assignedTo){
        super.setTicketDescription ( description );
        super.setDateSubmitted ( submitted );

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

    }

    @Override
    public void longDisplay() {

    }
            }
