package com.mes.gotogether.domains.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public final class UserDTO {
    
    @NotNull
    private String firstName;
    @NotNull
    private String middleName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String confirmPassword;
    @NotNull
    private String streetName;
    @NotNull
    private String houseNumber;
    @NotNull
    private String city;
    @NotNull
    private String zipcode;
    @NotNull
    private String state;
    @NotNull
    private String country;
    private boolean validated;
    private boolean hasPasswordMatch;
}
