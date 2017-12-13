package javaVersion.linkedList;

public class delete2 {


    private int i;

    public delete2(int i) {
        this.i = i;
    }

    public void SSS(){
        System.out.println(this);
    }

//    @Override
//    public String toString() {
//        return "delete2{" +
//                "i=" + i +
//                '}';
//    }

    public static void main(String[] args) {


        delete2 d2 = new delete2(5);
        delete2 d3 = new delete2(5);
        System.out.println(d2);
        System.out.println(d2);
        System.out.println(d3);


//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(10); // G. Hopper
//        pq.add(8); // A. Lovelace
//        pq.add(38); // J. von Neumann
//        pq.add(2); // K. Zuse
//
//        System.out.println("Iterating over elements...");
//        for (Integer date : pq)
//            System.out.println(date);
//        System.out.println("Removing elements...");
//        while (!pq.isEmpty())
//            System.out.println(pq.remove());

    }




class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlackBox blackBox = (BlackBox) o;

        if (varA != blackBox.varA) return false;
        return varB == blackBox.varB;
    }

    @Override
    public int hashCode() {
        int result = varA;
        result = 31 * result + varB;
        return result;
    }
}
}