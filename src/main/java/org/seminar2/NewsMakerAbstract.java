package org.seminar2;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsMakerAbstract implements Newsmaker{
    protected String message;
    private final List<Subscriber> subscribers = new ArrayList<>();
    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void sendMassege() {
        for (Subscriber sub : subscribers) {
            sub.getMessage(message);
        }
    }

    public abstract void setMessage(String message);

}
