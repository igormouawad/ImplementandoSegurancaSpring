/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mouawad.estudos.spring.seguranca.services;

import br.com.mouawad.estudos.spring.seguranca.UserSS;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 *
 * @author Igor M. Mouawad
 */
public class UserService {

    public static UserSS authenticated() {
        try {
            return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        } catch (Exception e) {
            return null;
        }
    }
}
