package org.example;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;

public class Feedback {
    @PartType(value = MediaType.TEXT_PLAIN)
    @FormParam("content")
    public String content;
}
