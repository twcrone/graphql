# Getting Started

## Run application
`./gradlew bootRun`

## Open GraphiQL UI in browser
`http://localhost:8080/graphiql`

Replace text in left-hand panel with the following:
```
query {
    recentPosts(count: 10, offset: 0) {
        id
        title
        category
        author {
            id
            name
            thumbnail
        }
    }
}
```
Click on `>` button to see results in right-hand panel.


### GraphiQL Native GUI

`brew install --cask graphiql`

POST above to `http://localhost:8080/graphql`


### Postman (or another HTTP Client app)

POST payloads directly to `http://localhost:8080/graphql`


### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.2/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.2/gradle-plugin/reference/html/#build-image)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

