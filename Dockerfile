# Java 21 tabanlı resmi imajı kullanıyoruz
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Gradle dosyalarını kopyalayıp bağımlılıkları indiriyoruz
COPY build.gradle settings.gradle gradlew ./
COPY gradle gradle
RUN ./gradlew dependencies

# Kaynak kodları kopyalayıp projeyi build ediyoruz
COPY src src
RUN ./gradlew bootJar -x test

# Çalıştırma aşaması
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]