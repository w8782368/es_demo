package com.example.demo;

import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class DemoApplicationTests {


    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Test
    void contextLoads() {
    }



    @Test
    public void aaa() throws IOException {
        IndexRequest indexRequest = new IndexRequest("ccc");
        indexRequest.source("{\"name:\":\"aaa\",\"age\":\"1\"}", XContentType.JSON);
        IndexResponse index = restHighLevelClient.index(indexRequest, RequestOptions.DEFAULT);

        System.out.println(index.status());
    }

    @Test
    public void bbb(){

    }

}
