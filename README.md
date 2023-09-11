# Trailer Site

## About

This project is a simple streaming site built using Spring Boot for the backend and React for the frontend. The primary features include:

- **REST API**: Allows clients to watch trailers and then post reviews.
- **Integration with MongoDB**: All data is stored in a Mongo cluster.
- **HTTP Requests**: The React frontend interacts with the backend using Axios for HTTP requests.

## Set Up

To get the project up and running on your local machine, follow these steps:

### Prerequisites:

- Make sure you have `Node.js` and `npm` installed.
- Ensure `Java` and `Maven` are set up on your system.
- Have `MongoDB` installed and running.

### Steps:

1. **Clone the Repository**

   ```bash
   git clone https://github.com/nitvob/trailer_site.git
   ```

2. **Navigate to the Frontend Static Directory**

   ```bash
   cd trailer_site/src/main/resources/static
   ```

3. **Install Dependencies**

   ```bash
   npm install
   ```

4. **Navigate to the Backend Directory**

   ```bash
   cd ../../../../
   ```

5. **Run the Spring Boot Application**
   ```bash
   mvn spring-boot:run
   ```

Once both the frontend and backend are running, you should be able to access the trailer site from your web browser on the localhost:8080.

## Contributions

Feel free to fork the project, open issues, and submit pull requests. All contributions are welcomed!

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

---

Happy coding! 🚀
