# 🎮 Java Maze Game (Console-Based)

A console-based maze game built in Java where a player navigates 
through a 2D maze while avoiding 4 randomly moving enemies.

---

## 📋 About The Project

This is my first Java project built to practice Object-Oriented 
Programming concepts. The player moves through an 11x19 character 
grid using keyboard controls while 4 enemies move randomly each turn.
The game ends when the player hits a wall or an enemy catches the player.

---

## 🎯 Features

- ✅ 2D maze grid using character arrays (11 x 19)
- ✅ Player movement using W/A/S/D controls
- ✅ 4 randomly moving enemies with collision detection
- ✅ Real-time score tracking (score increases every valid move)
- ✅ Game Over detection for wall hits and enemy catches
- ✅ Object-Oriented Design with 4 separate classes

---

## 🏗️ Project Structure

Main.java
│
├── Main Class        → Entry point, creates all objects, runs game loop
├── Structure Class   → Owns the 2D maze grid, prints it each turn
├── Player Class      → Handles player position, movement and score
└── Enemies Class     → Handles 4 enemy positions and random movement

## 🖥️ How To Run

**Requirements:**
- Java JDK 8 or higher
- Any Java IDE (IntelliJ IDEA recommended) or Command Line

**Steps:**

1. Clone this repository: https://github.com/Muhammad-Zain-Rasheed/Java-Pacman-Maze-Game.git

2. Open the project in IntelliJ IDEA

3. Run Main.java

4. Use W/A/S/D keys to move the player

---

## 🎮 How To Play

W = Move Up
A = Move Left
S = Move Down
D = Move Right
p = Your Player
E = Enemy
x = Wall (do not touch!)
. = Walkable Floor

**Win condition** — Survive as long as possible and maximize your score

**Lose condition** — Hit a wall or get caught by an enemy

---

## 📸 Screenshot

Pacman Game on CLI Screenshot.png

## 💡 What I Learned

- Object-Oriented Programming (4 classes working together)
- Shared state management using object passing
- 2D array manipulation
- Random algorithm implementation
- Console-based input/output handling
- Debugging and fixing logical errors

---

## 🔮 Future Improvements

- [ ] Add multiple maze levels
- [ ] Add a high score system with database storage
- [ ] Add power-ups for the player
- [ ] Build a GUI version using Java Swing

---

## 👨‍💻 Author

**Muhammad Zain Rasheed**
- LinkedIn: www.linkedin.com/in/muhammad-zain-rasheed-76727231a
- GitHub: https://github.com/Muhammad-Zain-Rasheed

---

## 📚 Technologies Used

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

---

⭐ If you found this project helpful, please give it a star!
