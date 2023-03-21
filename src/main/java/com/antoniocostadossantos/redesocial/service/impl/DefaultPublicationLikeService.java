package com.antoniocostadossantos.redesocial.service.impl;

import com.antoniocostadossantos.redesocial.repository.PostLikeRepository;
import com.antoniocostadossantos.redesocial.service.PublicationLikeService;
import com.antoniocostadossantos.redesocial.util.PublicationLikesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultPublicationLikeService implements PublicationLikeService {

    @Autowired
    PostLikeRepository postLikeRepository;

    @Override
    public void likePost(Long ownerId, Long publicationId) {
        Boolean postLike = postLikeRepository.existsByOnwerIdAndPublicationId(ownerId, publicationId);
        if (!postLike){
            postLikeRepository.save(PublicationLikesMapper().)
        }
    }
}
