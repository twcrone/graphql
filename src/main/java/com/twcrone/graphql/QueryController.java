package com.twcrone.graphql;

import graphql.kickstart.spring.webclient.boot.GraphQLRequest;
import graphql.kickstart.spring.webclient.boot.GraphQLResponse;
import graphql.kickstart.spring.webclient.boot.GraphQLWebClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryController {
    private final GraphQLWebClient graphQLWebClient;

    public QueryController(GraphQLWebClient graphQLWebClient) {
        this.graphQLWebClient = graphQLWebClient;
    }

    @GetMapping("/query")
    public String query() {
        GraphQLRequest request = GraphQLRequest.builder().query(QUERY).build();
        GraphQLResponse response = graphQLWebClient.post(request).block();
        return response.toString();
    }

    private static final String QUERY = "query {\n" +
            "    recentPosts(count: 10, offset: 0) {\n" +
            "        id\n" +
            "        title\n" +
            "        category\n" +
            "        text\n" +
            "        author {\n" +
            "            id\n" +
            "            name\n" +
            "            thumbnail\n" +
            "        }\n" +
            "    }\n" +
            "}";
}
