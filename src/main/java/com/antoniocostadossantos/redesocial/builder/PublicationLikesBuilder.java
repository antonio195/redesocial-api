package com.antoniocostadossantos.redesocial.builder;

import com.antoniocostadossantos.redesocial.entity.PublicationLikes;

public final class PublicationLikesBuilder {

    private PublicationLikes postLikes;

    public PublicationLikesBuilder() {
        this.postLikes = new PublicationLikes();
    }

    public static PublicationLikesBuilder create() {
        return new PublicationLikesBuilder();
    }

    public PublicationLikesBuilder addOwner(Long owner) {
        this.postLikes.setOnwerId(owner);
        return this;
    }

    public PublicationLikesBuilder addPost(Long publicationId) {
        this.postLikes.setPublicationId(publicationId);
        return this;
    }

    public PublicationLikes build() {
        return this.postLikes;
    }


}
