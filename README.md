# Overview

- This app makes it easy to get a java.sql.Connection to a database
- To get a connection to a database, use below code:

```java
Connection connection = DatabaseManager.getInstance().getConnection();
```

# Requirements

- Use this application as a Maven dependency in your application
- You need the relevant database drivers in your pom.xml
- You also need to supply properties-files for database-details
- properties-files are placed in resources-folder with the name: `config.properties`
- These properties are needed (key=value)
  -db.url=your_url
  -db.user=your_db_user
  -db.password=your_db_password