package me.namila.rxpubsub;

import java.time.LocalTime;
import java.util.Objects;

public class Publisher {
  private final String name;

  public Publisher(String name) {
    this.name = name;
  }

  public Publisher() {
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
    Publisher publisher = (Publisher) o;
    return Objects.equals(name, publisher.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
