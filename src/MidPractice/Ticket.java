package MidPractice;

public abstract class Ticket implements Comparable{
    public static int TicketCount;
    private int ticketId;
    private String ticketDescription;
    private Date dateSubmitted;
    private boolean completed;

    public Ticket(){}
    public Ticket(String ticketDescription, Date dateSubmitted){
        this.ticketDescription = ticketDescription;
        this.dateSubmitted = dateSubmitted;
        TicketCount++;
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
        this.completed = true;
    }

    public String completeToString(){
        if(this.completed){
            return "Open";
        } else return "Closed";
    }

    public abstract void shortDisplay();

    public abstract void longDisplay();

    @Override
    public int compareTo(Object o) {
        Ticket ticket = (Ticket) o;
        if(this.getTicketId ()>ticket.getTicketId ()){
            return 1;
        }
        if(this.getTicketId ()==ticket.getTicketId ()){
            return 0;
        }
        else return -1;
    }
}
