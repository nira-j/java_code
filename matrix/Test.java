package matrix;

public class Test {
    public static void main(String[] args) {
        MetrixProblem obj=new MetrixProblem();
        int x[][]=obj.readMatrix();
        obj.displayMatrix(x);
        obj.getDiagonalElements(x);

//        obj.displayMatrix(obj.reverseColumnwise(x));

    }
}
