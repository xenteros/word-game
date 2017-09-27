package com.github.xenteros.word.game.security;

import com.github.xenteros.word.game.model.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by agurgul on 27.09.2017.
 */
public class LoggedUserUtils {

    public static User getLoggedUser() {
        final Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        final Object principal = auth.getPrincipal();

        if (principal instanceof User) {
            return (User) principal;
        }
        return null;
    }
}
