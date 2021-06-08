FROM openjdk
COPY . /src/java
WORKDIR /src/java
RUN ["javac","Ferrari.java"]
ENTRYPOINT ["java","Ferrari"]