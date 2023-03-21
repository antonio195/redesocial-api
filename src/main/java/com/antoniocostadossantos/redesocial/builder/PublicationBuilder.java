package com.antoniocostadossantos.redesocial.builder;

import com.antoniocostadossantos.redesocial.entity.Publication;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PublicationBuilder {

    private Publication publication;

    public PublicationBuilder() {
        this.publication = new Publication();
    }

    public static PublicationBuilder create() {
        return new PublicationBuilder();
    }

    public PublicationBuilder addMessage(String message) {
        this.publication.setMessage(message);
        return this;
    }

    public PublicationBuilder addDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        this.publication.setDate(dtf.format(now));
        return this;
    }

    public PublicationBuilder addOwner(Long ownerId) {
        this.publication.setOwnerId(ownerId);
        return this;
    }

    public Publication build(){
        return this.publication;
    }

}
