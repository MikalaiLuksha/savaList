package by.pelar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;

    @NotBlank
    private String name;

    @NotBlank
    private String login;

    @NotBlank
    private String password;

    private Role role;
}
