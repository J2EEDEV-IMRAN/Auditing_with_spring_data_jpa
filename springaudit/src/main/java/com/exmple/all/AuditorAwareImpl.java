package com.exmple.all;
import org.springframework.data.domain.AuditorAware;

class AuditorAwareImpl implements AuditorAware<String> {

   // @Override
    public String getCurrentAuditor() {
        return "Imran";
        // Can use Spring Security to return currently logged in user
        // return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername()
    }
}
