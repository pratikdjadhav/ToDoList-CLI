
---

## 📄 `README.md` – To-Do List Console App (Java)

````markdown
# ✅ Java To-Do List Console Application

A simple and professional console-based To-Do List manager built using **Java**.  
This app allows you to add, view, mark, and delete tasks — and stores them persistently in a local text file (`Tasks.txt`).

---

## 📦 Features

- ➕ Add a new task (auto-assigned ID)
- 📋 View all tasks in a clean format
- ✅ Mark a task as completed
- ❌ Delete a task by ID
- 💾 Automatically saves and loads tasks from a file
- 🚪 Clean menu-driven console UI

---

## 🧰 Technologies Used

- Java (JDK 8+)
- Object-Oriented Programming
- File Handling (BufferedReader & BufferedWriter)
- ArrayList for task storage

---

## 🧑‍💻 How to Run

### ✅ Requirements:
- JDK installed (Java 8 or later)
- A terminal or IDE like IntelliJ / VS Code / Eclipse

### ▶️ Run from terminal:
```bash
javac Task.java Main.java
java Main
````

Tasks will be read from and written to a file named **`Tasks.txt`** in the project folder.

---

## 🧾 Example Task File Format

The file `Tasks.txt` is automatically updated and stores tasks like:

```
1|Buy groceries|false
2|Complete Java project|true
```

Each line follows:

```
ID|Task Description|isCompleted
```

---

## 📁 Project Structure

```
ToDoListApp/
├── Task.java           # Model class for tasks
├── Main.java           # Program logic and menu
└── Tasks.txt           # File that stores tasks
```

---

## 💡 Sample Output

```
1. Add a task
2. View all tasks
3. Mark task as complete
4. Delete a task
5. Exit (save tasks)
Select an option : 2

Your TO-DO list
---------------------
1 -> Buy groceries -> Not Completed
2 -> Complete Homework -> Completed
---------------------
```

---

## 🙋 Author

Developed by **Pratik Dilip Jadhav**
📧 Email: [pratikdj.5699@gmail.com](mailto:pratikdj.5699@gmail.com)
🔗 GitHub: [github.com/pratikdjadhav](https://github.com/pratikdjadhav)

---

## 🪪 License

This project is open-source and free to use for learning or personal productivity.

````
