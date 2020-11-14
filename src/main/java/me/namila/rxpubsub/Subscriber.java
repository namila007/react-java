package me.namila.rxpubsub;

import java.time.LocalTime;
import java.util.Objects;

public class Subscriber {
  private final String name;

  public Subscriber(String name) {
    this.name = name;
  }

  public Subscriber() {
    this.name = String.valueOf(LocalTime.now().hashCode());
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscriber that = (Subscriber) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
