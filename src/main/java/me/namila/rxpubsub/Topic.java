package me.namila.rxpubsub;

import java.util.ArrayList;
import java.util.Objects;

public class Topic {
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
    this.subscribers.add(subscriber);
  }

  public void addPublisher(Publisher publisher) {
    this.publishers.add(publisher);
  }

  public ArrayList<Subscriber> getSubscribers() {
    return subscribers;
  }

  public String getTopic() {
    return topic;
  }

  public ArrayList<Publisher> getPublishers() {
    return publishers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Topic topic1 = (Topic) o;
    return Objects.equals(topic, topic1.topic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic);
  }
}
