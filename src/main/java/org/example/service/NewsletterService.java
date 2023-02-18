package org.example.service;

import org.example.events.NewsletterPublisher;
import org.example.events.NewsletterSubscriber;

public class NewsletterService {
    private NewsletterPublisher publisher = new NewsletterPublisher();

    public void inscricaoNewsletter(String email){
        NewsletterSubscriber subscriber = new NewsletterSubscriber(email);
        subscriber.subscribe(publisher.getNewsFlux());
    }

    public void publicarNoticia(String news){
        publisher.publish(news);
    }
}
