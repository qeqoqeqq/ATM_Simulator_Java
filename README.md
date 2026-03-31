# Java OOP ATM Simulation

**Overview**
A console-based object-oriented simulation of an ATM and banking network. This project models the interactions between customers, ATMs, a central transaction clearing house, and individual banks. Developed as an academic project at ELTE to solidify Object-Oriented Programming (OOP) principles.

**Domain Model & Architecture**
The simulation is built on a modular architecture representing real-world banking entities:
* `Customer` / `Card` / `Account`: Represents the user and their financial data.
* `Bank`: Manages accounts and authorizes transactions.
* `Center`: Acts as a central network hub routing ATM requests to the appropriate Bank.
* `ATM`: The user interface that communicates with the Center to process cash withdrawals.

**How to Run**
1. Clone the repository: `git clone [repository-link]`
2. Compile the Java files: `javac *.java`
3. Run the main simulation: `java Main`
