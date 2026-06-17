package testYourKnowledge;

class Test {
    int x = 10;

    void show(int x) {
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        new Test().show(20);
    }
}

