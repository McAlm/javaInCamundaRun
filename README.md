# javaInCamundaRun
demo to showcase how DelegationCode / Listeners can be used within Camunda Platform Run

# How to build
```mvn clean package```

After building the project with Maven you can copy the resulting jar into Camunda-Run ```/configuration/userlib``` and restart Camunda-Run.
From now on every implemented JAVA component will be executed…
 
Important here is that this is not an engine plugin but a pure Springboot extension. 
The ResourceConfig is the trigger that Spring takes care of this jar. It is referenced in ```/src/main/resource/META-INF/spring.factories```.
