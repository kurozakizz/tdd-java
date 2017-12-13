# Day 1
- TDD by Circular Buffer

# Day 2
- SRP ทำหน้าที่แค่อย่างเดียว อย่าทำหลายอย่าง
- OCP เปิดสำหรับการเพิ่ม ปิดสำหรับการแก้
- Loose Coupling High Cohesion
- JUnit data driven
- Refactoring
- [Tennis Kata](https://github.com/emilybache/Tennis-Refactoring-Kata)
- [Spring Boot](https://github.com/up1/workshop_java_legacy)
- [Java TDD Course](github.com/up1/course-java-tdd-basic)

## Start Jenkins Warfile
```sh
java -jar jenkins.war --httpPort=9999
```

## Start Springboot
```sh
mvn spring-boot:run
```

## Jacoco coverage report
```sh
mvn jacoco:report
```
## Run unit test
```sh
mvn surefire:test
```

## Run integration test
```sh
mvn failsafe:integration-test
```

# Book
- *The Art of Unit Test
- *TDD by Example
- Effective Unit Test
- *Refactoring (Martin Fowler)
- Refactoring to Patterns(Joshua Kerievsky)
- *Clean Code
- Clean Coder
- *The Pragmatic Programmer

# References
- [Refactoring techniques](https://sourcemaking.com/refactoring/refactorings)
- [Code Smells](https://sourcemaking.com/refactoring/smells)
