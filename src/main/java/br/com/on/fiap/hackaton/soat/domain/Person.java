package br.com.on.fiap.hackaton.soat.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {

    private String name;

    private String email;

    private String password;

}
