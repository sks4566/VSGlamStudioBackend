# VS Glam Studio - Sample Spring Boot Backend

This is a minimal Spring Boot example implementing the JSON endpoints expected by the VS Glam Studio frontend demo.

Run locally:

```bash
mvn -f backend-spring-boot/pom.xml spring-boot:run
# or
cd backend-spring-boot
mvn spring-boot:run
```

Default port: `8081`

Endpoints implemented:
- GET /site
- GET /services
- GET /services/{slug}
- GET /courses
- GET /courses/{slug}
- GET /gallery
- GET /reviews
- GET /blog
- GET /blog/{slug}
- GET /contact
- POST /contact
- POST /appointments

Sample curl:

```bash
curl http://localhost:8081/site
```