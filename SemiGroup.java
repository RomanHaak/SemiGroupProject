public class SemiGroup {
    /**
     * This class represents FINITE semigroups, e.g. all finite sets with an
     * associative multiplication
     * 
     * It's important to check, if a matrix (which is the multiplication table of
     * the semigroup) really represents a semigroup. This is done by the constructor
     * "SemiGroup(int[][] multiplicationTable) {...}"
     */
    int cardinality; // the number of elements indexed by 0 , ... , (cardinality-1)
    int[][] structure = null; // the multiplication table of the semigroup
    /**
     * 
     * @param multiplicationTable
     * @return an object of type "SemiGroup" if the input matrix is valid (quadratic
     *         and associative), null otherwise
     */
    
    SemiGroup(){
    }
    
    
    SemiGroup(int[][] multiplicationTable) {
        if (checkAssociativity(multiplicationTable)) {
            setAttributes(multiplicationTable);
        }
    }
    /**
     * @param multiplicationTable
     * @return true if input matrix is quadratic, false otherwise.
     */
    private boolean checkQuadraticMultiplicationTable(int[][] multiplicationTable) {
        if (multiplicationTable.length == multiplicationTable[0].length) {
            return true;
        }
        System.out.println("Multiplication Table is not quadratic!");
        return false;
    }
    /**
     * 
     * @param multiplicationTable
     * @return true if input is quadratic and associative, false otherwise
     */
    private boolean checkAssociativity(int[][] multiplicationTable) {
        if (checkQuadraticMultiplicationTable(multiplicationTable)) {
            int i, j, k;
            int size = multiplicationTable.length;
            for (i = 0; i < size; ++i) {
                for (j = 0; j < size; ++j) {
                    for (k = 0; k < size; ++k) {
                        if (multiplicationTable[multiplicationTable[i][j]][k] != multiplicationTable[i][multiplicationTable[j][k]]) {
                            System.out.println("Multiplication Table is not associative!");
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    /**
     * Method sets the attributes such that structure is the input matrix and
     * cardinality is its size.
     * 
     * @param multiplicationTable
     */
    private void setAttributes(int[][] multiplicationTable) {
        cardinality = multiplicationTable.length;
        structure = multiplicationTable;
    }
    /**
     * 
     * @return the attribute "cardinality" which is the amount of elements of the
     *         semigroup
     */
    int getCardinality() {
        return cardinality;
    }
    /**
     * 
     * @return the attribute "structure" which is the multiplication table of the
     *         semigroup
     */
    int[][] getStructure() {
        return structure;
    }
}