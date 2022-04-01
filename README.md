# gh_issue_gateway2438

Basic example to test the fix for **[GitHub Issue 2438 in Gateway](https://github.com/spring-cloud/spring-cloud-gateway/issues/2438)**

The project has 2 componenents:
- Gateway (using snapshot build installed locally)
- Server 


**Server URLs** can be accessed directly:

`curl http://localhost:9090/serviceA/control`

`curl http://localhost:9090/{var1}/partners/{var2}/home`

For direct testing var1 and var2 can be different.  When routed from the Gateway they will be the same.

These simple endpoints only return a string with the method name.


**Gateway URLs** can be tested by:

`curl http://localhost:8080/control`

This URL will add the `/serviceA` prefix.

`curl http://localhost:8080/parnters/{var}/home`

Gateway will capture the value of `{var}` and add it as a prefix.  This effectively results in `{var}` being on the routed path twice.

