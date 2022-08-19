public class TurnCL {

    private Person head;
    private int count = 1;
    private int currentTurn = 1;

    public void addLast (){

        if (head == null){

            head = new Person(count);
            head.setNext(head);
            head.setPrev(head);
        } else {

            Person input = new Person(count += 1);

            Person tail = head.getPrev();
            //Los enlaces next
            tail.setNext(input);
            input.setNext(head);
            //Los enlaces previous
            head.setPrev(input);
            input.setPrev(tail);

        }
    }

    public void print(){

        Person current = search(currentTurn);

        if(current==null){
            System.out.println("There are no turns.");
            return;
        }
        if(current == head.getPrev()){
            System.out.println(current.getTurnNum()+" ");
            return;
        }

        System.out.print(current.getTurnNum()+" ");
    }

    public Person search(int goal){
        return search(head,goal);
    }

    private Person search(Person current, int goal){

        if(head==null){
            return null;
        }

        if(current == head.getPrev() && goal != head.getPrev().getTurnNum()){
            return null;
        }

        if(goal==current.getTurnNum()){
            return current;
        }

        return search(current.getNext(), goal);
    }

    public void delete(){
        delete(head);
    }

    private Person delete(Person n) {

        if(head==null){
            return null;
        }

        if (n == head && head.getNext()==null){
            return head = null;
        }

        Person current = (search(currentTurn));

        if(current.getTurnNum()==n.getTurnNum()){
            Person temp= new Person(n.getTurnNum());
            Person next= n.getNext();
            temp.setNext(next);
            next.setPrev(temp);
            if(n==head){
                head=next;
            }
            currentTurn +=1;
            return null;
        }

        return delete(n.getNext());
    }

    public void printR(){printR(head.getPrev());}

    private void printR(Person current){
        if(current==head){
            System.out.print(current.getTurnNum()+" ");
            return;
        }

        System.out.print(current.getTurnNum()+" ");
        printR(current.getPrev());
    }
}
