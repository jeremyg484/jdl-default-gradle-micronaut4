package com.mycompany.myapp.security;

import jakarta.validation.constraints.NotBlank;

public interface PasswordEncoder {
    String encode(@NotBlank String rawPassword);

    boolean matches(@NotBlank String rawPassword, @NotBlank String encodedPassword);
}
