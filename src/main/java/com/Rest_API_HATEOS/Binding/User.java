package com.Rest_API_HATEOS.Binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends RepresentationModel<User> {
    private Integer id;
    private String name;
    private String email;
}
