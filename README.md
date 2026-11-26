# multica-demo

一个基于 Spring Boot 的 Java 示例项目。

## 技术栈

- Java 17
- Spring Boot 3.3.5
- Maven

## 运行

```bash
mvn spring-boot:run
```

启动后可访问以下接口：

- http://localhost:8080/hello —— 返回 `Hello, Spring Boot!`
- http://localhost:8080/test —— 测试接口，返回 JSON（`status` / `message` / `timestamp`）

## 构建

```bash
mvn clean package
```

生成的 jar 位于 `target/demo-0.0.1-SNAPSHOT.jar`，运行：

```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
```
