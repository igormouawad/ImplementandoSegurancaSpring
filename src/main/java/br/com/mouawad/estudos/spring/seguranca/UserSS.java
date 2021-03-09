/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mouawad.estudos.spring.seguranca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author Igor M. Mouawad
 */
public class UserSS implements UserDetails {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String email;
    private String senha;
    private Collection<? extends GrantedAuthority> authorities;

    private final List<String> l = new ArrayList<>();

    public UserSS() {
    }

    public UserSS(Integer id, String email, String senha) {
        super();
        l.add("ROLE_ADMIN");
        l.add("ROLE_CLIENTE");
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.authorities = l.stream().map(x -> new SimpleGrantedAuthority(x)).collect(Collectors.toList());

    }

    public Integer getId() {
        return id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public boolean hasRole(String s) {
        return getAuthorities().contains(new SimpleGrantedAuthority(s));
    }
}
