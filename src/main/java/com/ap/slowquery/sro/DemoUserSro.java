package com.ap.slowquery.sro;

import com.ap.slowquery.entity.DemoUser;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DemoUserSro {
    private Integer id;

    private String name;

    private String email;

    public DemoUserSro(DemoUser demoUser) {

        id= demoUser.getId();
        name=demoUser.getName();
        email=demoUser.getEmail();
    }
}
