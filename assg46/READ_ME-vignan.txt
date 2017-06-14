SPRING CLOUD — NETFLIX’S CONTRIBUTIONS = Hystrix, Ribbon, Eureka, Zuul etc.

4 steps in Spring Cloud - Eureka: Service Registry and Discovery

Step 1> REST Producer and Consumer w/o Spring Cloud
Usage of RestTemplate to consume — using HttpMethod.GET()

Step 2> Configure and start an Eureka Server
EnableEurekaServer

Step 3> Configure Producer to make service registration with Eureka server
EnableDiscoveryClient

Step 4> Configure Consumer to discover service from running instance of Eureka server
We use DiscoveryClient along with ServiceInstance

1 Step in Spring Cloud’s component - Ribbon

Step 5> We make sure that we are running multiple instances of Producer by changing appropriate code in Producer  (2 instances on different ports in our example)
We replace DiscoveryClient with LoadBalancerClient in consumer and let the Spring Ribbon pick one of the instances
So client side load balancing is achieved.
Depending on the place from where client hits the eureka server registry (Client side load balancing is done by Ribbon)

1 more step for Netflix Hystrix:

Step 6> Hystrix has 2 features : Fallback method and Circuit Breaker
@EnableCircuitBreaker at the main class 
In both producer’s REST controllers use  @HystrixCommand(fallbackMethod = "getDataFallBack") and implement getDataFallback method in producers controllers class if there is a runtime exception at the firstPage()

Step 7> Set Zuul properties accordingly to route traffic and set as reverse proxies.
zuul:
  routes:
    employess:
      path: /info
All “/info” requests from the UI will be routed to our Eureka server’s registered instances which are producers. I fEureka is not used we should specify “url” as zuul:routes:employees:url: http://localhost:8081.

Learned:

ApplicationContext keeps one running instance of an application (usually microservice) and helps to deal with it. It keeps it as an Object

ServiceInstance keeps one running instance as an object.

ApplicationContext vs ServiceInstance differences?

Maven topics:	Scope, Dependencies vs DependencyManagement


 