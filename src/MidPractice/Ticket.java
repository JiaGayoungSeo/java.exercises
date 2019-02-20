package MidPractice;

public abstract class Ticket implements Comparable{
    private static int TicketCount;
    private int ticketId;
    private String ticketDescription;
    private Date dateSubmitted;
    private boolean completed;

    public Ticket(){}
    public Ticket(String ticketDescription, Date dateSubmitted){
        this.ticketDescription = ticketDescription;
        this.dateSubmitted = dateSubmitted;
        this.TicketCount++;
    }


    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        if(ticketId>0){
            this.ticketId = ticketId;
        }
        else this.ticketId = 1;
    }

    public static int getTicketCount() {
        return TicketCount;
    }

    public static void setTicketCount(int ticketCount) {
        TicketCount = ticketCount;
    }

    public String getTicketDescription() {
        return ticketDescription;
    }

    public void setTicketDescription(String ticketDescription) {
        this.ticketDescription = ticketDescription;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted() {
        System.out.println ( "It is completed." );
        this.completed = true;
    }

    public abstract void shortDisplay();

    public abstract void longDisplay();

    @Override
    public int compareTo(Object o) {
        Ticket ticket = (Ticket) o;
        if(this.getTicketId ()>ticket.getTicketId ()){
            return -1;
        }
        if(this.getTicketId ()==ticket.getTicketId ()){
            return 0;
        }
        else return 1;
    }
}
