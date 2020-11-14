package me.namila.rxpubsub;

import rx.Observable;

public interface PubSubService {

  Observable<String> subscribe(String topic,String subsName);

  void unSubscribe(String topic,String subsName);


}
