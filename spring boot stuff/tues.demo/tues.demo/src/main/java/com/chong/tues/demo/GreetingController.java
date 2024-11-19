package com.chong.tues.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getMyGreeting() {
        String myReturnMessage = "<!DOCTYPE html>"
                + "<html lang=\"en\">"
                + "<head>"
                + "<meta charset=\"UTF-8\">"
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                + "<title>Greeting Page</title>"
                + "<style>"
                + "body {"
                + "    font-family: Arial, sans-serif;"
                + "    text-align: center;"
                + "    margin-top: 50px;"
                + "}"
                + ".greeting {"
                + "    font-size: 24px;"
                + "    color: #4CAF50;"
                + "    font-weight: bold;"
                + "}"
                + "</style>"
                + "</head>"
                + "<body>"
                + "<div class=\"greeting\">"
                + "<h1>********* Hello from my Website! *********</h1>"
                + "</div>"
                + "</body>"
                + "</html>";

        return myReturnMessage;
    }
}
