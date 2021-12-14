package gr0102.projectecommercewaa.dto.authDTOs;

import lombok.Getter;

@Getter
public class AuthenticationResponse {

    private final String jwt;

    public AuthenticationResponse(String jwt){
        this.jwt = jwt;
    }


}
