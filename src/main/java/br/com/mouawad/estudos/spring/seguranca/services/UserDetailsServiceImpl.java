/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mouawad.estudos.spring.seguranca.services;

import br.com.mouawad.estudos.spring.seguranca.UserSS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private BCryptPasswordEncoder pe;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        return new UserSS(1, "igor@mouawad.com.br",pe.encode("123"));
    }
}
