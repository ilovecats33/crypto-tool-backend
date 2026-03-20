package com.nia.cryptotool;

import java.util.Base64;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
public class CryptoController 
{
/* to check server response
    @GetMapping("/")
    public String home() 
    {
        return "Crypto Tool is running!!";
    }
*/

    @PostMapping("/encrypt")
    public String encrypt(@RequestBody String text) 
    {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestBody String text) 
    {
        return new String(Base64.getDecoder().decode(text));
    }
}