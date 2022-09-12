package com.jaydot2.security.secureapp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SSRFValidationService {

    /**
     * Using REGEX to protect against SSRF attacks is vulnerable to work-arounds by malicious attackers.
     */
    private String regexRestricted = "///#?*";

    /**
     * Blacklisting is vulnerable to being overcome.  It is better to whitelist resources.
     */
    private String[] blackListedIPAddresses = {
            "0.0.0.0",
            "127.0.0.1",
            "192.168.0.0",
            "172.16.0.0",
            "10.0.0.0",
            "169.254.169.254"
    };

    private String[] whilteListedDomains = {};

    private String[] restrictedHosts = {"localhost", "local"};

    private String[] whiteListedResourceTypes = {"http", "https"};

    public SSRFValidationService() {
    }

    public boolean validateIPAddress(String address) {
        //TODO add logic here
        return false;
    }

    public String sanitizeUserInput(String userInput) {
        String sanitizedUserInput = "";

        //TODO add logic here

        return sanitizedUserInput;
    }
}
