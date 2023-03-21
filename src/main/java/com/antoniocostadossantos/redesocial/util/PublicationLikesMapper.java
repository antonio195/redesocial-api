package com.antoniocostadossantos.redesocial.util;

import com.antoniocostadossantos.redesocial.builder.PublicationLikesBuilder;
import com.antoniocostadossantos.redesocial.entity.PublicationLikes;

public class PublicationLikesMapper {

    public PublicationLikes publicationLikesDTOToPublicationLikes(PublicationLikes publicationLikes) {
        PublicationLikes newPublicationLikes = PublicationLikesBuilder.create()
                .addOwner(publicationLikes.getOnwerId())
                .addPost(publicationLikes.getPublicationId())
                .build();
        return newPublicationLikes;
    }

}
