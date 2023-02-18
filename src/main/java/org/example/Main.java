package org.example;

import org.example.service.NewsletterService;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NewsletterService newsletterService = new NewsletterService();
        newsletterService.inscricaoNewsletter("cinthia@teste.com");
        newsletterService.publicarNoticia("noticia 1");

        Thread.sleep(1000);
        newsletterService.inscricaoNewsletter("joaoa@teste");
        newsletterService.publicarNoticia("noticia 2");

        Thread.sleep(1000);
    }
}