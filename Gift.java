interface Gift {
    void openGift();
}
class SurpriseGift implements Gift {
    @Override
    public void openGift() {
        System.out.println("You got a new gift! Enjoy!");
    }
}
