package org.example.events;

import reactor.core.publisher.Flux;

public class NewsletterSubscriber {
    private final String email;

    public NewsletterSubscriber(String email){
        this.email = email;
    }

    public void subscribe(Flux<String> newsFlux){
        newsFlux.subscribe(
                news -> System.out.println(this.email + " nova noticia"+ news),
                error -> System.out.println(this.email + "error" + error)
        );
    }

}
