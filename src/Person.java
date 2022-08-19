public class Person {

    private int turnNum;
    private final int strikes = 0;

    private Person next;
    private Person prev;

    public Person (int turnNum){
        this.turnNum = turnNum;
    }

    public int getTurnNum() {
        return turnNum;
    }

    public void setTurnNum(int turnNum) {
        this.turnNum = turnNum;
    }

    public int getStrikes() {
        return strikes;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    public Person getPrev() {
        return prev;
    }

    public void setPrev(Person prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Turn number " + turnNum;
    }
}
