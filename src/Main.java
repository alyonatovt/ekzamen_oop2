public class Main {
    public static void main(String[] args) {
        Two twoInstance = new Two();
        int sum = twoInstance.calculateSum();
        int parentJ = twoInstance.getParentJ();

        System.out.println("Sum of j from parent class and k from child class: " + sum);
        System.out.println("Value of j from parent class: " + parentJ);
    }
}