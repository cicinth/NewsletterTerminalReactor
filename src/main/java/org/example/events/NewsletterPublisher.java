package org.example.events;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

public class NewsletterPublisher {

    private final Sinks.Many<String> newsSinks;

    public NewsletterPublisher(){
        this.newsSinks = Sinks.many().multicast().onBackpressureBuffer();
    }
    public void publish(String news){
        this.newsSinks.tryEmitNext(news);
    }

    public Flux<String> getNewsFlux() {
        return this.newsSinks.asFlux();
    }
}
