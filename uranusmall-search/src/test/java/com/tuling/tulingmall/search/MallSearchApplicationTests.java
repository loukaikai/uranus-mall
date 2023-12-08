package com.uranus.uranusmall.search;



import com.uranus.uranusmall.search.service.EsClientSearchService;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallSearchApplicationTests {

    @Qualifier("restHighLevelClient")
    @Autowired
    private RestHighLevelClient client;

    @Autowired
    private EsClientSearchService esSearchService;



    @Test
    public void CreateIndex()  throws IOException{
        esSearchService.createIndex("aaa");
    }



    public void isExit(String index) throws IOException {

    }



    public void delete(String index) throws IOException {

    }



    public void addDocument(String index, String id, Object object) throws IOException {

    }



    public void isdocuexit(String index, String id) throws IOException {

    }



    public void GetDoucumment(String index, String id) throws IOException {

    }



    public void UpdateDocument(Object object, String index, String id) throws IOException {

    }


    public void DeleteDocument(String index, String id) throws IOException{

    }


    public void addmoredocument(ArrayList<Object> list, String index, String id) throws IOException{

    }


    public void termQuery(String index, TreeMap<String, Object> content, int size, int from, boolean ishigh) throws IOException {

    }


    public void matchQuery(String index, TreeMap<String, Object> content, int size, int from, boolean ishigh) throws IOException {

    }



    public void boolmustQuery(String index, TreeMap<String, Object> content, int size, int from) throws IOException {

    }

}
