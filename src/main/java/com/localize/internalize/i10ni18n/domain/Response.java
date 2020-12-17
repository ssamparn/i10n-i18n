package com.localize.internalize.i10ni18n.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    private String greeting;
    private String change;
    private String language;
}
