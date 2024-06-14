package com.Rest_API_HATEOS.restController;

import com.Rest_API_HATEOS.Binding.User;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserRestController {

    @GetMapping("/user")
    public ResponseEntity<User> getUser(){

        User u1 = new User(101,"vidhya","vidhya10@gmail.com");
        u1.add(linkTo(methodOn(UserRestController.class).getUser()).withSelfRel());

        return new ResponseEntity<>(u1, HttpStatus.OK);

    }
}
