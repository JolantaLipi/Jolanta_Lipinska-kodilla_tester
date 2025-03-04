package com.kodilla.rest.controller;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;
import static org.hamcrest.Matchers.equalTo;

class ExternalApiRestAssuredTest {

    @Test
    void testGetPostShouldReturnStatus200AndValidateResponse() {
        given().  // [1]
                header("Content-Type", "application/json").
                when().
                get("https://jsonplaceholder.typicode.com/posts/1").  // [2]
                then().
                assertThat().
                statusCode(200).  //  [3]
                body("userId", equalTo(1)).  //  [4]
                body("id", equalTo(1)).
                body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")).
                body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")).
                log().all();  // [5]
    }
    @Test
    void testPutShouldReturnStatus200AndUpdatePost() {
        String json = "{\n" +
                "      id: 2,\n +" +
                "      title: 'xyz',\n" +
                "      body: 'abc',\n" +
                "      userId: 1,\n" +
                " }";
        given().  // [1]
                header("Content-Type", "application/json").
                when().
                put("https://jsonplaceholder.typicode.com/posts/1").  // [2]
                body(json).
                then().
                assertThat().
                statusCode(200).  //  [3]
                body("userId", equalTo(1)).  //  [4]
                body("id", equalTo(2)).
                body("title", equalTo("xyz")).
                body("body", equalTo("abc")).
                log().all();  // [5]
    }
}