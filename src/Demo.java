public class Demo {
    public static void main(String[]args){
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        CharQ iq;
        char ch ;
        int i ;

        iq = q1;

        for ( i = 0 ; i < 10;i++){
            iq.put((char)('A'+i));
        }
        System.out.print("Content of fixedQueue:");
        for (i = 0 ; i<10;i++){
            ch = iq.get();
            System.out.print(ch + " ");
        }
        System.out.println();

        iq = q2;
        for ( i = 0 ; i < 5;i++){
            iq.put((char)('A'+i));
        }
        System.out.print("Content of dynamicQueue:");
        for (i = 0 ; i<5;i++){
            ch = iq.get();
            System.out.print(ch + " ");
        }
        System.out.println();


        iq = q3;
        for ( i = 0 ; i < 10;i++){
            iq.put((char)('Z'-i));
        }
        System.out.print("Content of circularQueue:");
        for (i = 0 ; i<10;i++){
            ch = iq.get();
            System.out.print(ch + " ");
        }
        System.out.println();
//        put mote characters in circular queue
        for ( i = 10 ; i < 20;i++){
            iq.put((char)('A'+i));
        }
        System.out.print("Content of circualr queue");
        for ( i = 0 ; i < 10;i++){
            ch = iq.get();
            System.out.print(ch + " ");
        }

        System.out.println("\nStore and consume from circular queue");
        for(i = 0 ; i <20; i ++){
            iq.put((char )('A'+i));
            ch = iq.get();
            System.out.print(ch);
        }
    }
}
