package com.localize.internalize.i10ni18n.controller;

import com.localize.internalize.i10ni18n.domain.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequiredArgsConstructor
public class MessageSourceController {

    private final MessageSource messageSource;

    @GetMapping("/locale")
    public ResponseEntity<Response> getLocale(Locale locale) {

        String greeting = messageSource.getMessage("locale.greeting", null, locale);
        String change = messageSource.getMessage("locale.change", null, locale);
        String language = messageSource.getMessage("locale.language", null, locale);

        Response response = Response.builder()
                .greeting(greeting)
                .change(change)
                .language(language)
                .build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/locale-en")
    public ResponseEntity<Response> getLocaleEn(@RequestParam(name = "lang", defaultValue = "en") Locale locale) {

        String greeting = messageSource.getMessage("locale.greeting", null, locale);
        String change = messageSource.getMessage("locale.change", null, locale);
        String language = messageSource.getMessage("locale.language", null, locale);

        Response response = Response.builder()
                .greeting(greeting)
                .change(change)
                .language(language)
                .build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/locale-nl")
    public ResponseEntity<Response> getLocaleNl(@RequestParam(name = "lang", defaultValue = "en") Locale locale) {

        String greeting = messageSource.getMessage("locale.greeting", null, locale);
        String change = messageSource.getMessage("locale.change", null, locale);
        String language = messageSource.getMessage("locale.language", null, locale);

        Response response = Response.builder()
                .greeting(greeting)
                .change(change)
                .language(language)
                .build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/locale-es")
    public ResponseEntity<Response> getLocaleEs(@RequestParam(name = "lang", defaultValue = "en") Locale locale) {

        String greeting = messageSource.getMessage("locale.greeting", null, locale);
        String change = messageSource.getMessage("locale.change", null, locale);
        String language = messageSource.getMessage("locale.language", null, locale);

        Response response = Response.builder()
                .greeting(greeting)
                .change(change)
                .language(language)
                .build();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
