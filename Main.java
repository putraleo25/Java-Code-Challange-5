class Main {
    int x;
    int y;

    public static void main(String[] args) {
        Hero hero = new Hero("Putra Leo", 23);
        hero.player();
        looping(7, () -> hero.walk());
        looping(4, () -> hero.run());
        looping(4, () -> hero.eat());
        looping(3, () -> hero.drink());
        looping(3, () -> hero.jump());
        looping(4, () -> hero.sit());
        looping(50, () -> hero.walk());
        looping(4, () -> hero.attack());
        hero.player();
    }

    static void looping(int x, Runnable r) {
        for (int i = 0; i < x; i++) {
            r.run();
        }
    }

    // walk 7x, run 4x, eat 4x, drink 3x, jump 3x, sit 4x, walk 50x, attack 4x
}