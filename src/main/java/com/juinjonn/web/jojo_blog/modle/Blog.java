package com.juinjonn.web.jojo_blog.modle;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Blog {
    private String title;
    private String context;
    private String url;

}
