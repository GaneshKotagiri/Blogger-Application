package com.userpublic.bloggerapplication.users;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "users")
@Getter
@Setter
@ToString
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UsersEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long Id;

    @Column(nullable = false)
    @NonNull
    private String UserName;
    @Column(nullable = false)
    @NonNull
    private String Email;
    @Column(nullable = true)
    @Nullable
    private String Bio;
    @Column(nullable = true)
    @Nullable
    private String Image;

}
