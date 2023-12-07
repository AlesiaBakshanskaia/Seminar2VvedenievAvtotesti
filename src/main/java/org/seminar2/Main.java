package org.seminar2;

public class Main {
    public static void main(String[] args) {
        NewsMakerAbstract newspaper = new Newspaper();
        NewsMakerAbstract magazine = new Magazine();
        Subscriber subscriber1 = new SubscriberImpl();
        Subscriber subscriber2 = new SubscriberImpl();
        newspaper.subscribe(subscriber1);
        magazine.subscribe(subscriber1);
        magazine.subscribe(subscriber2);

        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                publishNews(newspaper, i);
            } else {
                publishNews(magazine, i);
            }
        }

    }

    private static void publishNews(NewsMakerAbstract abstractNewsMaker, int i) {
        abstractNewsMaker.setMessage("Новость " + i);
        abstractNewsMaker.sendMassege();
    }
}
