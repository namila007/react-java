package me.namila.rxpubsub;

import java.util.ArrayList;
import rx.Observable;

public class Topic extends Observable<Object> {
  private final ArrayList<Publisher> publishers;
  private final String topic;
  private final ArrayList<Subscriber> subscribers;

  public Topic(String topic) {
    //    super();
    this.publishers = new ArrayList<>();
    this.topic = topic;
    this.subscribers = new ArrayList<>();
  }

  public void addSubscriber(Subscriber subscriber) {
    subscribers.add(subscriber);
  }
}
