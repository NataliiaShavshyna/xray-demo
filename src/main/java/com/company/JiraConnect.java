package com.company;

import static io.restassured.RestAssured.when;


public class JiraConnect {
    public void init(){


           when().
                get("todo").
                then().
                statusCode(200);
    }
}
