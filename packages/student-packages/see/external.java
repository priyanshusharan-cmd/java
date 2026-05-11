package see;

import cie.Internals;

public class External extends Internals {

    public int[] externalMarks = new int[5];

    public External(String usn, String name, int semester,
                    int[] internalMarks, int[] externalMarks) {

        super(usn, name, semester, internalMarks);

        this.externalMarks = externalMarks;
    }
}
