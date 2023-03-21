package com.antoniocostadossantos.redesocial.repository;

import com.antoniocostadossantos.redesocial.entity.PublicationLikes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostLikeRepository extends JpaRepository<PublicationLikes, Long> {

    boolean existsByOnwerIdAndPublicationId(Long onwerId, Long publicationId);

}
