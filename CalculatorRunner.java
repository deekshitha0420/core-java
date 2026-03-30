class CalculatorRunner {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        // -------- ADD --------
        System.out.println("Add1: " + c.add(5));
        System.out.println("Add2: " + c.add(5, 10));

        // -------- SUB --------
        System.out.println("Sub1: " + c.sub(20));
        System.out.println("Sub2: " + c.sub(20, 5));

        // -------- MUL --------
        System.out.println("Mul1: " + c.mul(3));
        System.out.println("Mul2: " + c.mul(3, 4));

        // Calling with different inputs
        System.out.println("Add3: " + c.add(1,2,3));
        System.out.println("Add4: " + c.add(2,3,4,5));

        System.out.println("Sub3: " + c.sub(50,10,5));
        System.out.println("Sub4: " + c.sub(100,20,10,5));

        System.out.println("Mul3: " + c.mul(2,3,4));
        System.out.println("Mul4: " + c.mul(1,2,3,4,5));

        // Higher parameter examples
        System.out.println("Add10: " + c.add(1,1,1,1,1,1,1,1,1,1));
        System.out.println("Sub10: " + c.sub(100,1,1,1,1,1,1,1,1,1));
        System.out.println("Mul5: " + c.mul(1,2,3,4,5));
    }
}