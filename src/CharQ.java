public interface CharQ {
    void put(char ch ) throws QueueFullException;
    char get () throws QueueEmptyException;
}
