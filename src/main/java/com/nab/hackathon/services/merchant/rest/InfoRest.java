package com.nab.hackathon.services.merchant.rest;

import com.nab.hackathon.services.merchant.beans.Info;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class InfoRest
{
    private static Log logger = LogFactory.getLog(InfoRest.class);

    @RequestMapping(value = "/about",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Info about()
    {
        logger.info("Invoking /api/about RESTful method");
        Info info = new Info("merchant spring boot service", "1.0");

        return info;
    }
}
