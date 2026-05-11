package cie;

public class Internals extends Student {

    public int[] internalMarks = new int[5];

    public Internals(String usn, String name, int semester, int[] internalMarks) {

        super(usn, name, semester);

        this.internalMarks = internalMarks;
    }
}
