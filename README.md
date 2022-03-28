# gh_issue_gateway2438

Basic example to test the fix for **[GitHub Issue 2438 in Gateway](https://github.com/spring-cloud/spring-cloud-gateway/issues/2438)**

The project has 2 componenents:
- Gateway (using snapshot build installed locally)
- Server 


**Server URLs** can be accessed directly:

`curl http://localhost:9090/serviceA/control`

`curl http://localhost:9090/serviceB/variable`

These simple endpoints only return a string with the method name.


**Gateway URLs** can be tested by:

`curl http://localhost:8080/control`

This URL will add the `/serviceA` prefix.

`curl http://localhost:8080/variable`

This URL ill add the `/serviceB` prefix.  For this exmaple `/variable` must be used because that is the URL of the serviceB endpoint.  You can use another URL i.e. `/foo` and Gateway will route it OK but you will receive a 404 as the endpoint does not exist on the server.


For this example an `order` property was specified to be explicit about which filter should be preferred.  This is because `/control' could be picked up by either route.
