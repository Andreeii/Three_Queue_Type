public class DynQueue implements CharQ {

    private char q[];
    private int putloc , getloc;

    public DynQueue(int size) {
        q = new char[size];
        putloc = getloc = 0 ;
    }

    public void put(char ch ){
        if(putloc == q.length) {
            char t[] = new char[q.length * 2];

            for (int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
        }
        q[putloc++] = ch;
    }
    public char get (){
        if(getloc == putloc){
            System.out.println("Queue is empty");
            return (char) 0;
        }
        return q[getloc++];
    }
}
