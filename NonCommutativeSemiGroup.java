public class NonCommutativeSemiGroup extends SemiGroup {
    /**
     * This class represents all FINITE semigroups which are NOT commutative, e.g.
     * all finite sets with an associative, non-commutative multiplication        
     * 
     * It's important to check, if a matrix (which is the multiplication table of
     * the semigroup) really is non-commutative. This is done by the constructor
     * "NonCommutativeSemiGroup(int[][] multiplicationTable) {...}"
     */
    
    
    /**
     * Constructor constructs the object if the multiplication table is valid
     * (quadratic, associative, non-commutative)
     * 
     * If the multiplication table is not valid the constructor sets the attributes
     * to cardinality = 0; structure = null
     * 
     * * @param multiplicationTable
     */
    NonCommutativeSemiGroup(){
        super();
    }
    
    NonCommutativeSemiGroup(int[][] multiplicationTable) {
        super(multiplicationTable);
        if (checkNonCommutativity(multiplicationTable)) {
        } else {
            cardinality = 0;
            structure = null;
            System.out.println("Multiplication Table is commutative!");
        }
    }
    /**
     * 
     * @param multiplicationTable
     * @return true if input is non-commutative, false otherwise
     */
    private boolean checkNonCommutativity(int[][] multiplicationTable) {
        int i, j;
        for (i = 0; i < cardinality; ++i) {
            for (j = i + 1; j < cardinality; ++j) {
                if (structure[i][j] != structure[j][i]) {
                    return true;
                }
            }
        }
        return false;
    }
}