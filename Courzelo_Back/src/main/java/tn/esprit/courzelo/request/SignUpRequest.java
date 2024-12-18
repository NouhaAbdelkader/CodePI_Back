package tn.esprit.courzelo.request;

import tn.esprit.courzelo.entities.UserCorzelo.ERole;

import java.util.Set;

public class SignUpRequest {
    /* @NotBlank
  @Size(min = 3, max = 20)*/
    private String username;
    /*
      @NotBlank
      @Size(max = 50)
      @Email*/
    private String email;

    private Set<ERole> roles;

    public Set<ERole> getRoles() {
        return  roles;
    }

    public void setRoles(Set<ERole> roles) {
        this.roles = roles;
    }

    /*@NotBlank
        @Size(min = 6, max = 40)*/
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
