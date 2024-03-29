package com.userpublic.bloggerapplication.comments;

import com.userpublic.bloggerapplication.articles.ArticleEntity;
import com.userpublic.bloggerapplication.users.UsersEntity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "Comments")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long Id;

    @Nullable
    private String title;
    @NonNull
    private String body;
    @NonNull
    private Date CreatedAt;

    @ManyToOne
    @JoinColumn(name = "articleId",nullable = false)
    private ArticleEntity article;

    @ManyToOne
    @JoinColumn(name = "authorId",nullable = false)
    private UsersEntity author;
}
