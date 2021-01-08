# spring-simplest-rest-api-app

Pretty simple Spring REST API application using Spring Boot, Spring Data, Apache Maven and H2 Database.

Run app using:

    ./mvnw spring-boot:run

App should start at `localhost:8080`.

You can enter **database console** using `localhost:8080/console`. JDBC URL is `jdbc:h2:file:./usersDataBase`.

You can use **Postman** or another tool to test API.

<table style="width: 100%">
  <thead>
    <tr>
        <th>METHOD</th>
        <th>URL</th>
        <th>DESCRIPTION</th>
    </tr>
    <tr>
        <td>GET</td>
        <td>/api/users/all</td>
        <td>Returns all Users from the database.</td>
    </tr>
    <tr>
        <td>GET</td>
        <td>/api/users?id=1</td>
        <td>Returns User with the specific - "1" in this example - id.</td>
    </tr>
    <tr>
        <td>POST</td>
        <td>/api/users</td>
        <td>Adds User.</td>
    </tr>
    <tr>
        <td>PUT</td>
        <td>/api/users</td>
        <td>Updates User.</td>
    </tr>
    <tr>
        <td>DELETE</td>
        <td>/api/users?id=1</td>
        <td>Removes User with the specific - "1" in this example - id.</td>
    </tr>
</table>
