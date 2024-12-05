1. Build and install kamelet
```
mvn -f bits-kamelet-library clean install
```
2. Run sample 
 ```
mvn -f log-example spring-boot:run
```

3. Build for EAP
```
mvn -f log-example/eap_pom.xml clean package
```