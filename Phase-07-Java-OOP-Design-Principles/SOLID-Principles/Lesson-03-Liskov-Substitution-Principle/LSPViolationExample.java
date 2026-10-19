class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}

class LSPViolationExample {
    static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        makeBirdFly(new Penguin());
    }
}