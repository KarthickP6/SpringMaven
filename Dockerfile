FROM openjdk:8
EXPOSE 3003
ADD target/CustomeCRUD-0.0.1-SNAPSHOT.war CustomeCRUD-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-war","CustomeCRUD-0.0.1-SNAPSHOT.war"]

