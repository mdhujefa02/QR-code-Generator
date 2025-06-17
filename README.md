# QR-code-Generator

A simple Spring Boot application to generate QR codes using user input via a web interface.

## 🧰 Technologies Used

- **Java**
- **Spring Boot**
- **Thymeleaf**
- **ZXing Library** (for QR code generation)
- **HTML/CSS** (basic frontend)

## 📂 Project Structure

├── QrCodeApplication.java # Main application entry point
├── QrCodeGenerateApplication.java # Core logic to generate QR code
├── index.html # Frontend HTML form
├── application.properties # Spring Boot configuration
├── pom.xml # Maven project dependencies
└── README.md # Project documentation

bash
Copy
Edit

## 🚀 How to Run

1. **Clone the Repository**

bash
git clone https://github.com/mdhujefa02/QR-code-Generator.git
cd QR-code-Generator
Build and Run the Application

Make sure you have Java and Maven installed.

bash
Copy
Edit
mvn spring-boot:run
Open in Browser

Visit: http://localhost:8080

Generate QR Code

Enter text in the input field.

Click the Generate QR button.

A QR code image will be generated and displayed.

# ⚙️ Configuration
You can change the server port or any other Spring Boot configurations in the application.properties file.

properties
Copy
Edit
server.port=8080

# 📸 Screenshots
![Screenshot 2025-06-17 170044](https://github.com/user-attachments/assets/0dd5d8cd-911a-4b32-a8be-152359316d06)

