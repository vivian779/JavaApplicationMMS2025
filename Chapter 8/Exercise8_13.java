class IntegerSet {

    private boolean[] a = new boolean[101];

    public void insertElement(int k) {
        a[k] = true;
    }

    public void deleteElement(int m) {
        a[m] = false;
    }

    public static IntegerSet union(IntegerSet s1,IntegerSet s2) {

        IntegerSet result = new IntegerSet();

        for(int i=0;i<101;i++)
            result.a[i] = s1.a[i] || s2.a[i];

        return result;
    }

    public static IntegerSet intersection(IntegerSet s1,IntegerSet s2) {

        IntegerSet result = new IntegerSet();

        for(int i=0;i<101;i++)
            result.a[i] = s1.a[i] && s2.a[i];

        return result;
    }

    public String toString() {

        String s="";

        for(int i=0;i<101;i++)
            if(a[i])
                s += i + " ";

        if(s.equals(""))
            return "---";

        return s;
    }
}

public class Exercise8_13 {

    public static void main(String[] args) {

        IntegerSet s1 = new IntegerSet();
        IntegerSet s2 = new IntegerSet();

        s1.insertElement(5);
        s1.insertElement(10);

        s2.insertElement(10);
        s2.insertElement(20);

        IntegerSet union = IntegerSet.union(s1,s2);
        IntegerSet inter = IntegerSet.intersection(s1,s2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
    }
}