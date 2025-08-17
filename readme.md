# Java Unix Utilities

A lightweight collection of classic Unix command line tools re-implemented in **Java**.  
These utilities mimic the behavior of well-known commands like `cat`, `ls`, `grep`, `tail`, and more — and can run on any system with Java installed.

---

## 📦 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/java-unix-utilities.git
   cd java-unix-utilities
   ```

2. **Compile the project**
   ```bash
   javac src/*.java -d out
   ```

3. **Run commands**
   ```bash
   java -cp out CommandName [options] [file...]
   ```

---

## ⚡ Available Commands

### 🐱 `cat`
Print the contents of a file to the terminal.
```bash
java -cp out Cat example.txt
```

---

### 📂 `ls`
List files and directories in the current or given directory.
```bash
java -cp out Ls
java -cp out Ls /path/to/dir
```

---

### 🔢 `wc`
Display the number of lines, words, and bytes in a file.
```bash
java -cp out Wc notes.txt
```

---

### 📜 `tail`
Print the last *n* lines of a file.  
Supports `-f` (follow mode) for continuously updated files like logs.
```bash
java -cp out Tail -n 20 log.txt
java -cp out Tail -f log.txt
```

---

### 🔤 `sort`
Sort lines of a file alphabetically.
```bash
java -cp out Sort names.txt
```

---

### 🔍 `grep`
Search for a pattern in a file.
```bash
java -cp out Grep error log.txt
```

---

### 📖 `less`
Open a file in a scrollable, read-only viewer.
```bash
java -cp out Less bigfile.txt
```

---

## 🔗 Example Usage

```bash
# Show contents of a file
java -cp out Cat notes.txt

# Search logs for "ERROR"
java -cp out Grep "ERROR" server.log

# Count words in a file
java -cp out Wc essay.txt

# Sort a list
java -cp out Sort names.txt

# View last 50 lines of a log and follow new ones
java -cp out Tail -n 50 -f app.log
```

---

## ✅ Requirements
- **Java 17 or higher**
- Works on **Linux, macOS, and Windows**

---

## 📅 Roadmap
- [x] Implement `cat`
- [ ] Implement `ls`
- [ ] Implement `wc`
- [ ] Implement `tail`
- [ ] Implement `sort`
- [ ] Implement `grep`
- [ ] Implement `less`
- [ ] Add more advanced features (flags, regex options, etc.)
- [ ] Add support for piping (`|`) between commands

---

## 📝 Notes
- These utilities are **simplified versions** of Unix commands.
- They are built in Java for portability and educational purposes.
- Behavior may not match 100% of the original Unix tools.

---

## 👨‍💻 Author
Built with ❤️ in Java by [Prince Pal](https://github.com/hustlerZzZ)
