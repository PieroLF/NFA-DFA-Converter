public class State {

    // Fields
    private int id;
    private boolean isStart;
    private boolean isAccept;


    // Constructor
    State(int id, boolean isStart, boolean isAccept) {
        this.id = id;
        this.isStart = isStart;
        this.isAccept = isAccept;
    }

    // Getter Methods
    public int getId() {return id;}
    public boolean isStart() {return isStart;}
    public boolean isAccept() {return  isAccept;}

    // Helper Methods
    public boolean isInitial() { return isStart();}
    public boolean isIFinal() { return isAccept();}


}