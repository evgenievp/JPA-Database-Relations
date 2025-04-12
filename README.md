# Spring Boot JPA Relations Demo

This is a small demonstration project created to showcase understanding of:

-  Java + Spring Boot
-  Spring Data JPA
-  Entity relationships in a relational database (OneToMany, ManyToOne)
-  PostgreSQL as a database (running in a Docker container)
-  Initial data loading using `@PostConstruct`

= What does this project do?

When the application starts:

- Creates two football teams (`Team`)
- Creates two players (`Player`) and links them to their respective teams
- Saves all entries to a PostgreSQL database
- Prints a success message to the console

---

## 🛠️ Technologies Used

| Technology         | Purpose                          |
|--------------------|----------------------------------|
| Java 17+           | Main programming language        |
| Spring Boot 3      | Framework                        |
| Spring Data JPA    | ORM and database interactions    |
| PostgreSQL         | Relational database              |
| Docker + pgAdmin   | Containerized database setup     |
| Maven              | Dependency & project management  |

