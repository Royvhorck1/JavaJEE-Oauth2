/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.security.Principal;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Gebruiker
 */
public class User implements Principal{

    String name ="akbar";
    String id;
    String email;
    
    @Override
    public String getName() {
        return name;
    }
    
}
