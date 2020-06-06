public class ClassOfInterest extends NonCommutativeSemiGroup {
    /**
     * This class represents all FINITE non-commutative semigroups which have at
     * most one right-neutral or one left-neutral element but not both, e.g. all
     * finite sets with an associative, non-commutative multiplication with the
     * above neutrality property
     * 
     * It's important to check, if a matrix (which is the multiplication table of
     * the semigroup) really has the needed property. This is done by the
     * constructor "ClassOfInterest(int[][] multiplicationTable) {...}"
     * 
     * rightNeutral (which represents the right-neutral element) is -1 if and only
     * if there are zero right-neutral elements or at least two right-neutral
     * elements or the semigroup is in fact a monoid
     */
    int rightNeutral = -1; // contains the only right-neutral element or is null
    int leftNeutral = -1; // contains the only left-neutral element or is null
    /**
     * Constructor constructs the object if the multiplication table is valid
     * (quadratic, associative, non-commutative, neutrality property)
     * 
     * If the multiplication table is not valid the constructor sets the attributes
     * to cardinality = 0; structure = null; rightNeutral = null; leftNeutral = null
     * 
     * * @param multiplicationTable
     */
    ClassOfInterest() {
        super();
    }
    ClassOfInterest(int[][] multiplicationTable) {
        super(multiplicationTable);
        setNewAttributes();
        if (!checkNoNeutralElement()) {
            cardinality = 0;
            structure = null;
            System.out.println("Multiplication Table has a neutral element!");
        }
    }
    /**
     * 
     * @param elem
     * @return true if the input is a right-neutral element, false otherwise
     */
    private boolean checkRightNeutrality(int elem) {
        int i;
        for (i = 0; i < cardinality; ++i) {
            if (structure[i][elem] != i) {
                return false;
            }
        }
        return true;
    }
    /**
     * If there is exactly one right-neutral element, set the attribute
     * "rightNeutral" to this element, set null otherwise.
     */
    private void setRightNeutral() {
        int elem;
        int r = 0; // counts the number of right neutral elements
        for (elem = 0; elem < cardinality; ++elem) {
            if (checkRightNeutrality(elem)) {
                rightNeutral = elem;
                r = r + 1;
            }
            if (r == 2) {
                rightNeutral = -1;
                System.out.println("There are more than two right neutral elements!");
                return;
            }
        }
    }
    /**
     * 
     * @param elem
     * @return true if the input is a left-neutral element, false otherwise
     */
    private boolean checkLeftNeutrality(int elem) {
        int i;
        for (i = 0; i < cardinality; ++i) {
            if (structure[elem][i] != i) {
                return false;
            }
        }
        return true;
    }
    /**
     * If there is exactly one left-neutral element, set the attribute "leftNeutral"
     * to this element, set null otherwise.
     */
    private void setLeftNeutral() {
        int elem;
        int r = 0; // counts the number of left neutral elements
        for (elem = 0; elem < cardinality; ++elem) {
            if (checkLeftNeutrality(elem)) {
                leftNeutral = elem;
                r = r + 1;
            }
            if (r == 2) {
                leftNeutral = -1;
                System.out.println("There are more than two left neutral elements!");
                return;
            }
        }
    }
    /**
     * If there is a neutral element, set rightNeutral and leftNeutral to null.
     * 
     * @return true if there is NO neutral element, false otherwise
     */
    private boolean checkNoNeutralElement() {
        if (rightNeutral == -1) {
            return true;
        }
        if (leftNeutral == -1) {
            return true;
        }
        rightNeutral = -1;
        leftNeutral = -1;
        return false;
    }
    private void setNewAttributes() {
        setRightNeutral();
        setLeftNeutral();
    }
}